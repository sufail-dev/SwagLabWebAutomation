package com.aucselenium.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {

	private ReadPropertyFile() {}
	private static final Properties prop=new Properties();
	private static final Map<String,String> PROPERTYDATA= new HashMap<>();
	static {
		try {
			FileInputStream input =new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
			try {
				prop.load(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(Map.Entry<Object, Object> entry: prop.entrySet()) {
			PROPERTYDATA.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			System.out.println(PROPERTYDATA);
		}
			
	}
	
	public static String get(String key) throws Exception {
		if(Objects.isNull(key)||Objects.isNull(PROPERTYDATA.get(key))) {
			throw new Exception(key +"is not available");
		}
		return PROPERTYDATA.get(key);	
	}
}
