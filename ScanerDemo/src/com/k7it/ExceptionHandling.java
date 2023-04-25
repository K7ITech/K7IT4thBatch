package com.k7it;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling {
/**
 * 
 * public static void main(String[] args) {
		
		System.out.println("main start");
		String str =  args[0]; //"K7iT"  case 3: "9"
		int i =  Integer.parseInt(str);	// 9	
		int result  =  i/(i-9);		// 9/(9-9) =  9/0 
		System.out.println("Output is:"+result);	
		System.out.println("Main end"); 
		
	}
	
 * case1: execute the program without cm line args
 * > java  ExceptionHandling 
 *   o/p: 
 *     main start
 *     java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at com.k7it.ExceptionHandling.main(ExceptionHandling.java:12)
	
	 Note: this is called as abnormal condition or abnormal execution, because progem expecting at least one
	  cmd line arg. but we are not passing anything. if we want to solve this issue we need to pass one cmd line
	  arg.
	  
	 case 2 : 
	 -> java   ExceptionHandling "K7iT"
		main start
		Exception in thread "main" java.lang.NumberFormatException: For input string: "K7iT"
			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
			at java.base/java.lang.Integer.parseInt(Integer.java:668)
			at java.base/java.lang.Integer.parseInt(Integer.java:786)
			at com.k7it.ExceptionHandling.main(ExceptionHandling.java:27)
	 Note: we cant convert "K7iT" string into a integer number type. if we want to resolve this issue we need 
	 pass at least one cmd line arg and also that arg should be numeric value.
	 
	 Case 3 : 
	 
	   -> java  ExceptionHandling "9"
	   
		main start
		Exception in thread "main" java.lang.ArithmeticException: / by zero
			at com.k7it.ExceptionHandling.main(ExceptionHandling.java:44)
			
	   Note: if we want to avoid this issue we need to pass at least one cmd arg and that arg should be numeric 
	   and also it should not a equals to 9.
	   
	   
	   Case 4: 
	       -> java ExceptionHandling "20"
	       
	       o/p:
	        main start
			Output is:1
			Main end
			
			here  
			case1, case 2, case 3 are called as abnormal execution 
			case 4 is called as normal execution.
			
			
			in side java for every abnormal condition there a one corresponding exception class like
			NullPointerException, ArithmeticException, NumberFormateException, ArrayIndexOutOfBoundExeption.
			
			 types abnormal conditions in java : there 2 type abnormal conditions we have in java 
			  
			   1. Exception : the abnormal conditions which we can able resolve/ recover by developer
			                  those conditions are called as Exceptions.
			                  
			              again exceptions we have 2 types of exceptions 
			              
			                  1. compile time exceptions or checked type exceptions: the exceptions which are
			                   known to the compiler those are called checked type exception. those exceptions
			                   will identify at compile time it self.
			                   
			                     
			                  2. RuntimeExceptions or Unchecked type exceptions : the exceptions which are
			                   known to the compiler those are called unchecked type exception
			                    these exceptions we can't find out at compile time, we can came to know only
			                    at Runtime.
			                  
			                   
			                 
			   2. Error  :  the abnormal conditions which we can unable resolve/ recover by developer
			                 those conditions are called as Errors.
			
			
			   

          exception hierarchy :
          =======================
          
            Object 
               -> Throwable 
                    ->Exception
                       ->ClassNotFoundException
                       -> IOException
                          ->FileNotFoundException
                       ->SQLException
                       ->NotSerializableException
                       ->CloneNotSupprtedException
                       
                       ->RunTimeException
                           -> NPE
                           -> IOOBE
	                           -> SIOOBE
	                           -> AIOOBE
                           -> AE
                           -> NFE
                           -> ClassCastException
                          
                    ->Error
	                   ->StackOVerFlowError
	                   ->MemoryOutOfBoundError
	                   
	                   
	                   
	      Exception handling: in java we have 2 type os exception handling 
	       1. using try - catch  : where exception is raised there only we will hand it 
	       2. using throws : instead of handling our self, we will throw raised exception to caller place.
	       
	       
	       1. try - catch():
	       
	                    try: try is one of the executable block it will contains the code which is causing
	                          abnormal condition. 
	                     syntax:
	                     
	                        try{
	                            /// abnormal code
	                        }
	                      Catch(): is also a one of the executable block with signature of Corresponding 
	                      exception class type which is having the issue in try block.
	                      
	                      syntax:
	                        catch(ExceptionClass ref){
	                          /// body of the catch
	                        }
	                        
	                        
	                    example:
	                    
	                      public static void main(String[] args) {
		
					System.out.println("main start");
					String str = null;
					//str =  args[0]; //"K7iT"  case 3: "9"
					try {
						 str =  args[0]; //"K7iT"  case 3: "9"
						 // when try block receive the exception or abnormal condition it will simply create the 
						  // Calling statement for catch by passing corresponding exception class object as a input paramter.
						 // -> catch(new ArrayIndexOutOfBoundsException())
					}catch(ArrayIndexOutOfBoundsException e) {
						System.out.println("Please enter at least one cmd line arg");
					}
					
					int i =0;
					try {
						 i =  Integer.parseInt(str);	// 9	
					 }catch(NumberFormatException e) {
						 System.out.println("please enter only numeric values");
					 }
					
					 int result=0;
					 try {
						  result  =  i/(i-9);		// 9/(9-9) =  9/0 
					 }catch(ArithmeticException e) {
						 System.out.println("please enter numeric value other than 9");
					 }
					
					System.out.println("Output is:"+result);	
					System.out.println("Main end"); 
					
				}  
				output:
				 main start
				Please enter at least one cmd line arg
				please enter only numeric values
				Output is:0
				Main end

			
				Note: by using exception handling we can make abnormal execution into normal execution.
				
				this same code we can reactor with single try and multiple catch blocks, 
				
				try {
					System.out.println("main start");
					String str = args[0]; // "K7iT" case 3: "9"
					int i = Integer.parseInt(str); // 9
					int result = i / (i - 9); // 9/(9-9) = 9/0
					System.out.println("Output is:" + result);
					System.out.println("Main end");
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Please enter at least one cmd line arg");
				} catch (NumberFormatException e) {
					System.out.println("please enter only numeric values");
				} catch (ArithmeticException e) {
					System.out.println("please enter numeric value other than 9");
				}
				
				
				output:
				
				case1 : 
				-> java  ExceptionHandling "9"
				
						main start
						please enter numeric value other than 9
						Output is:0
						Main end
						
				execution order of try and catch blocks:
				========================================
					-> try should be followed by catch().\
					    try{
					    // error code
					    }catch(Exception e){
					    //catch body
					    }
					-> one try block can have multiple catch blocks
					
					     try{
					    	// error code
					    }catch(AE e){
					    	//catch1 body
					    }catch(NFE e){
					    	//catch2 body
					    }
					-> even though if we keep multiple catch blocks for one try block at any point of
					   time only one catch() block will execute. 
					   
					     try{
					        int i = 9/0; -> catch(new AE());
					     }catch(AIOOBE e){
					       sop("1");
					     }catch(NFE e){
					       sop("2");
					     }catch(AE e){
					        sop("3");
					     }
					     
					     o/p: 
					      3
					      
					      
					       try{
					       String str  = null;
					       int i =  str.length(); -> catch(new NPE());  -> he will go away from here it self.
					       sop("length is:"+i);
					     }catch(AIOOBE e){
					       sop("1");
					     }catch(NFE e){
					       sop("2");
					     }catch(AE e){
					        sop("3");
					     }
					     
					     o/p:
					     A.  CTE 
					     B. CS but RTE with NPE  -- this correct answer.
					     C. CS and RS with output is 
					        "length is": 4
					     D. CS and RS but no output.
					     E. we will get out put: 1,2,3
					     F. we will get output only 1
					     G. we will get output only 2
					     H. we will get output only 3
					     
					     I. NOA
					     J. AOA
					     
					 -> without try block we can't keep catch() block either one or multiple catch
					 
					        catch(---){ // CTE
					        
					        }catch(---){ // CTE
					        
					        }
                  -> we cant keep try block also alone with out catch() or finally block.
                  
                        try{  // CTE
                        }
                        
                        try{  // CS
                        }catch(){
                        
                        }
                        
                         try{ // CS
                        }catch(){
                        
                        }catch(){
                        
                        }
                        
                        try{ // CS
                        
                        }finally{
                        
                        }
                        
                       finally : here finally block is a block which is used to execute the any mandatory code.
                       either exception raised or not, raised exception caught or not fanallu block will 
                       execute. 
                       
                       public static void main(String[] args) {
							System.out.println("1");
							try {
								String str = args[0];
								int i =  Integer.valueOf(str);
								int result  = i/(i-9);20/11 = 1
								System.out.println(result);
							}catch(ArithmeticException ae) {
								System.out.println("2");
							}catch(NumberFormatException nfe) {
								System.out.println("3");
							}
							catch(ArrayIndexOutOfBoundsException e) {
								System.out.println("4");
							}finally {
								System.out.println("5");
							}
							
							System.out.println("6");
							
						}
						
						case1 : java ExceptionHandling 
						     1
						     4
						     5
						     6
						     
						case2 : java ExceptionHandling "K7iT"
						     1
						     3
						     5
						     6
						case3 : java ExceptionHandling "9"
						     1
						     2
						     5
						     6
						case3 : java ExceptionHandling "20"
						     1
						     1
						     5
						     6
						     
					stackTrace :  if we receive any abnormal condition while executing any of the code, that time
					execution will terminate unexpectedly and it will print the all the information of 
					members which are part of stack memory in reverse order. 
					
						    Exception in thread "main" java.lang.ArithmeticException: / by zero
							at com.k7it.ExceptionHandling.divide(ExceptionHandling.java:375)
							at com.k7it.ExceptionHandling.getPranitha(ExceptionHandling.java:370)
							at com.k7it.ExceptionHandling.m3(ExceptionHandling.java:366)
							at com.k7it.ExceptionHandling.m2(ExceptionHandling.java:363)
							at com.k7it.ExceptionHandling.m1(ExceptionHandling.java:360)
							at com.k7it.ExceptionHandling.main(ExceptionHandling.java:380)
						
						Here we are received exception at divide() method i.e AE. once we receive this 
						exception immediately jre will look for is there any try and catch for this problem
						if there is no try and catch block then it will propagate the raise exception 
						to his caller place and it will remove that method from stack memory and it will print
					    that 

                   Throws : by using throws key word we can propagate the raised exception from raised place 
                   to caller place. this process is called as exception propagation. 
                   
                   in case of RuntimeExceptions this propagation of exceptions will happens automatically.
                   we no need to do explicit propagation.
                   
                   syntax :
                   
                     returnType methodName(singnature) throws ExceptionName{
                      // Body of the method.
                     }
                     
                     
                     Ex:
                     
                     void loadMyClassFile(String className) throws ClassNotFoundException {
                        
                        Class.forName(className); //CTE it will raise the one check type exception i.e CNFE
                        
                        // if we need to avoid this CTE we need add try and catch handle our self
                        // else throws the raised exception to caller .
                     }
                     
                     void ClassLoader() throws ClassNotFoundException{
                     
                     		loadMyClassFile("com.k7it.Person");//   now we will get CTE here , beacuse CNFE
                     		                                   // propagating to his caller so it will come to 
                     		                                    // here.
                        
                     }
                     
               how to throws multiple Exceptions from one method:
               ===================================================
               
               syntax:
               
                returnType methodName()Exception1, Exception2, Exception........, ExceptionN
                
                
                
                void test1() throws NullPinterException{
                
                
                }
                 CS and RS
                 
                 
                 
                 void test2() throws SQLException{
                 
                 }
                 
                 CS and RS 
                 
                 Note: in case of empty try block we can't keep the catch() with checked type exception 
                 but in case throws we can keep the checked type exceptions even though method is empty.
                 
           
              throw : by using throw key word we can raise the exception explicitly when ever we need. 
              
                  syntax :
                  
                    throw Object for any of the Exception class;
                    
                 ex:
                    throw new IllegalArgumentException();
                    
                     throw new RunTimeException();
                     throw new SQLException();
                     
                     Note :  if we try to raise any checked type exception by using throw key explicitly 
                     then we should had the throws key word with corresponding exception at method level 
                     or we should add try and catch with corresponding exception else complier will not to
                     compile success of our code .
                     
                     ex:
                     
                      void m1(){
                          throw new SQLException();
                      }
                      // CTE
                       * 
                     void m1() throws SQLException {
                          throw new SQLException();
                      }
                      CS but RTE with SQLE
                      
                      
                       void m1() {
                        try{
                          throw new SQLException();
                          }catch(SQLException e){
                            e.printStackTrace();
                          }
                      }
                      CS but RTE with SQLE
                      
                      Note:  if we try to raise any unchecked type exception by using throw key explicitly 
                     then we should not required to add any the throws key word with corresponding exception
                      at method level or we should not required  add try and catch with corresponding exception.
                      
                      in case of unchecked type exceptions throws and try and catch is optional.
                      
                      
                      Note : if we are raising the any exception by using throw key our self then
                      after that line we cant' keep any line of code because that will become unreachable code.
                      
                      
                      void m1(){
                        SOP("start m1");
                        
                        throw new NullPointerException();---> it will go away from here it self ...
                        
                        sop("m1 end");// CTE like unreachable code
                      
                      }
                      
                                   
              
              
              re throwing exceptions : 
              ========================
                 it is a process of catching the raised exception and throwing again same exception or other
                 type exception from the catch block using throw key word.
                 
                 example :
                 
                 try {
                 
                    int age  =  Interger.parseInt("abc");
                 }catch(NumberFormateException e){
                    syso("please enter the valid numeric number for age value");
                    throw e;// this re throwing same exception
                 }
                 
                 
                 
                 ex1:
                 
                 try {
                 
                    int age  =  Interger.parseInt("abc");
                 }catch(NumberFormateException e){
                    syso("please enter the valid numeric number for age value");
                    throw new IllegalArgumentException("please enter numeric values between 0 to 100");
                 }
                 
                 
                 note :
                 while throws with multiple sub class type exceptions we can replace with one
                 single super class type exception.
                 
                 void m1()throws SQLException, ClassNotFoundExceptin,IOException
                 {
                 
                 
                 }
                 
                 void m1()

                 {
                 
                 
                 }
                 
                 
                 even try and catch also same thing :
                 
                 
                 try{
                 }catch(CNFE e){
                 }
                 catch(SQLE e){
                 }
                 catch(IOE e){
                 }
                  catch(NFE e){
                 }
                  we can replace with single parent type exception
                 
                 try{
                 
                 }catch(Exception e){
                 
                 }
                
                 how to create user defined exceptions 
                 
                 try(resource obj)
                 catch(multiple exceptions)
                 
                
                        
 * 
 * 
 */
	
	 void test1() throws NullPointerException{

	 }
	 
	 void test2() throws SQLException{
         
     }
	 
	 
	 
	
	void m1() throws ArithmeticException {
		m2();
	}
	void m2()  throws ArithmeticException{
		m3();
	}
	void m3() throws ArithmeticException,NullPointerException,NumberFormatException {
		getPranitha();
	}
	String getPranitha() throws ArithmeticException {
		
		int result  =  divide(20,0);
		
		return "Pranitha";
	}
	private int divide(int i, int j) throws ArithmeticException {
		return i/j;
	}
	
	 void loadMyClassFile(String className) throws ClassNotFoundException ,ArithmeticException{
         
         Class.forName(className); //CTE it will raise the one check type exception i.e CNFE
         
         // if we need to avoid this CTE we need add try and catch handle our self
         // else throws the raised exception to caller .
      }
      
      void ClassLoader() throws ClassNotFoundException{
      
      		loadMyClassFile("com.k7it.Person");//   now we will get CTE here , beacuse CNFE
      		                                   // propagating to his caller so it will come to 
      		                                    // here.
         
      }
	public static void main(String[] args) throws Throwable {
		
		ExceptionHandling eh = new ExceptionHandling();
		FileWriter fe  = new FileWriter("test");
		
		
		
		eh.m1();
		
		eh.ClassLoader();
		
		eh.test1();
		
		eh.test2();
		
	}
}
