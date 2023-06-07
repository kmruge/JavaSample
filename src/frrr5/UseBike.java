package frrr5;

public class UseBike {

	public static void main(String[] args) {
		Bike b1=new Bike();
		Bike b2=new Bike();
		Bike b3=new Bike();
		
		b1.name="ROYAL ENFIELD";
		b1.price=200000;
		b1.milage=38;
		
		b2.name="Hero Splendor";
		b2.price=80000;
		b2.milage=65;
		
		b3.name="KTM RC90";
		b3.price=250000;
		b3.milage=30;
		Bike[] b= {b1,b2,b3};
		for(int i=0;i<b.length;i++) {
			if(b[i].milage>40) {
				System.out.println(b[i].name+" "+b[i].price+" "+b[i].milage);
			}
		}
		
		
	}

}
