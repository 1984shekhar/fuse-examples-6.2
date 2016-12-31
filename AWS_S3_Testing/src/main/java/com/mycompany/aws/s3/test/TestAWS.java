package com.mycompany.aws.s3.test;

import org.apache.camel.builder.RouteBuilder;

import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

public class TestAWS extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     * 
     */
	private com.amazonaws.services.s3.AmazonS3Client amazonS3Client;

	public void configure() {
		/*Regions region = Regions.fromName("Mumbai");*/
		System.setProperty(SDKGlobalConfiguration.ENFORCE_S3_SIGV4_SYSTEM_PROPERTY, "true");
		amazonS3Client.setRegion(Region.getRegion(Regions.US_WEST_2));
        System.out.println("......Inside MyRouteBuilder.....");
        from("aws-s3://2015dhairya?amazonS3Client=#s3Client&delay=5000&maxMessagesPerPoll=1")
        .log("Connected successfully ${body}");
    }
	
	public com.amazonaws.services.s3.AmazonS3Client getAmazonS3Client() {
		return amazonS3Client;
	}
	public void setAmazonS3Client(
			com.amazonaws.services.s3.AmazonS3Client amazonS3Client) {
		this.amazonS3Client = amazonS3Client;
	}

}