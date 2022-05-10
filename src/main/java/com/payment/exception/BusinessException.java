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
public class BusinessException extends Exception{
	
	private String respCode;
	private String respMsg;
	private String errorCode;
	
	public BusinessException(String respCode, String respMsg,String errorCode) {
		
		this.respCode = respCode;
		this.respMsg  = respMsg;
		this.errorCode = errorCode;
	}
}	