package com.k7it;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class IOExampleDemo {

	public static void main(String[] args) {
     File myfolder=new File("my data");
     File file=new File("D:\\lab\\MyBioData.txt");
     FileWriter fw=null;
     try {
    	 if(!myfolder.exists()) {
    		 myfolder.mkdir();
    		 System.out.println("my folder:"+myfolder.isDirectory());
    		 }
    	 if(!file.exists()) {				
				file.createNewFile();
				System.out.println("File is created:"+file.isFile());
			}
			System.out.println("My parent is:"+file.getParent());
			System.out.println("My parent file is:"+file.getParentFile());
            System.out.println("my path:"+file.getPath());
            System.out.println("My AbsolutePath:"+file.getAbsolutePath());
			fw = new FileWriter(file);
			fw = new FileWriter(file);
			fw.write("Hi Team, My self Anuradha, I have completed my Mcom in commerce "
					+ "from gulbarga university");
			fw.append("\n My\tam doing java course at K7iT");
        System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println("file write operation completed");
		}catch (IOException e) {
			e.printStackTrace();
	}finally {
		if(fw!=null) {
			try {
				fw.flush();
				fw.close();
			}catch (IOException E) {
				E.printStackTrace();
			}
			}
		}
	}
     
	}


