package org.Testcase.AutomationExercises;
import java.net.MalformedURLException;
import org.AutomationExercises.base.BaseConfigurationAutomationExercise;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orgP.ageObject.LoginIncorrectUser.loginuseragain;

public class AutomationTestCase3 extends BaseConfigurationAutomationExercise {
	public loginuseragain homelogin1;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		homelogin1 = new loginuseragain(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		homelogin1.HomePagesignup2();
		homelogin1.VisiblesignupCheck2();
		homelogin1.enteremailandpassword2();
		homelogin1.loginclick2();
	}



}

