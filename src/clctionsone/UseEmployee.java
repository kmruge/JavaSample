package clctionsone;

import java.util.ArrayList;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("RAM",001,"male",18000);
		Employee e2=new Employee("thiru",002,"male",10000);
		Employee e3=new Employee("murugan",003,"male",18000);
		Employee e4=new Employee("mohana",004,"female",17000);
		Employee e5=new Employee("harish",005,"male",13000);
		Employee e6=new Employee("kumari",006,"female",14000);
		Employee e7=new Employee("karthika",007,"female",13000);
		Employee e8=new Employee("usha",8,"female",20000);
		Employee e9=new Employee ("JUPI",9,"FEMALE",21000);
		
		ArrayList<Employee> e=new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		e.add(e6);
		e.add(e7);
		e.add(e8);
		e.add(e9);
		
		ArrayList<Employee> fmale=new ArrayList<>();
		
		for(int i=0;i<e.size();i++) {
			if(e.get(i).getGender().equalsIgnoreCase("feMALE")&&e.get(i).getSalary()>15000) {
				fmale.add(e.get(i));
			}
		}
		for(int i=0;i<fmale.size();i++) {
			System.out.println(fmale.get(i));
		}
		
	}

}
