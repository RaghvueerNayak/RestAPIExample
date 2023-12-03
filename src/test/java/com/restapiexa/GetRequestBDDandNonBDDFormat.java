package com.restapiexa;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestBDDandNonBDDFormat {
	
	@Test(enabled=false)
	//https://reqres.in/api/users/2
	public void testcase01_NonBDDFormat() 
	{
		System.out.println("****************Non BDD format *********************");
		Response resp = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(resp.asString());
		System.out.println("NON BDD _Status code is : " + resp.getStatusCode());
		System.out.println("NON BDD _Response Body  : " + resp.getBody().asString());
		System.out.println("NON BDD _Response Time : " + resp.getTime());
		System.out.println("NON BDD _Response header : " + resp.getHeader("Content-Type"));
		System.out.println(resp.prettyPrint());
		
		//Validate response code should be 200
		Assert.assertEquals(resp.getStatusCode(), 200);
		
	
		
			
	}
@Test
	public void testcase02_BDDFormat() 
	{
		System.out.println("****************BDD format *********************");
		
		//Given/When/Then format 
		RestAssured.baseURI = "https://reqres.in/api/users/";
		RequestSpecification rests = RestAssured.given().queryParam("pages", "2");
		RestAssured.when()
		.get()
		.then()
		.statusCode(200);
		
		
		
	}
}
