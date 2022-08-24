package Rmg_Api;

import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectUsingJSONFile extends BaseAPIClass{
	
	@Test
	public void createP()
	{
		
		
		File file = new File(".\\TestData\\data.json");
		
		
		given()
		 .body(file)
		 .contentType(ContentType.JSON)
	    .when()
	     .post(EndPointsLibrary.CreateProject)
	    .then().log().all();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
