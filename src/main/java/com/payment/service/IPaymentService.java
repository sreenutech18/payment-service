/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.service;

import com.payment.model.PaymentRequest;
import com.payment.model.PaymentResponse;

/**
 * @author sreenu,08-Apr-2022
 * Description :
 */
public interface IPaymentService {
	
	
	PaymentResponse doPayments(PaymentRequest request);

}
