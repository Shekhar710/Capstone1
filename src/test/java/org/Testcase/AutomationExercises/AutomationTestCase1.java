package org.Testcase.AutomationExercises;

import java.net.MalformedURLException;
import org.AutomationExercises.base.BaseConfigurationAutomationExercise;
import org.PageObject.RegisterUser.AccountVerify;
import org.PageObject.RegisterUser.FillDetails;
import org.PageObject.RegisterUser.HomePageDeleteAcc;
import org.PageObject.RegisterUser.SignupPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationTestCase1 extends BaseConfigurationAutomationExercise {
	public SignupPage homesignup;
	public FillDetails Filluserdetails;
	public AccountVerify VerifyAccount;
	public HomePageDeleteAcc deleteaccverify;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		homesignup = new SignupPage(driver);
		Filluserdetails = new FillDetails(driver);
		VerifyAccount = new AccountVerify(driver);
		deleteaccverify = new HomePageDeleteAcc(driver);
	}
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		homesignup.HomePagesignup();
		homesignup.VisiblesignupCheck();
		homesignup.EnterNameEmail();
		homesignup.Clickenter();
		
		// Class 2
		Filluserdetails.VisiblesignupCheck();
		Filluserdetails.filldetialsAccountuser();
		
		// Class 3
		VerifyAccount.AccountButtonVerify();
		
		// Class 4
		deleteaccverify.AccountButtonVerify();
	}



}

