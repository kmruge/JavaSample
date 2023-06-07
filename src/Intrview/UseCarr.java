package Intrview;

public class UseCarr {

	public static void main(String[] args) {
		Car car=new Car();
		car.brand="SWIFT";
		car.color="red";
		car.price=1234344;
		car.tax=1213;
		System.out.println(car.getNetPrice(car));
	}

}
