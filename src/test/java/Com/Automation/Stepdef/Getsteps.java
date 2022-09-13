package Com.Automation.Stepdef;

import java.util.concurrent.TimeUnit;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.Pages.GetPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Getsteps {
	GetPage gp=new GetPage();
	@Given("Open the browser")
	public void open_the_browser() {
		DriverUtils.getDriver().get("https://fakerestapi.azurewebsites.net/index.html");
		DriverUtils.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	}

	@Given("open book get")
	public void open_book_get() {
	    gp.get();
	}

	@When("Enter valid book id")
	public void enter_valid_book_id() {
	    gp.tryitout();
	    gp.execute();
	}

	@Then("get book information")
	public void get_book_information() {
	    gp.getfield();
	}

}
