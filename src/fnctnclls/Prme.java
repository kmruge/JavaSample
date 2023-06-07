package fnctnclls;

public class Prme {
	public void prime(int a) {
		int count =0;
		for(int i=1;i<=a;i++) {
			
			if(a%i==0) {
			count++;
				
			}
		}
		if(count==2) {
			System.out.println(a+" IS PRIME");
		}
		else {
			System.out.println(a+" NOT PRIME");
		}
		
	}
	public static void main(String[] args) {
		Prme p=new Prme();
		int a=5;
		p.prime(a);
	}

}
