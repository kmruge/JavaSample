package Day4;

public class UseBottle {

	public static void main(String[] args) {
		Bottle b=new Bottle();
		String[] w=args[0].split(",");
		b.brand=w[0];
		b.price=Integer.parseInt(w[1]);
		b.rating=Float.parseFloat(w[2]);
		b.isVisible=Boolean.parseBoolean(w[3]);
		b.barCode=Long.parseLong(w[4]);
		
		System.out.println("Brand="+b.brand+" Price="+b.price+" Rating="+b.rating+" Best quality="+b.isVisible+" barcodeno.="+b.barCode);
		

	}

}