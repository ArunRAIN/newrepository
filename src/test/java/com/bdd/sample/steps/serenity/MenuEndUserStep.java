package com.bdd.sample.steps.serenity;



import com.bdd.sample.pages.MenuobjectPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MenuEndUserStep extends ScenarioSteps
{
	MenuobjectPage MoPage;
	
	

	   @Step
	   public void hover_on_Menu_bar()
	   {   
		 MoPage.hover_Menu_bar(); 
	   }

		
	   @Step
	   public void shows_primary_panel_with_categories()
	   {
	     
		  MoPage.verify_primarypanel_with_categories();
		   
		  
	     
	   }
	   
	   @Step
	   public void hover_on_primary_panel_categories()
	   {
		   MoPage.hover_on_primary_panel_categories();
 
	   }
	   
	   
	   @Step
	   public void shows_secondary_panel()
	   {
		MoPage.verify_secondary_panel_displays();
	     
	   }
	   
	   
	   @Step
	   public void hover_on_Secondary_panel_categories()
	   {
		   MoPage.hover_on_secondary_panel_catagories();
		   
		   
 
	   }
	   
	   @Step
	   public void shows_Categories_with_direct_link()
	   {
		   MoPage.shows_categories_with_direct_link();
		   
 
	   }
	  
	   
}
