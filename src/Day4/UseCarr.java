package Day4;

public class UseCarr {

	public static void main(String[] args) {
		Carr c=new Carr();
		c.brand =args[0];
		c.color=args[1];
		c.price=Integer.parseInt(args[2]);
		c.discount=Integer.parseInt(args[3]);
		c.netprice=c.price-c.price*c.discount/100;
		c.rating=Float.parseFloat(args[4]);
		c.isrunning=Boolean.parseBoolean(args[5]);
		System.out.println("name"+c.brand);
		System.out.println("color"+c.color);
		System.out.println("price"+c.price);
		System.out.println("dicount"+c.discount);
		System.out.println("netprice"+c.netprice);
		System.out.println("rating"+c.rating);
		System.out.println("isrunning"+c.isrunning);
		
	}

}