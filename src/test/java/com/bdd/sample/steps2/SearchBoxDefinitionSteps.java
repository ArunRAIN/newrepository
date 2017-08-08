package com.bdd.sample.steps2;

import java.awt.AWTException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.bdd.sample.steps.serenity.SearchBoxUserStep;

import net.thucydides.core.annotations.Steps;



public class SearchBoxDefinitionSteps
{
	@Steps
	SearchBoxUserStep scustep;
	
	

    @When("User click inside the search box must show the cursor")
	public void Userclickinsidethesearchboxmustshowthecursor() throws AWTException 
	{

    	scustep.click_on_inside_Textbox();
    	
    	scustep.is_focus_on_Textbox();
    	
       
	    	
	}
	  
    @Then("User checks Without entering any text in the search box hit return key Search field must flash in red and disappear")
   	public void UserchecksWithoutenteringanytextinthesearchboxhitreturnkeySearchfieldmustflashinred() 
   	{

    	scustep.click_search();
    	
    	
    	scustep.is_display();
   	    	
   	}
    
    
    @Then("User text is type '$data' in the search box options must be displayed to choose")
   	public void Usertextistypedinthesearchboxoptionsmustbedisplayedtochoose(String data) 
   	{

       	scustep.type_textbox(data);
       	
       
       	
       	scustep.is_search_option_display(); 
   	    	
   	}
    
   

   
    
    @Then("User Click on the '$option' options should navigate to '$expectedtitle' page")
   	public void UserClickontheoptionsshouldnavigatetopage(String option,String expectedtitle) 
   	{

    	scustep.click_option(option);
    	
    	
    	scustep.is_page(expectedtitle);
   	    	
   	}

    
}
