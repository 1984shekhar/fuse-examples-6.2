package com.mycompany.aws.blueprint;

import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

public class AS3Client extends com.amazonaws.services.s3.AmazonS3Client{

	private String regionName;
	
	
	public AS3Client(AWSCredentials awsCredentials) {
        super(awsCredentials);
    }
	
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		System.out.println("Setting region: "+regionName);
		this.regionName = regionName;	
		System.setProperty(SDKGlobalConfiguration.ENFORCE_S3_SIGV4_SYSTEM_PROPERTY, "true");
		super.setRegion(Region.getRegion(Regions.fromName(regionName)));
	}

}
