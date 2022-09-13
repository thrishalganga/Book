package Com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Deletepage extends BasePage{
	@FindBy(id="operations-Books-delete_api_v1_Books__id_")
	private WebElement Clickdelete;
	@FindBy(xpath="//button[text()='Try it out ']")
	private WebElement clicktry;
	@FindBy(xpath="//input[@placeholder='id']")
	private WebElement Inputid;
	@FindBy(xpath="//button[text()='Execute']")
	private WebElement clickexecute;
	@FindBy(xpath="//td[text()='Description']/../../..//p[text()='Success']")
	private WebElement statusfield;
	@FindBy(xpath="//h4[text()='Server response']/..//td[@class='response-col_status']")
	private WebElement getserverresponse;
	
	public void delete()
	{
		Clickdelete.click();
	}
	public void tryitout()
	{
		clicktry.click();
	}
	public void id()
	{
		Inputid.sendKeys("3");
		
		
	}
	public void execute()
	{
		clickexecute.click();
	}
	public void status()
	{
		String abc=statusfield.getText();
		System.out.println("the deleted status is:"+abc);
	}
	public void executionstatus()
	{
		String res=getserverresponse.getText();
		System.out.println("\n"+"status is: "+res+"\n");
	}

}


