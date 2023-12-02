import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ValidateResponse {
	@Test
	public void validateresponse() 
	{
		//https://reqres.in/api/users/2
		
		//Get Request Specification request 
		
		RequestSpecification requestSpec = RestAssured.given();
		
		Response res =  requestSpec.get("https://reqres.in/api/users/2");
		
		ValidatableResponse validateRes = res.then();
		validateRes.statusCode(200);
		validateRes.statusLine("HTTP/1.1 200 OK");
	}
	
}
