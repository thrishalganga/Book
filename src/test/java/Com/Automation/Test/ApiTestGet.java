package Com.Automation.Test;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.ApiUtils;

public class ApiTestGet extends ApiUtils{
	@Test
	public void verifyget()
	{
		ApiUtils obj=new ApiUtils();
		obj.getmethod();
	}


}
