package com.bdd.sample.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CountryListPage extends PageObject
{
	@FindBy(id="u02menulink")
    private WebElementFacade country;

	
	public void hover_on(String country)
	{
		
		Actions a=new Actions(getDriver());
				a.moveToElement(getDriver().findElement(By.xpath("//span[contains(text(),'Country')]"))).perform();
	    waitABit(1000);
	}
	
	public void region_panel_display()
	{
		int ele = getDriver().findElements(By.xpath("//ul[@class='u02cmenu-l1']/li[3]/a")).size();
		if(ele==1)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void countries_panel_display()
	{

		int ele = getDriver().findElements(By.xpath("(//div[@class='u02cmenu-l2'])[1]/ul")).size();
		System.out.println(ele);
		for(int i=0;i<ele;i++)
		{
			int v=i+1;
		    int ele1 = getDriver().findElements(By.xpath("(//div[@class='u02cmenu-l2'])[1]/ul["+v+"]/li[2]/a")).size();
			if(ele1==1)
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
	}
	
	public void is_pin_appear()
	{

		int ele = getDriver().findElements(By.xpath("//li[@id='u02cmenu']/div/div/ul/li/a")).size();
		//System.out.println(ele);
		for(int i=0;i<ele;i++)
		{
			int v=i+1;
		    WebElement element = getDriver().findElement(By.xpath("(//li[@id='u02cmenu']/div/div/ul/li/a)["+v+"]"));
		    JavascriptExecutor js = (JavascriptExecutor)getDriver();
		    js.executeScript("arguments[0].click();", element);
		    
		    WebElement ele12 = getDriver().findElement(By.xpath("(//*[@id='u02cmenu']/div/div/ul/li/div/ul[1]/li[3]/a)["+v+"]"));
		    waitABit(2000);
		    Actions a =new Actions(getDriver());
		    a.moveToElement(ele12).perform();
		    waitABit(2000);
		}
	}
}
