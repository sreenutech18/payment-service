/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.client;

import com.payment.model.FinancialServiceRequest;
import com.payment.model.FinancialServiceResponse;

/**
 * @author sreenu,27-Apr-2022
 * Description :
 */
public interface IFinancialService {
	
	FinancialServiceResponse doPayments(FinancialServiceRequest finsServiceRequest);

}
