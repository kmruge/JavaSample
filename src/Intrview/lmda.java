package Intrview;

import java.util.Scanner;

interface Addable {
	
	int add(int a, int b);
	
}

public class lmda {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int aa=scanner.nextInt();
		int bb=scanner.nextInt();
		Addable add1=(d,c)->(d+c);
		System.out.println(add1.add(a,b));
		Addable add2=(f,g)->(f-g);
		System.out.println(add2.add(aa,bb));

	}

}
