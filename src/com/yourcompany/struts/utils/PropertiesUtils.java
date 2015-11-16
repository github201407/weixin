package com.yourcompany.struts.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.yourcompany.struts.test.ProjectTest;

public class PropertiesUtils {
	
	public static Properties loadProperties(){
		Properties properties = new Properties();
		String fileName = ProjectTest.class.getResource("/").getPath() + "wechat.properties";
		InputStream inStream = null;
		try {
			inStream = new FileInputStream(fileName);
			properties.load(inStream);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		//通过PropertyUtils的getProperty方法获取指定属性的值  
		return properties;
	}
}
