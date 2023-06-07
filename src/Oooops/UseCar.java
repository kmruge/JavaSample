package Oooops;

public class UseCar {

	public static void main(String[] args) {
		Car c=new Car("SWIFT","PETROL","SUZUKI",200000,"RED");
		System.out.print(c+" "+c.findMilage(55)+" tax amount "+c.FindTax(500000, 5));
	
	}

}
