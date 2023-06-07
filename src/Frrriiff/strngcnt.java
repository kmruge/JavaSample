package Frrriiff;

public class strngcnt {

	public static void main(String[] args) {
		String a="ThIruMuRugaAn";
		int count=0;
		int count1=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='a'&&a.charAt(i)<='z') {
				count++;
			}
			else {
			count1 ++;
			}
			
		}System.out.println(count+" count of smalls");
		System.out.println(count1+" count of capss");
	}

}
