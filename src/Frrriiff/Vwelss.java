package Frrriiff;

public class Vwelss {

	public static void main(String[] args) {
		String a="HELLO WORLD";
		int count=0;
		char[] c=a.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U') {
				count++;
			}
			else {
				System.out.println("not assigned");
			}
		}System.out.println(count+" is count of vowels");
	}

}
