package tjavaprogram;

import java.util.HashMap;
import java.util.Map;

public class withmaincharoccurencecount {
	
	public static void getCharCount(String name)
	{
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char strArray[]= name.toCharArray(); //tocharArray will return one char array so we will store in strArray[]
		//now we have to traverse/iterator the chararray so we need for each loop
		
		for(char c : strArray)
		{
			//c will traverse each character from strArray and it should store it in charMap
			
			//now we have condition that it should find duplicate character then increase the count by 
			//adding to charMap else add only once to charMap 
		//so we have to use ContainsKey() method by if condition
			
			if(charMap.containsKey(c))
			{
			//containKey method will check the c value in strArray weather it conatins same character or not if  contains then do +1 or go to elase part
								
				charMap.put(c, charMap.get(c)+1);
				
			}
			else {
				charMap.put(c, 1);
			}
			
			
		}
		System.out.println(name +" : " + charMap);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getCharCount("test");

	}

}
