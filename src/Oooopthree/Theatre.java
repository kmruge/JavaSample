package Oooopthree;

public interface Theatre {
	public int ticketPrice(int price, int gst, int handlingChrge);
	public int foodPrice();
}
 class  Movie implements Theatre {
	public int movieBudget(int budget) {
		return 0;
	}
	public int HeroSalary(int budget, int heroSalary) {
		int salary=budget-budget*heroSalary/100;
		return salary;
	}
	public  int ticketPrice(int price, int gst, int handlingChrge) {
		return  price+gst+handlingChrge;
	}
	public int foodPrice(int foodPrice) {
		return foodPrice;
	}
	@Override
	public int foodPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
 }
 class UseMovie extends Movie {
	 public int movieBudget(int budget) {
		 return budget;
	 }
 }