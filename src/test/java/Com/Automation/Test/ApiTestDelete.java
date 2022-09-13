package Com.Automation.Test;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.ApiUtils;

public class ApiTestDelete {
	@Test
	public void verifydelete()
	{
		ApiUtils obj3=new ApiUtils();
		obj3.deletemethod();
	}


}
