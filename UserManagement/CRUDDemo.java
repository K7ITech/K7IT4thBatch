package anu.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CRUDDemo {

	public static void main(String[] args) {
		List<Employee> c = new ArrayList<Employee>();

		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		int ch;
		do {
			System.out.println("1. INSERT");
			System.out.println("2. DISPLAY");
			System.out.println("3. SEARCH");
			System.out.println("4. DELETE");
			System.out.println("5. UPDATE");
			System.out.println("Enter your choice: ");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter empno :");
				int empno = s.nextInt();
				System.out.println("Enter empname :");
				String empname = s.next();
				System.out.println("Enter salary :");
				int salary = s.nextInt();

				c.add(new Employee(empno, empname, salary));
				break;
			case 2:
				System.out.println("---------------");
				Iterator<Employee> i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					System.out.println(e);
				}
				System.out.println("------------");
				break;
			case 3:
				boolean found = false;
				System.out.println("Enter empno to search :");
				// int empno1 =s.nextInt();
				empno = s.nextInt();
				System.out.println("----------");
				i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					if (e.getEmpno() == empno) {
						System.out.println(e);
						found = true;
					}

				}
				if (!found) {
					System.out.println("Record not found");
				}
				System.out.println("----------");
				break;
			case 4:
				found = false;
				System.out.println("Enter Empno to delete :");
				empno = s.nextInt();
				System.out.println("--------");
				i = c.iterator();
				while (i.hasNext()) {
					Employee e = i.next();
					if (e.getEmpno() == empno) {
						i.remove();
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record not found");
				} else {
					System.out.println("Record deleted successfully....!");
				}
				System.out.println("-------------");
				break;
			case 5:
				found = false;
				System.out.println("Enter Empno to update :");
				empno = s.nextInt();
				System.out.println("-------------");
				ListIterator<Employee> li = c.listIterator();
				while (li.hasNext()) {
					Employee e = li.next();
					if (e.getEmpno() == empno) {
						System.out.println("Enter new Name :");
						empname = s1.nextLine();
						System.out.println("Enter new salary :");
						salary = s.nextInt();
						li.set(new Employee(empno, empname, salary));
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record not found");
				} else {
					System.out.println("Record is updated successfully....!");
				}
				System.out.println("----------");
			}
		} while (ch != 0);

	}

}
