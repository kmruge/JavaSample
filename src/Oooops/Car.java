package Oooops;

class Car extends Vehicle {
	private String model;
	private String fueltype;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getFuelType() {
		return fueltype;
	}
	public void setFuelType(String fueltype) {
		this.fueltype=fueltype;
	}
	public Car(String model, String fueltype,String brand, int price, String color){
		super(brand, price,color);
		this.model=model;
		this.fueltype=fueltype;
	}
	public String toString() {
		return "MODEL: "+model+", FUELTYPE: "+fueltype+", "+super.toString()+" Milage  ";
	}
	public String findMilage(int speed) {
		if(speed>=20&&speed<=40) {
			return "50";
		}
		else if(speed>=40&&speed<=80) {
			return "35";
		}
		else if(speed>=100) {
			return "20";
		}
		else {
			return "0";
		}
	}
	
}
