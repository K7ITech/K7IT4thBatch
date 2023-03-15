import java.util.HashMap;
import java.util.Map;

public class ProgramToFindCountOfRepeatedCharacters {
	/*public static void main(String[] args) {
		int count;
		String str="i am full stack developers";
		/*for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
		}
		*/
		/*String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			
			count=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i]==words[j]&&words[i]!=" ")
				{
		
					//System.out.println(str[j]+" ");
					count++;
					words[j]="0";
					
				}
			}
			if(count>1&&words[i]!="0")
			{
				System.out.println(words[i]+count);
			}
		
		
		}
		System.out.println();
	*/
		
		
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
               System.out.println(key + ", count = " + value);
        }
    }
    
    public static void main(String[] args)
    {
        String str = "i am fullstack developer";
        printDups(str);
    }
	}
	

