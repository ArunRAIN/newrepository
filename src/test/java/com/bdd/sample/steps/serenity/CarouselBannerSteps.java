package com.bdd.sample.steps.serenity;

import com.bdd.sample.pages.CarouselBannerPage;
import net.thucydides.core.annotations.Step;

public class CarouselBannerSteps 
{

	CarouselBannerPage CBpage;
	
    
    @Step
   	public void is_slide_display() 
   	{
       	CBpage.is_slide_display();
   	}
    
    @Step
   	public void is_dot_red() 
   	{
       	CBpage.is_dot_red();
   	}
    
    @Step
   	public void click_left_nav_arrows() 
   	{
       	CBpage.click_left_nav_arrows();
   	}
    
    @Step
   	public void is_slide_navigate_to_previous_story() 
   	{
       	CBpage.is_slide_navigate_to_previous_story();
   	}
    
    @Step
   	public void click_right_nav_arrows() 
   	{
       	CBpage.click_right_nav_arrows();
   	}

    @Step
   	public void is_slide_navigate_to_next_story() 
   	{
       	CBpage.is_slide_navigate_to_next_story();
   	}
    
    @Step
   	public void expected_slide_display(String data) 
   	{
       	CBpage.expected_slide_display(data);
   	}
    
    @Step
	public void Expected_page(String expectedtitle) 
	{
		
    	CBpage.is_page(expectedtitle);
	}
    
    @Step
	public void Slide(String slide,String expectedtitle) 
	{
    	CBpage.click_CTA_button(slide);
    	Expected_page(expectedtitle);
	}
    
    @Step
   	public void hover_nav_arrow() 
   	{
       	CBpage.hover_nav_arrows();
       	
   	}
	
}
