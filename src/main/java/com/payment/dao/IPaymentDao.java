/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.dao;

import com.payment.model.PaymentDaoRequest;
import com.payment.model.PaymentDaoResponse;


public interface IPaymentDao {
	
	PaymentDaoResponse paymentStatusUpdate(PaymentDaoRequest daoRequest);

}
