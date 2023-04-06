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
		//Scanner s1 = new Scanner(System.in);
		//Scanner s2 = new Scanner(System.in);
		//Scanner s3 = new Scanner(System.in);
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
					//log.info("Enter how many employee you want");
					//int n = s.nextInt();
					//for (int i = 0; i < n; i++) {

					log.info("Enter empid :");
					empid = s.nextInt();

					log.info("Enter emname :");
					String emname = s.next();

					log.info("Enter salary : ");
					salary = s.nextInt();

					log.info("companyname :");
					String companyname1 = s.next();

					// int k  = 1/0;
					c.add(new Employee(empid, emname, salary, companyname1));
					log.info("one Emp create  successfully ");
					//int n1 = s.nextInt();
					log.info("---------------------");
					Iterator<Employee> i1 = c.iterator();
					while (i1.hasNext()) {
						Employee e = i1.next();
						log.info(e);
					}
					log.info("-------------------");
					//}
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
							empname = s.nextLine();

							log.info("Enter new salary :");
							salary = s.nextInt();

							log.info("Enter new companyname :");
							companyname = s.nextLine();

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

 OUTPUT:
 ======
 2023-02-27 12:08:33 INFO  CrudDemo:26 - 1.create
2023-02-27 12:08:33 INFO  CrudDemo:27 - 2.get
2023-02-27 12:08:33 INFO  CrudDemo:28 - 3.search
2023-02-27 12:08:33 INFO  CrudDemo:29 - 4.delete
2023-02-27 12:08:33 INFO  CrudDemo:30 - 5.update
2023-02-27 12:08:33 INFO  CrudDemo:32 - Enter your choics :
1
2023-02-27 12:08:39 INFO  CrudDemo:46 - Enter empid :
101
2023-02-27 12:08:42 INFO  CrudDemo:49 - Enter emname :
vinnu
2023-02-27 12:08:45 INFO  CrudDemo:52 - Enter salary :
90000
2023-02-27 12:08:49 INFO  CrudDemo:55 - companyname :
k7it
2023-02-27 12:08:52 INFO  CrudDemo:60 - one Emp create  successfully
2023-02-27 12:08:52 INFO  CrudDemo:62 - ---------------------
2023-02-27 12:08:52 INFO  CrudDemo:66 - Employee [empid=101, empname=vinnu, salary=90000, companyname=k7it]
2023-02-27 12:08:52 INFO  CrudDemo:68 - -------------------
2023-02-27 12:08:52 INFO  CrudDemo:26 - 1.create
2023-02-27 12:08:52 INFO  CrudDemo:27 - 2.get
2023-02-27 12:08:52 INFO  CrudDemo:28 - 3.search
2023-02-27 12:08:52 INFO  CrudDemo:29 - 4.delete
2023-02-27 12:08:52 INFO  CrudDemo:30 - 5.update
2023-02-27 12:08:52 INFO  CrudDemo:32 - Enter your choics :
1
2023-02-27 12:08:55 INFO  CrudDemo:46 - Enter empid :
102
2023-02-27 12:08:58 INFO  CrudDemo:49 - Enter emname :
lucky
2023-02-27 12:09:03 INFO  CrudDemo:52 - Enter salary :
40000
2023-02-27 12:09:06 INFO  CrudDemo:55 - companyname :
k7it
2023-02-27 12:09:18 INFO  CrudDemo:60 - one Emp create  successfully
2023-02-27 12:09:18 INFO  CrudDemo:62 - ---------------------
2023-02-27 12:09:18 INFO  CrudDemo:66 - Employee [empid=101, empname=vinnu, salary=90000, companyname=k7it]
2023-02-27 12:09:18 INFO  CrudDemo:66 - Employee [empid=102, empname=lucky, salary=40000, companyname=k7it]
2023-02-27 12:09:18 INFO  CrudDemo:68 - -------------------
2023-02-27 12:09:18 INFO  CrudDemo:26 - 1.create
2023-02-27 12:09:18 INFO  CrudDemo:27 - 2.get
2023-02-27 12:09:18 INFO  CrudDemo:28 - 3.search
2023-02-27 12:09:18 INFO  CrudDemo:29 - 4.delete
2023-02-27 12:09:18 INFO  CrudDemo:30 - 5.update
2023-02-27 12:09:18 INFO  CrudDemo:32 - Enter your choics :
1
2023-02-27 12:09:22 INFO  CrudDemo:46 - Enter empid :
103
2023-02-27 12:09:32 INFO  CrudDemo:49 - Enter emname :
cherry
2023-02-27 12:09:35 INFO  CrudDemo:52 - Enter salary :
4000
2023-02-27 12:09:38 INFO  CrudDemo:55 - companyname :
k7it
2023-02-27 12:09:46 INFO  CrudDemo:60 - one Emp create  successfully
2023-02-27 12:09:46 INFO  CrudDemo:62 - ---------------------
2023-02-27 12:09:46 INFO  CrudDemo:66 - Employee [empid=101, empname=vinnu, salary=90000, companyname=k7it]
2023-02-27 12:09:46 INFO  CrudDemo:66 - Employee [empid=102, empname=lucky, salary=40000, companyname=k7it]
2023-02-27 12:09:46 INFO  CrudDemo:66 - Employee [empid=103, empname=cherry, salary=4000, companyname=k7it]
2023-02-27 12:09:46 INFO  CrudDemo:68 - -------------------
2023-02-27 12:09:46 INFO  CrudDemo:26 - 1.create
2023-02-27 12:09:46 INFO  CrudDemo:27 - 2.get
2023-02-27 12:09:46 INFO  CrudDemo:28 - 3.search
2023-02-27 12:09:46 INFO  CrudDemo:29 - 4.delete
2023-02-27 12:09:46 INFO  CrudDemo:30 - 5.update
2023-02-27 12:09:46 INFO  CrudDemo:32 - Enter your choics :
1
2023-02-27 12:09:50 INFO  CrudDemo:46 - Enter empid :
104
2023-02-27 12:09:53 INFO  CrudDemo:49 - Enter emname :
lovely
2023-02-27 12:09:59 INFO  CrudDemo:52 - Enter salary :
40950
2023-02-27 12:10:03 INFO  CrudDemo:55 - companyname :
k7it
2023-02-27 12:10:06 INFO  CrudDemo:60 - one Emp create  successfully
2023-02-27 12:10:06 INFO  CrudDemo:62 - ---------------------
2023-02-27 12:10:06 INFO  CrudDemo:66 - Employee [empid=101, empname=vinnu, salary=90000, companyname=k7it]
2023-02-27 12:10:06 INFO  CrudDemo:66 - Employee [empid=102, empname=lucky, salary=40000, companyname=k7it]
2023-02-27 12:10:06 INFO  CrudDemo:66 - Employee [empid=103, empname=cherry, salary=4000, companyname=k7it]
2023-02-27 12:10:06 INFO  CrudDemo:66 - Employee [empid=104, empname=lovely, salary=40950, companyname=k7it]
2023-02-27 12:10:06 INFO  CrudDemo:68 - -------------------
2023-02-27 12:10:06 INFO  CrudDemo:26 - 1.create
2023-02-27 12:10:06 INFO  CrudDemo:27 - 2.get
2023-02-27 12:10:06 INFO  CrudDemo:28 - 3.search
2023-02-27 12:10:06 INFO  CrudDemo:29 - 4.delete
2023-02-27 12:10:06 INFO  CrudDemo:30 - 5.update
2023-02-27 12:10:06 INFO  CrudDemo:32 - Enter your choics :
3
2023-02-27 12:10:20 INFO  CrudDemo:85 - Enter empid to search :
1000
2023-02-27 12:10:24 INFO  CrudDemo:88 - -------------------
2023-02-27 12:10:24 INFO  CrudDemo:103 - record not found
2023-02-27 12:10:24 INFO  CrudDemo:105 - -------------------
2023-02-27 12:10:24 INFO  CrudDemo:26 - 1.create
2023-02-27 12:10:24 INFO  CrudDemo:27 - 2.get
2023-02-27 12:10:24 INFO  CrudDemo:28 - 3.search
2023-02-27 12:10:24 INFO  CrudDemo:29 - 4.delete
2023-02-27 12:10:24 INFO  CrudDemo:30 - 5.update
2023-02-27 12:10:24 INFO  CrudDemo:32 - Enter your choics :
3
2023-02-27 12:10:27 INFO  CrudDemo:85 - Enter empid to search :
102
2023-02-27 12:10:30 INFO  CrudDemo:88 - -------------------
2023-02-27 12:10:30 INFO  CrudDemo:95 - Employee [empid=102, empname=lucky, salary=40000, companyname=k7it]
2023-02-27 12:10:30 INFO  CrudDemo:105 - -------------------
2023-02-27 12:10:30 INFO  CrudDemo:26 - 1.create
2023-02-27 12:10:30 INFO  CrudDemo:27 - 2.get
2023-02-27 12:10:30 INFO  CrudDemo:28 - 3.search
2023-02-27 12:10:30 INFO  CrudDemo:29 - 4.delete
2023-02-27 12:10:30 INFO  CrudDemo:30 - 5.update
2023-02-27 12:10:30 INFO  CrudDemo:32 - Enter your choics :
4
2023-02-27 12:10:37 INFO  CrudDemo:110 - Enter empid to delete :
104
2023-02-27 12:10:45 INFO  CrudDemo:112 - -------------------
2023-02-27 12:10:45 INFO  CrudDemo:131 - record is deleted successfully
2023-02-27 12:10:45 INFO  CrudDemo:133 - ---------------------
2023-02-27 12:10:45 INFO  CrudDemo:26 - 1.create
2023-02-27 12:10:45 INFO  CrudDemo:27 - 2.get
2023-02-27 12:10:45 INFO  CrudDemo:28 - 3.search
2023-02-27 12:10:45 INFO  CrudDemo:29 - 4.delete
2023-02-27 12:10:45 INFO  CrudDemo:30 - 5.update
2023-02-27 12:10:45 INFO  CrudDemo:32 - Enter your choics :
2
2023-02-27 12:10:47 INFO  CrudDemo:74 - -------------------
2023-02-27 12:10:47 INFO  CrudDemo:78 - Employee [empid=101, empname=vinnu, salary=90000, companyname=k7it]
2023-02-27 12:10:47 INFO  CrudDemo:78 - Employee [empid=102, empname=lucky, salary=40000, companyname=k7it]
2023-02-27 12:10:47 INFO  CrudDemo:78 - Employee [empid=103, empname=cherry, salary=4000, companyname=k7it]
2023-02-27 12:10:47 INFO  CrudDemo:80 - -------------------
2023-02-27 12:10:47 INFO  CrudDemo:26 - 1.create
2023-02-27 12:10:47 INFO  CrudDemo:27 - 2.get
2023-02-27 12:10:47 INFO  CrudDemo:28 - 3.search
2023-02-27 12:10:47 INFO  CrudDemo:29 - 4.delete
2023-02-27 12:10:47 INFO  CrudDemo:30 - 5.update
2023-02-27 12:10:47 INFO  CrudDemo:32 - Enter your choics :
5
2023-02-27 12:10:52 INFO  CrudDemo:139 - Enter empid to update :
103
2023-02-27 12:10:58 INFO  CrudDemo:149 - Enter new empname :
lovely
2023-02-27 12:11:07 INFO  CrudDemo:152 - Enter new salary :
2000
2023-02-27 12:11:09 INFO  CrudDemo:155 - Enter new companyname :
k7it
2023-02-27 12:11:12 INFO  CrudDemo:170 - record is updated successfully
2023-02-27 12:11:12 INFO  CrudDemo:26 - 1.create
2023-02-27 12:11:12 INFO  CrudDemo:27 - 2.get
2023-02-27 12:11:12 INFO  CrudDemo:28 - 3.search
2023-02-27 12:11:12 INFO  CrudDemo:29 - 4.delete
2023-02-27 12:11:12 INFO  CrudDemo:30 - 5.update
2023-02-27 12:11:12 INFO  CrudDemo:32 - Enter your choics :
2
2023-02-27 12:11:17 INFO  CrudDemo:74 - -------------------
2023-02-27 12:11:17 INFO  CrudDemo:78 - Employee [empid=101, empname=vinnu, salary=90000, companyname=k7it]
2023-02-27 12:11:17 INFO  CrudDemo:78 - Employee [empid=102, empname=lucky, salary=40000, companyname=k7it]
2023-02-27 12:11:17 INFO  CrudDemo:78 - Employee [empid=103, empname=lovely, salary=2000, companyname=k7it]
2023-02-27 12:11:17 INFO  CrudDemo:80 - -------------------
2023-02-27 12:11:17 INFO  CrudDemo:26 - 1.create
2023-02-27 12:11:17 INFO  CrudDemo:27 - 2.get
2023-02-27 12:11:17 INFO  CrudDemo:28 - 3.search
2023-02-27 12:11:17 INFO  CrudDemo:29 - 4.delete
2023-02-27 12:11:17 INFO  CrudDemo:30 - 5.update
2023-02-27 12:11:17 INFO  CrudDemo:32 - Enter your choics :


*/