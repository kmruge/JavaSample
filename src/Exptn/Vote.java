package Exptn;

public class Vote {

	public static void main(String[] args)throws AgeException {
		int age=12;
		try {
		if(age>18) {
			System.out.println("Elligible");
		}
		else {
			throw new AgeException("not Elligble");
		}}catch(AgeException ae) {
			System.out.println(ae.getMessage());
		}
	}
	}


