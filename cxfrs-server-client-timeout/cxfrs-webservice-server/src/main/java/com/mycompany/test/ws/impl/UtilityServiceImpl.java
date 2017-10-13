/**
 * 
 */
package com.mycompany.test.ws.impl;

import org.apache.camel.Header;

import com.mycompany.test.beans.MaskVO;
import com.mycompany.test.util.MaskMessageUtil;
import com.mycompany.test.ws.UtilityService;

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
