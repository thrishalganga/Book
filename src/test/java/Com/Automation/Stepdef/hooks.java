package Com.Automation.Stepdef;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import Com.Automation.GenericUtils.DriverUtils;
import io.cucumber.java.Before;

public class hooks {
	@Before
	public void precondition() throws FileNotFoundException, IOException {
		DriverUtils.createDriver();
		DriverUtils.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}

}
