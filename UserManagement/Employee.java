package anu.com;
import java.util.*; 
public class Employee {
 private int empno;
 private String empname;
 private int salary;
  
 Employee(int empno,String empname,int salary){
	 this.empno=empno;
	 this.empname=empname;
	 this.salary=salary;
	 
 }
 public int getEmpno() {
	 return empno;
 }
 public String getEmpname() {
	 return empname;
 }
 public int getSalary() {
	 return salary;
 }
 public String toString() {
	 return empno+" "+empname+" "+salary;
 }
}

 
		