package fnctnclls;

public class Card {
	public String max(int num1, int num2) {
		if(num1>num2) {
			return (num1+" IS HIGHER");
		}
		else {
			return (num2+" IS HIGHER");
		}
	}
	public static void main(String[] args) {
		Card c=new Card();
		int num1=20;
		int num2=30;
		System.out.println(c.max(num1, num2));
	}

}
