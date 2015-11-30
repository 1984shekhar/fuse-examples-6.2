package io.scratcharea.bean;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator=",")
public class Product {
	@DataField(pos=1, required=true)
	private String activityId;
	@DataField(pos=2, required=true)
	private String activityName;
	
	@Override
	public String toString() {
		
		return "activityId :" +activityId +" activityName :" +activityName;
	}
}
