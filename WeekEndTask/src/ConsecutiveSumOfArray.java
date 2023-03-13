import org.apache.log4j.Logger;

public class ConsecutiveSumOfArray {
	private static Logger log=Logger.getLogger(ConsecutiveSumOfArray.class);
	public static void main(String[] args) {
		int a[]= {10,20,35,90,60,20};
		 int b[]=new int[a.length-1];
		 int c[]=new int[5];
		
		 //int max=b[j];
		// int c[]=new int[5];
		for(int i=0,j=0;i<a.length;i++) {
			if(i<a.length-1)
			{
			b[i]=a[i]+a[i+1];
			}
		}
			log.info("Consecutive sum of 0th and 1st index:"+b[0]);
			log.info("Consecutive sum of 1st and 2nd index:"+b[1]);
			log.info("Consecutive sum of 2nd and 3rd index:"+b[2]);
			log.info("Consecutive sum of 3rd and 4th index:"+b[3]);
			log.info("Consecutive sum of 4th and 5th index::"+b[4]);
			int max=b[0];
			for(int i=0;i<b.length;i++)
			{
				if(b[i]>max)
				{
					max=b[i];
				}
			}
			log.info("maximum value of consecutive number of array:"+max);

			
			}

}
