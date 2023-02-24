import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class CrudDemo {

	
	private static final Logger log = Logger.getLogger(CrudDemo.class);
	private static String empname;
	private static String companyname;

	public static void main(String[] args) {

		List<Employee> c = new ArrayList<Employee>();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		int ch = 0;
		do {
			log.info("1.create");
			log.info("2.get");
			log.info("3.search");
			log.info("4.delete");
			log.info("5.update");

			log.info("Enter your choics :");

			ch = s.nextInt();

			int empid;
			int salary;

			switch (ch) {

			case 1:
				log.info("Enter how many employee you want");
				int n = s.nextInt();
				for (int i = 0; i < n; i++) {

					log.info("Enter empid :");
					empid = s.nextInt();

					log.info("Enter emname :");
					String emname = s1.nextLine();

					log.info("Enter salary : ");
					salary = s2.nextInt();

					log.info("companyname :");
					String companyname1 = s3.nextLine();

					c.add(new Employee(empid, emname, salary, companyname1));
				}
				break;

			case 2:

				log.info("-------------------");
				Iterator<Employee> i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					log.info(e);
				}
				log.info("-------------------");
				break;

			case 3:
				boolean found = false;
				log.info("Enter empid to search :");

				int empid1 = s.nextInt();
				log.info("-------------------");

				i = c.iterator();

				while (i.hasNext()) {
					Employee e = i.next();
					if (e.getEmpid() == empid1) {
						log.info(e);

						found = true;
					}

				}

				if (!found) {
					log.info("record not found");
				}
				log.info("-------------------");
				break;

			case 4:
				found = false;
				log.info("Enter empid to delete :");
				empid = s.nextInt();
				log.info("-------------------");

				i = c.iterator();

				while (i.hasNext()) {
					Employee e = i.next();
					if (e.getEmpid() == empid) {

						i.remove();

						found = true;
					}

				}

				if (!found) {
					log.info("record not found :");

				} else {
					log.info("record is deleted successfully");
				}
				log.info("---------------------");
				break;

			case 5:

				found = false;
				log.info("Enter empid to update :");
				empid = s.nextInt();

				ListIterator<Employee> li = c.listIterator();

				while (li.hasNext()) {
					Employee e = li.next();
					if (e.getEmpid() == empid) {

						log.info("Enter new empname :");
						empname = s1.nextLine();

						log.info("Enter new salary :");
						salary = s2.nextInt();

						log.info("Enter new companyname :");
						companyname = s3.nextLine();

						li.set(new Employee(empid, empname, salary, companyname));

						found = true;

					}

				}

				if (!found) {
					log.info("record not found");

				} else {
					log.info("record is updated successfully");
				}

				break;
			}

		} while (ch != 0);
	}

}
/*
 OUTPUT:
 ======
 
 023-02-24 11:56:28 INFO  CrudDemo:26 - 1.create
2023-02-24 11:56:28 INFO  CrudDemo:27 - 2.get
2023-02-24 11:56:28 INFO  CrudDemo:28 - 3.search
2023-02-24 11:56:28 INFO  CrudDemo:29 - 4.delete
2023-02-24 11:56:28 INFO  CrudDemo:30 - 5.update
2023-02-24 11:56:28 INFO  CrudDemo:32 - Enter your choics :
1
2023-02-24 11:56:32 INFO  CrudDemo:42 - Enter how many employee you want
3
2023-02-24 11:56:35 INFO  CrudDemo:46 - Enter empid :
1001
2023-02-24 11:56:42 INFO  CrudDemo:49 - Enter emname :
lucky
2023-02-24 11:56:47 INFO  CrudDemo:52 - Enter salary : 
30000
2023-02-24 11:56:51 INFO  CrudDemo:55 - companyname :
k7it
2023-02-24 11:56:54 INFO  CrudDemo:46 - Enter empid :
1002
2023-02-24 11:57:02 INFO  CrudDemo:49 - Enter emname :
vinnu
2023-02-24 11:57:06 INFO  CrudDemo:52 - Enter salary : 
300000
2023-02-24 11:57:11 INFO  CrudDemo:55 - companyname :
k7it
2023-02-24 11:57:15 INFO  CrudDemo:46 - Enter empid :
1003
2023-02-24 11:57:19 INFO  CrudDemo:49 - Enter emname :
lovely
2023-02-24 11:57:24 INFO  CrudDemo:52 - Enter salary : 
34000
2023-02-24 11:57:27 INFO  CrudDemo:55 - companyname :
k7it
2023-02-24 11:57:30 INFO  CrudDemo:26 - 1.create
2023-02-24 11:57:30 INFO  CrudDemo:27 - 2.get
2023-02-24 11:57:30 INFO  CrudDemo:28 - 3.search
2023-02-24 11:57:30 INFO  CrudDemo:29 - 4.delete
2023-02-24 11:57:30 INFO  CrudDemo:30 - 5.update
2023-02-24 11:57:30 INFO  CrudDemo:32 - Enter your choics :
2
2023-02-24 11:57:34 INFO  CrudDemo:64 - -------------------
2023-02-24 11:57:34 INFO  CrudDemo:68 - Employee [empid=1001, empname=lucky, salary=30000, companyname=k7it]
2023-02-24 11:57:34 INFO  CrudDemo:68 - Employee [empid=1002, empname=vinnu, salary=300000, companyname=k7it]
2023-02-24 11:57:34 INFO  CrudDemo:68 - Employee [empid=1003, empname=lovely, salary=34000, companyname=k7it]
2023-02-24 11:57:34 INFO  CrudDemo:70 - -------------------
2023-02-24 11:57:34 INFO  CrudDemo:26 - 1.create
2023-02-24 11:57:34 INFO  CrudDemo:27 - 2.get
2023-02-24 11:57:34 INFO  CrudDemo:28 - 3.search
2023-02-24 11:57:34 INFO  CrudDemo:29 - 4.delete
2023-02-24 11:57:34 INFO  CrudDemo:30 - 5.update
2023-02-24 11:57:34 INFO  CrudDemo:32 - Enter your choics :
3
2023-02-24 11:58:03 INFO  CrudDemo:75 - Enter empid to search :
1001
2023-02-24 11:58:22 INFO  CrudDemo:78 - -------------------
2023-02-24 11:58:22 INFO  CrudDemo:85 - Employee [empid=1001, empname=lucky, salary=30000, companyname=k7it]
2023-02-24 11:58:22 INFO  CrudDemo:95 - -------------------
2023-02-24 11:58:22 INFO  CrudDemo:26 - 1.create
2023-02-24 11:58:22 INFO  CrudDemo:27 - 2.get
2023-02-24 11:58:22 INFO  CrudDemo:28 - 3.search
2023-02-24 11:58:22 INFO  CrudDemo:29 - 4.delete
2023-02-24 11:58:22 INFO  CrudDemo:30 - 5.update
2023-02-24 11:58:22 INFO  CrudDemo:32 - Enter your choics :
1003
2023-02-24 11:58:35 INFO  CrudDemo:26 - 1.create
2023-02-24 11:58:35 INFO  CrudDemo:27 - 2.get
2023-02-24 11:58:35 INFO  CrudDemo:28 - 3.search
2023-02-24 11:58:35 INFO  CrudDemo:29 - 4.delete
2023-02-24 11:58:35 INFO  CrudDemo:30 - 5.update
2023-02-24 11:58:35 INFO  CrudDemo:32 - Enter your choics :
4
2023-02-24 11:58:39 INFO  CrudDemo:100 - Enter empid to delete :
1003
2023-02-24 11:58:43 INFO  CrudDemo:102 - -------------------
2023-02-24 11:58:43 INFO  CrudDemo:121 - record is deleted successfully
2023-02-24 11:58:43 INFO  CrudDemo:123 - ---------------------
2023-02-24 11:58:43 INFO  CrudDemo:26 - 1.create
2023-02-24 11:58:43 INFO  CrudDemo:27 - 2.get
2023-02-24 11:58:43 INFO  CrudDemo:28 - 3.search
2023-02-24 11:58:43 INFO  CrudDemo:29 - 4.delete
2023-02-24 11:58:43 INFO  CrudDemo:30 - 5.update
2023-02-24 11:58:43 INFO  CrudDemo:32 - Enter your choics :
2
2023-02-24 11:58:50 INFO  CrudDemo:64 - -------------------
2023-02-24 11:58:50 INFO  CrudDemo:68 - Employee [empid=1001, empname=lucky, salary=30000, companyname=k7it]
2023-02-24 11:58:50 INFO  CrudDemo:68 - Employee [empid=1002, empname=vinnu, salary=300000, companyname=k7it]
2023-02-24 11:58:50 INFO  CrudDemo:70 - -------------------
2023-02-24 11:58:50 INFO  CrudDemo:26 - 1.create
2023-02-24 11:58:50 INFO  CrudDemo:27 - 2.get
2023-02-24 11:58:50 INFO  CrudDemo:28 - 3.search
2023-02-24 11:58:50 INFO  CrudDemo:29 - 4.delete
2023-02-24 11:58:50 INFO  CrudDemo:30 - 5.update
2023-02-24 11:58:50 INFO  CrudDemo:32 - Enter your choics :
5
2023-02-24 11:58:59 INFO  CrudDemo:129 - Enter empid to update :
1001
2023-02-24 11:59:04 INFO  CrudDemo:138 - Enter new empname :
sir
2023-02-24 11:59:09 INFO  CrudDemo:141 - Enter new salary :
1000000
2023-02-24 11:59:16 INFO  CrudDemo:144 - Enter new companyname :
info
2023-02-24 11:59:22 INFO  CrudDemo:159 - record is updated successfully
2023-02-24 11:59:22 INFO  CrudDemo:26 - 1.create
2023-02-24 11:59:22 INFO  CrudDemo:27 - 2.get
2023-02-24 11:59:22 INFO  CrudDemo:28 - 3.search
2023-02-24 11:59:22 INFO  CrudDemo:29 - 4.delete
2023-02-24 11:59:22 INFO  CrudDemo:30 - 5.update
2023-02-24 11:59:22 INFO  CrudDemo:32 - Enter your choics :
2
2023-02-24 11:59:26 INFO  CrudDemo:64 - -------------------
2023-02-24 11:59:26 INFO  CrudDemo:68 - Employee [empid=1001, empname=sir, salary=1000000, companyname=info]
2023-02-24 11:59:26 INFO  CrudDemo:68 - Employee [empid=1002, empname=vinnu, salary=300000, companyname=k7it]
2023-02-24 11:59:26 INFO  CrudDemo:70 - -------------------
2023-02-24 11:59:26 INFO  CrudDemo:26 - 1.create
2023-02-24 11:59:26 INFO  CrudDemo:27 - 2.get
2023-02-24 11:59:26 INFO  CrudDemo:28 - 3.search
2023-02-24 11:59:26 INFO  CrudDemo:29 - 4.delete
2023-02-24 11:59:26 INFO  CrudDemo:30 - 5.update
2023-02-24 11:59:26 INFO  CrudDemo:32 - Enter your choics :
 */

