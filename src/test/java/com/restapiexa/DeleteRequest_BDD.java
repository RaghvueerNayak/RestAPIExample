package com.restapiexa;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteRequest_BDD {
	@Test
	public void DeleteBDD() 
	{
		
				
		RestAssured.baseURI= "https://reqres.in/api/users/130";
		RestAssured.given().
			header("Content-type","application/json").
			contentType(ContentType.JSON).
		when().
			delete().
		then().
			statusCode(204).log().all();
		
		
		
	}

}
