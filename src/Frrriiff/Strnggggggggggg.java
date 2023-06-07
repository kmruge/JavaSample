package Frrriiff;

public class Strnggggggggggg {

	public static void main(String[] args) {
		String a="THirU@63362244*3";
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		char[] c=a.toCharArray();
		
		for(int i=0;i<a.length();i++) {
			if(c[i]>='A'&&c[i]<='Z') {
				count++;
			}
			else if(c[i]>='a'&&c[i]<='z') {
				count1++;
			}
			
			else if(c[i]>=48&&c[i]<=57){
			count2++;
			}
			else {
				count3++;
			}
		}
		System.out.println(count+" is the count of caps");
		System.out.println(count1+" is the count of small");
		System.out.println(count2+" is the count of number");
		System.out.println(count3+" is the count of special");
		
	}

}
