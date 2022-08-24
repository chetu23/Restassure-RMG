package Rmg_Api;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import ProjectLibrary.ProjectLibrary;
import io.restassured.http.ContentType;



public class CreateProjectTest extends BaseAPIClass  {
	
	@Test
	public void createProjectTest()
	{
		
		 ProjectLibrary pLib = new ProjectLibrary("chetan", "tyss-"+jLib.getRandomNumber(), "created", 12);
		
		given()
		 .body(pLib)
		 .contentType(ContentType.JSON)
		.when() 
		 .post(EndPointsLibrary.CreateProject)
		.then()
		  .assertThat().statusCode(201).log().all();
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
