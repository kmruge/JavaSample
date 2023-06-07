package Oooopone;

public class Ac {
	String brand;
	int price;
	float ton;
	String color;
	
	
	
	public Ac(String brand,int price,float ton,String color) {
		this.brand=brand;
		this.price=price;
		this.ton=ton;
		this.color=color;
	}
	public String toString() {
		return brand+" "+price+" "+color;
	}

}
