package fnctnclls;

public class Fctorial {
	public int fct(int a) {
		int c=1;
		for(int i=1;i<a;i++) {
			c=c*i;
		} return c;
	}
	public static void main(String[] args) {
		Fctorial f=new Fctorial();
		int a=6;
		System.out.println(f.fct(a));
	}

}
