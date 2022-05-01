/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.dao;

import com.payment.model.PaymentDaoRequest;
import com.payment.model.PaymentDaoResponse;
import org.springframework.stereotype.Component
/**
 * @author sreenu,08-Apr-2022
 * Description :
 */
 @Component
public class PaymentDaoImpl implements IPaymentDao {

	@Override
	public PaymentDaoResponse paymentStatusUpdate(PaymentDaoRequest daoRequest) {
		
		return null;
	}

}
