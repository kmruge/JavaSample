package fnctnclls;

public class Swtch {
	public void capital(String a) {
		switch(a) {
		case "INDIA": System.out.println("DELHI"); break;
		case "USA": System.out.println("WASHINGTON"); break;
		case "UK": System.out.println("LONDON"); break;
		case "JAPAN": System.out.println("TOKYO"); break;
		case "CHINA": System.out.println("BEIGING"); break;
		default:System.out.println("INVALID DATA"); break;
		
	}


	}
	public static void main(String[] args) {
		Swtch s=new Swtch();
		String a="usa".toUpperCase();
		s.capital(a);
	}
}
