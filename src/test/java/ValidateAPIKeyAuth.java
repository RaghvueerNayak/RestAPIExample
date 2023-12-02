import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateAPIKeyAuth {
	
	@Test
	public void APIKey()
	
	{
		//https://api.openweathermap.org/data/2.5/weather?q={city id}&appid={API key}
		RequestSpecification request =  RestAssured.given();
		request.baseUri("https://api.openweathermap.org");
		request.basePath("/data/2.5/weather");
		request.queryParam("q", "mumbai").queryParam("appid", "1c22aeecfc35c5b651332bfc11592079");
		Response res= request.get();
		
		Assert.assertEquals(res.statusCode(), 200);
		
				
		
	}

}
