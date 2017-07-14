package com.bdd.sample.steps.serenity;

import com.bdd.sample.pages.SearchAutosuggestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchAutosuggestSteps extends ScenarioSteps
{
	SearchAutosuggestPage SaPage;
	
	
	
	@Step
	public void type_keyword(String option)
	{
		SaPage.type_keyword(option);
	}
	
	@Step
	public void Autosuggestion_display()
	{
		SaPage.verify_Autosuggestion_display();
	}
	
	@Step
	public void is_Autosuggestion_not_display()
	{
		SaPage.verify_Autosuggestion_not_display();
	}
	
	@Step
	public void click_outside_searchbox()
	{
		
		SaPage.click_outside_searchbox();
	}
	
	@Step
	public void press_Enter()
	{
		SaPage.hit_Enter();
	}
	
	@Step
	public void Expected_page(String title)
	{
		SaPage.is_page(title);
	}
	
	@Step
	public void click_searchIcon()
	{
		SaPage.click_serch_Icon();
	}
	
	@Step
	public void navigate_page()
	{
		
		SaPage.click_outside_searchbox();
	}
}
