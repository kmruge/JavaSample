package Forrrroobbjjeecctt;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.brand="APPLE";
		m1.size=5.5f;
		m1.color="RED";
		m1.price=50000;
		
		Mobile m2=new Mobile();
		m2.brand="XIOMI";
		m2.size=5.6f;
		m2.color="BLUE";
		m2.price=49000;
		
		Mobile m3=new Mobile();
		m3.brand="LAVA";
		m3.size=5.5f;
		m3.color="violet";
		m3.price=48000;
		
		Mobile m4=new Mobile();
		m4.brand="ONE PLUS";
		m4.size=5.7f;
		m4.color="green";
		m4.price=47000;
		
		Mobile m5=new Mobile();
		m5.brand="LENOVO";
		m5.size=5.8f;
		m5.color="orrange";
		m5.price=46000;
		
		Mobile m6=new Mobile();
		m6.brand="LE ECO";
		m6.size=5.9f;
		m6.color="yellow";
		m6.price=45000;
		String a=" ";
		
		Mobile[] m= {m1,m2,m3,m4,m5,m6};
		
		for(int i=0;i<m.length;i++) {
			System.out.println("THE COLOR OF"+m[i].brand+" IN UPPER CASE CASE IS "+m[i].color.toUpperCase());
		}
		for(int i=0;i<m.length;i++) {
			System.out.println("THE COLOR OF "+m[i].brand+" IN LOWER CASE IS "+m[i].color.toLowerCase());
		}
		for (int i=0;i<m.length;i++) {
			System.out.println("the brand equals "+m[i].brand.equals("ONE PLUS"));
		}
		for (int i=0;i<m.length;i++) {
			System.out.println("the color equals "+m[i].color.equals("RED"));
	}
		for (int i=0;i<m.length;i++) {
			System.out.println("the mobile name Starts with "+m[i].brand.startsWith("A"));
	}
		for (int i=0;i<m.length;i++) {
			System.out.println("the mobile name ends with "+m[i].brand.endsWith("o"));
	}
		for (int i=0;i<m.length;i++) {
			System.out.println("the mobile ADITION OF TAX AND PRICE "+((m[i].price)+100));
	}
		for (int i=0;i<m.length;i++) {
			System.out.println("the mobile SUBRACTION OF DISCOUNT FROM PRICE IS   "+((m[i].price)-100));
	}
		for (int i=0;i<m.length;i++) {
			System.out.println("the mobile ADITION OF TAX AND PRICE "+((m[i].price)+100));
	}
		for (int i=0;i<m.length;i++) {
			System.out.println("the mobile ADITION OF TAX AND PRICE "+((m[i].price)+100));
	}
     	for (int i=0;i<m.length;i++) {
		a=a+ " " +m[i].brand;
     	}
		System.out.println("mobile names are"+a);
	}
     	
}
	

