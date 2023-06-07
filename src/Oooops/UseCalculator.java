package Oooops;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.Sum(10));
		System.out.println(c.Sum(20, 10));
		System.out.println(c.Sum(20, 30, 40));
		System.out.println(c.Mum(20));
	}

}
