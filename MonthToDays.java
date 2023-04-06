import java.util.HashMap;

import org.apache.log4j.Logger;

public class MonthToDays {
	private static Logger log = Logger.getLogger(MonthToDays.class);
	public static void main(String[] args) {
		
		
		HashMap<String, Integer>monthToDays = new HashMap<>();
		
		monthToDays.put("jan", 31);
		monthToDays.put("feb", 28);
		monthToDays.put("mar", 31);
		monthToDays.put("apr", 30);
		monthToDays.put("may", 31);
		monthToDays.put("jun", 30);
		monthToDays.put("jul", 31);
		monthToDays.put("Aug", 31);
		monthToDays.put("spe", 30);
		monthToDays.put("oct", 31);
		monthToDays.put("nov", 30);
		monthToDays.put("dec", 31);
		
		log.debug("No of days in jan:"+monthToDays.get("jan"));
		log.info("No of days in jan:"+monthToDays.get("feb"));
		log.info("No of days in jan:"+monthToDays.get("mar"));
		log.info("No of days in jan:"+monthToDays.get("apr"));
		log.info("No of days in jan:"+monthToDays.get("may"));
		log.info("No of days in jan:"+monthToDays.get("jun"));
		log.info("No of days in jan:"+monthToDays.get("jul"));
		log.info("No of days in jan:"+monthToDays.get("Aug"));
		log.info("No of days in jan:"+monthToDays.get("oct"));
		log.info("No of days in jan:"+monthToDays.get("nov"));
		log.info("No of days in jan:"+monthToDays.get("dec"));
		System.out.println("No of days in jan:"+monthToDays.get("jan"));
		
		
	}

}

/*
 OUTPUT
 =======
 2023-02-22 20:33:49 DEBUG MonthToDays:25 - No of days in jan:31
  2023-02-22 20:33:49 INFO  MonthToDays:26 - No of days in jan:28
  2023-02-22 20:33:49 INFO  MonthToDays:27 - No of days in jan:31
  2023-02-22 20:33:49 INFO  MonthToDays:28 - No of days in jan:30
  2023-02-22 20:33:49 INFO  MonthToDays:29 - No of days in jan:31
  2023-02-22 20:33:49 INFO  MonthToDays:30 - No of days in jan:30
  2023-02-22 20:33:49 INFO  MonthToDays:31 - No of days in jan:31
  2023-02-22 20:33:49 INFO  MonthToDays:32 - No of days in jan:31
  2023-02-22 20:33:49 INFO  MonthToDays:33 - No of days in jan:31
  2023-02-22 20:33:49 INFO  MonthToDays:34 - No of days in jan:30
  2023-02-22 20:33:49 INFO  MonthToDays:35 - No of days in jan:31
  No of days in jan:31

 
 
 */
