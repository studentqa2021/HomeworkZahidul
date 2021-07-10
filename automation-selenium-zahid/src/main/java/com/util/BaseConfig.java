package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	public static String getConfig(String value){
		File file = new File("./Config.Properties");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(pro.getProperty("URL"));
		System.out.println(pro.getProperty("email"));
		System.out.println(pro.getProperty("password"));
		return pro.getProperty(value);
	}
	public static void main(String[] args) {
		BaseConfig.getConfig("URL");
	}
	
}
