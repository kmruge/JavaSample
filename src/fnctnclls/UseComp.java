package fnctnclls;

public class UseComp {

	public static void main(String[] args) {
		Comp c1=new Comp();
		Comp c2=new Comp();
		c1.price=3001;
		c1.tax=5;
		c2.price=2000;
		c2.tax=4;
		System.out.println(c1.netprice(c1.price,c1.tax));
		System.out.println(c2.netprice(c2.price,c2.tax));
	}

}
