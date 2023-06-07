package Exptn;

public class NllPntExptn {

	public static void main(String[] args) {
		String a=null;
		try {
		System.out.println(a.toLowerCase());
		}catch(NullPointerException ne) {
			System.out.println("cant find value");
		}
		System.out.println("hey hii");
		System.out.println("java");
	}

}
