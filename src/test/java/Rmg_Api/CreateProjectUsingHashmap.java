package Rmg_Api;

import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateProjectUsingHashmap extends BaseAPIClass {
	
	@Test
	public void createP()
	{
		
		//create data
		HashMap map = new HashMap();
		map.put("createdBy", "Rahul");
		map.put("projectName", "Xylem"+jLib.getRandomNumber());
		map.put("status", "Created");
		map.put("teamSize", 12);
		
		//send request and validate response
		given()
		  .body(map)
		  .contentType(ContentType.JSON)
		.when()
		  .post(EndPointsLibrary.CreateProject)
		.then()
		   .assertThat().statusCode(201).log().all();
		
		
		
		
		
		
		
		
	}

}
