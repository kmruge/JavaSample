package Oooopone;

public class UseCar {

	public static void main(String[] args) {
		Engine e=new Engine();
		e.cc=1200;
		e.engineNo=5634568532413l;
		
		Car c=new Car();
		c.brand="SWIFT";
		c.color="RED";
		c.price=1000000;
		c.engine=e;
		
		System.out.println("BRAND "+c.brand+" color "+c.color+"  price "+c.price+" engine cc "+c.engine.cc+" engine number "+c.engine.engineNo);
	}

}
