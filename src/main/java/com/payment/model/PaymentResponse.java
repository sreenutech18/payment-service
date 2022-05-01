/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.model;

import java.util.List;

import lombok.Data;

/**
 * @author sreenu,08-Apr-2022
 * Description :
 */

@Data
public class PaymentResponse {
	
	private StatusBock status;
	private List<PaymentStatus> paymentStatus;

}
