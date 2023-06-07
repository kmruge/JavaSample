package Exptn;

public class Exmp {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		
		try {
			System.out.println(a[5]);
		}catch(Exception e) {
			System.out.println("hii");
		}
		finally {
			System.out.println("hello");
		}
	}

}
