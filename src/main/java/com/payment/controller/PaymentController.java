/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.payment.model.PaymentRequest;
import com.payment.model.PaymentResponse;
import com.payment.service.IPaymentService;
import com.payment.validator.PaymentRequestValidator;

/**
 * @author sreenu,08-Apr-2022
 * Description :
 */

@RestController
@RequestMapping("/v1")
public class PaymentController {
	
	@Autowired
	PaymentRequestValidator paymentRequestValidator;
	
	@Autowired
	IPaymentService paymentService;
	
	
	
	@ResponseBody
	@RequestMapping(value="/payments", method=RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public PaymentResponse doPayments(@RequestBody PaymentRequest paymentRequest,
									@Validated @RequestHeader("client-id") String clientId,
									@Validated @RequestHeader("requestId") String requestId,
									@Validated @RequestHeader("messageTS") String messageTS) {
		
		//1. validate the request
		
		paymentRequestValidator.validateRequest(paymentRequest);
		
		//2. prepare the request for service 
		
		PaymentResponse response = paymentService.doPayments(paymentRequest);
		
		//3. call the service and get the response
		
		//4. prepare the response and send to consumer/client
		
		
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value="/upload", method=RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public PaymentResponse payments(@RequestParam("file") MultipartFile file) {
		
		//1. got the file from consumer/client
		//2. parse/read the file and read line by line from file, split the file into multiple records
		//3. prepare the java object
		
		
		return null;
		
		
	}
	
	
	@RequestMapping(value="/payment/{mobileNum}/{paymentdate}", method=RequestMethod.GET,
					produces="application/json")
	public String paymentStatus(@PathVariable("mobileNum") String mobileNum, 
								@PathVariable("paymentdate") String paymentDate) {
		
		
			
		
		return null;
	
		
	}
	
	

}
