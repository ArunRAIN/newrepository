package com.bdd.sample.steps.serenity;



import com.bdd.sample.pages.NotSignedInPage;

import net.thucydides.core.annotations.Step;

public class NotSignedInStep 
{
	NotSignedInPage NssPage;
	
	

	@Step
	public void is_not_signin() 
	{
		NssPage.Not_signIn();
	}
	
	@Step
	public void expected_text(String actualtext) 
	{
		NssPage.Expected_text(actualtext);
	}
	
	@Step
	public void hover_on_signin(String text) 
	{
		NssPage.hover_on(text);
	}
	
	@Step
	public void Expected_option_display(String option1,String option2) 
	{
		NssPage.option_display(option1, option2);
	}
	
	@Step
	public void Expected_oracle_account_option(String option) 
	{
		NssPage.oracle_account_option(option);
	}
	
	@Step
	public void Expected_cloud_account_option(String option) 
	{
		NssPage.cloud_account_option(option);
	}
	
	@Step
	public void page(String option,String link,String expectedtitle) 
	{
		
		if(link.equals("Help"))
		{
		NssPage.is_page_(option, expectedtitle);
		}
		else if(link.equals("Create an account"))
		{
			NssPage.is_page_(option, expectedtitle);
		}
		else if(link.equals("Sign in"))
		{
			NssPage.is_page3(option, expectedtitle);
		}
	}
	
	@Step
	public void is_page(String option,String link,String expectedtitle) 
	{
		NssPage.oracle_account_option_click(link,option,expectedtitle);
		//page(link,option, expectedtitle);
	}
	
	@Step
	public void Page(String option,String link,String expectedtitle) 
	{
		NssPage.is_page_(option, expectedtitle);
	}
	
	
	@Step
	public void is_page_(String option,String link,String expectedtitle) 
	{
		NssPage.oracle_cloud_account_option_click(link);
		Page(option, link, expectedtitle);
	}
	
	
	
}
