package Com.Automation.GenericUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.hamcrest.core.IsEqual;

import Com.Automation.pojo.Putpojo;

import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class ApiUtils {
	public void getmethod()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").when().log().all().get("/api/v1/Books/")
		.then().log().all().assertThat().statusCode(200);
	}
	
	public void createmethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\thrishal.g\\eclipse-workspace\\Pbook\\src\\test\\resources\\postbook.txt"))
		.header("Content-Type","application/json")
		.when().log().all().post("/api/v1/Books").then().log().all().assertThat().statusCode(200);
		
	}
	
	public void updatemethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\thrishal.g\\eclipse-workspace\\Pbook\\src\\test\\resources\\putbook.txt"))
		.header("Content-Type","application/json")
		.when().log().all().put("/api/v1/Books/10").then().log().all().assertThat().statusCode(200).log().all()
		.assertThat().body("excerpt", equalTo("string"));	
	}
	
	public void deletemethod()
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net").when().log().all().delete("/api/v1/Books/15")
		.then().log().all().assertThat().statusCode(200).statusLine("HTTP/1.1 200 OK").log().all();
	}
	
	public void partialupdatemethod() throws FileNotFoundException
	{
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.body(getFileContent("C:\\Users\\thrishal.g\\eclipse-workspace\\Pbook\\src\\test\\resources\\patchbook.txt"))
		.header("Content-Type","application/json")
		.when().log().all().patch("/api/v1/Books/1").then().statusCode(200);
	}
	
	public void sertest1()
	{
		Putpojo pojo=new Putpojo(10, "books10", "description book", 100, "hello", "2022-09-12T06:40:41.450Z");
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net")
		.header("Content-Type","application/json").body(pojo)
		.when().log().all().put("/api/v1/Books/10").then().log().all();
	}
		
	
	public static String getFileContent(String filepath) throws FileNotFoundException
	{
		File file=new File(filepath);
		Scanner sc= new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}

}
