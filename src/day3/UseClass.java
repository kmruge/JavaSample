package day3;

public class UseClass {
	public static void main(String[]args) {
	Car c1=new Car();
	c1.brand="Innova";
	c1.color="blue";
	c1.price=1700000;
	String b=c1.brand.toUpperCase();
	
	Car c2=new Car();
	c2.brand="Swift";
	c2.color="blue";
	c2.price=1800000;
	String c=c2.brand.toUpperCase();
	
	System.out.println("Brand= "+b+" "+c1.color+" "+c1.price);
	System.out.println("Brand="+c+""+c1.color+" "+c1.price);
	char ab=c1.brand.charAt(0);
	char bc=c1.brand.charAt(5);
	char cd=c2.brand.charAt(0);
	char da=c2.brand.charAt(4);
	System.out.println("FIRST and LAST LETTER OF INNOVA IS "+ab+" "+bc);
	System.out.println("FIRST and LAST LETTER OF SWIFT IS "+cd+" "+da);
	int aa=c1.brand.length();
	int bb=c2.brand.length();
	System.out.println("the length of the brand 1 is"+aa);
	System.out.println("the length of the brand 1 is"+bb);
	
	
	
}
}