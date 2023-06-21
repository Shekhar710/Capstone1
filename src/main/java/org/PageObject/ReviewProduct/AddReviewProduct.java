package org.PageObject.ReviewProduct;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddReviewProduct {
	WebDriver driver;

	  public AddReviewProduct(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	  
	  @FindBy(xpath="//a[@href='/products']")
	   public WebElement Button6;
	  
	  
	  @FindBy(xpath="//h2[@class='title text-center']")
	  public WebElement AllProduct;
	  
	  @FindBy(xpath="//div[9]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	  public WebElement ClickViewProduct;
	  
	  public void PerformReview()
	  {   
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		  
	      Button6.click();  
		  Assert.assertEquals(AllProduct.isDisplayed(), true);
		  ClickViewProduct.click();
		  
	  }
	  

}