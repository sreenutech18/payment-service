/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.builder;

import org.springframework.stereotype.Component;

import com.payment.model.FinancialServiceRequest;
import com.payment.model.FinancialServiceResponse;
import com.payment.model.PaymentDaoRequest;
import com.payment.model.PaymentRequest;

/**
 * @author sreenu,09-Apr-2022
 * Description :
 */

@Component
public class PaymentRequestBuilder {
	
	
	public FinancialServiceRequest buildFinancialREquest(PaymentRequest paymentRequest) {
		
		//TODO : Prepare FinancialServiceRequest with the help of PaymentRequest
		
		
		return null;
		
		
	}

	/**
	 * @param paymentRequest
	 * @return
	 */
	public String buildKafkaMessageRequest(FinancialServiceResponse financialReSponse) {
		
		//TODO : preare the message with the help of FInance Service 
		
		return null;
	}

	/**
	 * @param financialReSponse
	 * @return
	 */
	public PaymentDaoRequest buildDaoRequest(FinancialServiceResponse financialReSponse) {
		// TODO : prepare the dao request with the help of Finance Service
		return null;
	}

}
