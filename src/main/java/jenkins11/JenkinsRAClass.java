package jenkins11;

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

import org.testng.*;
import org.testng.annotations.*;

// import java.net.URI;

public class JenkinsRAClass {

	public static void main(String args[]) {
	
		 given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log()
		  .all();

	}
	
	@Test 
public static void getResponseBody(){
		
		given().queryParam("CUSTOMER_ID","68195")
        .queryParam("PASSWORD","1234!")
        .queryParam("Account_No","1")
        .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
        .body();

		
}

}
