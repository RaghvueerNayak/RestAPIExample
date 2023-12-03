package com.restapiexa;
import java.util.List;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.path.xml.*;

public class xmlResponse_Approch2 {

@Test
	
	public void  validatexmlresapp2() 
	{
		
		//http://restapi.adequateshop.com/api/Traveler?page=1

		RequestSpecification ResSpe = RestAssured.given();
		ResSpe.baseUri("http://restapi.adequateshop.com");
		ResSpe.basePath("/api/Traveler?page=1");
		ResSpe.header("accept","application/xml");
		Response response = ResSpe.get();
		//response.prettyPrint();
		
		Assert.assertEquals(response.statusCode(), 200);
		//validate single field
		XmlPath obkxmlpath = new XmlPath(response.asString());
		String travvername = obkxmlpath.get("TravelerinformationResponse.travelers.Travelerinformation[2].name").toString();
		Assert.assertEquals(travvername, "vano","Check for traveller name");
		
		//ALl list Traveler on page 1 
		List<String> listname = obkxmlpath.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		
		for (String name:listname) {
			
			System.out.println("Traverler name :" + name);
			
			
		}
			
			
		}
			
	}



