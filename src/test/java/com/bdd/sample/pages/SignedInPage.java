package com.bdd.sample.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.bdd.sample.Genric;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class SignedInPage extends PageObject
{
	@FindBy(id="sso_username")
    private WebElementFacade usrname;

    @FindBy(id="ssopassword")
    private WebElementFacade pwd;

    @FindBy(xpath="//a[contains(text(),'Sign In')]")
    private WebElementFacade signbtn;

    @FindBy(xpath="//a[@class='u02ticon u02user']//span[@class='u02signout']")
    private WebElementFacade ACCOUNT;
    
    @FindBy(xpath="//a[@class='u02ticon u02user']//span[@class='u02signin']")
    private WebElementFacade SignIn;
  
    @FindBy(xpath="//div[@class='u02userinw1 u02userloggedout']/a[@class='u02bttn']")
    private WebElementFacade accsignbtn;
  
    public void hover_SignIn()
    {
    	Actions a=new Actions(getDriver());
		a.moveToElement(SignIn).perform();
		
    }
    
    public void click_sigin()
    {
    	accsignbtn.click();
    }
    
    public void SignIn_account()
    {
        usrname.type(Genric.getPropertyValue("UN"));
        pwd.type(Genric.getPropertyValue("PW"));
        signbtn.click();
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
		       int ele22 = getDriver().findElements(By.xpath("//div[@class='u02userinw1 u02userloggedin']//a[text()='"+option+"']")).size();
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
		       int ele22 = getDriver().findElements(By.xpath("//div[@class='u02userinw2']//a[text()='"+option+"']")).size();
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
	    		
	    		int ele22 = getDriver().findElements(By.xpath("//span[text()='"+expectedtitle+"']")).size();
		    	 if(ele22==1)
		    	    {
		    	    	Assert.assertTrue(true);
		    	    }
		    	    else
		    	    {
		    	    	Assert.assertTrue(false);
		    	    }
		    	    
		    	  
	    	}
	    	
	    	navigate_page();
	    	
	    	hover_on(option);
	    
	    }
	   
	   public void oracle_account_option_click(String link)
	   {
		      
		   getDriver().findElement(By.xpath("//div[@class='u02userinw1 u02userloggedin']//a[text()='"+link+"']")).click();
		    waitABit(1000);	
		       
	   }
	   
	   public void oracle_cloud_account_option_click(String option,String link)
	   {
		      
		   getDriver().findElement(By.xpath("//div[@class='u02userinw2']//a[text()='"+link+"']")).click();
		    waitABit(1000);	
		    
		    
		       
	   }
   
    
     
    
}
