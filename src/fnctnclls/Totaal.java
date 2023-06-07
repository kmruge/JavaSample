package fnctnclls;

public class Totaal {
	public int add(int a) {
		int c=0;
		for(int i=0;i<a;i++) {
			c=c+i;
		}
		return c;
	}
	public static void main(String[] args) {
		Totaal t=new Totaal();
		int a=10;

		System.out.println(t.add(a));
	}

}
