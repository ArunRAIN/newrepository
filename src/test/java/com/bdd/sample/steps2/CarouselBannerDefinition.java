package com.bdd.sample.steps2;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;

import com.bdd.sample.steps.serenity.CarouselBannerSteps;
import net.thucydides.core.annotations.Steps;

public class CarouselBannerDefinition 
{
	@Steps
	CarouselBannerSteps CBStep;

   
    
    @When("Story slide is in view")
	public void Storyslideisinview()
	{
    	CBStep.is_slide_display();
	}
    
    @Then("corresponding place dot turn red in color")
	public void correspondingplacedotturnredincolor()
	{
    	CBStep.is_dot_red();
	}

    
    @When("User clicks on the left nav arrows")
	public void Userclicksontheleftnavarrows()
	{
    	CBStep.click_left_nav_arrows();
	}
    
    @Then("slide navigates to previous story")
	public void slidenavigatestopreviousandnextstory()
	{
    	CBStep.is_slide_navigate_to_previous_story();
	}
    
    @When("User clicks on the right nav arrows")
	public void Userclicksontherightnavarrows()
	{
    	CBStep.click_right_nav_arrows();
	}
    
    @Then("slide navigates to next story")
	public void slidenavigatestonextstory()
	{
    	CBStep.is_slide_navigate_to_next_story();
	}
    
    @When("User see the '$data' slide")
    public void Userseethe3slide(String data)
    {
    	CBStep.expected_slide_display(data);
    }
    
    @Then("User verify all 3 slide links are navigate to appropriate page: $data")
    public void Userverifyall3slidelinksarenavigatetoappropriatepage(ExamplesTable activityTable)
    {
    	for (Parameters row : activityTable.getRowsAsParameters()) 
   	     {
			 String slide = row.valueAs("CTA Button", String.class);
             String apprPAGE = row.valueAs("Appropriate page", String.class);
         
             CBStep.Slide(slide, apprPAGE);
          
   	     }
           
   	
    }
}
