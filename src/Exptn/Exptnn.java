package Exptn;

public class Exptnn {

	public static void main(String[] args) {
		String a=null;
		String b="11";
		String c="thiru";
		int d=Integer.parseInt(b);
		int f=144;
		int[] num= {d,f};
		
		try {
			System.out.println("thiru");

			int e=Integer.parseInt(c);
						System.out.println(e);
			System.out.println(num[1]);
		}catch(ArithmeticException ae) {
			System.out.println("arithmatic error");
			
		}catch(NullPointerException ne) {
			System.out.println("null value");
		}catch(NumberFormatException nf) {
			System.out.println("Number format is invalid");
		}catch(ArrayIndexOutOfBoundsException at) {
			System.out.println("no value int the list");
		}catch(Exception ex) {
			System.out.println("nill");
		}
		//System.out.println(c);
	}

}
