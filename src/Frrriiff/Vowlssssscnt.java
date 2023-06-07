package Frrriiff;

public class Vowlssssscnt {

	public static void main(String[] args) {
		String a="White Board".toUpperCase();
		int count=0;
		int count1=0;
		char[] c=a.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U') {
				count++;
			}
			else {
				count1++;
			}
			
		}System.out.println(count+" is count of vowels");
		System.out.println(count1+"not contains");
	}

	}


