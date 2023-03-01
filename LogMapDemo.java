import java.util.HashMap;

import org.apache.log4j.Logger;

public class LogMapDemo
{
private static Logger log=Logger.getLogger(LogMapDemo.class);
public static void main(String[] args) {
HashMap map=new HashMap();
map.put("name"," k7it");
map.put("age", 37);
map.put("height", 5.5);
map.put("weight", 60.25);
log.debug("Map:"+map);
map.put("name", "aruna");
log.debug("map:"+map);

log.debug("map:"+map.remove("age"));
log.debug("Map:" +map);
log.info("value of height keyv:"+map.get("height"));

	}

}
