package Frrriiff;

public class plndrome {

	public static void main(String[] args) {
		String a="MALAYALam";
		String b="";
		char[] c=a.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			b=b+c[i];
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("PALINDROME");
			
		}
		else {
			System.out.println("NOT PALINDROME");
		}
	}

}
