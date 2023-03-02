package Chap15.f_p749_PropertiesExample;

import java.io.*;
import java.net.*;
import java.util.*;

public class PropertiesExample {

	public static void main(String[] args)   {
		// 이것이 자바다 p749
		try {
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		} catch (Exception e) {}
	}

}
