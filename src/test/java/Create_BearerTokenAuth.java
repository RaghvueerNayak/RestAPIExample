import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create_BearerTokenAuth {
	
	@Test
	
	public void BearerToken() 
	
	{
		
		RequestSpecification reqSpe = RestAssured.given();
		
		reqSpe.baseUri("https://gorest.co.in");
		reqSpe.basePath("/public/v2/users");
		
		JSONObject payload = new JSONObject();
		payload.put("name", "fsdfsdf");
		payload.put("gender", "Male");
		payload.put("email", "asdfsad@gmail.com");
		payload.put("status", "Active");
		
		String bearertok = "Bearer ee8e08288fe5f9f5f9d67ab4acb34c14c1c4b303abba2bdfbdded4c777f3de78";
		reqSpe.header("Authorization", bearertok)
		.contentType(ContentType.JSON)
		.body(payload.toJSONString());
		
		Response res = reqSpe.post();
		Assert.assertEquals(res.statusCode(), 201,"Status code");
		
		 
		
		
	}

}
