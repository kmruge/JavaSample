package Intrview;

public class Bike {
	String brand;
	int price;
	String color;
	public void findBike (Bike b) {
		
	System.out.println(b.brand+b.price+b.color);
		
	}
	public void findbrand(Bike [] bike) {
		for(int i=0;i<bike.length;i++) {
			
		
	if(bike[i].brand.equals(bike[i].brand.toUpperCase())) {
		System.out.println(bike[i].brand);
	}
	}
	}
	
	
	
	public static void main(String[] args) {
		
		Bike b1=new Bike();
		b1.brand="pulsar";
		b1.price=250000;
		b1.color="Black";
		
		Bike b2=new Bike();
		b2.brand="KTM";
		b2.price=50000;
		b2.color="Yellow";
		
		Bike [] bike= {b1,b2};
		
	
		b2.findBike(b2);
		b1.findbrand(bike);
		
		
		
		
	}
	
	
	
	
	
	

}
 