package org.Testcase.AutomationExercises;
import java.net.MalformedURLException;
import org.AutomationExercises.base.BaseConfigurationAutomationExercise;
import org.PageObject.RemoveProductCart.AddToCart1;
import org.PageObject.RemoveProductCart.RemoveToCart;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationTestCase4 extends BaseConfigurationAutomationExercise {
    public AddToCart1 ac;
    public RemoveToCart RTC;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		ac = new AddToCart1(driver);
		RTC = new RemoveToCart(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		
		// class1
		ac.addToCart();
		
		// class2
		RTC.removeproduct();

	}



}


