package com.bdd.sample.steps2;

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
	    
	    @Then("panel must show Regions in the 1st panel and their countries in the 2nd panel 2 column countries list must be displayed")
	    public void UsercanseethepanelshowingRegionsandtheircountrieswithtwocolumn()
	    {
	   
            Cuser.region_panel_display();
	    	
	    	Cuser.countries_panel_display();
	    }
	    
	    @Then("Depending upon which country the page belongs to,  pin must appear against it")
	    public void Dependinguponwhichcountrythepagebelongstopinmustappearagainstit()
	    {
	    	Cuser.is_pin_appear();
	    
	    }
}
