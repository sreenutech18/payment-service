package com.payment.model;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaObect {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		PaymentRequest request = mapper.readValue(
				new File("D:\\project-ws\\abpc\\payment-service\\src\\main\\resources\\payment-request.json"),
				PaymentRequest.class);
		
		System.out.println(request);

	}

}
