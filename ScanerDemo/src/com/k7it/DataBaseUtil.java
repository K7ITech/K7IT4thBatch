package com.k7it.finaldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DataBaseUtil {

	static Connection con = null;
	
	public static void main(String[] args) {
		 getEmployeeList();
	}
	
	public static  List getEmployeeList() {
		
		 try {
			Class.forName("oracle.db.OracleDRiver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		 
		 try {
			 
			  con = DriverManager.getConnection("URL","usrname","psw");// SQLE
			
			  Statement stmt = con.createStatement();
			  stmt.execute("Select * from employee;");
			  ResultSet rs =  stmt.getResultSet();
			 
			  String empName =  rs.getString("Name");
			  String empID =  rs.getString("ID");
			  
			 // con.close();
			
		} catch (SQLException e) {
			System.out.println("Unnable to open the data base connection");
			e.printStackTrace();
			//con.close();
		}finally {
			
			try {
				if(con != null) {
					con.close();  /// there closeing connection is a mandatory stmt so we need to keep such
		 // kind of code inside the finally block. before closing we need verify not null condition
					                 
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 
		
		return null;
	}
	
}



/*
		Modified

*/
