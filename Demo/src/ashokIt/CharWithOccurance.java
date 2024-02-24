package ashokIt;

import java.util.Arrays;

public class CharWithOccurance {

	public static void main(String[] args) {
		String input="opentext";
		char charToReplace='t';
		//expected output=open1ex2; output : open1ex2
		
		//check char presense in string
		if(input.indexOf(charToReplace)== -1)
		{
			System.out.println("Given Character not Available in Input String...");
			System.exit(0);
			
		}	
		
		//logic to replace char occurance in string
		int cnt=1;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == charToReplace) {
				input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
				cnt++;
			}
		}

		System.out.println(input);
		 
		
		
		
		
		
		
		/*
		 * char[] arr=input.toCharArray();//opentext int cnt=1; for(int
		 * i=0;i<arr.length;i++) { if(arr[i]==charToReplace) //o==t p==t n==t t==t {
		 * arr[i] =String.valueOf(cnt).charAt(0); cnt++; }
		 * }System.out.println(Arrays.toString(arr));
		 */
		 
	}

}
