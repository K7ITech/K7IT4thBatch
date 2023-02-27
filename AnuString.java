
public class AnuString {

	public static void main(String[] args) {
		
		//String s1= "Anand";
		//String s2="Anu";
		//String s3=new String("Anand");
		//String s4=s3;
		//String s5="Anand";
		//String s6=new String("Anand");
		
		//System.out.println("equal method");
		//System.out.println(s1==s2);
		//System.out.println(s1==s3);
		//System.out.println(s1==s5);
		//System.out.println(s1==s4);
		//System.out.println(s2==s5);
		//System.out.println(s3==s4);
		//System.out.println(s3==s6);
		
		//System.out.println("equal operater");
		
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(3));
		//System.out.println(s1.equals(s5));
		//System.out.println(s1.equals(s4));
		//System.out.println(s2.equals(s5));
		//System.out.println(s3.equals(s5));
		//System.out.println(s3.equals(s4));
		//System.out.println(s3.equals(s6));
		
		//System.out.println("hash code");
		
		//System.out.println(s1.hashCode()==s2.hashCode());
		//System.out.println(s1.hashCode()==s3.hashCode());
		//System.out.println(s1.hashCode()==s5.hashCode());
		//System.out.println(s1.hashCode()==s4.hashCode());
		//System.out.println(s2.hashCode()==s5.hashCode());
		//System.out.println(s3.hashCode()==s5.hashCode());
		//System.out.println(s3.hashCode()==s4.hashCode());
		//System.out.println(s3.hashCode()==s6.hashCode());
		
		
		
		
		
		
	//String s2 = s.replace(" ","");
	//System.out.println(s.length());
	//System.out.println(s2);
		//System.out.println(s.contains("Biradar "));
		//System.out.println(s.toString());
		
	//String s1="abc";
	//String s2="xyz";
	//String s3=s1.concat("123");
	//s2.concat("456");
	//s2=s2.concat("456");
	
	//System.out.println(s1);
	//System.out.println(s2);
	//System.out.println(s3);
	//System.out.println(s2);
	
	//String s ="Hello everyone welcome to K7iT,we are going to learn java here,if we learn java our life will settele happily,if not go to hell";
	 // String[] str=s.split(",");
	  /*str[0]="Hello everyone welcome to K7iT";
	  str[1]="we are going to learn java here";
	  str[2]="if we learn java our life will settele happily";
	  str[3]="if not go to hell";*/
	  
	//for(int i=0;i<size.str[];i++) {
	//	System.out.println(str[i]);
//	}
	 // for (String c : str) {
		//  System.out.println(c);}
	  //System.out.println(size.str[]);
	  //System.out.println(s);
	  //System.out.println(str[0]);
	 // System.out.println(str[1]);
	 // System.out.println(str[2]);
	 // System.out.println(str[3]);
		
		/*String s = "Hello everyone";
		String substr=s.substring(3);
		System.out.println(substr);
		
		String s="Anuradha";
		System.out.println(s.length());
		String substr=s.substring(0,3);
		System.out.println(substr.length());
		System.out.println(substr);
		
		String s="Anuradha7022821737";
		
        System.out.println(s.contains("Anuradha"));
        System.out.println(s.contains("abc"));
	  System.out.println(s.contains("7022"));*/
	  
	 String s="wel come";
	 String rstr=" ";
	// System.out.println(s.charAt(1));
	 
	for(int i= s.length()-1;i>=0;i--)
	{
		rstr = rstr + s.charAt(i);
		
		}
	System.out.println("Original String :"+s);
	System.out.println("The revers String :"+rstr);
	 int n=s.length();
	 for(int i=0;i<n;i++) {
		 char c = s.charAt(i);
		rstr=c+rstr; 
	 }
	 System.out.println("Original String :"+s);
		System.out.println("The revers String :"+rstr);
	}
}
	


