package com.mycompany.ecf.wiretap.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author singhmanis
 */
@Entity
@Table(name = "CLAIM_EVENT_TYPE")
@XmlRootElement
public class ClaimEventType implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "EVENT_TYPE_ID")
	private Long eventTypeId;

	@Column(name = "EVENT_TYPE")
	private String eventType;

	@Column(name = "EVENT_TYPE_DESC")
	private String eventTypeDesc;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	public ClaimEventType() {
	}

	public ClaimEventType(Long eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public Long getEventTypeId() {
		return eventTypeId;
	}

	public void setEventTypeId(Long eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventTypeDesc() {
		return eventTypeDesc;
	}

	public void setEventTypeDesc(String eventTypeDesc) {
		this.eventTypeDesc = eventTypeDesc;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (eventTypeId != null ? eventTypeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ClaimEventType)) {
			return false;
		}
		ClaimEventType other = (ClaimEventType) object;
		if ((this.eventTypeId == null && other.eventTypeId != null)
				|| (this.eventTypeId != null && !this.eventTypeId
						.equals(other.eventTypeId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.mycompany.ecf.wiretap.model.ClaimEventType[ eventTypeId=" + eventTypeId + " ]";
	}

}
