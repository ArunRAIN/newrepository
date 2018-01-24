package com.bdd.sample.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    
 
    @FindBy(xpath="//input[@type='button']")
    private WebElementFacade signbtn2;

    @FindBy(xpath="//a[@class='u02ticon u02user']//span[@class='u02signout']")
    private WebElementFacade ACCOUNT;
    
    @FindBy(xpath="//a[@class='u02ticon u02user']//span[@class='u02signout']")
    private List<WebElementFacade> ACCOUNT2;
    
    @FindBy(xpath="//a[@class='u02ticon u02user']//span[@class='u02signin']")
    private WebElementFacade SignIn;
  
    @FindBy(xpath="//div[@class='u02userinw1 u02userloggedout']/a[@class='u02bttn']")
    private WebElementFacade accsignbtn;
  
    public void hover_SignIn()
    {
    	
    	List<WebElement> count = getDriver().findElements(By.xpath("//a[@class='u02ticon u02user']//span[@class='u02signout']"));
    	System.out.println(count.size());
    	if(count.size()==1)
    	{
    		System.out.println(getDriver().findElement(By.xpath("//a[@class='u02ticon u02user']//span[@class='u02signout']")).isDisplayed());
    		if(getDriver().findElement(By.xpath("//a[@class='u02ticon u02user']//span[@class='u02signout']")).isDisplayed())
    		{
    			Actions a=new Actions(getDriver());
        		a.moveToElement(ACCOUNT).perform();
        		
        		 WebElement ele33 = getDriver().findElement(By.xpath("//div[@class='u02userinw1 u02userloggedin']//a[text()='Sign Out']"));
        		waitABit(2000);
        		 JavascriptExecutor js = (JavascriptExecutor)getDriver();
            	js.executeScript("arguments[0].click();", ele33);
            	
            	waitABit(8000);
    	    	Actions a1=new Actions(getDriver());
    			a1.moveToElement(SignIn).perform();
    		}
    		else
    		{
    			waitABit(8000);
    	    	Actions a=new Actions(getDriver());
    			a.moveToElement(SignIn).perform();
    		}
        		
    	}
    	else
    	{
    	
    	}
    	
    	
    }
    
    public void click_sigin()
    {
    	//accsignbtn.click();
    	waitABit(2000);
    	JavascriptExecutor js = (JavascriptExecutor)getDriver();
    	js.executeScript("arguments[0].click();", accsignbtn);
    	///waitABit(10000);
    }
    
    public void SignIn_account()
    {
    	WebDriverWait wait=new WebDriverWait(getDriver(),300);
    	wait.until(ExpectedConditions.visibilityOf(usrname));
        usrname.type(Genric.getPropertyValue("UN"));
        pwd.type(Genric.getPropertyValue("PW"));
        //signbtn.click();
        System.out.println("hi");
        List<WebElement> count=getDriver().findElements(By.xpath("//input[@type='button']"));
        System.out.println(count.size());
        if(count.size()==1)
        {
	        if(getDriver().findElement(By.xpath("//input[@type='button']")).isDisplayed())
	        {
	        		JavascriptExecutor js = (JavascriptExecutor)getDriver();
	    	js.executeScript("arguments[0].click();", signbtn2);
	    	waitABit(4000);
	        }
	        else
	        {
	        	JavascriptExecutor js = (JavascriptExecutor)getDriver();
	        	js.executeScript("arguments[0].click();", signbtn);
	        	waitABit(4000);
	        }
        }
        else
        {
        	JavascriptExecutor js = (JavascriptExecutor)getDriver();
        	js.executeScript("arguments[0].click();", signbtn);
        	waitABit(4000);
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
	
	 public void hover_on_signin(String text)
	    {
		 waitABit(3000);
		 //System.out.println("//span[text()='Country']/../../../li//span[text()='Account']");
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
		       int ele22 = getDriver().findElements(By.xpath("//div[@class='u02userinw2']/a")).size();
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
		    waitABit(2000);
	    	getDriver().navigate().back();
	    }
	   public void is_page(String expectedtitle)
	    {
		 
		   waitABit(9000);
	    	String actualtitle=getDriver().getTitle();
	    	System.out.println(actualtitle);
	    	if(actualtitle.contains(expectedtitle))
	    	{
	    		Assert.assertTrue(true);
	    	}
	    	else if(actualtitle.contains("Single Sign-Off"))
	    	{
	    		Assert.assertTrue(true);
	    	}
	    	else
	    	{
		    	Assert.assertTrue(false);
  
	    	}
	    	
	    	navigate_page();
	    
	    }
	   
	   public void oracle_account_option_click(String link,String option)
	   {
		   hover_on_signin(option);
		   
		   
		   WebElement ele = getDriver().findElement(By.xpath("//div[@class='u02userinw1 u02userloggedin']//a[text()='"+link+"']"));
		  waitABit(3000);
		   JavascriptExecutor js = (JavascriptExecutor)getDriver();
	    	js.executeScript("arguments[0].click();", ele);
		 
		       
	   }
	   
	   public void oracle_cloud_account_option_click(String option,String link)
	   {
		     
		    WebElement ele = getDriver().findElement(By.xpath("//div[@class='u02userinw2']//a[text()='"+link+"']"));
		   JavascriptExecutor js = (JavascriptExecutor)getDriver();
	    	js.executeScript("arguments[0].click();", ele);
		   waitABit(3000);	
		    
		    
		       
	   }
   
    
     
    
}
