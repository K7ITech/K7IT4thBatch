import org.apache.log4j.Logger;

public class StringReverse {
	private static Logger log=Logger.getLogger(StringReverse.class);
	/*
	public static void main(String[] args) {
		String str="This is K7iT company";
		char ch;
		String rstr=" ";
	
		
		//String strs[]=str.split(" ");
		
		for(int i=0;i<str.length();i++)
		{
				ch=str.charAt(i);
				rstr=ch+rstr;
		
		}
		
	System.out.println("original string:"+str);
	System.out.println("reverse string:"+rstr);
*/
	/*
		System.out.println("Enter String to reverse:");
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println("reverse string is:"+reverse);
	}
	*/
	static void reverseEachWordOfString(String str) {

		String[] words = str.split(" ");

		String rstr = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			rstr = rstr + reverseWord + " ";
		}

		log.info(str);

		log.info(rstr);

		
	}

	public static void main(String[] args) {
		
		reverseEachWordOfString("this is k7it company");
	

	}

};
