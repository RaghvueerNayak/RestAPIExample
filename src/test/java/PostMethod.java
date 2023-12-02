import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostMethod {
	
	@Test
	public void Get_BDDformat() 
	{
		
		JSONObject jsondata = new JSONObject();
		jsondata.put("name","Raghuveer");
		jsondata.put("job","QA");
		
		RestAssured.baseURI= "https://reqres.in/api/users";
		RestAssured.given().header("Content-type","application/json").contentType(ContentType.JSON).
		body(jsondata.toJSONString()).
		when().post().then().statusCode(201).log().all();
		
		
	}

}
