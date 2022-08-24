package Rmg_Api;

import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;

import static io.restassured.RestAssured.*;

public class GetSingleProjectTest extends BaseAPIClass  {
	
	@Test
	public void getSingleProject()
	{
		
		
		when()
		  .get(EndPointsLibrary.SingleProject+"TY_PROJ_1203")
		.then()
		  .log().all();
	}

}
