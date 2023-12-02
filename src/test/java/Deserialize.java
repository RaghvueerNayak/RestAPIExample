import org.testng.annotations.Test;
import org.json.simple.*;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Deserialize {
	
	@Test
	public void DeserializeJsonResponse() 
	
	
	{
		//Request Specification 
		RequestSpecification resquest = RestAssured.given(); 
		resquest.baseUri("https://reqres.in");
		resquest.basePath("/api/users");
		
		//Create request body 
		JSONObject jsondata = new JSONObject();
		jsondata.put("name","Raghuveer");
		jsondata.put("job","QA");
		
		
		//post request
		
		Response response = resquest
		.contentType(ContentType.JSON)
		.body(jsondata.toJSONString())
		.post();	
		
		
		ResponseBody responsebody = response.getBody();
		
		//Deserialize to class object
		
		DesrilizationClass responseclass = responsebody.as(DesrilizationClass.class);
		
		Assert.assertEquals(responseclass.name,"Raghuveer");		
		Assert.assertEquals(responseclass.job,"QA");	
		
		
		
	}

}
