package com.k7it.innerClass;


class Person{
	void m1() {
		System.out.println("Person -m1");
	}
}

abstract class Vehicle{
	abstract void addBody();
}

abstract class Car extends Vehicle{
	// 1. sub class should provide the definition or implementation for all inherited 
	//abstract methods else we need declare sub class also abstract type

	
}



public class InnerClassDemo {
  public static void main(String[] args) {
  
	  Vehicle car = new Vehicle() {
		@Override
		void addBody() {
			System.out.println("fixed body for anonymous car");
			
		}		  
	  };	  
	  car.addBody();
	  
	  
	  new Vehicle() {
			@Override
			void addBody() {
				System.out.println("fixed body for anonymous car");
				
			}
			  
		  }.addBody();
	  
	  
	  /*
	   	class Anonymous extends Person{
			void m1() {
				System.out.println("Anonymous inner class -m1");
			}
		}
		Person p1 = new Anonymous();
		p1.m1();
		
	   */
	    Person p1 = new Person() { 
	    	int i =10;
	    	void m1() {
	    		System.out.println("Anonymous inner class -m1");
	    		System.out.println(i);
	    	}
	    };
	    
	    p1.m1();
	    p1.m1();
	    p1.m1();
	    
	    
	    new Person() { 
	    	void m1() {
	    		System.out.println("Anonymous inner  design1 -m1");
	    	}
	    }.m1();
	    
	    new Person() { 
	    	void m1() {
	    		System.out.println("Anonymous inner  design2 -m1");
	    	}
	    }.m1();
	    
	    new Person() { 
	    	void m1() {
	    		System.out.println("Anonymous inner  design3 -m1");
	    	}
	    }.m1();
	    
	    new Person() { 
	    	
	    }.m1();
	    
	    
	    
	    
	    
	   // System.out.println(p1.i);// CTE why bzc by using super class ref var, we cant access 
	   //  sub class specific members , by using super class ref var we can able to access 
	   // only what are the members are inherited from super class to subclass. 
   
   
    
    
  }
  
