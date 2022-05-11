/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.validator;

import com.payment.model.PaymentRequest;
import org.springframework.stereotype.Component;

/**
 * @author sreenu,09-Apr-2022
 * Description :
 */
 @Component
public class PaymentRequestValidator {
	
	
	public void validateRequest(PaymentRequest paymentRequest) {
		
		//todo : validate the all the mandatory request elements, if any of the element is invalid then 
		//thorw the userdefined exception
		
		if(paymentRequest != null ){
		
			throw new PaymentServiceException("ps001", "invalid request object");
		}

		 if(paymentRequest.getCardNumber() != null ){
		
			throw new PaymentServiceException("ps002", "invalid cardnumber");
		}		
		

		if(paymentRequest.getClientId() ==null || " ".equals(paymentRequest.getClientId) ){
			
		throw new PaymentServiceException("ps002", "invlaid client id");	
		}	

	}

}
