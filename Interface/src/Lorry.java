import org.apache.log4j.Logger;

public class Lorry extends Vehicle
{
	private static Logger log = Logger.getLogger(Lorry.class);

	
	
		public void fixHandle() {
			 log.debug("Fixing Lorry Handle");
		}
		
		public void fixSeats() {
			 log.error("Fixing Lorry seats");
		}
		public void fixWheels() {
			 log.info("Fixing Lorry Wheels");
		}
		
		public void fixEngine() {
			 log.fatal("Fixing Lorry Engine");
		}
		
		public void fixBreak() {
			 log.info("Fixing Lorry Breaks");
		}
		
		public void fixAccelator() {
			 log.debug("Fixing Lorry Accelator");
		}
		
		public void fixBody() {
			 log.info("Fixing Lorry Body");
		}
		
		public void fixAdvNumberPlate() {
			 log.fatal("Fixing Lorry number plate");
		}
		
		

	}


