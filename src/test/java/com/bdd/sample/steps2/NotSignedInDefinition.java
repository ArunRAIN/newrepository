package com.bdd.sample.steps2;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;
import org.junit.Assert;

import com.bdd.sample.steps.serenity.NotSignedInStep;
import net.thucydides.core.annotations.Steps;

public class NotSignedInDefinition 
{
	@Steps
	NotSignedInStep Nsstep;
	
	
	@When("User Not signed In")
	public void UserNotsignedIn()
	{
		Nsstep.is_not_signin();
		
	}
	
	@Then("User see the text '$text' must be displayed")
	public void Userseethetexttextmustbedisplayed(String text)
	{
		Nsstep.expected_text(text);
	}
	
	@When("User Hover over '$text'")
	public void UserHoveroverSignIn(String text)
	{
		Nsstep.hover_on_signin(text);
		
	}
	
	@Then("User see the panel must slide down showing two account options '$option1' and '$option2'")
	public void UserHoveroverSignInandapanelmustslidedownshowingtwoaccountoptions(String text,String option1,String option2)
	{
		
		
		Nsstep.Expected_option_display(option1, option2);
	}
	
	@Then("User verify Oracle Account must have options: $table")
	public void UserverifyOracleAccountmusthaveoptions(ExamplesTable activityTable)
	{
		 for (Parameters row : activityTable.getRowsAsParameters()) 
    	 {
            String name = row.valueAs("option", String.class);
            Nsstep.Expected_oracle_account_option(name);
       
    	 }
	}

	@Then("User verify Cloud Account must have only option: $table")
	public void UserverifyCloudAccountmusthaveonlyoption(ExamplesTable activityTable)
	{
		 for (Parameters row : activityTable.getRowsAsParameters()) 
    	 {
            String name = row.valueAs("option", String.class);
            Nsstep.Expected_cloud_account_option(name);
       
    	 }
	}
	
	@Then("User Click on Oracle Account each links: $table")
	public void UserClickonOracleAccounteachlinks(ExamplesTable activityTable) throws InterruptedException
	{
		 for (Parameters row : activityTable.getRowsAsParameters()) 
    	 {
			 String option = row.valueAs("Option", String.class);
            String link = row.valueAs("Link", String.class);
            String apprPAGE = row.valueAs("appropriate page", String.class);
//          
            Nsstep.is_page(option, link, apprPAGE);
            Thread.sleep(2000);
            Nsstep.page(option, link, apprPAGE);
           
           
            
    	 }
	}
	
	@Then("User Click on Cloud Account each links: $table")
	public void UserClickoneachoptions(ExamplesTable activityTable) throws InterruptedException
	{
		 for (Parameters row : activityTable.getRowsAsParameters()) 
    	 {
			 String option = row.valueAs("Option", String.class);
            String link = row.valueAs("Link", String.class);
            String apprPAGE = row.valueAs("appropriate page", String.class);
//          
            Nsstep.is_page_(option, link, apprPAGE);
         
           
            
    	 }
	}
}
