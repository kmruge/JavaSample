package Intrview;

public class Whil {

	public static void main(String[] args) {
		int i=1;
		int j=10;
		do {
			if(i++>--j) {
				j+=i;
			}
		}while(i<5);
		System.out.println("i= "+i+" j= "+j);
	}

}
