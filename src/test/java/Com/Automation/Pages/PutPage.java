package Com.Automation.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PutPage extends BasePage{
	@FindBy(id="operations-Books-put_api_v1_Books__id_")
	private WebElement Clickput;
	@FindBy(xpath="//button[text()='Try it out ']")
	private WebElement clicktry;
	@FindBy(xpath="//input[@placeholder='id']")
	private WebElement Inputid;
	@FindBy(xpath="//button[text()='Execute']")
	private WebElement clickexecute;
	@FindBy(xpath="//pre[@class=' microlight']")
	private WebElement getfield;
	@FindBy(xpath="//h4[text()='Server response']/..//td[@class='response-col_status']")
	private WebElement getserverresponse;
	
	public void put()
	{
		Clickput.click();
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
	public void id()
	{
		Inputid.sendKeys("3");
		
		
	}
	public void execute()
	{
		clickexecute.click();
	}
	public void getfield()
	{
		String abc=getfield.getText();
		System.out.println("The put(updated) item is:"+abc);
	}
	public void executionstatus()
	{
		String res=getserverresponse.getText();
		System.out.println("\n"+"status is: "+res+"\n");
	}
	

}


