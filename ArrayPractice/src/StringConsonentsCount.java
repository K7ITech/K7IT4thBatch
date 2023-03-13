import java.util.Scanner;

public class StringConsonentsCount {
public static void main(String[] args) {
	int count=0;
	System.out.println("enter a string");
	Scanner s=new Scanner(System.in);
	String string=s.nextLine();
	for(int i=0;i<string.length();i++)
	{
		char ch=string.charAt(i);
		if(ch== 'a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'u')
		{
			System.out.println("");
		}
		else if(ch!=' ')
		{
			count++;
		}
	}
	System.out.println("Number of consonents in the given string is:"+count);
}
}
