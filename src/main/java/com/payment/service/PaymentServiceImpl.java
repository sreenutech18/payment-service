/** @Copyright 2022 Keybank pvt ltd. All rights are reserved, you should not
 *  disclose the information outside otherwise terms and conditions will apply
 */
package com.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.payment.builder.PaymentRequestBuilder;
import com.payment.builder.PaymentResponseBuilder;
import com.payment.client.IFinancialService;
import com.payment.dao.IPaymentDao;
import com.payment.message.publisher.PaymentKafkaPublisher;
import com.payment.model.FinancialServiceRequest;
import com.payment.model.FinancialServiceResponse;
import com.payment.model.PaymentDaoRequest;
import com.payment.model.PaymentDaoResponse;
import com.payment.model.PaymentRequest;
import com.payment.model.PaymentResponse;

/**
 * @author sreenu,08-Apr-2022 Description :
 */
@Component
public class PaymentServiceImpl implements IPaymentService {

	@Autowired
	IFinancialService iFinancialService;

	@Autowired
	PaymentKafkaPublisher kafakaPublisher;

	@Autowired
	IPaymentDao paymentDao;

	@Autowired
	PaymentRequestBuilder requestBuilder;

	@Autowired
	PaymentResponseBuilder responseBuilder;

	@Override
	public PaymentResponse doPayments(PaymentRequest paymentRequest) {

		PaymentDaoResponse daoResponse = null;
		PaymentResponse paymentResponse = null;

		// 1. prepare the request for Financial Service

		FinancialServiceRequest financialRequest = requestBuilder.buildFinancialREquest(paymentRequest);

		// 2. call Financial Service and get the response

		FinancialServiceResponse financialReSponse = iFinancialService.doPayments(financialRequest);

		// 3. validate financialReSponse object, if it is valid then call
		// KafkaMessagePublisher and Dao calls

		// 4. prepae the request for kafka message publisher

		String message = requestBuilder.buildKafkaMessageRequest(financialReSponse);

		// 5. prepare the request for dao

		PaymentDaoRequest paymentDaoRequest = requestBuilder.buildDaoRequest(financialReSponse);

		if (financialReSponse != null) {

			// invoke parellel calls and get the response

			kafakaPublisher.paymentStatus(message);

			daoResponse = paymentDao.paymentStatusUpdate(paymentDaoRequest);

		}

		

		return responseBuilder.buildPaymentResponse(daoResponse, financialReSponse);;
	}

}
