package fnctnclls;

public class Odd {
	public void ods(int a) {
		if(a%2==0) {
		System.out.println(a+" IS EVEN");
		}
		else {
			System.out.println(a+" IS ODD");
		}
	}
	public static void main(String[] args) {
		
		Odd o=new Odd();
		int a=21;
		o.ods(a);
		
	}

}
