import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateQueryParam {

	
	@Test
	
	public void validateQueery() 
	
	{
		
		RequestSpecification reqspec = RestAssured.given();
		
		reqspec.baseUri("https://reqres.in/");
		reqspec.basePath("/api/users");
		reqspec.queryParam("page", "2").queryParam("id", "10");
		
		Response res =  reqspec.get();
		
		String  pretypri= res.prettyPrint();
		
		JsonPath jason = res.jsonPath();
		
		String jasonview = jason.get("data.first_name");
		
		System.out.println("jasonview " +jasonview);
		
		
		
	}
	
	
}
