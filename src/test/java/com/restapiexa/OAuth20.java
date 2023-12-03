package com.restapiexa;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class OAuth20 {
	
	@Test
	public void OAuth2()
	{
		//https://api-m.sandbox.paypal.com/v1/oauth2/token
		RequestSpecification request = RestAssured.given();
		request.baseUri("https://api-m.sandbox.paypal.com");
		request.basePath("/v1/oauth2/token");
		
		//Basic Auth
		//request.auth().preemptive().basic(null, null)
		
		
		
		
		
	}

}