  /*
    InnerClass: the process of define the class inside another class is 
     called as inner class. 
     in java we have 4 types of inner classes 
     1. instance inner class 
     2. static inner class
     3. local inner class
     4. Anonymous inner class
     
     1. Instance Inner class: the process of defining the inner class
      inside another class without using static key is called as 
      instance inner class.
      
      systax:
      
       class OuterClass{
       
	        class InnerClass{
	        
	        }
       }
       
       ex:
         class A{
         
             class B{             
             }
         
         }
         
         here class A is called as outer class and class B is called as
         non static inner class.
         
         
         how to save or compile inner class?
         ===================================
         
          for saving java file we will use outer class name only. 
          
          A.java
	     ============
	       class A{
	         
	             class B{             
	             }
	         
	         }
	         
	    src> javac A.java
	     out: we will get 2 .class files with the name of 
	        1. A.clss 
	        2. A$B.class   
	        
	      what is the inner className format?
	      =============================
	      synatx :
	            OuterClassName$InnerClassName.class
	           
	            
	       How to create object for inner class:
	       ======================================
	       
	            syntax: 
	            ======
	             
	             OutClassName.InnerClassName ref = new OuterClassName().new InnerClassName();
	           Ex: 
	             A.B b1 = new A().new B();                            
	            
	            
	     note:
	      1. non static inner class will works almost as same as non static 
	       method rules and regulations.   like if we want to access non static method or attribute
	       inside static method we should access through object creation. 
	       
	       
	       How to access the out class members in side non static inner class:
	       
	       inside inner class we can able to access static or non static members of out class 
	       directly .
	       
	       
	       public class A {  
	
			 int i =10;
			 static int j = 30;
			 
			class B{
				
				void m1() {
				  System.out.println(i);	
				  System.out.println(j);	
				}
				
			}
	
	       non static inner class members ?
	       ================================
	       inside non static inner class or instance inner class we can able to declare 
	       only non static member i.e 
		      1. attributes or 
		      2. methods or 
		      3. constructors
	       
	      public class A {
  			 int i =10;
			 //static int j = 30; //CTE we cant declare static members inside non static 
			  						//inner class
			  		 
			class B{
				int k = 20;
			//	static int l = 40;
				void m1() {
				  System.out.println(i);	
				  System.out.println(j);	
				}
				
				static void m2() {// CTE we cant declare static members inside non static 
			  						//inner class
					  System.out.println(i);	
					  System.out.println(j);	
					}
					
			}
		}  
		
		     static inner class:
		     ==================
		     
		     the process of creating class inside another class with static key is called as
		     static inner clas. 
		     
		     syntax:
		     class Outer{
		     
		        static class Inner{
		        
		        }
		     
		     }
		     
		     Ex:
		     X.java
		     class X{
		        static  class Y{
		        
		        }
		     }
		     src> javac X.java
		      output:we will 2 .class files 
		      1. X.class
		      2. X$Y.class
		       
		     How to create Obj for static inner class:
		     ========================================  
		     
		     as per the static member rules we can able to access the 
		     static members by using class name, even though if we try 
		     access class Object or OBj ref variable at compile time
		     it will replace with corresponding class name.
		     
		     Syntax:
		     =======
		     
		     Outer.Inner ref = new Outer.Inner();
		     
		     Ex:
		     
		     X.y ref = new X.Y();
		     
		     Members of static inner class:
		     ================================
		     static inner class will support all the members of class members 
		     both static and non static members .
		     
		     class X{
			    static  class Y{
			    	
			      int i = 10;
			      static int j = 40;
			      
			      void m1() {
			    	  
			      }
			      static void m2() {
			    	  
			      }
			    }
 			}
 			
 			how to access the outer class members inside static inner class 
 			=================================================================
 			
 			class X{
				int k =  30;
				static int m = 40;
				
			    static  class Y{
			    	
			      int i = 10;
			      static int j = 40;
			      
			      void m1() {
			    	 // System.out.println(k);//CTE we cant access out clas non static members 
			    	                          // directly from static inner class method.
			    	                           // if we want to access we should use the out class
			    	                            // object
			    	  System.out.println(new X().k);  //CS                   
			    	  System.out.println(m);
			      }
			      static void m2() {
			    	  
			      }
			    }
			 }
			 
			 3. Local inner class:
			 ======================
			 
			 the process of defining the class inside the method or constructor or blocks 
			 are called as local inner class.  (or) defining the class inside another class members
			 is called as local inner class.
			 
			 syntax:
			 ========
			 
			 class Outer{
			 
			   void methodName(){
			   
			      class LocalClass{
			      
			      }
			   }
			 }
			 
			 ex:
			 ==
			 P.java
			 class P{
				void m1() {
					class Q{
					}
				}
				void m2() {
					class R{
						
					}
				}
				void m3() {
					class Q{
						
					}
				}
			}
			 
			 
		what is the .class file format for local inner class:
		=====================================================
		local inner class .class file is same as non static inner class naming format , but 
		here local inner class additionally we will get index before local class name as prefix.
		
		      Syntax:
		      
		      OuterClassName$Index+InnerClassName.class.
		      
		      
		      ex:
		      src> javac P.java
		      output: we will 4 .class files we will get 
		      1. P.class
		      2. P$1Q.class
		      3. P$1R.class
		      4. P$2Q.class
		      
		     local inner class members:
		     ============================
		     
		     Local inner class will supoort only non static members, because static only 
		     for global purpose not or local purpose.
		     class P{
				void m1() {
					class Q{
						int i =10;
						//static int k = 40; //CTE we cant declare static member inside local inner class
						void m1() {
							
						}
						static void m2() {//CTE
							
						}
					}
				}
				}
				
				 
				 How to create Object for local inner class:
				 -===============================
				 local means with in the same member or same block scope.
				 
				 So we dont nee to out class reference for accessing the local inner class
				 
				 Syntax:
				 
				 LocalInnerClass ref = new LocalInnerClass();
				 
				 
		     class P{
				void m1() {
					class Q{
						int i =10;
						//static int k = 40; //CTE we cant declare static member inside local inner class
						void m1() {
							
						}
						static void m2() {//CTE
							
						}
					}
					
					
					Q q1 = new Q();
					q1.m1();
					sop(q1.i);
				}
				}
				
				
				
				 class P{
				void m1() {
					class Q{
						int i =10;
						//static int k = 40; //CTE we cant declare static member inside local inner class
						void test1() {
							
						}
						static void tes2() {//CTE
							
						}
					}
					
					
					Q q1 = new Q();
					q1.test1();
					sop(q1.i);
				}
				
				void m2(){
				
				  //Q q1 = new Q();//CTE Q class is local member of m1() method , we can't access out side
				                   // of m1().   scope of the local members with in the block.
				  q1.test();
				}
				}
				
				
				Anonymous inner class:
				======================
				
				the process of defining the class inside another class or class member without
				className is called as anonymous inner class.
				
				-> if we dont have name for inner class, then how to use the inner class when 
				ever we required .
				
				ans: we will take super class name help to create the anonymous inner class. 
				
				Syntax:
				
				//SuperClassName refvar = new SuperClassName();  //this direct obj creation for
				                                                 super class.
				
				
				SuperClassName refvar = new SuperClassName(){
				
				   // this is called as anonymous inner class body
				};
				
				
				{} : // this is called as anonymous inner class body
				new SuperClassName() : it will create object for anonymous inner class not for
				  super class. 
				
				 SuperClassName refvar = new SuperClassName() : Co-relationship between super
				 ref and sub class(our anonymous inner class) object.
				 
				 
				 Ex:
				 
				 class A{
				 
				   void m1(){
				     system.out.println("A-m1");
				   }
				 }
				 
				 class B extends A{
				 
				    void m1(){
				      system.out.println("B-m1");
				    }
				 }
				 
				 A a1 = new A();
				 a1.m1();// A-m1
				 
				 B b1 = new B();
				 b1.m1();// B-m1
				 
				 A a2 = new B();// co relationship
				 
				 a2.m1();//B-m1
				 
				 
				 
				  A a2 = new A(){ //this is anonymous inner sub class for class A
				 
				 
				   };
				 
				 Object obj = new Object(){
				 
				 };
				 Person p1 = new Person(); // this is object of person class
				 
				 Person p1 = new Person(){// this is object of sub class of person class
				 };
				 
				 
				 Example:
				 
				 class Person{
					void m1() {
						System.out.println("Person -m1");
					}
				}
				
				  ***************
				   	class Anonymous extends Person{
						void m1() {
							System.out.println("Anonymous inner class -m1");
						}
					}				
					
					Person p1 = new Anonymous();
					p1.m1();
					new Anonymous().m1();
					p1.m1();
					new Anonymous().m1();
				
					
				   *************************
				   *
				    Person p1 = new Person() { 
				    	int i =10;
				    	void m1() {
				    		System.out.println("Anonymous inner class -m1");
				    		System.out.println(i);
				    	}
				    };				    
				    p1.m1();
				    
				   // System.out.println(p1.i);// CTE why bzc by using super class ref var, we cant access 
				   //  sub class specific members , by using super class ref var we can able to access 
				   // only what are the members are inherited from super class to subclass. 
			   
			      /// this is creating object with out ref var 
			       new Person() { 
				    	int i =10;
				    	void m1() {
				    		System.out.println("Anonymous inner class -m1");
				    		System.out.println(i);
				    	}
				    }.m1();	
				    
				  //  new Anonymous().m1();
			   

   */
}


