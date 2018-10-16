package RestAPI.Testing.users;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DatabidingPractice {

  Faker faker = new Faker();
  int newUserID ; 
  
  @BeforeClass
  public void init() {
    
    RestAssured.baseURI = "https://www.lalalalalalalal.com.dev.cc" ; 
    RestAssured.basePath = "/wp-json/wp/v2" ; 
  
  }  
  
  @Test
  public void test() {
    
    Map<String,Object> map=new HashMap<>();
    	map.put("title", "ohhhlalal");
    	map.put("content", "mysuper");
    	map.put("status", "publish");
    
    given()
    .relaxedHTTPSValidation()
    .auth().preemptive().basic("admin", "admin")
    .contentType(ContentType.JSON)
    .body("{\n" + 
        "  \n" + 
        "  \"title \":\"abc\",\n" + 
        "  \" content\":\"nmy super\",\n" + 
        "  \"status\":\"publish\"\n" + 
        "\n" + 
        "}").
  when()
    .log().all()
    .post("/posts").
  then()
    //.statusCode(HttpStatus.SC_CREATED)
    .statusCode(201)
    .header("Content-Type" , containsString("application/json") );
   // .body("title.raw", is("abc") ) ; 
    
  }
  
  @Test
  public void PassPojoToObject() {
	  postBody pb= new postBody(faker.book().title(),"laliea","publish");
	  given()
	  	.relaxedHTTPSValidation()
	  	.auth().preemptive().basic("abc", "abc")
	  	.contentType(ContentType.JSON)
	  	.body(pb)
	  .when()
	  	.log().all()
	  	.post("/posts")
	  	.then().statusCode(200);
	  	
  }
  
}



class postBody{
	String title;
	String content;
	String status;
	
	public postBody() {
		
	}
	public postBody(String title, String content, String status) {

		this.title = title;
		this.content = content;
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "postBody [title=" + title + ", content=" + content + ", status=" + status + "]";
	}
	
	
}
