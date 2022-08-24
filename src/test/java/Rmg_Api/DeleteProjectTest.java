package Rmg_Api;

import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;

import static io.restassured.RestAssured.*;

public class DeleteProjectTest extends BaseAPIClass {
	
	@Test
	public void deleteP()
	{
		
		when()
		 .delete(EndPointsLibrary.DeleteProject+"TY_PROJ_815")
		.then()
		 .assertThat().statusCode(204).log().all();
	}

}
