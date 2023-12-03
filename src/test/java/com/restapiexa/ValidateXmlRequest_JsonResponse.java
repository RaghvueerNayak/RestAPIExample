package com.restapiexa;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateXmlRequest_JsonResponse {
	
	@Test
	
	public void XmlRequest_JsonResponse() 
	
	{
		
		String jsonreqquest = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
				+ "<Pet>\r\n"
				+ "	<id>0</id>\r\n"
				+ "	<Category>\r\n"
				+ "		<id>0</id>\r\n"
				+ "		<name>string</name>\r\n"
				+ "	</Category>\r\n"
				+ "	<name>doggie</name>\r\n"
				+ "	<photoUrls>\r\n"
				+ "		<photoUrl>string</photoUrl>\r\n"
				+ "	</photoUrls>\r\n"
				+ "	<tags>\r\n"
				+ "		<Tag>\r\n"
				+ "			<id>0</id>\r\n"
				+ "			<name>string</name>\r\n"
				+ "		</Tag>\r\n"
				+ "	</tags>\r\n"
				+ "	<status>available</status>\r\n"
				+ "</Pet>";

		//https://petstore.swagger.io/v2/pet

		RequestSpecification ResSpe = RestAssured.given();
		ResSpe.baseUri("https://petstore.swagger.io");
		ResSpe.basePath("/v2/pet");
		ResSpe.header("accept","application/xml");
		ResSpe.header("Content-Type","application/xml");
		ResSpe.body(jsonreqquest);
		Response response = ResSpe.post();
		response.prettyPrint();

		
		
	}

}
