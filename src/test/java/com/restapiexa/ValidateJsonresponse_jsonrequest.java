package com.restapiexa;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateJsonresponse_jsonrequest {
	
	
	@Test
	 public void Jsonrequest_Jsonresponse() 
	
	{
		
	String jsonreqquest = "{\r\n"
			+ "  \"id\": 0,\r\n"
			+ "  \"category\": {\r\n"
			+ "    \"id\": 0,\r\n"
			+ "    \"name\": \"string\"\r\n"
			+ "  },\r\n"
			+ "  \"name\": \"doggie\",\r\n"
			+ "  \"photoUrls\": [\r\n"
			+ "    \"string\"\r\n"
			+ "  ],\r\n"
			+ "  \"tags\": [\r\n"
			+ "    {\r\n"
			+ "      \"id\": 0,\r\n"
			+ "      \"name\": \"string\"\r\n"
			+ "    }\r\n"
			+ "  ],\r\n"
			+ "  \"status\": \"available\"\r\n"
			+ "}";
	
		//https://petstore.swagger.io/v2/pet

		RequestSpecification ResSpe = RestAssured.given();
		ResSpe.baseUri("https://petstore.swagger.io");
		ResSpe.basePath("/v2/pet");
		ResSpe.header("accept","application/json");
		ResSpe.header("Content-Type","application/json");
		ResSpe.body(jsonreqquest);
		Response response = ResSpe.post();
		response.prettyPrint();
		
		
		
	}

}
