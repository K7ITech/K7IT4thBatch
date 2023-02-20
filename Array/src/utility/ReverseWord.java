package utility;

public class ReverseWord {
	public static void main(String[] args) {
		
	 String s[] = "you shall not pass".split(" "); 
     String rstr = " "; 
     
     for (int i = s.length - 1; i >= 0; i--) 
    	 //for(int i=0;i<s.length;i++)
     { 
       rstr += s[i] + " "; 
       /*
       for (int i = s.length - 1; i >= 0; i--) { 
           rstr += s[i] + " "; 
        */

       System.out.println("Reversed String: " + rstr); 
     } 
     System.out.println("\n"+"Reversed String: " + rstr); 
   }
}
