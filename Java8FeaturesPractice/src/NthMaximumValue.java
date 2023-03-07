import java.util.Arrays;

import org.apache.log4j.Logger;

public class NthMaximumValue
{
	private static Logger log = Logger.getLogger(NthMaximumValue.class);
	public static void main(String[] args) 
	{
		int a[]= {10,50,40,30,70};
		int max=a[0];
		Arrays.sort(a);
		int n=3;
		log.info(a[a.length-n]);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		
		}
		log.info("Maximum value of an array:"+max);

	}
		
	}

