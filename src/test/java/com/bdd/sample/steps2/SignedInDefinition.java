package com.bdd.sample.steps2;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;

import com.bdd.sample.steps.serenity.SignedInSteps;

import net.thucydides.core.annotations.Steps;

public class SignedInDefinition
{
	@Steps
	SignedInSteps sistep;
	
	
	
	@When("User Signed In")
	public void UserSignedIn() 
	{
		sistep.is_signin();
	
		
	}
	
	@Then("User see the Text '$text' must be displayed")
	public void Userseethetexttextmustbedisplayed(String text)
	{
		sistep.expected_text(text);
	}
	
	@When("User Hover Over '$text'")
	public void UserHoveroverSignIn(String text)
	{
		sistep.hover_on_signin(text);
		
	}
	
	@Then("User see the panel must slide down showing two Account options '$option1' and '$option2'")
	public void UserHoveroverSignInandapanelmustslidedownshowingtwoaccountoptions(String text,String option1,String option2)
	{
		
		
		sistep.Expected_option_display(option1, option2);
	}
	
	@Then("User verify Oracle account must have options: $table")
	public void UserverifyOracleAccountmusthaveoptions(ExamplesTable activityTable)
	{
		 for (Parameters row : activityTable.getRowsAsParameters()) 
    	 {
            String name = row.valueAs("option", String.class);
            sistep.Expected_oracle_account_option(name);
       
    	 }
	}

	@Then("User verify Cloud account must have only option: $table")
	public void UserverifyCloudAccountmusthaveonlyoption(ExamplesTable activityTable)
	{
		 for (Parameters row : activityTable.getRowsAsParameters()) 
    	 {
            String name = row.valueAs("option", String.class);
            sistep.Expected_cloud_account_option(name);
       
    	 }
	}
	
	@Then("User Click on Oracle account each links: $table")
	public void UserClickonOracleAccounteachlinks(ExamplesTable activityTable)
	{
		 for (Parameters row : activityTable.getRowsAsParameters()) 
    	 {
			 String option = row.valueAs("Option", String.class);
            String link = row.valueAs("Link", String.class);
            String apprPAGE = row.valueAs("appropriate page", String.class);
//          
            sistep.is_page(option, link, apprPAGE);
           
           
            
    	 }
	}
	
	@Then("User Click on Cloud account each links: $table")
	public void UserClickoneachoptions(ExamplesTable activityTable)
	{
		 for (Parameters row : activityTable.getRowsAsParameters()) 
    	 {
			 String option = row.valueAs("Option", String.class);
            String link = row.valueAs("Link", String.class);
            String apprPAGE = row.valueAs("appropriate page", String.class);
//          
            sistep.is_page_(option, link, apprPAGE);
           
           
            
    	 }
	}

	
	
}
