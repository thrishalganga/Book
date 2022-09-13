package Com.Automation.Stepdef;

import Com.Automation.Pages.Createpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
	Createpage cp=new Createpage();
	
	@Given("open book post")
	public void open_book_post() {
	   cp.create();
	}
	
	@When("Enter valid book id to create")
	public void enter_valid_book_id_to_create() {
	   cp.tryitout();
	   cp.execute();
	   cp.scroll();
	}

	@Then("post book information")
	public void post_book_information() {
	    cp.executionstatus();
	    cp.getfield();
	}


}
