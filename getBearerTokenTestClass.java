package MyBearerTokenTestPackage;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getBearerTokenTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Test");
		
		getBearerTokenTestClass gbt = new getBearerTokenTestClass();
		gbt.testResponse();testResponse();
				
		//http://samples.openweathermap.org/data/2.5/weather?q=London\u0026appid=b1b15e88fa797225412429c1c50c122a1
	}
	
	public static void testResponse()
	
	  {
		Response BT = io.restassured.RestAssured.get("https://api.twitter.com/1.1/search/tweets.json?q=from%3Atwitterdev&result_type=mixed&count=2");

	    }
	
	


}
