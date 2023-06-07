package Exptn;

public class StrngOtOfBnd {

	public static void main(String[] args) {

		String a="HellO";
		try {
			
		
		System.out.println(a.charAt(5));
		}catch(StringIndexOutOfBoundsException st) {
			System.out.println("index not found");
		}
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(2));
		System.out.println(a.charAt(3));
		System.out.println(a.charAt(4));
	}

}
