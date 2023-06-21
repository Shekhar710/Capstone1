package org.Testcase.AutomationExercises;
import java.net.MalformedURLException;
import org.AutomationExercises.base.BaseConfigurationAutomationExercise;
import org.PageObject.SearchProduct.SearchProduct;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationTestCase5 extends BaseConfigurationAutomationExercise {
	public SearchProduct SProduct;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		SProduct = new SearchProduct(driver);
	} 
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		SProduct.clickProduct5();
		SProduct.searchProductVisible5();
		SProduct.addToCart5();
		SProduct.clickCart5();
		
	}



}


