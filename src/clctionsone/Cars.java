package clctionsone;

public class Cars {
	private String brand1;
	private int price;
	private String color;
	private int engineCapacity;
	public String getBrand() {
		return brand1;
	}
	public void setBrand(String brand) {
		this.brand1=brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity=engineCapacity;
	}
	Cars(String brand, int price, String color, int engineCapacity){
		this.brand1=brand;
		this.price=price;
		this.color=color;
		this.engineCapacity=engineCapacity;
	}
	public String toString() {
		return "BRAND: "+brand1+" PRICE: "+price+" COLOR: "+color+" ENGINE CAPACITY: "+engineCapacity;
	}

}
