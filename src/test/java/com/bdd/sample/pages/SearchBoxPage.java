package com.bdd.sample.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
    
   
    
    public void click_on_inside_textbox()
    {
  
    	searchbox.click();
    }
    
    public void is_focus_on_textbox()
    {
    	WebElement ele = getDriver().switchTo().activeElement();
    	Assert.assertEquals(ele, searchbox);
    	waitABit(1000);
    
    }
    
   
    
    public void type_in_search_box(String data)
    {
    	searchbox.type(data);
    	waitABit(500);
    }
    
    public void verify_search_option_displays()
    {
    	waitABit(3000);
	    List<WebElement> ele = getDriver().findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'][contains(@style,'display: block')]/li[1]"));
	  
	    if(ele.size()==1)
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
    
    }
    
    public void click_option(String option)
    {
    	waitABit(2000);
    	getDriver().findElement(By.xpath("//li[contains(.,'"+option+"')]")).click();
    }
    
    public void is_page(String expectedtitle)
    {
    	String actualtitle=getDriver().getTitle();
    	
    	Assert.assertEquals(expectedtitle, actualtitle);
    }
    
    
    public void click_search()
    {
    	//waitFor(ExpectedConditions.titleContains("Oracle Technology Network"));
    	searchicon.click();
    }
    public void is_display()
    {
//        waitABit(300);
    	String text = searchbox.getCssValue("background-color");
    	//System.out.println(text);
    }
}
