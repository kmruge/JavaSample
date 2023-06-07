package Coollleeeccctttiiiooonnnsssttwwoo;

public class Marker {
	private String brand;
	private int price;
	private boolean isRefillable;
	private String color;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand ) {
		this.brand=brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public boolean getIsRefillable() {
		return isRefillable;
	}
	public void setIsRefillable(boolean isRefillable) {
		this.isRefillable=isRefillable;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	Marker(String brand, int price, boolean isRefillable, String color){
		this.brand=brand;
		this.price=price;
		this.isRefillable=isRefillable;
		this.color=color;
	}

}
