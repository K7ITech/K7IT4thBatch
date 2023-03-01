import org.apache.log4j.Logger;

public class Printingpress 
{
private static Logger log = Logger.getLogger(Printingpress.class);
static int count = 0;
static void printNumber()
{
	for(int i = 0;i<100;i++)
	{
		log.debug(Thread.currentThread().getName()
				+":"+count++);
	}
}
}
