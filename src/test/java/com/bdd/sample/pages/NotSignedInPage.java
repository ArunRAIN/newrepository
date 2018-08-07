package com.bdd.sample.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bdd.sample.Genric;

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
	
	@FindBy(id="sso_username")
    private WebElementFacade usrname;

    @FindBy(id="ssopassword")
    private WebElementFacade pwd;

    @FindBy(xpath="//a[contains(text(),'Sign In')]")
    private WebElementFacade signbtn;
	
    @FindBy(xpath="//a[@class='u02ticon u02user']//span[@class='u02signout']")
    private WebElementFacade ACCOUNT;
    
	
	public void Not_signIn()
	{
		List<WebElement> yes = getDriver().findElements(By.xpath("//a[@class='u02ticon u02user']//span[@class='u02signin']"));
		System.out.println(yes.size());
		if(yes.size()==1)
		{
			boolean ele = getDriver().findElement(By.xpath("//a[@class='u02ticon u02user']//span[@class='u02signin']")).isDisplayed();
			System.out.println(ele);
			if(ele)
			{
				
			}
			else
			{
				waitABit(2000);
				Actions a=new Actions(getDriver());
	    		a.moveToElement(ACCOUNT).perform();
	    		
	    		 WebElement ele33 = getDriver().findElement(By.xpath("//div[@class='u02userinw1 u02userloggedin']//a[text()='Sign Out']"));
	    		waitABit(2000);
	    		 JavascriptExecutor js = (JavascriptExecutor)getDriver();
	        	js.executeScript("arguments[0].click();", ele33);
			}
			
		}
		else
		{
			
			
		}
	}
	
	public void Expected_text(String text)
	{
		waitABit(10000);
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
		 waitABit(1500);
		  WebElement ele1 = getDriver().findElement(By.xpath("//span[contains(text(),'Country')]/../../../li//span[text()='"+text+"']"));
	    	Actions a=new Actions(getDriver());
	    			a.moveToElement(ele1).perform();
	    }
	 
	 
	 
	   public void option_display(String option1,String option2)
	    {
		 
	       int  rele=getDriver().findElements(By.xpath("//div[@class='u02userin']//div[position()=2  or position()=3]/h5[contains(text(),'"+option1+"')]")).size();
		    if(rele==1)
		    {
		    	Assert.assertTrue(true);
		    }
		    else
		    {
		    	Assert.assertTrue(false);
		    }
		    
		    int  rele2=getDriver().findElements(By.xpath("//div[@class='u02userin']//div[position()=2  or position()=3]/h5[contains(text(),'"+option2+"')]")).size();
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
		       int ele22 = getDriver().findElements(By.xpath("//div[@class='u02userin']//div[position()=2]//a[contains(text(),'"+option+"')]")).size();
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
		       int ele22 = getDriver().findElements(By.xpath("//div[@class='u02userin']//div[position()=3]//a[contains(text(),'"+option+"')]")).size();
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
		    waitABit(500);
	    	getDriver().navigate().back();
	    	
	    	
	    }
	   public void is_page_(String option,String expectedtitle)
	    {
		  
		    waitABit(15000);
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
	    	
	    	waitABit(4500);
	    	hover_on(option);
	    
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
	    	
	    	waitABit(2000);
	    	hover_on(option);
	    
	    }
	   
	   public void is_page2(String option,String expectedtitle)
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
	    	
	    	waitABit(1000);
	    
	    	hover_on(option);
	    
	    }
	   public void is_page3(String option,String expectedtitle)
	    {
		  
		    
	    	String actualtitle=getDriver().getTitle();
	    	
	    	if(actualtitle.contains(expectedtitle))
	    	{
	    		Assert.assertTrue(true);
	    		 usrname.type(Genric.getPropertyValue("UN"));
	             pwd.type(Genric.getPropertyValue("PW"));
	             
	             JavascriptExecutor js = (JavascriptExecutor)getDriver();
	 	    	js.executeScript("arguments[0].click();", signbtn);
	             waitABit(8000);
	             hover_on("Account");
	             waitABit(2000);
                 WebElement ele = getDriver().findElement(By.xpath("//div[@class='u02userinw1 u02userloggedin']//a[text()='Sign Out']"));
	             JavascriptExecutor js1 = (JavascriptExecutor)getDriver();
	 	    	js1.executeScript("arguments[0].click();", ele);
	 	    	 waitABit(4000);
	    	}
	    	else
	    	{
	    		
		     Assert.assertTrue(false);
		    	  
	    	}
	    	
	    
	    	
	    
	    }
	   public void oracle_account_option_click(String link,String option,String expectedtitle)
	   {
		      waitABit(3000);
		   WebElement ele = getDriver().findElement(By.xpath("//div[@class='u02userin']//div[position()=2]//a[contains(text(),'"+link+"')]"));
		   JavascriptExecutor js = (JavascriptExecutor)getDriver();
	    	js.executeScript("arguments[0].click();", ele);
	    	waitABit(9000);
		   //waitABit(1000);	
//		    if(link.equals("Help"))
//			{
//			is_page_(option, expectedtitle);
//			}
//			else if(link.equals("Create an account"))
//			{
//				is_page_(option, expectedtitle);
//			}
//			else if(link.equals("Sign in"))
//			{
//				is_page3(option, expectedtitle);
//			}
	   }
	   
	   public void oracle_cloud_account_option_click(String link)
	   {
		      
		   WebElement ele = getDriver().findElement(By.xpath("//div[@class='u02userin']//div[position()=3]//a[text()='"+link+"'] "));
		   JavascriptExecutor js = (JavascriptExecutor)getDriver();
	    	js.executeScript("arguments[0].click();", ele); 
		   waitABit(3000);	
		       
	   }
	   
	   
}
