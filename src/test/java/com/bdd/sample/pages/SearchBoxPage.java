package com.bdd.sample.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


public class SearchBoxPage extends PageObject
{
	@FindBy(id="sso_username")
    private WebElementFacade usrname;

    @FindBy(id="ssopassword")
    private WebElementFacade pwd;

    @FindBy(xpath="//a[contains(text(),'Sign In')]")
    private WebElementFacade signbtn;

    @FindBy(xpath="//input[@id='txtSearch']")
    private WebElementFacade searchbox;
    
 
    @FindBy(xpath="//input[@value='Submit Search']")
    private WebElementFacade searchicon;
    
    
    @FindBy(xpath="//div[contains(@class,'u02search')]/ul/li[4]/b")
    private WebElementFacade searchopt;
    
    
    
    
    public void click_on_inside_textbox() throws AWTException
    {
  waitABit(4000);
  
  

  
  JavascriptExecutor js = (JavascriptExecutor)getDriver();
  String sText =  js.executeScript("return navigator.userAgent").toString();
 System.out.println(sText);
 
 if(sText.contains("Firefox"))
 {
//	  WebElement un = searchbox;
//	  int xaxis = un.getLocation().x;
//	   
//	  int yaxis=un.getLocation().y;
//	  System.out.println(yaxis);
//	  
//	  int width = un.getSize().width;
//	  int height= un.getSize().height;
//	  System.out.println(height);
//	  Robot r=new Robot();
//	  //r.mouseMove(xaxis+width+70/2, yaxis+height/2+160);
//	  System.out.println(xaxis+width/2);
//	  System.out.println(yaxis+height);
//	  
//	  int v=yaxis+height;
//	  int c=v/2;
//	  System.out.println(c);
//	 
//	  waitABit(20000);
////	  r.mouseMove(xaxis+width/2, c+68);
////	  System.out.println(xaxis+width/2);
////	  System.out.println(c+60);
//	  r.mouseMove(510, 98);
//	  r.mousePress(KeyEvent.BUTTON1_MASK);//click function
//	  r.mouseRelease(KeyEvent.BUTTON1_MASK);
	 waitABit(5000);
//	 Actions a=new Actions(getDriver());
//	 a.moveToElement(searchbox).click(searchbox).perform();
 }
 else
 {
//	  WebElement un = searchbox;
//	  int xaxis = un.getLocation().x;
//	   
//	  int yaxis=un.getLocation().y;
//	   
//	  int width = un.getSize().width;
//	  int height= un.getSize().height;
//	   
//	  Robot r=new Robot();
//	  r.mouseMove(xaxis+width+50/2, yaxis+height/2+400);
//	  r.mousePress(KeyEvent.BUTTON1_MASK);//click function
//	  r.mouseRelease(KeyEvent.BUTTON1_MASK);
	 
	 waitABit(3000);
	 Actions a=new Actions(getDriver());
	 a.moveToElement(searchbox).click(searchbox).perform();
 }
 
  
    }
    
    public void is_focus_on_textbox()
    {
    	WebElement ele = getDriver().switchTo().activeElement();
    	Assert.assertEquals(ele, searchbox);
    	waitABit(1000);
    
    }
    
   
    
    public void type_in_search_box(String data)
    {
    	//waitABit(2000);
    	searchbox.sendKeys(data);
    	waitABit(500);
    }
    
    public void verify_search_option_displays()
    {
    	waitABit(3000);
	    List<WebElement> ele = getDriver().findElements(By.xpath("//div[contains(@class,'u02search')]/ul/li[1]"));
	  
	    if(ele.size()==1)
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
    
    }
    
    public void click_option(String option) throws AWTException
    {
//    	System.out.println(option);
//    	WebElement ele = getDriver().findElement(By.xpath("//div[contains(@class,'u02search')]/ul/li[4]"));
//    	
////    	JavascriptExecutor js = (JavascriptExecutor)getDriver();
////    	js.executeScript("arguments[0].click();", getDriver().findElement(By.xpath("//div[contains(@class,'u02search')]/ul/li[4]")));
//    	waitABit(3000);
//    	
//    	Robot r=new Robot();
//    	r.keyPress(KeyEvent.VK_DOWN);
//    	r.keyRelease(KeyEvent.VK_DOWN);
//    	r.keyPress(KeyEvent.VK_DOWN);
//    	r.keyRelease(KeyEvent.VK_DOWN);
//    	r.keyPress(KeyEvent.VK_DOWN);
//    	r.keyRelease(KeyEvent.VK_DOWN);
//    	r.keyPress(KeyEvent.VK_DOWN);
//    	r.keyRelease(KeyEvent.VK_DOWN);
//    	r.keyPress(KeyEvent.VK_ENTER);
//    	r.keyRelease(KeyEvent.VK_ENTER);
    	waitABit(9000);
    }
    
   
    public void is_page(String expectedtitle)
    {
    	//waitABit(10000);
    	String actualtitle=getDriver().getTitle();
    	
    	Assert.assertEquals(expectedtitle, actualtitle);
    }
    
    
    public void click_search()
    {
    	//waitFor(ExpectedConditions.titleContains("Oracle Technology Network"));
    	//searchicon.click();
    	JavascriptExecutor js = (JavascriptExecutor)getDriver();
    	js.executeScript("arguments[0].click();", searchicon);
    }
    
   
    public void is_display()
    {
//        waitABit(300);
    	String text = searchbox.getCssValue("background-color");
    	//System.out.println(text);
    }
}
