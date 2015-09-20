package com.mycompany.proxy.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.mycompany.business.model.FTRequest;

public class FilterString {
	
	/*public static String modifiedString(String str){
		System.out.println("Within str: "+str);
		StringBuilder strBuilder = new StringBuilder();
		String[] strArray = str.split("\n");
		for(String s: strArray){
			if(s.contains("UTF-8")){
				continue;
			}
			strBuilder.append(s.trim());
		}

		System.out.println("returning str: "+strBuilder);
		return strBuilder.toString();
	}*/
	
	public static FTRequest returnPojo(String str) throws JAXBException{
		JAXBContext jaxbContext = JAXBContext.newInstance(FTRequest.class);
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	     
	    //We had written this file in marshalling example
	    InputStream is = new ByteArrayInputStream(str.getBytes());
	    FTRequest emps = (FTRequest) jaxbUnmarshaller.unmarshal(is);
	     
		return emps;
	}

}
