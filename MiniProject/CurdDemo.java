import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class CurdDemo {
private static final Logger log = Logger.getLogger(CurdDemo.class);
	
	
		private static String stdname;

		private static String instname;

		
		public static void main(String[] args)
		
		{
			List<Student> st = new ArrayList<Student>();
			Scanner s = new Scanner(System.in);
			int ch = 0;
			do
			{
				log.info("1.create");
				log.info("2.get");
				log.info("3.Search");
				log.info("4.delete");
				log.info("5.update");
				log.info("6.Exit");
				
				
				log.info("Enter your choice :");
				
				ch = s.nextInt();
			
				
				int stdid;
				int stdage;
				
					
					if(ch==1)
					{
					
						log.info("Enter how many employee you want");
						int n = s.nextInt();
						for(int i=0;i<n;i++) {
							
							log.info("Enter stdid");
							stdid = s.nextInt();
							
							log.info("Enter stdame:");
							String stdname = s.next();
							
							log.info("Enter stdage:");
							stdage = s.nextInt();
							
							log.info("Institutename:");
							String instname1 = s.next();
	
							st.add(new Student(stdid,stdname,stdage,instname1));
							log.info("one Emp create successfully");
							log.info("-------------------------");
						Iterator<Student> it = st.iterator();
							while(it.hasNext())
							{
								Student std = it.next();
								log.info(std);
								
							}
							log.info("-------------------");
							
						}
						continue;
					}
					else  if(	ch==2)
					{
						  
						log.info("-------------------------");
						Iterator<Student>it=st.iterator();
						while(it.hasNext())
						{
							Student std = it.next();
							log.info(std);
							
						}
						log.info("-------------------");
						continue;
					}
						
						
					else if(ch==3)
					{
						   boolean found = false;
					 	log.info("Emter stdid to search");
						
						int stdid1 = s.nextInt();
						log.info("------------------------");
						
						 Iterator<Student> it = st.iterator();
						
						while(it.hasNext())
						{
							Student std = it.next();
							if(std.getStdid()==stdid1)
								
							{
								log.info(std);
								found = true;
								
							}
						}
						if (!found) 
						{
							log.info("record not found");
							
						}
						log.info("-------------------------");
						continue;
						
		
					}
					if(ch==4) {
						
					boolean found = false;
					log.info("Enter empid to delete:");
					stdid = s.nextInt();
					log.info("----------------------------------");
					
					Iterator<Student> it = st.iterator();
					while(it.hasNext())
					{
						Student std = it.next();
						if ( std.getStdid()== stdid){
							
							it.remove();
							found = true;
							
						}

					}
					if (!found)
					{
						log.info("record not found:");
						
					}
					else
					{
						log.info("record is deleted successfully");
					}
					log.info("-------------------");
					continue;
		
					}

				
					if(ch==5) {
					boolean found = false;
					log.info("Enter empid to update:");
					stdid = s.nextInt();
					
					ListIterator<Student>li = st.listIterator();
					
					while(li.hasNext())
					{
						Student std = li.next();
						if(std.getStdid()==stdid)
						{
							log.info("Enter new stdname:");
							stdname = s.next();
							
							log.info("Enter new stdage:");
							stdage = s.nextInt();
			
							log.info("Enter new instname:");
							instname = s.next();
							
							li.set(new Student(stdid,stdname,stdage,instname));
							found = true;
						}
					}
					if(!found)
					{
						log.info("record not found");
						
					}
					else
					{
						log.info("record is update successfully");
					}
					continue;
						
					}
					if(ch>=6)
					{
						System.exit(6);
					}
			
			}while(ch!=0);
		
			
		}
}

