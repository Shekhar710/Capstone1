package org.Testcase.AutomationExercises;
import java.net.MalformedURLException;
import org.AutomationExercises.base.BaseConfigurationAutomationExercise;
import org.PageObject.ReviewProduct.AddReviewProdcut2;
import org.PageObject.ReviewProduct.AddReviewProduct;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationTestCase6 extends BaseConfigurationAutomationExercise {
	public AddReviewProduct ARP;
	public AddReviewProdcut2 ARP2;
	
    WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup2(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		ARP=new AddReviewProduct(driver);
		ARP2=new AddReviewProdcut2(driver);
	}

	
	@Test
	public void DemoScenario() 
	{
		ARP.PerformReview();
		ARP2.EnterReview();
	}

	
	

}