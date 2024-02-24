package ashokIt;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		// "\"pr!org#am%m*in&g Lan?#guag(e\"";
		// "$ja!va$&st%ar";
		
		String str="$ja!va$&st%ar";      // output : javastar
		
		//approach-1 -replaceAll() method
		String plainstr=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(plainstr);

	}

}
