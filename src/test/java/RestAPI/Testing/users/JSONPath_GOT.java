package RestAPI.Testing.users;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JSONPath_GOT {
	
	
	/*
	   * use this end point -- GET https://api.got.show/api/characters/
	   * get only the characters belong to house stark 
	   *  tips -- use findAll method 
	   * and get the count of it 
	   * and print out as String 
	   * */
	@Test
	public void testJsonPath() {
		Response rs=RestAssured.given()
			.relaxedHTTPSValidation()
			.contentType(ContentType.JSON)
			.get("https://api.got.show/api/characters");
		
		JsonPath jp=rs.jsonPath();
		
		List<String> ls = jp.getList("findAll{it.house=='House Stark'}.name",String.class);
		System.out.println(ls.size());
	}

}
