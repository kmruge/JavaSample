package Intrview;

 class Car {
	String brand;
	String color;
	int price;
	int tax;
	
	public String getNetPrice(Car c) {
		return "netprice is"+(c.price+c.tax);
	}

}