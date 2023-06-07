package Swwitch;

public class Atm {

	public static void main(String[] args) {
		int request=5;
		switch (request) {
		case 1:System.out.println(" insert your card");break;
		case 2:System.out.println(" select the language");break;
		case 3:System.out.println(" enter your password");break;
		case 4:System.out.println("select type");break;
		case 5:System.out.println("enter amount");break;
		case 6:System.out.println("please wait");break;
		case 7:System.out.println("Collect your cash");break;
		default:System.out.println("card is blocked");break;
		}
	}

}
