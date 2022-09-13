package Com.Automation.Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.ApiUtils;

public class ApiTestPost extends ApiUtils{
	@Test
	public void verifycreate() throws FileNotFoundException
	{
		ApiUtils ref=new ApiUtils();
		ref.createmethod();
	}
	

}


