package Com.Automation.Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.ApiUtils;

public class ApiTestPut extends ApiUtils {
	@Test
	public void verifyupdate() throws FileNotFoundException
	{
	
	ApiUtils abc=new ApiUtils();
	abc.updatemethod();
	}

}
