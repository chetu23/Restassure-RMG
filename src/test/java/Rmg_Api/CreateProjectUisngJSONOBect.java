package Rmg_Api;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import io.restassured.http.ContentType;

public class CreateProjectUisngJSONOBect extends BaseAPIClass {
	
	@Test
	public void createP()
	{
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Abhishek");
		jobj.put("projectName", "Xylem"+jLib.getRandomNumber());
		jobj.put("status", "Created");
		jobj.put("teamSize", 15);
		
		
		given()
		 .body(jobj)
		 .contentType(ContentType.JSON)
		.when() 
		 .post(EndPointsLibrary.CreateProject)
		.then()
		  .assertThat().statusCode(201).log().all();
	}

}
