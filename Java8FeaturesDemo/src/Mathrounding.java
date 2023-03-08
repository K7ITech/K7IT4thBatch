import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

import org.apache.log4j.Logger;

public class Mathrounding {
	
	private static Logger log = Logger.getLogger(Mathrounding.class);
	
	public static void main(String[] args) {
		log.info(Math.random());
			log.info(Math.random());
			
			 log.info(Math.random()*9);
			 log.info(Math.random()*9);
			 log.info(Math.random()*9);
			 
			   Supplier<String> otpSupplier = ()-> {
		    String otp="";
		    for(int i =0;i<6;i++) {
		    	otp=otp+Math.round(Math.random()*9);
		    }
		  
		  return otp;
	  };
	  log.info(otpSupplier.get());
	  log.info(otpSupplier.get());
	
	  BiPredicate<Integer, Integer> p = (i,j)->{
		  return (i+j)%2 == 0;
	  };
	  
	  System.out.println("sum of 11 , 75 is a even?"+p.test(11 ,75));
	  System.out.println("sum of 14 , 55 is a even?"+p.test(14,55));
	  
	  
	  
	  Function<Integer,Integer> f = (a)-> a;
		 IntFunction<Integer> f1 =null;
		 
		 f1.apply(12345);
	}
	
}
/*
 * OUTPUT:
  =======
  math.random;
2023-03-08 10:53:12 INFO  Mathrounding:8 - 0.1621755988816147
2023-03-08 10:53:12 INFO  Mathrounding:9 - 0.8624870980879166
************
2023-03-08 10:54:31 INFO  Mathrounding:8 - 0.41410102008800265
2023-03-08 10:54:31 INFO  Mathrounding:9 - 0.4413077946682522
2023-03-08 10:54:31 INFO  Mathrounding:11 - 6.2177504148243585
2023-03-08 10:54:31 INFO  Mathrounding:12 - 3.274211480101276
2023-03-08 10:54:31 INFO  Mathrounding:13 - 3.9718111751708345
OTP:
====
2023-03-08 11:01:34 INFO  Mathrounding:25 - 689345
2023-03-08 11:01:34 INFO  Mathrounding:26 - 075557
sum:
====
sum of 11 , 75 is a even?true
sum of 14 , 55 is a even?false
 */
