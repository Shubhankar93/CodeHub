package DemoAutomation.DemoAPIAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoClass {
	
	
	
	@Test
	public void VerifyResponseCode200() {
		
		Response response = RestAssured.get("https://www.google.co.in/");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
	
		
	}

}
