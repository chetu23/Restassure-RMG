package Rmg_Api;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import ProjectLibrary.ProjectLibrary;
import io.restassured.http.ContentType;

public class CreateProjectUsingPOJO extends BaseAPIClass  {
	
	@Test
	public void createP()
	{
		
		
		
		ProjectLibrary pLib = new ProjectLibrary("Chaitra", "tyss-"+jLib.getRandomNumber(), "Created", 24);
		
		given()
		 .body(pLib)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .assertThat().statusCode(201).log().all();
	}

}
