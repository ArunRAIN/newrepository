package com.bdd.sample;

import java.io.FileInputStream;
import java.util.Properties;

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
