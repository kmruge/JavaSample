package Oooops;

public class UseGovt {

	public static void main(String[] args) {

		Private p=new Private();
		System.out.println("GOVERNMENT : "+p.FindInterestaAmt(6000));
		Govt g=new Govt();
		System.out.println("PRIVATE : "+g.FindInterestaAmt(6000));
		Bank b=new Bank();
		System.out.println("COMMON : "+b.FindInterestaAmt(6000));
	}

}
