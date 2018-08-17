package com.bdd.sample.steps.serenity;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import com.bdd.sample.pages.DictionaryPage;
import jxl.common.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;


   
    @Step
    public void is_the_home_page() 
    {
    	dictionaryPage.home_page();
    }
    
    
    @Step
    public boolean verify_Menu_bar_position() throws InterruptedException {
        
        boolean position = dictionaryPage.Menu_bar_displayed();
       
       return position;
     
    }
    
    @Step
    public void logo(String header) {
    	dictionaryPage.logo(header);
    }
    
    @Step
    public void menu(String header) {
    	dictionaryPage.menu(header);
    }
    
    @Step
    public void search(String header) {
    	dictionaryPage.search(header);
    }
    
    @Step
    public boolean left_hand_header_contain_(String header) {
        boolean ele = dictionaryPage.left_header_contains(header);
        
        return ele;
    }
    
    @Step
    public boolean right_hand_header_contain_(String header) {
        boolean ele = dictionaryPage.right_header_contains(header);
        
        return ele;
    }
}