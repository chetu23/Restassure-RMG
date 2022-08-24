package Rmg_Api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import ProjectLibrary.ProjectLibrary;
import io.restassured.http.ContentType;

public class DuplicateTest extends BaseAPIClass{
	@Test
	public void duplicaTest() {
    		 ProjectLibrary pLib = new ProjectLibrary("chetan", "tyss", "ongoing", 10);
    		 
    		 given().body(pLib).contentType(ContentType.JSON)
    		 .when().post(EndPointsLibrary.CreateProject)
    		 .then().assertThat().statusCode(409);
		
	}

}
