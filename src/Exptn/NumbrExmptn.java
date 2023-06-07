package Exptn;

public class NumbrExmptn {

	public static void main(String[] args) {
		String a=args[0];
		String c=args[1];
		
		try {
			int b=Integer.parseInt(args[2]);
			System.out.println(b);
		}catch(NumberFormatException ee) {
			System.out.println("You cant give String to Integer");
		}
		
		System.out.println(a);
		System.out.println(c);
	}

}
