package com.fuse.sample.processor.hits;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.datacontract.schemas._2004._07.integrationservice.Feature;
import org.datacontract.schemas._2004._07.integrationservice.ServicePlanDetailResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.model.FeatureType;
import io.swagger.model.SKUType;
import io.swagger.model.ServicePlanDetailsType;
import io.swagger.model.ServicePlanResponseBO;
import io.swagger.model.ServicePlanType;

public class ParseBodyForHitsGetServicePlanDetailAndSku implements Processor {

	Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("*************"+exchange.getIn().getBody().toString());
		logger.info("*************"+exchange.getIn().getBody().toString());
		ServicePlanResponseBO response = new ServicePlanResponseBO();
		
		ServicePlanDetailResult result = exchange.getIn().getBody(ServicePlanDetailResult.class);
		String statusCode = result.getCode().getValue().toString(); 
		if(statusCode.equals("0")){
		
		SKUType skuType = new SKUType();
			skuType.setSKU(result.getEquipmentSku().getValue().getSku().getValue().toString());
			skuType.setEquipmentCondition(result.getEquipmentSku().getValue().getEquipmentCondition()+"");
			
			List<FeatureType> features = new ArrayList<FeatureType>();
			
			for(Feature  featureIn :result.getServicePlanDetail().getValue().getFeature().getValue().getFeature()){
				FeatureType featureOut = new FeatureType();
					featureOut.setDeatureType(featureIn.getFeatureType()+"");
					featureOut.setDeductible(featureIn.getDeductible()+"");
					features.add(featureOut);
			}
			
			
			
			ServicePlanType planType = new ServicePlanType();
				planType.setServicePlanID(result.getServicePlanDetail().getValue().getServicePlan().getValue().getServicePlanId().toString());
				planType.setServicePlanName(result.getServicePlanDetail().getValue().getServicePlan().getValue().getServicePlanName().getValue().toString());
				
			ServicePlanDetailsType details = new ServicePlanDetailsType();
				details.setServicePlan(planType);
				details.setFeatures(features);
			
		
			response.setSKUType(skuType);
			response.setServicePlanDetails(details);
		}else{
			logger.error("Invalid status code returned returning blank message");
		}
		exchange.getOut().setBody(response);
		
		
	}

}
