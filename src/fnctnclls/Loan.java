package fnctnclls;

public class Loan {
	public String cibilScore(int cibilscore) {
		if(cibilscore>=400&&cibilscore<500) {
			return ("poor");
		}
		else if(cibilscore>=500&&cibilscore<600) {
			return ("average");
		}
		else if(cibilscore>=600&&cibilscore<700) {
			return("GOOD");
		}
		else if(cibilscore>=700) {
			return("EXCELLENT");
		}
		else {
			return("INVALID");
		}
	}
	public void approval(String eligibility) {
		if(eligibility.equalsIgnoreCase("poor")) {
			System.out.println("NOT ELLIGIBLE");
		}
		else if(eligibility.equalsIgnoreCase("AVERAGE")) {
			System.out.println("TRY AFTER 3 MONTHS");
		}
		else if(eligibility.equalsIgnoreCase("GOOD")) {
			System.out.println("ELIGIBLE");
		}
		else if(eligibility.equalsIgnoreCase("excellent")) {
			System.out.println("PERFECTLY ELIGIBLE");
		}
		else {
			System.out.println("INVALID");
		}
		
	}
	public static void main(String[] args) {
		Loan l=new Loan();
		String cibilScore=l.cibilScore(500);
		l.approval(cibilScore);

	}

}
