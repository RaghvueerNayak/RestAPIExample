import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateBasicAuth_Premptive {


	@Test
	public void BasicAuth_pre() {
		
	//https://postman-echo.com/basic-auth
	RequestSpecification ReqSpe = RestAssured.given();
	//Rest Assured will  send credential to server first attempt even if server will ask for credential or not.
	Response res = ReqSpe.auth().preemptive().basic("postman","password").get("https://postman-echo.com/basic-auth");
	
	System.out.println(res.statusLine());
	
	}

	
}
