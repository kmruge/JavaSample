package ColllleeccttiioonnssThrrreeee;

public class Marker {
	private String name;
	private int price;
	private String color;
	private boolean isRefillable;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getIsRefillable() {
		return isRefillable;
	}
	public void setIsRefillable(boolean isRefillable) {
		this.isRefillable = isRefillable;
	}
	public Marker(String name, int price, String color, boolean isRefillable) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.isRefillable = isRefillable;
	}
	@Override
	public String toString() {
		return "Marker [name=" + name + ", price=" + price + ", color=" + color + ", isRefillable=" + isRefillable
				+ "]";
	}
	

}
