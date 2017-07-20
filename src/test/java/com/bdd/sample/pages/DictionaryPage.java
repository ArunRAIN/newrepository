package com.bdd.sample.pages;

import ch.lambdaj.function.convert.Converter;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.thucydides.core.pages.PageObject;

import java.util.List;
import java.util.Random;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://www-portal-stage.oracle.com/search/internal/otnhub")
public class DictionaryPage extends PageObject {

    @FindBy(id="u02menulink")
    private WebElementFacade MenuBar;

    @FindBy(id="u02menulink")
    private WebElementFacade MenuBar1;
    
    
    @FindBy(id="sso_username")
    private WebElementFacade usrname;
    
    @FindBy(id="ssopassword")
    private WebElementFacade pwd;
    
    @FindBy(xpath="//a[contains(text(),'Sign In')]")
    private WebElementFacade signbtn;
    
    
    
    public void login()
    {
    	usrname.type("arun.panneer@oracle.com");
    	pwd.type("Naikqa@99");
    	signbtn.click();
    }
  
    public void home_page()
    {
    	getDriver().manage().window().maximize();
    	getDriver().get("https://www-portal-stage.oracle.com/search/internal/hub");
    	
    	String expectitle = getDriver().getTitle();
    	Assert.assertEquals(expectitle,expectitle);
    	
    }
    
    public boolean Menu_bar_displayed()
    {
        
		   Point menuposition = MenuBar.getLocation();
		  
		   if(menuposition.equals(menuposition))
		      {
		    	 return true;
		      }
		      else
		      {
		    	  return false;
		      }
  
		  
    }

    public void logo(String header)
    {
    	String input = header.toLowerCase();
    	int ele = getDriver().findElements(By.xpath("//div[@class='u02w1']//div[@class='u02"+input+"']")).size();
    	
    	 if(ele==1)
    	{
    		Assert.assertTrue(true);
    		waitABit(1000);
    		WebElementFacade ele2 = find(By.xpath("//div[@class='u02w1']//div[@class='u02"+input+"']//a/span"));
        	Actions builder = new Actions(getDriver());
        	builder.moveToElement(ele2).perform();
        	
    	}
    	 else
    	 {
    		 Assert.assertTrue(false);
    	 }
    }
    
    
    public void menu(String header)
    {
    	String input = header.toLowerCase();
    	int ele = getDriver().findElements(By.xpath("//div[@class='u02w1']//div[@class='u02"+input+"']")).size();
    	
    	 if(ele==1)
    	{
    		Assert.assertTrue(true);
    		//waitABit(1000);
    	    	WebElementFacade ele1 = find(By.xpath("//div[@class='u02w1']//div[@class='u02"+input+"']//a"));
    	    	Actions builder = new Actions(getDriver());
    	    	builder.moveToElement(ele1).perform();
        	
    	}
    	 else
    	 {
    		 Assert.assertTrue(false);
    	 }
    }
    
    public void search(String header)
    {String input = header.toLowerCase();
    	WebElementFacade ele3 = find(By.xpath("//div[@class='u02w1']//div[@class='u02search']//input[@class='u02"+input+"bttn']"));
		Actions builder = new Actions(getDriver());
		builder.doubleClick(ele3).perform();
    	
    	int ele = getDriver().findElements(By.xpath("//div[@class='u02w1']//div[@class='u02"+input+"']")).size();
    	
    	 if(ele==1)
    	{
    		Assert.assertTrue(true);
    		
        	
    	}
    	 else
    	 {
    		 Assert.assertTrue(false);
    	 }
    }
    public boolean left_header_contains(String header)
    {
        String input = header.toLowerCase();
    	boolean ele = find(By.xpath("//div[@class='u02w1']//div[@class='u02"+input+"']")).isDisplayed();
    	
    	 if(input.equals("logo"))
    	{
    		 waitABit(1000);
    		WebElementFacade ele2 = find(By.xpath("//div[@class='u02w1']//div[@class='u02"+input+"']//a/span"));
        	Actions builder = new Actions(getDriver());
        	builder.moveToElement(ele2).perform();
        	
    	}
    	 else if(input.equals("menu"))
    	{
    		 waitABit(2000);
    	WebElementFacade ele1 = find(By.xpath("//div[@class='u02w1']//div[@class='u02"+input+"']//a"));
    	Actions builder = new Actions(getDriver());
    	builder.moveToElement(ele1).perform();
    	//waitABit(1000);
    	}
    	
    	else if(input.equals("search"))
    	{
    		waitABit(1000);
    		WebElementFacade ele3 = find(By.xpath("//div[@class='u02w1']//div[@class='u02search']//input[@class='u02"+input+"bttn']"));
    		Actions builder = new Actions(getDriver());
    		builder.doubleClick(ele3).perform();
    		//waitABit(1000);
    	}
    		
    	    
    	return ele;
    }
    
    public boolean right_header_contains(String header)
    {
    	int num=randomnumber();
        String input = header.toLowerCase();
    	boolean ele = find(By.xpath("//div[@class='u02tools u02li1']/ul/li["+num+"]/a")).isDisplayed();
    	
    	 if(input.equals("account"))
    	{
    		 waitABit(1000);
    		WebElementFacade ele2 = find(By.xpath("//div[@class='u02tools u02li1']//a[@data-lbl='profile:sign-in-"+input+"']"));
        	Actions builder = new Actions(getDriver());
        	builder.moveToElement(ele2).perform();
        	
    	}
    	 else if(input.equals("country"))
    	{
    		 waitABit(1000);
    	WebElementFacade ele1 = find(By.xpath("//div[@class='u02tools u02li1']/ul/li/a[@href='#u02"+input+"menu']"));
    	Actions builder = new Actions(getDriver());
    	builder.moveToElement(ele1).perform();
    	waitABit(1000);
    	
    	
    	}
    	
    	else if(input.equals("call"))
    	{
    		waitABit(1000);
    		WebElementFacade ele3 = find(By.xpath("//div[@class='u02tools u02li1']//a[@data-lbl='"+input+"']"));
    		Actions builder = new Actions(getDriver());
    		builder.moveToElement(ele3).perform();
    		
    		waitABit(2000);
    		
    		
    		
    	}


    	return ele;
    }

	public static int randomnumber()
	{
		Random r=new Random();
		int v = r.nextInt(2);
		int num=v+1;
		return num;
	}
   
    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
}