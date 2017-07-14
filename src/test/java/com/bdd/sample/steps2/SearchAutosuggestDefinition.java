package com.bdd.sample.steps2;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.bdd.sample.steps.serenity.SearchAutosuggestSteps;
import net.thucydides.core.annotations.Steps;

public class SearchAutosuggestDefinition
{
	@Steps
	SearchAutosuggestSteps sastep;
	
	
	
	@When("User begins to type keyword '$option' in search box autosuggest must suggest options")
	public void whenUserBeginsToTypeAKeywordjavInSearchBoxAutosuggestMustSuggestOptions(String option) 
	{
		sastep.type_keyword(option);
		
		sastep.Autosuggestion_display();
	  
	}

	@Then("User start entering keyword '$option' again and autosuggest must reappear")
	public void thenUserStartEnteringKeywordoracleAndOnceAutosuggestionAppearsClickOutsideTheSearchFieldAndVerifyThatTheAutosuggestRetracts(String option) 
	{
		
		sastep.type_keyword(option);
		
		sastep.Autosuggestion_display();
	
	}


	@Then("User Enters keyword '$data' and hit enter results must be displayed in '$title' page")
	public void thenUserEnterAKeywordoracleSelectOneOfTheOptionsFromAutosuggestAndHitEnterResultsMustBeDisplayedInOraclecomSearchPage(String data,String title)
	{
	 
		sastep.type_keyword(data);
		
		sastep.press_Enter();
		
		sastep.Expected_page(title);
	}

	@Then("User Enters keyword '$data' and click search icon results must be displayed in '$title' page")
	public void thenUserEnterAKeywordoracleOrSelectOneOfTheOptionsFromAutosuggestAndClickSearchIconResultsMustBeDisplayedInOraclecomSearchPage(String data,String title)
	{
	  
		
		sastep.type_keyword(data);
		
		sastep.click_searchIcon();
		
		sastep.Expected_page(title);
		
	}
	

	@Then("User Enters keyword '$option' and once autosuggestion appears, click outside the search field and verify that the autosuggest retracts")
	public void thenUserContinuationFromPreviousStepStartEnteringKeywordAgainAndAutosuggestMustReappear(String option) 
	{
		sastep.type_keyword(option);
		

		sastep.click_outside_searchbox();
		
		sastep.is_Autosuggestion_not_display();
		
	}

}
