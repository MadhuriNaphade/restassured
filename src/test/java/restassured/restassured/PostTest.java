package restassured.restassured;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;
public class PostTest 
{
@Test
public void testRestA()
{
		
RestAssured.baseURI= "http://restapi.demoqa.com/customer";
RequestSpecification req = RestAssured.given();
JSONObject requestParams = new JSONObject();
requestParams.put("FirstName", "Virender"); 
requestParams.put("LastName", "Singh");
requestParams.put("UserName", "simpleuser001");
requestParams.put("Password", "password1");
requestParams.put("Email",  "someuser@gmail.com");
}

}
