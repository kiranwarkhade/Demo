package ashokIt;

import java.util.Arrays;

public class SortStringChar {

	public static void main(String[] args) {
		String str="java";    //aajv
		
		
		// Approach-1 -without using sort() method
		// Approach-2 -using sort() method
		
		// Approach-1
		char arr[] =str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]> arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr);
		
		// Approach-2
		String str1="rock";   //ckor
		char[] charArray=str1.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
		
	}

}
