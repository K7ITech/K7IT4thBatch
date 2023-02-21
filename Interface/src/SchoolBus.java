import org.apache.log4j.Logger;

public class SchoolBus extends Bus
{
	private static Logger Log = Logger.getLogger(SchoolBus.class);
	public void fixBody() {
		
		super.fixBody();
		Log.info("change the body color into Yellow");
		Log.info("fix the safety grills for body windows");
	}

}