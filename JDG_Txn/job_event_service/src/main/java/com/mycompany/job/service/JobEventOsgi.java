package com.mycompany.job.service;

import java.util.Date;

public interface JobEventOsgi {

	public void insertEventLog(String jobNo, String eventCode, String eventDetails, Date eventDate);
	public void updateEventLog(JobEventLogEntity jobEvent);
	public JobEventLogEntity findByJobNo(String jobNo);
	
}
