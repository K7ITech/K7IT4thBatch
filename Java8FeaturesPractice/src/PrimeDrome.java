import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BiFunction;

import org.apache.log4j.Logger;

public class PrimeDrome
{
	private static Logger log = Logger.getLogger(PrimeDrome.class);
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		log.info(" Enter n value");
		int num=s.nextInt();
		/*int n;
		for(n=2;n<num;n++)
		{
			boolean isPrime=true;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(n);
			}
			
			
		}*/
		BiFunction<Integer, Integer, ArrayList<Integer>> f = (startNum,endNum)->{
			ArrayList<Integer> res= new ArrayList<>();
			for(startNum=3;startNum<endNum;startNum++)
			{
				boolean isPrime=true;
				for(int i=2;i<startNum;i++)
				{
					if(startNum%i==0)
					{
						isPrime=false;
						break;
					}
				}
				if(isPrime)
				{
					log.info(startNum);
					res.add(startNum);
				}
			}
			return res;
			
			
		};
		log.info(f.apply(0, num));
		}

}
