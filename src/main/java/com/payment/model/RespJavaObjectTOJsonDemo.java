package com.payment.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RespJavaObjectTOJsonDemo {

	public static void main(String[] args) throws JsonProcessingException {

		PaymentResponse paymentResponse = new PaymentResponse();
		
		
		List<PaymentStatus> paymentStatusList = new ArrayList<PaymentStatus>();
		
		PaymentStatus paymentStatus = new PaymentStatus();
		paymentStatus.setMobilenumber("9100947494");
		paymentStatus.setTxnstatus("completed");
		
		PaymentStatus paymentStatus1 = new PaymentStatus();
		paymentStatus1.setMobilenumber("9100947494");
		paymentStatus1.setTxnstatus("completed");
		
		
		PaymentStatus paymentStatus2 = new PaymentStatus();
		paymentStatus2.setMobilenumber("9100947494");
		paymentStatus2.setTxnstatus("completed");
		
		paymentStatusList.add(paymentStatus);
		paymentStatusList.add(paymentStatus1);
		
		
		
		
		StatusBock status = new StatusBock();
		status.setRespCode("0");
		status.setRespMsg("success");
		
		//set status
		paymentResponse.setStatus(status);
		
		//set paymentStatusList
		paymentResponse.setPaymentStatus(paymentStatusList);
		
		//convert java object to json
		
		ObjectMapper mapper = new ObjectMapper();
		
		String response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(paymentResponse);
		
		System.out.println("payment response is :  "+response);
		
		
		
	}

}
