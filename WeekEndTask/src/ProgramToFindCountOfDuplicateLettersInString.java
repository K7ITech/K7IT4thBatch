import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class ProgramToFindCountOfDuplicateLettersInString {
	private static Logger log=Logger.getLogger(ProgramToFindCountOfDuplicateLettersInString.class);
	static void printDups(String str)
    {
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
          if(str.charAt(i)!=' ') {
            if (!count.containsKey(str.charAt(i)))
            	count.put(str.charAt(i), 1);
            else
                count.put(str.charAt(i),
                count.get(str.charAt(i)) + 1);
        }}
        for (Map.Entry mapElement : count.entrySet()) 	
        {
            char key = (char)mapElement.getKey();
        
            int value = (int)mapElement.getValue();
 
            if (value >= 1 && str!=" ")
               log.info(key + ", count = " + value);
        }
    }
    
    public static void main(String[] args)
    {
        String str = "i am fullstack developer";
        printDups(str);
    }


}
