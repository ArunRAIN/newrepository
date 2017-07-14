package com.bdd.sample.steps2;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.bdd.sample.steps.serenity.MenuEndUserStep;

import net.thucydides.core.annotations.Steps;

public class MenuDefinitionSteps
{

	 @Steps
	 MenuEndUserStep MenuendUser;

	

	 @When("User hover on Menu Bar shows primary panel with categories")
	 public void jameshoveronMenuBarshowsprimarypanelwithcategories() throws InterruptedException
	  {
	   	MenuendUser.hover_on_Menu_bar();
	    	
	    	MenuendUser.shows_primary_panel_with_categories();
	    	
	   }
	    

	    @Then("User hover on primary categories panel shows secondary panel")
	    public void jameshoveronprimarycategoriespanelshowssecondarypanel() throws InterruptedException
	     {
	    	MenuendUser.hover_on_primary_panel_categories();
	    	
	        MenuendUser.shows_secondary_panel();	
	    
	     }
	   
	    @Then("User hover on Secondary panel should show categerioes and direct links with arrow pointing")
	    public void jameshoveronSecondarypanelshouldshowcategerioesanddirectlinkswitharrowpointing() throws InterruptedException
	     {
	    	
	    	MenuendUser.hover_on_Secondary_panel_categories();
	    	
	    	MenuendUser.shows_Categories_with_direct_link();
	     }
	    
}
