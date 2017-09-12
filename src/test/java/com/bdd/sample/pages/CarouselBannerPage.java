package com.bdd.sample.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarouselBannerPage extends PageObject
{
	@FindBy(xpath="//ul[@class='slick-dots']/li/button[@aria-pressed='true']")
    private List<WebElementFacade> currentdotred;

	@FindBy(xpath="//div[@class='hp10w2 slick-slide slick-current slick-active']")
    private WebElementFacade slide1;
	
	
	public void is_slide_display()
	{
		//waitABit(3000);
		boolean count = slide1.isDisplayed();
		if(count)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	public void is_dot_red()
	{
		int count = currentdotred.size();
		if(count==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	public void click_left_nav_arrows()
	{
		waitABit(3000);
		WebElement element = getDriver().findElement(By.xpath("//button[@class='slick-prev slick-arrow']"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", element);
		
	}
	
	
	public void is_slide_navigate_to_previous_story()
	{
		
		int count = currentdotred.size();
		if(count==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	public void click_right_nav_arrows()
	{
		waitABit(3000);
		WebElement element = getDriver().findElement(By.xpath("//button[@class='slick-next slick-arrow']"));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].click();", element);
		
	}
	
	
	public void is_slide_navigate_to_next_story()
	{
		
		int count = currentdotred.size();
		if(count==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			
			
		}
	}
	
	public void expected_slide_display(String data)
	{
		List<WebElement> count = getDriver().findElements(By.xpath("//ul[@class='slick-dots']//button"));
		String slidecount=String.valueOf(count.size());
		if(slidecount.equals(data))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	
	
	
	public void navigate_page()
    {
	    waitABit(1000);
    	getDriver().navigate().back();
    }
   public void is_page(String expectedtitle)
    {
	  
	   waitABit(1000);
    	String actualtitle=getDriver().getTitle();
    	
    	if(actualtitle.contains(expectedtitle))
    	{
    		Assert.assertTrue(true);
    	}
    	else
    	{    		
	      Assert.assertTrue(false);  
    	}
    	
    	navigate_page();
    	
    	
    
    }
   
   public void click_CTA_button(String slide)
   {
	   String slide11 = slide.replaceAll("[^-?0-9]+", " "); 
	   WebElement ele = getDriver().findElement(By.xpath("(//div[@class='slick-track']//a[@class='icn-arrowthn hp10btn'])["+slide11+"]"));
	   waitABit(3000);
	   JavascriptExecutor js = (JavascriptExecutor)getDriver();
       js.executeScript("arguments[0].click();", ele);
	 
	       
   }
   
   public void hover_nav_arrows()
   {
	   WebElement ele = getDriver().findElement(By.xpath("//button[@class='slick-prev slick-arrow']"));
	   waitABit(1000);
	   Actions a=new Actions(getDriver());
			   a.moveToElement(ele).perform();
   }

   public void background_color()
   {
	   waitABit(3000);
	  String ele = getDriver().findElement(By.xpath("//button[@class='slick-prev slick-arrow']")).getCssValue("background-color");
	  System.out.println(ele);
	  
	  
	  
   }
}
