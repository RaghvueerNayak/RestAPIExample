
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateResponseAssert {
	@Test
	public void validateresgetmethod() 
	{
		//https://reqres.in/api/users/2
		
		//specify base URL
		//RestAssured.baseURI = "https://reqres.in/api/users/2";
		
		//Get Request Specification request 
		
		RequestSpecification requestSpec = RestAssured.given();
		
		Response res =  requestSpec.get("https://reqres.in/api/users/2");
		
		int StatusCode = res.getStatusCode();
		
		System.out.println(StatusCode);
		Assert.assertEquals(StatusCode, 200,"Correct Status Code:");
		
		String StatusLine = res.getStatusLine();
		System.out.println(StatusLine);
		Assert.assertEquals(StatusLine, "HTTP/1.1 200 OK","Correct Status Line:");
		
	}

}
