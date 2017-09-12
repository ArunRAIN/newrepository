package com.bdd.sample.steps.serenity;

import com.bdd.sample.pages.SignedInPage;

import net.thucydides.core.annotations.Step;

public class SignedInSteps
{

	SignedInPage sipage;

   
    @Step
    public void is_signin() 
    {
    	sipage.hover_SignIn();
    	sipage.click_sigin();
    	sipage.SignIn_account();
    }
    
    @Step
	public void expected_text(String actualtext) 
	{
    	sipage.Expected_text(actualtext);
	}
	
	@Step
	public void hover_on_signin(String text) 
	{
		sipage.hover_on_signin(text);
		}
	
	@Step
	public void Expected_option_display(String option1,String option2) 
	{
		sipage.option_display(option1, option2);
	}
	
	@Step
	public void Expected_oracle_account_option(String option) 
	{
		sipage.oracle_account_option(option);
	}
	
	@Step
	public void Expected_cloud_account_option(String option) 
	{
		sipage.cloud_account_option(option);
	}
	
	@Step
	public void page(String expectedtitle) throws InterruptedException 
	{
		
		sipage.is_page( expectedtitle);
	}
	
	@Step
	public void is_page(String option,String link,String expectedtitle) throws InterruptedException 
	{
		sipage.oracle_account_option_click(link,option);
		page( expectedtitle);
	}
	
	
	@Step
	public void is_page_(String option,String link,String expectedtitle) throws InterruptedException 
	{
		sipage.oracle_cloud_account_option_click(option,link);
		page(expectedtitle);
	}
    
  
}
