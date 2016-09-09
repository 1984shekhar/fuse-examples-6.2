package com.mycompany.job.service;

import java.io.Serializable;
import java.util.Date;

public class JobEventLogEntity implements Serializable{

	private static final long serialVersionUID = -7656282969144937434L;

	private Long id ;
	private String jobNo;
	private Date logDt;
	private String vehicleId;
	private String driverId;
	private String eventCode;
	private String eventDetails;
	private String REMARKS;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobNo() {
		return jobNo;
	}

	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventDetails() {
		return eventDetails;
	}

	public void setEventDetails(String eventDetails) {
		this.eventDetails = eventDetails;
	}

	public String getREMARKS() {
		return REMARKS;
	}

	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}

	public Date getLogDt() {
		return logDt;
	}

	public void setLogDt(Date logDt) {
		this.logDt = logDt;
	}

	@Override
	public String toString() {
		return "JobEventLogEntity [id=" + id + ", jobNo=" + jobNo + ", logDt="
				+ logDt + ", vehicleId=" + vehicleId + ", driverId=" + driverId
				+ ", eventCode=" + eventCode + ", eventDetails=" + eventDetails
				+ ", REMARKS=" + REMARKS + "]";
	}	
	
}
