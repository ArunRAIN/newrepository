package com.bdd.sample.steps.serenity;

import com.bdd.sample.pages.CountryListPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CountryListSteps extends ScenarioSteps
{

	CountryListPage CLPage;
	
    @Step
	public void hover_on(String country) 
	{
    	CLPage.hover_on(country);
	}
    
    @Step
	public void region_panel_display() 
	{
    	CLPage.region_panel_display();
	}
    
    @Step
	public void countries_panel_display() 
	{
    	CLPage.countries_panel_display();
	}
    
    @Step
   	public void is_pin_appear() 
   	{
       	CLPage.is_pin_appear();
   	}
}
