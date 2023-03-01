import org.apache.log4j.Logger;

public class SynchronixedDemo {
private static Logger log = Logger.getLogger(SynchronixedDemo .class);
	public static void main(String[] args)
	{
		
		
		
		log.debug("main start");
		Printingpress pp1 = new Printingpress();
		 Printingpress pp2 = new Printingpress();
		  MyPrintingThread t1 = new MyPrintingThread(pp1);
		  MyPrintingThread t2 = new MyPrintingThread(pp2);
		 t1.start();
		  t2.start();
		  log.debug("main end");

		

	}

}
