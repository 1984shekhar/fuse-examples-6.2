package com.mycompany.job.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.manager.EmbeddedCacheManager;

import javax.transaction.TransactionManager;

public class JobEventService  implements JobEventOsgi {
	private static final Logger log = LoggerFactory.getLogger(JobEventService.class);
	private DefaultCacheManager cacheManager;
	
	public DefaultCacheManager getCacheManager() {
		return cacheManager;
	}

	public void setCacheManager(DefaultCacheManager cacheManager) {
		this.cacheManager = cacheManager;
	}

	public void save(JobEventLogEntity entity) throws Exception {
		log.info("insert jobid " + entity.getJobNo() + " in to cache."); 
		
		Cache jobCache = cacheManager.getCache("jobservice-datastore");
		TransactionManager tm = jobCache.getAdvancedCache().getTransactionManager();
		tm.begin();
		jobCache.put(entity.getJobNo(), entity);
		tm.commit();
	}
	
	
	public JobEventLogEntity findByJobNo(String jobNo) {
		return (JobEventLogEntity) cacheManager.getCache().get( jobNo );
	}

	@Override
	public void insertEventLog(String jobNo, String eventCode,
			String eventDetails, Date eventDate) {
		
		log.info("insert into job event log");
		JobEventLogEntity entity = new JobEventLogEntity();	
		entity.setJobNo(jobNo);
		entity.setEventCode(eventCode);
		entity.setEventDetails(eventDetails);
		entity.setLogDt(eventDate);
		try { 
			save(entity);
		} catch( Exception ex) {
			log.error("Received exception while putting job " + jobNo );
		}
	}

	@Override
	public void updateEventLog(JobEventLogEntity jobEvent) {
		try { 
			save(jobEvent);
		} catch( Exception ex) {
			log.error("Received exception while putting job " + jobEvent.getJobNo() );
		}
		
	}
}
