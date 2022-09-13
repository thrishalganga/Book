package Com.Automation.Stepdef;

import Com.Automation.Pages.PutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PutSteps {
	PutPage pp=new PutPage();
	
	@Given("open book put")
	public void open_book_put() {
	    pp.put();
	}

	@When("Enter valid book id to update")
	public void enter_valid_book_id_to_update() {
	    pp.tryitout();
	    pp.id();
	    pp.execute();
	    pp.scroll();
	}

	@Then("put book information")
	public void put_book_information() {
		pp.getfield();
		pp.executionstatus();
	    
	}


}
