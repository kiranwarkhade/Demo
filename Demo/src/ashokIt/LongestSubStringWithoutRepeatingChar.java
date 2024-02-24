package ashokIt;

import java.util.Map;
import java.util.LinkedHashMap;
public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {
		LengthofLongestSubString("java");//abbac
		                                    //The Longest substring :[j, a, v]
	                                      	//The Longest substring Length:3 
		
		

	}
	
	public static void LengthofLongestSubString(String s)
	{
		String LongestSubString=null;
		int LongestSubStringLength=0;
		Map<Character, Integer> map=new LinkedHashMap<Character,Integer>();
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			if(!map.containsKey(ch))
			{
				map.put(ch, i);//a-0 b-1
			}else
			{
				i=map.get(ch);
				map.clear();
			}
			if(map.size() > LongestSubStringLength)
			{LongestSubStringLength=map.size();
			LongestSubString=map.keySet().toString();
			
			}

		}
		System.out.println("The Longest substring :" + LongestSubString);
		System.out.println("The Longest substring Length:" + LongestSubStringLength);
		
	}

}
