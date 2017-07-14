package com.bdd.sample;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Genric {
	public static String getPropertyValue(String key)
	{
		String value="";
		Properties ppt=new Properties();
		try{
			ppt.load(new FileInputStream("./config/config.properties"));
			value=ppt.getProperty(key);
		}
		catch(Exception e){
		}
		return value;
	}
	
	
}
