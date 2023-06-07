package fnctnclls;

public class Vote {
	public String elgble(int num1,int num2) {
		if(num1>=num2) {
			return (num1+" ELIGIBLE TO VOTE");
		}
		else {
			return (num1+"IS NOT ELIGIBLE TO VOTE");
			}
		}
	public static void main(String[] args) {
		Vote v=new Vote();
		int num1=20;
		int num2=18;
		System.out.println(v.elgble(num1, num2));
	}

}
