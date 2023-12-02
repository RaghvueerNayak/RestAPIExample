import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class validateHeaderResponse {
	
	@Test
	
	public void validate_headerResponse()
	{
		
		
		RequestSpecification ResSpc= RestAssured.given();
		
		Response HeaderRes = ResSpc.get("https://reqres.in/api/users/2");
		String Headersinglevalue = HeaderRes.getHeader("Content-Type");
		System.out.println("Single Header value  : " + Headersinglevalue);
		
		Headers headerList = HeaderRes.getHeaders();
		
		for(Header header:headerList)
		{
			
			System.out.println(header.getName() + " " + header.getValue());
			
		}
	}

}
