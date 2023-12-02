import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutRequest_BDD {
	
	
	@Test
	public void Putdata() 
	
	{
		
		JSONObject jsondata = new JSONObject();
		jsondata.put("name","Nayak");
		jsondata.put("job","Test");
		
		RestAssured.baseURI= "https://reqres.in/api/users/130";
		RestAssured.given().header("Content-type","application/json").contentType(ContentType.JSON).
		body(jsondata.toJSONString()).
		when().put().then().statusCode(200).log().all();
		
		
		
		
	}

}
