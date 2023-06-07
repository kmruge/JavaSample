package Exptn;

public class IndxOtOfBnd {

	public static void main(String[] args) {
		String[] a= {"thiru","Murugan","Hi"};
		try {
		System.out.println(a[3]);
	}catch(IndexOutOfBoundsException ie) {
		System.out.println("no value found");
		
	}
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
	}
