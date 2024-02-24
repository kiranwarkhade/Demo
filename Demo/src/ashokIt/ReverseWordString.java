package ashokIt;

public class ReverseWordString {

	public static void main(String[] args) {
	
		String input="java code";
		System.out.println("Original word String :: "+ input);
		
		String output="";
		String[] words=input.split(" ");
		for(String word : words)
		{String revword="";
			//reverse word
			for(int i=word.length()-1;i>=0;i--)
			{
				revword=revword+word.charAt(i);
			}
			output=output+revword+" ";
		}
		System.out.println("Reverse word String :: "+ output);
	}
	     //output
        //Original word String :: java code
	   //Reverse word String :: avaj edoc 
}
