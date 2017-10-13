package com.mycompany.test.util;
/**
 * 
 */


import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dalals
 *
 */
public class MaskMessageUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(MaskMessageUtil.class);
	
	/**
	 * 
	 * @return
	 */
	public static String getAllMaskedMessage(String comments, String maskedType, String maskedTypeValue){
		LOGGER.info("getAllMaskedMessage:maskedType - "+maskedType);
		if("All".equalsIgnoreCase(maskedType)){
			return comments;
		}
		return comments;
	}
	
}
