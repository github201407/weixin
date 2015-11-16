package com.yourcompany.struts.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

import com.yourcompany.struts.main.MenuManager;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {
	public void testProperties(){
		Properties properties = new Properties();
		String fileName = ProjectTest.class.getResource("/").getPath() + "wechat.properties";
		File file = new File(fileName);
		InputStream inStream = null;
		try {
			inStream = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			properties.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String appId = properties.getProperty("appId");
		String appSecret = properties.getProperty("appSecret");
        
        //通过PropertyUtils的getProperty方法获取指定属性的值  
        System.out.println("appId = " + appId + "  appSecret = " + appSecret); 
	}
	
	public void testPath(){
		// path不以’/'开头时，默认是从此类所在的包下取资源；
		// path  以’/'开头时，则是从ClassPath根下获取；
		 System.out.println(ProjectTest.class.getResource(""));
	     System.out.println(ProjectTest.class.getResource("/"));
//	     file:/F:/learn/ROOT/WebRoot/WEB-INF/classes/com/yourcompany/struts/test/
//	     file:/F:/learn/ROOT/WebRoot/WEB-INF/classes/
	}
	
	public void testMain(){
		MenuManager mManager = new MenuManager();
		String str = mManager.createMenu();
		System.out.println(str);
	}

}
