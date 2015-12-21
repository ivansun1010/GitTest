package com.test;

public class GetFilePath {
	public static String getFilePath()  
    {  
        String path = GetFilePath.class.getResource("").getFile().toString();  
  
        if (path != null)  
        {  
            System.out.println("current path :" + path);  
        }  
        return (path);  
    }  
	public static void main(String[] args) {
		getFilePath();
	}
}
