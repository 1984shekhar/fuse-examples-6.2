package io.scratcharea.bean;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator="\\,")
public class MyBean {
	@DataField(pos=1, required=true)
	private String activityId;
	@DataField(pos=2, required=true)
	private String activityName;
	@DataField(pos=3, required=false)
	private int availablePlace;
	@DataField(pos=4, required=true)
	private String endDate;
	@DataField(pos=5, required=true)
	private Boolean groupBased;
	@DataField(pos=6, required=true)
	private String host;
	@DataField(pos=7, required=true)
	private Boolean multiLocationIndicator;
	@DataField(pos=8, required=true)
	private String orgCode;
	@DataField(pos=9, required=true)
	private String providerContractType;
	@DataField(pos=10, required=true)
	private String region;
	@DataField(pos=11, required=true)
	private String startDate;
	@DataField(pos=12, required=true)
	private String status;
	@DataField(pos=13, required=true)
	private String subType;
	
	@Override
	public String toString() {
		
		return "activityId :" +activityId +" activityName :" +activityName;
	}
}
