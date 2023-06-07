package Swwitch;

public class Menu {

	public static void main(String[] args) {
		String menu="vada";
		switch(menu) {
		case "idly":System.out.println("It cost Rs10");break;
		case "dosa":System.out.println("It cost Rs20");break;
		case "vada":System.out.println("It cost Rs5");break;
		case "pongal":System.out.println("It cost Rs30");break;
		default:System.out.println("Its time to order");break;
		
		}
	}

}
