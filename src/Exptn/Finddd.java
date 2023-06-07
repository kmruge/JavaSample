package Exptn;

public class Finddd {

	public static void main(String[] args)throws VowelsException {
String a="gym";
		try {
		if(a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
			System.out.println("vowels Present");
		}
		else {
			throw new VowelsException("no vowels present");
		}
		}catch(VowelsException ve) {
			System.out.println(ve.getMessage());
		}
	}

}
