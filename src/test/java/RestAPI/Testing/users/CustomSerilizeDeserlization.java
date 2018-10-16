package RestAPI.Testing.users;
import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import RestAPI.Testing.users.POJO.GOT_Character;

public class CustomSerilizeDeserlization {

  
  @Test
  public void test() throws Exception{
    
    //String greeting = "{\"name\":\"Adam\" , \"message\":\"Hello\"}" ; 
    
    String greeting = "{\"name\":\"Adam\" , \"message\":\"Hello\" , \"extraMessage\":\"goodbye\"}" ; 
    
    ObjectMapper mapper = new ObjectMapper(); 
    
    Greeting g1 = mapper.readValue(greeting , Greeting.class) ; 
    System.out.println(g1);
    
    System.out.println("--------------------");
    String str2 = mapper.writeValueAsString(g1) ; 
    System.out.println(str);
    
    
    
  }

  
  
  String str  = " [\n" + 
      "    {\n" + 
      "        \"_id\": \"56ffc5be043244081938576d\",\n" + 
      "        \"male\": true,\n" + 
      "        \"house\": \"House Hightower\",\n" + 
      "        \"slug\": \"Abelar_Hightower\",\n" + 
      "        \"name\": \"Abelar Hightower\",\n" + 
      "        \"__v\": 0,\n" + 
      "        \"pageRank\": 2.5,\n" + 
      "        \"books\": [\n" + 
      "            \"The Hedge Knight\"\n" + 
      "        ],\n" + 
      "        \"updatedAt\": \"2016-04-02T13:14:38.834Z\",\n" + 
      "        \"createdAt\": \"2016-04-02T13:14:38.834Z\",\n" + 
      "        \"titles\": [\n" + 
      "            \"Ser\"\n" + 
      "        ]\n" + 
      "    },\n" + 
      "    {\n" + 
      "        \"_id\": \"56ffc5be043244081938576e\",\n" + 
      "        \"male\": true,\n" + 
      "        \"house\": \"House Frey\",\n" + 
      "        \"slug\": \"Addam_Frey\",\n" + 
      "        \"name\": \"Addam Frey\",\n" + 
      "        \"__v\": 0,\n" + 
      "        \"pageRank\": 4.5,\n" + 
      "        \"books\": [\n" + 
      "            \"The Mystery Knight\"\n" + 
      "        ],\n" + 
      "        \"updatedAt\": \"2016-04-02T13:14:38.875Z\",\n" + 
      "        \"createdAt\": \"2016-04-02T13:14:38.875Z\",\n" + 
      "        \"titles\": [\n" + 
      "            \"Ser\"\n" + 
      "        ]\n" + 
      "    },\n" + 
      "    {\n" + 
      "        \"_id\": \"56ffc5be043244081938576f\",\n" + 
      "        \"male\": true,\n" + 
      "        \"slug\": \"Addam\",\n" + 
      "        \"name\": \"Addam\",\n" + 
      "        \"__v\": 0,\n" + 
      "        \"pageRank\": 1.5,\n" + 
      "        \"books\": [\n" + 
      "            \"The Mystery Knight\"\n" + 
      "        ],\n" + 
      "        \"updatedAt\": \"2016-04-02T13:14:38.877Z\",\n" + 
      "        \"createdAt\": \"2016-04-02T13:14:38.877Z\",\n" + 
      "        \"titles\": [\n" + 
      "            \"Ser\"\n" + 
      "        ]\n" + 
      "    } ] " ; 
  
  @Test
  public void GOT_Charater() throws JsonParseException, JsonMappingException, IOException {
	  String str2="{\n" + 
	  		"	\"id\":56ffc5be0432488,\n" + 
	  		"	\"male\":true,\n" + 
	  		"	\"house\":\"House Yuuuannn\",\n" + 
	  		"	\"name\":\"Yuan Gao lalala\"\n" + 
	  		"}";
	  
	  ObjectMapper om= new ObjectMapper();
	
	  
	  
	  
	  GOT_Character[] people = om.readValue(str, GOT_Character[].class);
	  System.out.println(Arrays.toString(people));
  }
  
}

@JsonIgnoreProperties(ignoreUnknown = true )
//@JsonIgnoreProperties("extraMessage")
class Greeting{
  
  String name ; 
  String message ; 
  
  public Greeting() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public String toString() {
    return "Greeting [name=" + name + ", message=" + message + "]";
  }

  public Greeting(String name, String message) {
    super();
    this.name = name;
    this.message = message;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
  
  
  
  
  //extra field 
  //String extraMessage ; 
  
}
