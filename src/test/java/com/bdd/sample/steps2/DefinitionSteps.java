package com.bdd.sample.steps2;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;
import org.junit.Assert;

import com.bdd.sample.steps.serenity.EndUserSteps;



public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("User on home page")
	public void Useronhomepage()
	{
    	endUser.is_the_home_page();
	}

    @When("User verifies Menu bar should not Move while pageload")
    public void pageloadsjamesverifyMenubarshouldnotMove() throws InterruptedException
    {
    	boolean position = endUser.verify_Menu_bar_position();
    	Assert.assertTrue(position);
    	
    }
//    @Then("User verifies left Header contains: $table")
//    public void jamesverifyHeadershouldcontain(ExamplesTable activityTable) throws InterruptedException
//    {
//    	 for (Parameters row : activityTable.getRowsAsParameters()) 
//    	 {//Parameters row = activityTable.getRowAsParameters(0);
//        String name = row.valueAs("Header1", String.class);
//        
////        //String organisation = row.valueAs("organisation", String.class, "N/A");
////        System.out.println(name + " is part of organisation: " );
//        
//        boolean header1 = endUser.left_hand_header_contain_(name);
//        Assert.assertTrue(header1);
//    	 }
        
    	 
    	 @Then("User verifies left Header contains: $table")
    	    public void jamesverifyHeadershouldcontain(ExamplesTable activityTable) throws InterruptedException
    	    {
    	    	 for (Parameters row : activityTable.getRowsAsParameters()) 
    	    	 {//Parameters row = activityTable.getRowAsParameters(0);
    	        String name = row.valueAs("Header1", String.class);
    	          if(name.equals("Logo"))
    	          {
    	        	  endUser.logo(name);
    	          }
    	          else if(name.equals("Menu"))
    	          {
    	        	  endUser.menu(name);
    	          }
    	          if(name.equals("Search"))
    	          {
    	        	  endUser.search(name);
    	          }
    	   }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 }
    	
    @Then("User verifies right Header contains: $table")
    public void jamesverifyHeader2shouldcontain(ExamplesTable activityTable) throws InterruptedException
     {
    		 
    		 List<Parameters> t = activityTable.getRowsAsParameters(); 
    		 System.out.println(t.size());
    	    for(int i=0;i<t.size();i++)
    	    	 //for (Parameters row : activityTable.getRowsAsParameters()) 
    	   {
    	    	Parameters row = activityTable.getRowAsParameters(i);
    	        String name = row.valueAs("Header2", String.class);
    	        
//    	        //String organisation = row.valueAs("organisation", String.class, "N/A");
//    	        System.out.println(name + " is part of organisation: " );
    	        int v=i+1;
    	        boolean header2 = endUser.right_hand_header_contain_(name);
    	        Assert.assertTrue(header2);
    	        
    	    }
    	
    }
   
    
    
    
    
    
    }
    


