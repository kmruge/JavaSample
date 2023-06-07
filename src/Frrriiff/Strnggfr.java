package Frrriiff;

public class Strnggfr {

	public static void main(String[] args) {
		String a="hello";
		char [] c=a.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				System.out.println(c[i]+"  is vowels");
			}
			else {
				System.out.println(c[i]+"  is not vowels");
			}
		}
		
	}

}
