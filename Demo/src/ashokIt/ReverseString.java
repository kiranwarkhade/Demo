package ashokIt;

// 4 way to reverse a String

public class ReverseString {

	public static void main(String[] args) {
		String str="hello";
		
		//Approach-1  -Using to CharArray() method
		char[] chArr=str.toCharArray();
		for(int i=chArr.length-1;i>=0;i--)
		{
			System.out.print(chArr[i]);
		}
		System.out.println("");
		
		//Approach-2  - Using charAt(int index) method
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		//Approach-3  - Using java.lang.StringBuffer class provided revrese() method
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		//Approach-4  - Using java.lang.StringBuilder class provided revrese() method
     StringBuilder sbl=new StringBuilder(str);
     System.out.println(sbl.reverse());
	}

}
