package Com.Automation.Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.ApiUtils;

public class ApiTestPatch extends ApiUtils{
	@Test
	public void verifypartialupdate() throws FileNotFoundException
	{
		ApiUtils obj2=new ApiUtils();
		obj2.partialupdatemethod();
	}

}
