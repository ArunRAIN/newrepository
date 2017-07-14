package com.bdd.sample.steps2;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.bdd.sample.steps.serenity.CountryListSteps;
import net.thucydides.core.annotations.Steps;

public class CountryListDefinition
{
	    @Steps
	    CountryListSteps Cuser;

	   
	    
	    @When("User Hover over on '$country' text")
		public void UserHoveroveronCountrytext(String country)
		{
	    	Cuser.hover_on(country);
		}
	    
	    @Then("User can see the  panel showing Regions and their countries with two column")
	    public void UsercanseethepanelshowingRegionsandtheircountrieswithtwocolumn()
	    {
	   
	    	Cuser.region_panel_display();
	    	
	    	Cuser.countries_panel_display();
	    }
}
