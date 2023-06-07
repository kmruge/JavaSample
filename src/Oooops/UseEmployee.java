package Oooops;

public class UseEmployee {
	public static void main(String[] args) {
		Doctor d=new Doctor();
		System.out.println("DOCTOR WITH NO TAX: "+d.FindNetSalary(25000));
		
		SoftwareEngineer s=new SoftwareEngineer();
		System.out.println("SOFTWARE ENGINEER WITH 10 PERCENT TAX : "+s.FindNetSalary(25000));
		
		Architechture a=new Architechture();
		System.out.println("Architechture WITH 8 PERCENT TAX:  "+a.FindNetSalary(25000));
		
	}

}
