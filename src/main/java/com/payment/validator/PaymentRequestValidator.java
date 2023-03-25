/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.validator;

import org.springframework.stereotype.Component;

import com.payment.exception.PaymentRequestInvalidException;
import com.payment.model.PaymentRequest;

/**
 * @author sreenu,09-Apr-2022
 * Description :
 */
 @Component
public class PaymentRequestValidator {
	
	
	public void validateRequest(PaymentRequest paymentRequest) throws PaymentRequestInvalidException {
		
		//todo : validate the all the mandatory request elements, if any of the element is invalid then 
		//thorw the userdefined exception
		
		if(paymentRequest != null ){
		
			throw new PaymentRequestInvalidException("ps001", "invalid request object");
		}

		 if(paymentRequest.getCustomerDetails().getCardnumber() != null || " ".equals(paymentRequest.getCustomerDetails().getCardnumber()) ){
		
			throw new PaymentRequestInvalidException("ps002", "invalid cardnumber");
		}		

			


	}

}
