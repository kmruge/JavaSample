package Frrriiff;

public class Couuunnttt {

	public static void main(String[] args) {
		int count=0;
		int count1=0;
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				count=count+1;
				
			}
			else {
				count1=count1+1;
			}
			
		}
		System.out.println(count+" is count of even number");
		System.out.println(count1+" is count of odd number");
	}

}
