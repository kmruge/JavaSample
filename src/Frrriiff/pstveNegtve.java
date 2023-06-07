package Frrriiff;

public class pstveNegtve {

	public static void main(String[] args) {
		int a[]= {10,20,-1,-2,15,-17,-3};
		int count=0;
		int count1=0;
		int b=0;
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=0) {
				System.out.println(a[i]+"is positive");
				count=count+1;
				b=b+a[i];
			}
			else {
				System.out.println(a[i]+"is negative number");
				count1=count1+1;
				c=c+a[i];
			}
		}System.out.println(count+"positive nos count");
		System.out.println(count1+"negative nos count"); 
		System.out.println(b+"is add of positive");
		System.out.println(c+"is add of negative");
	}

}
