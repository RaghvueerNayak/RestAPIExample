 import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidateBodyResponse {
	
	
	@Test
	
	public void validatebody() 
	
	{
		
	RequestSpecification ReqSpec = RestAssured.given();
	
	Response res = ReqSpec.get("https://reqres.in/api/users?page=2");
	ResponseBody resBody  = res.body();
		
	JsonPath JasonPath = resBody.jsonPath();
	
	String firstname = JasonPath.get("data[4].first_name");
	
	Assert.assertEquals(firstname, "George","Checck Firstname as George");
	
	}

}
