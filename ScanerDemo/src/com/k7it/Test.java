package com.k7it;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test {
 public static void main(String[] args) throws IOException {
	
	 int age = Integer.parseInt(System.getProperty("age"));
     String name = System.getProperty("name");
     double ht = Double.parseDouble(System.getProperty("ht"));
     double wt = Double.parseDouble(System.getProperty("wt"));
     
     System.out.println("Name:"+name+",age:"+age+",ht:"+ht+",wt:"+wt);
	 
	 FileReader file = new FileReader(new File("D:\\lab\\3rd-batch\\ScanerDemo\\src\\resource\\MyApplication.properties"));
     
     Properties p1 =System.getProperties();
     p1.load(file);
     System.out.println("Name:"+p1.getProperty("name")+
    		 ",age:"+p1.getProperty("age")+
    		 ",ht:"+p1.getProperty("ht")+
    		 ",wt:"+p1.getProperty("wt"));
}
}
