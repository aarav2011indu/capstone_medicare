package rest_api_request;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequest {
	
	@Test
	public void test1() {
		
		RestAssured.given()
					.baseUri("http://localhost:8080/medicare/json/data/all/products")
					.contentType("application/json")
					.when()
					.get("products")
					.then()
					.log()
					.all()
					.statusCode(200);	
		
	}

	
	
}
	