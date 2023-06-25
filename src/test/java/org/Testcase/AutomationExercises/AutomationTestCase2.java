package org.Testcase.AutomationExercises;
import java.net.MalformedURLException;
import org.AutomationExercises.base.BaseConfigurationAutomationExercise;
import org.PageObject.LoginCorrectuser.HomePageDeleteAcc2;
import org.PageObject.LoginCorrectuser.loginuser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationTestCase2 extends BaseConfigurationAutomationExercise {
	public loginuser homelogin1;
	public HomePageDeleteAcc2 deleteccount;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		homelogin1 = new loginuser(driver);
		deleteccount = new HomePageDeleteAcc2(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		homelogin1.HomePagesignup1();
		homelogin1.VisiblesignupCheck();
		homelogin1.enteremailandpassword();
		homelogin1.loginclick();
		
		// class 2
		//deleteccount.AccountButtonVerify();
	}



}

