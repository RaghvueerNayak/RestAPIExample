package com.restapiexa;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateBasicAuth_NonPreemptive {
	
	
	@Test
	public void BasicAuth_Nonpre() {
		
	//https://postman-echo.com/basic-auth
	RequestSpecification ReqSpe = RestAssured.given();
	//Non Preemptive Basic Auth : Minimum two request pair required to process a call
	//Rest Assured will not send credential to server initially , when server explicitly asked then provide credentials.
	Response res = ReqSpe.auth().basic("postman","password").get("https://postman-echo.com/basic-auth");
	
	System.out.println(res.statusLine());
	
	}
}
