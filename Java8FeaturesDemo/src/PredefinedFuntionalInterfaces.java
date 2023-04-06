import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.apache.log4j.Logger;

public class PredefinedFuntionalInterfaces {
	private static Logger log = Logger.getLogger(PredefinedFuntionalInterfaces.class);
	private static Object c;

	public static void main(String[] args) {
		DataType ref[] = new DataType[4];
		int i[] = new int[2];
		i[0] = 10;
		i[1] = 20;
		log.info(i[0]);
		log.info(i[1]);
		log.info("=====");
		log.info("datatye valu.OUTPUT");
		log.info("=====");

		int i1[] = { 100, 200, 300, 400 };
		log.info(i1[0]);
		log.info(i1[1]);
		log.info(i1[2]);
		log.info(i1[3]);
		log.info("========");
		log.info("datatye valu object leval.OUTPUT");

		log.info("========");

		String names[] = { "latha", "pranitha", "Aruna", "Deepya", "Selvi" };
		log.info(names[0]);
		log.info(names[1]);
		log.info(names[2]);
		log.info(names[3]);
		log.info("==============");
		log.info(" drct  String format object.OUTPUT");
		log.info("==============");

		Function<Integer, Integer> f = (n) -> n * n;

		log.info("Square of 4000:" + f.apply(4000));
		log.info("Square of 5000:" + f.apply(5000));

		log.info("==============");
		log.info("this is Square format.OUTPUT ");
		log.info("================");

		Predicate<Integer> p = (n) -> n % 2 == 0;

		log.info("4 is a even number?" + p.test(4));
		log.info("5 is a even number?:" + p.test(5));
		log.info("==============");
		log.info("this is format even number? are not.OUTPUT ");
		log.info("================");
		
  //Consumer<String> c =  s ->
  //System.out.println("4 is a even number?"+s);
          
         // Predicate<Integer> p= (n)->n%2==0;
          //c.accept(p.test(4)); 
         
		
		log.info("i want only above 65% students list");
		log.info("======================================");

		Student students[] = { new Student(01, "Latha", 75), new Student(02, "Aruna", 80),
				new Student(03, "Deepya", 99), new Student(04, "Selvi", 100), new Student(05, "Praneetha", 69),
				new Student(06, "anu", 50), new Student(07, "sunny", 35), new Student(8, "bunny", 25),
				new Student(9, "unny", 15) };

		Predicate<Student> p1 = s -> s.marks >= 65;
		
		 Consumer<String> c =  s ->log.info(s);

		Function<Student, String> f1 = s -> {
		
				if (p1.test(s)) {
				if (s.marks >= 85) {// >= greater than or equal
					return "Id:" + s.id + ",Name:" + s.name + ",marks:" + s.marks + ",Grade:A";
				} else if (s.marks >= 75) {// >= greater than or equal
					return "Id:" + s.id + ",Name:" + s.name + ",marks:" + s.marks + ",Grade:B";
				} else if (s.marks >= 65) {// >= greater than or equal
					return "Id:" + s.id + ",Name:" + s.name + ",marks:" + s.marks + ",Grade:C";
				} else if (s.marks >= 55) {// >= greater than or equal
					return "Id:" + s.id + ",Name:" + s.name + ",marks:" + s.marks + ",Grade:D";
				} else if (s.marks >= 35) {// >= greater than or equal
					return "Id:" + s.id + ",Name:" + s.name + ",marks:" + s.marks + ",Grade:E";
				} else {
					return "Id:" + s.id + ",Name:" + s.name + ",marks:" + s.marks + ",Grade:F";
				}
			}
				return"";
			
		};

		for (Student s : students) {
			//log.info(f1.apply(s));
			c.accept(f1.apply(s));

			log.info("==================================");
			

		}

	}
}

/*
 * OUTPUT: ======= 
 *2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:16 - 10
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:17 - 20
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:18 - =====
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:19 - datatye valu.OUTPUT
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:20 - =====
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:23 - 100
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:24 - 200
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:25 - 300
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:26 - 400
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:27 - ========
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:28 - datatye valu object leval.OUTPUT
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:30 - ========
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:33 - latha
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:34 - pranitha
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:35 - Aruna
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:36 - Deepya
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:37 - ==============
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:38 -  drct  String format object.OUTPUT
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:39 - ==============
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:43 - Square of 4000:16000000
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:44 - Square of 5000:25000000
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:46 - ==============
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:47 - this is Square format.OUTPUT 
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:48 - ================
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:52 - 4 is a even number?true
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:53 - 5 is a even number?:false
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:54 - ==============
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:55 - this is format even number? are not.OUTPUT 
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:56 - ================
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:90 - Id:1,Name:Latha,marks:75,Grade:B
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:90 - Id:2,Name:Aruna,marks:80,Grade:B
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:90 - Id:3,Name:Deepya,marks:99,Grade:A
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:90 - Id:4,Name:Selvi,marks:100,Grade:A
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:90 - Id:5,Name:Praneetha,marks:69,Grade:C
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:90 - Id:6,Name:anu,marks:50,Grade:E
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:90 - Id:7,Name:sunny,marks:35,Grade:E
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:90 - Id:8,Name:bunny,marks:25,Grade:F
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:90 - Id:9,Name:unny,marks:15,Grade:F
2023-03-03 11:26:42 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:58 - i want only above 65% students list
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:59 - ======================================
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:90 - Id:1,Name:Latha,marks:75,Grade:B
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:90 - Id:2,Name:Aruna,marks:80,Grade:B
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:90 - Id:3,Name:Deepya,marks:99,Grade:A
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:90 - Id:4,Name:Selvi,marks:100,Grade:A
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:90 - Id:5,Name:Praneetha,marks:69,Grade:C
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:90 - fail
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:90 - fail
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:90 - fail
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:90 - fail
2023-03-03 11:27:45 INFO  PredefinedFuntionalInterfaces:92 - ==================================
 2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:58 - i want only above 65% students list
2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:59 - ======================================
2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:90 - Id:1,Name:Latha,marks:75,Grade:B
2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:90 - Id:2,Name:Aruna,marks:80,Grade:B
2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:90 - Id:3,Name:Deepya,marks:99,Grade:A
2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:90 - Id:4,Name:Selvi,marks:100,Grade:A
2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:92 - ==================================
2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:90 - Id:5,Name:Praneetha,marks:69,Grade:C
2023-03-03 11:29:21 INFO  PredefinedFuntionalInterfaces:92 - ==================================

 */
