package com.bdd.sample.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.bdd.sample.Genric;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


public class SearchAutosuggestPage extends PageObject
{
	@FindBy(id="sso_username")
    private WebElementFacade usrname;

    @FindBy(id="ssopassword")
    private WebElementFacade pwd;

    @FindBy(xpath="//a[contains(text(),'Sign In')]")
    private WebElementFacade signbtn;
    
    @FindBy(id="txtSearch")
    private WebElementFacade searchbox;
    
    @FindBy(xpath="//input[@value='Submit Search']")
    private WebElementFacade searchIcon;
    
   
   
    
    public void navigate_page()
    {
    	getDriver().navigate().back();
    }
    public void type_keyword(String option)
    {
    	searchbox.clear();
    	searchbox.type(option);
    }
    
    public void verify_Autosuggestion_display()
    {
    	waitABit(2000);
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
    
    public void verify_Autosuggestion_not_display()
    {
    	waitABit(2000);
	    List<WebElement> ele = getDriver().findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content'][contains(@style,'display: block')]/li[1]"));
	  
	    if(ele.size()==1)
	    {
	    	Assert.assertTrue(false);
	    }
	    else
	    {
	    	Assert.assertTrue(true);
	    }
    
    }
    
    public void click_outside_searchbox()
    {
    	WebElement ele = getDriver().findElement(By.xpath("//div[text()='Menu']"));
//    	waitFor(ExpectedConditions.visibilityOf(ele));
    	ele.click();
        waitABit(3000);
    }
    
    public void hit_Enter()
    {
    	searchbox.sendKeys(Keys.ENTER);
    }
    
    public void is_page(String expectedtitle)
    {
    	String actualtitle=getDriver().getTitle();
    	
    	Assert.assertEquals(expectedtitle, actualtitle);
    	
    	navigate_page();
    }
    
    public void click_serch_Icon()
    {
    	searchIcon.click();
    }
}
