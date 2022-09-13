package Com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetPage extends BasePage{
	
	@FindBy(id="operations-Books-get_api_v1_Books")
	private WebElement Clickget;
	@FindBy(xpath="//button[text()='Try it out ']")
	private WebElement clicktry;
	@FindBy(xpath="//button[text()='Execute']")
	private WebElement clickexecute;
	@FindBy(xpath="//pre[@class=' microlight']")
	private WebElement getfield;
	
	public void get()
	{
		Clickget.click();
	}
	public void tryitout()
	{
		clicktry.click();
	}
	public void execute()
	{
		clickexecute.click();
	}
	public void getfield()
	{
		String abc=getfield.getText();
		System.out.println("the get items are:"+abc);
	}

}
