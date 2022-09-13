package Com.Automation.Stepdef;

import Com.Automation.Pages.Deletepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteSteps {
	Deletepage dp=new Deletepage();
	
	@Given("open book Delete")
	public void open_book_delete() {
		dp.delete();
	    
	}

	@When("Enter valid book id to Delete")
	public void enter_valid_book_id_to_delete() {
		dp.tryitout();
		dp.id();
		dp.execute();
	    
	}

	@Then("Delete book information")
	public void delete_book_information() {
		dp.status();
		dp.executionstatus();
	    
	}


}
