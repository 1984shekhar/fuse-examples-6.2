/**
 * 
 */
package com.city.connect.ws.impl;

import org.apache.camel.Header;

import com.city.connect.beans.MaskVO;
import com.city.connect.util.MaskMessageUtil;
import com.city.connect.ws.UtilityService;

/**
 * @author dalals
 *
 */
public class UtilityServiceImpl {

	/**
	 * 
	 * @param comments
	 * @param maskedType
	 * @param maskedTypeValue
	 * @return
	 */
	
	public String getAllMaskedMessage(@Header("comments") String comments , @Header("maskedType") String maskedType, @Header("maskedTypeValue") String maskedTypeValue) {
		return MaskMessageUtil.getAllMaskedMessage(comments, maskedType, maskedTypeValue);
	}
	
	public String getAllMaskedMessage3(MaskVO maskVO){
		return MaskMessageUtil.getAllMaskedMessage(maskVO.getComments(), maskVO.getMaskedType(), maskVO.getMaskedTypeValue());
	}
	
	public String getAllMaskedMessage4(Object[] obj){
		if(obj != null && obj.length == 3){
		return MaskMessageUtil.getAllMaskedMessage((String)obj[0], (String)obj[1], (String)obj[2]);
		}else{
			return "Mapping Not Found.";
		}
	}


}
