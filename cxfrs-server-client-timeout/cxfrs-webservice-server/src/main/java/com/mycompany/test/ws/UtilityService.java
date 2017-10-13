/**
 * 
 */
package com.mycompany.test.ws;

import com.mycompany.test.beans.MaskVO;

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
