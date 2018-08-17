package com.bdd.sample.pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class MenuobjectPage extends PageObject
{
	 

    @FindBy(xpath="//div[@class='u02menu']/div/div/a")
    private WebElementFacade MenuBar;
    
    @FindBy(xpath="//div[@id='u02mmenu']/div/ul")
    private WebElementFacade primarypanel;

   
   
    
    public void hover_Menu_bar()
    {
    	waitFor(ExpectedConditions.visibilityOf(MenuBar));
    	Actions a=new Actions(getDriver());
    	a.moveToElement(MenuBar).perform();
        
    }
   
  
    public void verify_primarypanel_with_categories()
    {
    	waitABit(2000);
    	int ele = getDriver().findElements(By.xpath("//div[@id='u02mmenu']/div/ul/li[1]")).size();
    	
    	if(ele==1)
    	{
    		Assert.assertTrue(true);
    	}
    	else
    	{
    		Assert.assertTrue(false);
    	}
    }
    
//   public static int randomnumber()
//   {
////	   Random r=new Random();
////		 int v = r.nextInt(13);
////		 int num=v+1;
////		 return num;
//		 
//		 
//		 Random r=new Random();
//			int v = r.nextInt(13);
//			int num=0;
//			if(v==1)
//			{
//				num = v+1;
//				//System.out.println(num);
////				return in;
//			}
//			else
//			{
//				num=v+1;
//				//System.out.println(num);
////				return num;
//			}
//			
//			return num;
//		
//   }
    public void hover_on_primary_panel_categories()
    {
    	//int num = randomnumber();
		
    	WebElement ele = getDriver().findElement(By.xpath("//div[@id='u02mmenu']/div/ul/li[2]"));
    	//waitABit(1000);
    	Actions act=new Actions(getDriver());
    	//act.moveToElement(ele).perform();
    	act.click(ele).perform();
    	waitABit(2000);
    }
    
    public void verify_secondary_panel_displays()
    {
    	
    	
         int ele2=getDriver().findElements(By.xpath("(//div[@class='u02menu-l1 u02menuwrap u02mheight']//li/a[text()='Products'])[1]/../div/ul/li/a[text()='IT Infrastructure']/../div/ul/li/a[text()='IT Infrastructure']")).size();
       
         if(ele2==1)
     	{
     		Assert.assertTrue(true);
     	}
     	else
     	{
     		Assert.assertTrue(false);
     	}
         
    }
    
    public void hover_on_secondary_panel_catagories()
    {
    	WebElement hover = getDriver().findElement(By.xpath("(//div[@class='u02menu-l1 u02menuwrap u02mheight']//li/a[text()='Products'])[1]/../div/ul/li/a[text()='IT Infrastructure']"));
    	Actions a1=new Actions(getDriver());
    	a1.moveToElement(hover).perform();
    	
    	waitABit(1500);
    
    
    }
    
    public void shows_categories_with_direct_link()
    {
    	List<WebElement> ele=getDriver().findElements(By.xpath("(//div[@class='u02menu-l1 u02menuwrap u02mheight']//li/a[text()='Products'])[1]/../div/ul/li/a[text()='IT Infrastructure']/../div/ul/li/a[text()='IT Infrastructure']/../following-sibling::li"));
        
        for(int i=1;i<ele.size();i++)
        {
      	 WebElement move = ele.get(i);
      	 
      	 Actions a=new Actions(getDriver());
      	 a.moveToElement(move).perform();
      	 waitABit(300);
      	 
        }
    }
}
