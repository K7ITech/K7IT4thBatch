
import java.util.Scanner;

import org.apache.log4j.Logger;

public class CountOfConsonentsInString {
	private static Logger log=Logger.getLogger(CountOfConsonentsInString.class);
	
	public static void main(String[] args) {
		int count=0;
		log.info("enter a string");
		Scanner s=new Scanner(System.in);
		String string=s.nextLine();
		for(int i=0;i<string.length();i++)
		{
			char ch=string.charAt(i);
			if(ch== 'a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'u')
			{
				//log.info("");
			}
			else if(ch!=' ')
			{
				count++;
			}
		}
		log.info("Number of consonents in the given string is:"+count);
	}
}
