/**
 * 
 */
package com.city.connect.ws;

import com.city.connect.beans.MaskVO;

/**
 * @author dalals
 *
 */
public interface UtilityService {

	/**
	 * 
	 * @param comments
	 * @param maskedType
	 * @param maskedTypeValue
	 * @return
	 */
	public String getAllMaskedMessage(String comments, String maskedType, String maskedTypeValue);
	/**
	 * 
	 * @param maskVO
	 * @return
	 */
	public String getAllMaskedMessage1(MaskVO maskVO);
	public String getAllMaskedMessage2(Object[] obj);
	
}
