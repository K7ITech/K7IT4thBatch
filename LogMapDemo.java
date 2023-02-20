import java.util.HashMap;

import org.apache.log4j.Logger;

public class LogMapDemo {
	private static Logger log = Logger.getLogger(LogMapDemo.class);

	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("name", "K7it");
		map.put("age",37 );
		map.put("height", 5.5);
		map.put("weight", 72.5);
		log.debug("map:"+map);
		map.put("name","aruna" );
		log.debug("map:"+map);
		log.debug("map:"+map.remove("age"));
		log.debug("map:"+map);
		log.info("value of height key v :"+map.get("height"));
				
	}

}
