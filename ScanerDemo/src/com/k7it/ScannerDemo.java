package com.k7it;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) throws IOException {
		/*
		 * int age = Integer.parseInt(args[0]); String name = args[1]; double ht =
		 * Double.parseDouble(args[2]); double wt = Double.parseDouble(args[3]);
		 * 
		 * System.out.println("Name:"+name+",age:"+age+",ht:"+ht+",wt:"+wt);
		 */
	  
	   /*  int age = Integer.parseInt(System.getProperty("age"));
	     String name = System.getProperty("name");
	     double ht = Double.parseDouble(System.getProperty("ht"));
	     double wt = Double.parseDouble(System.getProperty("wt"));
	     
	     System.out.println("Name:"+name+",age:"+age+",ht:"+ht+",wt:"+wt);
	 
	     Properties p  = System.getProperties();
	     
	     System.out.println(p);
	     
	     System.out.println("Name:"+p.getProperty("name")+
	    		 ",age:"+p.getProperty("age")+
	    		 ",ht:"+p.getProperty("ht")+
	    		 ",wt:"+p.getProperty("wt"));
		 
	     FileReader file = new FileReader(new File("D:\\lab\\3rd-batch\\ScanerDemo\\src\\resource\\MyApplication.properties"));
	     
	     Properties p1 =System.getProperties();
	     p1.load(file);
	     System.out.println("Name:"+p1.getProperty("name")+
	    		 ",age:"+p1.getProperty("age")+
	    		 ",ht:"+p1.getProperty("ht")+
	    		 ",wt:"+p1.getProperty("wt"));
	     
	     System.out.println("K7it databse:"+p1.getProperty("com.k7it.database.name"));
	     System.out.println("K7it databse username:"+p1.getProperty("com.k7it.database.username"));
	     System.out.println("K7it databse password:"+p1.getProperty("com.k7it.databse.password"));
	     */
	  
	  
	  Scanner sc  = new Scanner(System.in);
	   System.out.println("Please enter your Name:");
	   String name = sc.nextLine();
	   System.out.println("Please enter your Age:");
	   int age = sc.nextInt();
	   System.out.println("Please enter your Height:");
	   double ht = sc.nextDouble();
	   System.out.println("Please enter your Weight:");
	   double wt = sc.nextDouble();
	   
	   Person person = new Person(age, name, ht, wt);
	   person.age = age;
	   person.name = name;
       person.setHt(ht);	   
       person.setWt(wt);	   
	   System.out.println(person);
	  
}
  
  
  /*
   * cmd line args drawbacks : no of arguments should be match, type of the args should be match'
   * order argument also should be match. 
   * 
   * in order ti fix this limitations in cmd line args java people introduced System properties.
   *  
   *  how to pass system properties to program:
   *   by using -D option for java cmd we can pass the system properties as input params to our 
   *   java program.  system properties will works like same as hashmap i,e key and value pair 
   *   concept. 
   *   
   *   syntax: java -Dkey=valuu -Dkey2= value1 ... *.java;
   *   
   *   How to read the system properties :
   *    
   *           datatype value = System.getProperty("key");
   *   
   *   note: we should not use the space between -D and key. and one priperty to another property
   *   space is delimer and for every system property we should use -D.
   *   
   *   exmample:  -Dwt="5.7"  -Dname="k7it" -Dht="37"  -Dage="27" as virtual arguments in the 
   *   eclipse .
   *   
   *   How to read the system properties :
   *   
   *   we can read in 2 ways
   *   1. System.getProperty("key");
   *   2. Properties p = System.getProperties();
   *      p.getProperty("key");
   *  
   *     int age = Integer.parseInt(System.getProperty("age"));
	     String name = System.getProperty("name");
	     double ht = Double.parseDouble(System.getProperty("ht"));
	     double wt = Double.parseDouble(System.getProperty("wt"));
	     
	     System.out.println("Name:"+name+",age:"+age+",ht:"+ht+",wt:"+wt);
	 
	     Properties p  = System.getProperties();
	     
	     System.out.println(p);
	     
	     System.out.println("Name:"+p.getProperty("name")+
	    		 ",age:"+p.getProperty("age")+
	    		 ",ht:"+p.getProperty("ht")+
	    		 ",wt:"+p.getProperty("wt"));
	    		 
	    	output: 
	    	Name:k7it,age:27,ht:37.0,wt:5.7
			{java.specification.version=17, sun.cpu.isalist=amd64, sun.jnu.encoding=Cp1252, java.class.path=D:\lab\3rd-batch\ScanerDemo\bin, java.vm.vendor=Eclipse Adoptium, ht=37, sun.arch.data.model=64, user.variant=, java.vendor.url=https://adoptium.net/, java.vm.specification.version=17, os.name=Windows 11, sun.java.launcher=SUN_STANDARD, user.country=IN, sun.boot.library.path=C:\Users\Dell\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.4.v20221004-1257\jre\bin, sun.java.command=com.k7it.ScannerDemo, jdk.debug=release, sun.cpu.endian=little, user.home=C:\Users\Dell, user.language=en, java.specification.vendor=Oracle Corporation, java.version.date=2022-08-12, java.home=C:\Users\Dell\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.4.v20221004-1257\jre, file.separator=\, java.vm.compressedOopsMode=Zero based, line.separator=
			, java.vm.specification.vendor=Oracle Corporation, java.specification.name=Java Platform API Specification, name=k7it, user.script=, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, java.runtime.version=17.0.4.1+1, user.name=Dell, path.separator=;, os.version=10.0, java.runtime.name=OpenJDK Runtime Environment, file.encoding=UTF-8, java.vm.name=OpenJDK 64-Bit Server VM, java.vendor.version=Temurin-17.0.4.1+1, wt=5.7, java.vendor.url.bug=https://github.com/adoptium/adoptium-support/issues, java.io.tmpdir=C:\Users\Dell\AppData\Local\Temp\, java.version=17.0.4.1, user.dir=D:\lab\3rd-batch\ScanerDemo, os.arch=amd64, java.vm.specification.name=Java Virtual Machine Specification, sun.os.patch.level=, native.encoding=Cp1252, java.library.path=C:\Users\Dell\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.4.v20221004-1257\jre\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:/Users/Dell/.p2/pool/plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.4.v20221004-1257/jre/bin/server;C:/Users/Dell/.p2/pool/plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.4.v20221004-1257/jre/bin;C:\oraclexe\app\oracle\product\11.2.0\server\bin;;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\MySQL\MySQL Shell 8.0\bin\;C:\Users\Dell\AppData\Local\Microsoft\WindowsApps;C:\apache-maven-3.8.6\bin;D:\Java\jdk1.8.0_202\bin;;C:\Users\Dell\Desktop;;., java.vm.info=mixed mode, java.vendor=Eclipse Adoptium, java.vm.version=17.0.4.1+1, sun.io.unicode.encoding=UnicodeLittle, java.class.version=61.0, age=27}
			Name:k7it,age:27,ht:37,wt:5.7
			
			
			how to read the system properties from properties file :
			
			MyApplication.properties
			
			name=K7iT
			age=37
			ht=5.5
			wt=56.5
			com.k7it.database.name=k7itdb
			com.k7it.database.username=k7it
			com.k7it.databse.password=123456
			
			
			
			FileReader file = new FileReader
				(new File("D:\\lab\\3rd-batch\\ScanerDemo\\src\\resource\\MyApplication.properties"));
	     
		     Properties p1 =System.getProperties();
		     p1.load(file);
		     System.out.println("Name:"+p1.getProperty("name")+
		    		 ",age:"+p1.getProperty("age")+
		    		 ",ht:"+p1.getProperty("ht")+
		    		 ",wt:"+p1.getProperty("wt"));
		     
		     System.out.println("K7it databse:"+p1.getProperty("com.k7it.database.name"));
		     System.out.println("K7it databse username:"+p1.getProperty("com.k7it.database.username"));
		     System.out.println("K7it databse password:"+p1.getProperty("com.k7it.databse.password"));
	     
			
		How to read dynamic inputs from user using scanner class:
		===========================================================
		
			Scanner class is available under java.util packe, by using scanner class we can
			read the dynamic input values from console with the help inputStream object
			(i.e System.in).
			Syste.out : it will write the data into console
			System.in : it will read the data from console
			
			
	 
   *   
   *   
   * 
   */
}
