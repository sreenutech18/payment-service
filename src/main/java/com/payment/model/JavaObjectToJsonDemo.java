package com.payment.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjectToJsonDemo {

	public static void main(String[] args) throws JsonProcessingException {
		
		PaymentRequest request = new PaymentRequest();
		
		List<CustomerDetails> customerDetailsList = new ArrayList<CustomerDetails>();
		
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setCustomername("sreenu");
		customerDetails.setCardnumber("05211178911");
		customerDetails.setCvvnum("123");
		customerDetails.setBilldate("09-04-2022");
		customerDetails.setExpdate("12-2022");
		customerDetails.setAmount("1000");
		
		CustomerDetails customerDetails1 = new CustomerDetails();
		customerDetails1.setCustomername("sreenu");
		customerDetails1.setCardnumber("05211178911");
		customerDetails1.setCvvnum("123");
		customerDetails1.setBilldate("09-04-2022");
		customerDetails1.setExpdate("12-2022");
		customerDetails1.setAmount("1000");
		
		customerDetailsList.add(customerDetails);
		customerDetailsList.add(customerDetails1);
		
		
		request.setCustomerDetails(customerDetailsList);
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		String response = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
		
		System.out.println(" response "+response);
		
		
		
		

	}

}
