package Frrriiff;

public class Strngmix {

	public static void main(String[] args) {
		String a="17J5A0505";
		int count =0;
		int count1=1;
		char[] c=a.toCharArray();
		for(int i=0;i<c.length;i++) {
			if((c[i]>='a'&&c[i]<='z')||(c[i]>='A'&&c[i]<='Z')) {
				count++;
			}
			else {
			count1 ++;
			}
			
		}System.out.println(count+" count of alphabets");
		System.out.println(count1+" count of numbers");
	}

}
