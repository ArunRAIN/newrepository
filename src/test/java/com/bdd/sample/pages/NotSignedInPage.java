package com.bdd.sample.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("https://www.oracle.com/index.html")
public class NotSignedInPage extends PageObject
{

	
	@FindBy(xpath="//a[@class='u02ticon u02user']//span[@class='u02signin']")
    private WebElementFacade signin;
	
	
	
	
	public void Not_signIn()
	{
		boolean yes = signin.isDisplayed();
		if(yes)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void Expected_text(String text)
	{
		int ele1 = getDriver().findElements(By.xpath("//span[text()='"+text+"']")).size();
		 if(ele1==1)
		    {
		    	Assert.assertTrue(true);
		    }
		    else
		    {
		    	Assert.assertTrue(false);
		    }
	}
	
	 public void hover_on(String text)
	    {
		 waitABit(1000);
		  WebElement ele1 = getDriver().findElement(By.xpath("//span[text()='"+text+"']"));
	    	Actions a=new Actions(getDriver());
	    			a.moveToElement(ele1).perform();
	    }
	 
	 
	 
	   public void option_display(String option1,String option2)
	    {
		 
	       int  rele=getDriver().findElements(By.xpath("//div[@class='u02user u02toolpop']/div[@class='u02userin']//div[position()=2  or position()=3]/h5[contains(text(),'"+option1+"')]")).size();
		    if(rele==1)
		    {
		    	Assert.assertTrue(true);
		    }
		    else
		    {
		    	Assert.assertTrue(false);
		    }
		    
		    int  rele2=getDriver().findElements(By.xpath("//div[@class='u02user u02toolpop']/div[@class='u02userin']//div[position()=2  or position()=3]/h5[contains(text(),'"+option2+"')]")).size();
		    if(rele2==1)
		    {
		    	Assert.assertTrue(true);
		    }
		    else
		    {
		    	Assert.assertTrue(false);
		    }
		   
       }
	   
	   public void oracle_account_option(String option)
	   {
		       int ele22 = getDriver().findElements(By.xpath("//div[@class='u02user u02toolpop']/div[@class='u02userin']//div[position()=2]//a[contains(text(),'"+option+"')]")).size();
		    	 if(ele22==1)
		    	    {
		    	    	Assert.assertTrue(true);
		    	    }
		    	    else
		    	    {
		    	    	Assert.assertTrue(false);
		    	    }
		    	    
		    
	   }
	   
	   public void cloud_account_option(String option)
	   {
		       int ele22 = getDriver().findElements(By.xpath("//div[@class='u02user u02toolpop']/div[@class='u02userin']//div[position()=3]//a[contains(text(),'"+option+"')]")).size();
		    	 if(ele22==1)
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
	   public void is_page(String option,String expectedtitle)
	    {
		  
		    
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
	    	waitABit(500);
	    	hover_on(option);
	    
	    }
	   
	   public void oracle_account_option_click(String link)
	   {
		      
		   getDriver().findElement(By.xpath("//div[@class='u02user u02toolpop']/div[@class='u02userin']//div[position()=2]//a[contains(text(),'"+link+"')]")).click();
		    waitABit(1000);	
		       
	   }
	   
	   public void oracle_cloud_account_option_click(String link)
	   {
		      
		   getDriver().findElement(By.xpath("//div[@class='u02user u02toolpop']/div[@class='u02userin']//div[position()=3]//a[contains(text(),'"+link+"')]")).click();
		    waitABit(1000);	
		       
	   }
	   
	   
}
