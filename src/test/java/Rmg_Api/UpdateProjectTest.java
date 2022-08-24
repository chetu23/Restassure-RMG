package Rmg_Api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import ProjectLibrary.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectTest extends BaseAPIClass {
	
	@Test
	public void updateProject()
	{
				
		
		 ProjectLibrary obj = new ProjectLibrary("chetan", "xylem", "created", 10);
		
		given()
		  .body(obj)
		  .contentType(ContentType.JSON)
		.when()
		  .put(EndPointsLibrary.UpdateProject+"TY_PROJ_811")
		.then()
		  .assertThat().statusCode(200)
		  .log().all();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
