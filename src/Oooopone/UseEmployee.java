package Oooopone;

public class UseEmployee {

	public static void main(String[] args) {
		Address a=new Address();
		a.area="KALLAKURICHI";
		a.doorNo=12;
		a.Street="SRP NAGAR";
		a.nearby="xy school";
		a.pinCode=600203;
		
		Family f=new Family();
		f.father="MUTHU";
		f.mother="KHATIJA";
		f.siblings="NO";
		f.grandma="KANMANI";
		f.grandpa="KARUPPU";
		
		Employee e=new Employee();
		e.id=1234;
		e.name="RAMBO";
		e.salary=50000;
		e.address=a;
		e.family=f;
		e.gender="MALE";
		
		Employee e1=new Employee();
		e1.name="ANNAMALAI";
		e1.gender="MALE";
		
		
		System.out.println(" ID= "+e.id+" EMP NAME= "+e.name+" GENDER= "+e.gender+" EMP SALARY= "+e.salary+" EMP ADDRESS, DOOR NO= "+e.address.doorNo+" STREET= "+e.address.Street+" NEARBY= "+e.address.nearby+" PINCODE= "+e.address.pinCode);
		System.out.println("FATHER="+e.family.father+" MOTHER= "+e.family.mother+" SIBLINGS "+e.family.siblings+" GRANDPA= "+e.family.grandpa+" GRANDMA "+e.family.grandma);
		
	}

}
