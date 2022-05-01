/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.client;

import org.springframework.stereotype.Component;

import com.payment.model.FinancialServiceRequest;
import com.payment.model.FinancialServiceResponse;

/**
 * @author sreenu,27-Apr-2022
 * Description :
 */

@Component
public class FinancialServiceImpl implements IFinancialService{

	@Override
	public FinancialServiceResponse doPayments(FinancialServiceRequest finsServiceRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
