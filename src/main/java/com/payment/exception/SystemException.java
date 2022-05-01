/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.exception;

import lombok.Data;

/**
 * @author sreenu,09-Apr-2022
 * Description :
 */
@Data
public class SystemException extends Exception{
	
	private String respCode;
	private String respMsg;
	
	public SystemException(String respCode, String respMsg) {
		
		this.respCode = respCode;
		this.respMsg  = respMsg;
	}
}	