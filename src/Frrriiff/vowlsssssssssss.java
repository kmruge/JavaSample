package Frrriiff;

public class vowlsssssssssss {

	public static void main(String[] args) {
		String a="oneSoft".toUpperCase();
		char[] c=a.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			
			if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U') {
			count++;
				
		}
		}	if (count>=1) {
			System.out.println(" Contains vowels");
		}
		else {
			System.out.println("not Contains vowels");
		}
	
		
	}
}