/*
 Output:
 
 2023-02-27 16:45:49 INFO  CurdDemo:26 - 1.create
  2023-02-27 16:45:49 INFO  CurdDemo:27 - 2.get
  2023-02-27 16:45:49 INFO  CurdDemo:28 - 3.Search
  2023-02-27 16:45:49 INFO  CurdDemo:29 - 4.delete
  2023-02-27 16:45:49 INFO  CurdDemo:30 - 5.update
  2023-02-27 16:45:49 INFO  CurdDemo:31 - 6.Exit
  2023-02-27 16:45:49 INFO  CurdDemo:34 - Enter your choice :
  1
2023-02-27 16:45:54 INFO  CurdDemo:46 - Enter how many students you want
  2
2023-02-27 16:45:55 INFO  CurdDemo:50 - Enter stdid
  101
2023-02-27 16:45:58 INFO  CurdDemo:53 - Enter stdame:
  aruna
2023-02-27 16:46:03 INFO  CurdDemo:56 - Enter stdage:
  23
2023-02-27 16:46:07 INFO  CurdDemo:59 - Institutename:
  k7it
2023-02-27 16:46:10 INFO  CurdDemo:63 - one std create successfully
  2023-02-27 16:46:10 INFO  CurdDemo:64 - -------------------------
  2023-02-27 16:46:10 INFO  CurdDemo:69 - student[stdid=101,stdname=aruna,stdage=23,instname=k7it]
  2023-02-27 16:46:10 INFO  CurdDemo:72 - -------------------
  2023-02-27 16:46:10 INFO  CurdDemo:50 - Enter stdid
  102
2023-02-27 16:46:16 INFO  CurdDemo:53 - Enter stdame:
  latha
2023-02-27 16:46:19 INFO  CurdDemo:56 - Enter stdage:
  21
2023-02-27 16:46:24 INFO  CurdDemo:59 - Institutename:
  k7it
2023-02-27 16:46:30 INFO  CurdDemo:63 - one std create successfully
  2023-02-27 16:46:30 INFO  CurdDemo:64 - -------------------------
  2023-02-27 16:46:30 INFO  CurdDemo:69 - student[stdid=101,stdname=aruna,stdage=23,instname=k7it]
  2023-02-27 16:46:30 INFO  CurdDemo:69 - student[stdid=102,stdname=latha,stdage=21,instname=k7it]
  2023-02-27 16:46:30 INFO  CurdDemo:72 - -------------------
  2023-02-27 16:46:30 INFO  CurdDemo:26 - 1.create
  2023-02-27 16:46:30 INFO  CurdDemo:27 - 2.get
  2023-02-27 16:46:30 INFO  CurdDemo:28 - 3.Search
  2023-02-27 16:46:30 INFO  CurdDemo:29 - 4.delete
  2023-02-27 16:46:30 INFO  CurdDemo:30 - 5.update
  2023-02-27 16:46:30 INFO  CurdDemo:31 - 6.Exit
  2023-02-27 16:46:30 INFO  CurdDemo:34 - Enter your choice :
  2
2023-02-27 16:46:32 INFO  CurdDemo:80 - -------------------------
  2023-02-27 16:46:32 INFO  CurdDemo:85 - student[stdid=101,stdname=aruna,stdage=23,instname=k7it]
  2023-02-27 16:46:32 INFO  CurdDemo:85 - student[stdid=102,stdname=latha,stdage=21,instname=k7it]
  2023-02-27 16:46:32 INFO  CurdDemo:88 - -------------------
  2023-02-27 16:46:32 INFO  CurdDemo:26 - 1.create
  2023-02-27 16:46:32 INFO  CurdDemo:27 - 2.get
  2023-02-27 16:46:32 INFO  CurdDemo:28 - 3.Search
  2023-02-27 16:46:32 INFO  CurdDemo:29 - 4.delete
  2023-02-27 16:46:32 INFO  CurdDemo:30 - 5.update
  2023-02-27 16:46:32 INFO  CurdDemo:31 - 6.Exit
  2023-02-27 16:46:32 INFO  CurdDemo:34 - Enter your choice :
  3
2023-02-27 16:46:37 INFO  CurdDemo:96 - Emter stdid to search
  102
2023-02-27 16:46:41 INFO  CurdDemo:99 - ------------------------
  2023-02-27 16:46:41 INFO  CurdDemo:109 - student[stdid=102,stdname=latha,stdage=21,instname=k7it]
  2023-02-27 16:46:41 INFO  CurdDemo:119 - -------------------------
  2023-02-27 16:46:41 INFO  CurdDemo:26 - 1.create
  2023-02-27 16:46:41 INFO  CurdDemo:27 - 2.get
  2023-02-27 16:46:41 INFO  CurdDemo:28 - 3.Search
  2023-02-27 16:46:41 INFO  CurdDemo:29 - 4.delete
  2023-02-27 16:46:41 INFO  CurdDemo:30 - 5.update
  2023-02-27 16:46:41 INFO  CurdDemo:31 - 6.Exit
  2023-02-27 16:46:41 INFO  CurdDemo:34 - Enter your choice :
  4
2023-02-27 16:46:44 INFO  CurdDemo:127 - Enter stdid to delete:
  102
2023-02-27 16:46:46 INFO  CurdDemo:129 - ----------------------------------
  2023-02-27 16:46:46 INFO  CurdDemo:150 - record is deleted successfully
  2023-02-27 16:46:46 INFO  CurdDemo:152 - -------------------
  2023-02-27 16:46:46 INFO  CurdDemo:26 - 1.create
  2023-02-27 16:46:46 INFO  CurdDemo:27 - 2.get
  2023-02-27 16:46:46 INFO  CurdDemo:28 - 3.Search
  2023-02-27 16:46:46 INFO  CurdDemo:29 - 4.delete
  2023-02-27 16:46:46 INFO  CurdDemo:30 - 5.update
  2023-02-27 16:46:46 INFO  CurdDemo:31 - 6.Exit
  2023-02-27 16:46:46 INFO  CurdDemo:34 - Enter your choice :
  1
2023-02-27 16:46:49 INFO  CurdDemo:46 - Enter how many students you want
  1
2023-02-27 16:46:51 INFO  CurdDemo:50 - Enter stdid
  104
2023-02-27 16:46:54 INFO  CurdDemo:53 - Enter stdame:
  deepthi
2023-02-27 16:46:59 INFO  CurdDemo:56 - Enter stdage:
  19
2023-02-27 16:47:04 INFO  CurdDemo:59 - Institutename:
  k7it
2023-02-27 16:47:09 INFO  CurdDemo:63 - one std create successfully
  2023-02-27 16:47:09 INFO  CurdDemo:64 - -------------------------
  2023-02-27 16:47:09 INFO  CurdDemo:69 - student[stdid=101,stdname=aruna,stdage=23,instname=k7it]
  2023-02-27 16:47:09 INFO  CurdDemo:69 - student[stdid=104,stdname=deepthi,stdage=19,instname=k7it]
  2023-02-27 16:47:09 INFO  CurdDemo:72 - -------------------
  2023-02-27 16:47:09 INFO  CurdDemo:26 - 1.create
  2023-02-27 16:47:09 INFO  CurdDemo:27 - 2.get
  2023-02-27 16:47:09 INFO  CurdDemo:28 - 3.Search
  2023-02-27 16:47:09 INFO  CurdDemo:29 - 4.delete
  2023-02-27 16:47:09 INFO  CurdDemo:30 - 5.update
  2023-02-27 16:47:09 INFO  CurdDemo:31 - 6.Exit
  2023-02-27 16:47:09 INFO  CurdDemo:34 - Enter your choice :
  5
2023-02-27 16:47:14 INFO  CurdDemo:160 - Enter stdid to update:
  104
2023-02-27 16:47:20 INFO  CurdDemo:170 - Enter new stdname:
  vinnu
2023-02-27 16:47:28 INFO  CurdDemo:173 - Enter new stdage:
  9
2023-02-27 16:47:33 INFO  CurdDemo:176 - Enter new instname:
  k7it
2023-02-27 16:47:42 INFO  CurdDemo:190 - record is update successfully
  2023-02-27 16:47:42 INFO  CurdDemo:26 - 1.create
  2023-02-27 16:47:42 INFO  CurdDemo:27 - 2.get
  2023-02-27 16:47:42 INFO  CurdDemo:28 - 3.Search
  2023-02-27 16:47:42 INFO  CurdDemo:29 - 4.delete
  2023-02-27 16:47:42 INFO  CurdDemo:30 - 5.update
  2023-02-27 16:47:42 INFO  CurdDemo:31 - 6.Exit
  2023-02-27 16:47:42 INFO  CurdDemo:34 - Enter your choice :
  6
 
 
 
 

*/