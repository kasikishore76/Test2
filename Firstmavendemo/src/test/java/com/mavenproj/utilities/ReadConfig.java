package com.mavenproj.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	public ReadConfig() {
		
		File src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public  String getBaseURL() {
		
		String url=pro.getProperty("baseurl");
		return url;
		
	}
	
	public String getUserName() {
		String uname=pro.getProperty("username");
		return uname;
		
	}
	
	public String getPassword()
	{
		String pwd=pro.getProperty("passwrod");
		return pwd;
		
	}
	
	public String getFFPath() {
		String ff=pro.getProperty("firepath");
		return ff;
		
	}

	public String getChromePath() {
		String ch=pro.getProperty("chromepath");
		return ch;
		
	}

	public String getIEPath() {
		String ie=pro.getProperty("iepath");
		return ie;
		
	}
	

	

}
