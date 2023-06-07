package fnctnclls;

public class Comp {
	int price;
	int tax;
	public String netprice(int price,int tax) {
		//return a+a*b/100;
		if(price%2==0) {
			return(price+" EVEN");
		}
		else {
			return (price+" ODD");
		}
	}

}
