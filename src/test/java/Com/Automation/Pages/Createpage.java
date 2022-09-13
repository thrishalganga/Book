package Com.Automation.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createpage extends BasePage{
	@FindBy(id="operations-Books-post_api_v1_Books")
	private WebElement Clickcreate;
	@FindBy(xpath="//button[text()='Try it out ']")
	private WebElement clicktry;
	@FindBy(xpath="//button[text()='Execute']")
	private WebElement clickexecute;
	@FindBy(xpath="//pre[@class=' microlight']")
	private WebElement getfield;
	@FindBy(xpath="//h4[text()='Server response']/..//td[@class='response-col_status']")
	private WebElement getserverresponse;
	
	public void create()
	{
		Clickcreate.click();
	}
	public void tryitout()
	{
		clicktry.click();
	}
	public void scroll()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String scrolldwn="window.scrollBy(0,1000)";
		js.executeScript(scrolldwn);
	}
	public void execute()
	{
		clickexecute.click();
	}
	public void getfield()
	{
		String abc=getfield.getText();
		System.out.println("The post(created) item is:"+abc);
	}
	public void executionstatus()
	{
		String res=getserverresponse.getText();
		System.out.println("\n"+"status is: "+res+"\n");
	}
	

}
