package Exptn;

public class FindVowels {

	public static void main(String[] args)throws VowelsException {
		String a="thiru";
		
		if(a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
			System.out.println("vowels Present");
		}
		else {
			throw new VowelsException("no vowels present");
		}
		
	}

}
