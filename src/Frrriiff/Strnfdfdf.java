package Frrriiff;

public class Strnfdfdf {

	public static void main(String[] args) {
		String a="ONeSoFT265tecH";
		int count=0;
		int count1=0;
		int count2=0;
		for (int i=0;i<a.length();i++){
			if(a.charAt(i)>='a'&&a.charAt(i)<='z') {
				count++;
			}
			else if(a.charAt(i)>='A'&&a.charAt(i)<='Z') {
				count1++;
			}
			else {
				count2++;
				
			}
		}
			System.out.println(count+" Lower CASE");
			System.out.println(count1+" UpperCase");
			System.out.println(count2+" numbers");
		
	}
}


