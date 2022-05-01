/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.model;

import lombok.Data;

/**
 * @author sreenu,09-Apr-2022
 * Description :
 */

@Data
public class CustomerDetails {
	
	private String customername;
	private String cardnumber;
	private String cvvnum;	 
	private String expdate;	 
	private String mobilnumber;
	private String amount;	 
	private String billdate;	 
 

}
