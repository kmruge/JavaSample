package Frrriiff;

public class Prmenumb {

	public static void main(String[] args) {
		int a=4;
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
				
			}
		}
			if(count==2) {
				System.out.print("Is Prime");
				
			}else {
				System.out.println("IS NOT PRIME");
			}
		}
	
	}


