package tjavaprogram;

import java.util.HashMap;

public class withoutmainmethodoccrancecount {

	public static void main(String[] args) {
		String str = "test";
		
		//Input: aabbbcccccc
		//Output: a2b3c6 we need hashmap of datatype Character, Integer due to out put we need as a=2, b=3 and c=6
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		//now we need to traverse the str and add all words in Map so we need to use for loop to iterate each word
		//once iterating and need to store the words in character so we have to initialize the char ch=str.charAt(i);
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch)) 
		//all words are stored in ch now and we have to verify the duplicates in the map so use if condition		
			{
				int count=map.get(ch);
				count++;
				map.replace(ch, count);
						
			}
			else 
			{
				map.put(ch, 1);
			}
		}
		for(Character key : map.keySet())
		{
			System.out.println(key +" = "+ map.get(key));
		}
		
		

	}

}
