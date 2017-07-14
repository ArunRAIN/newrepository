package com.bdd.sample.steps.serenity;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.bdd.sample.pages.SearchBoxPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchBoxUserStep extends ScenarioSteps
{
	SearchBoxPage scpage;

	
	   @Step
	   public void click_on_inside_Textbox()
	   {   
		 scpage.click_on_inside_textbox();
	   }

		@Step
		public void is_focus_on_Textbox()
		{
			 scpage.is_focus_on_textbox();
	
		}
		
		@Step
		public void type_textbox(String data)
		{
			 scpage.type_in_search_box(data);
	
		}
		

		@Step
		public void is_search_option_display()
		{
			 scpage.verify_search_option_displays();
	
		}
		
		
		@Step
		public void click_option(String option)
		{
			 scpage.click_option(option);
		}
		
		@Step
		public void is_page(String expectedtitle)
		{
			 scpage.is_page(expectedtitle);
		}
	
		@Step
		public void click_search()
		{
			 
			 scpage.click_search();
		}
		@Step
		public void is_display()
		{
			 scpage.is_display();
			
		}
}
