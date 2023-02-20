import java.util.HashMap;

import org.apache.log4j.Logger;

public class LogsMapDemo{
	
	private static Logger log=Logger.getLogger(LogsMapDemo.class);
	public static void main(String[] args) {
		
	HashMap map=new HashMap();
		
		map.put("Name", "Deepu");
		map.put("Age", 19);
		map.put("Height", 5.1);
		map.put("Weight", 63.5);
		log.debug("Map:"+map);
		
		map.put("Name", "Praneetha");
		log.error("Map:"+map);
		
		log.info("Map:"+map.remove("Age"));
		log.info("Map:"+map);
		
		log.fatal("Value of Height Key:"+map.get("Height"));
		log.fatal("Map:"+map);

	}

}
