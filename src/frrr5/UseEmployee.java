package frrr5;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		Employee e5=new Employee();
		
		
		e1.name="Thiru";
		e1.age=25;
		e1.gender="Male";
		e1.id=4001;
		e1.salary=15000;
		
		e2.name="Murugan";
		e2.age=26;
		e2.gender="male";
		e2.id=4002;
		e2.salary=20000;
		
		e3.name="KHATIJA";
		e3.age=26;
		e3.gender="female";
		e3.id=4003;
		e3.salary=26000;
		
		e4.name="KANMANI";
		e4.age=27;
		e4.gender="female";
		e4.id=4004;
		e4.salary=35000;
		
		e5.name="RAMBO";
		e5.age=28;
		e5.gender="male";
		e5.id=4005;
		e5.salary=40000;
		Employee[] e= {e1,e2,e3,e4,e5};
		
		Employee emp=null;
		
		for(int i=0;i<e.length;i++) {
			if(e[i].salary>10000&&e[i].salary<25000) {
				System.out.println("LESS THAN 2500"+e[i].name);
			}
			else if(e[i].salary>25000) {
				System.out.println("more than 25000"+e[i].name);
			}
			
		}
		for(int i=0;i<e.length;i++) {
			if(e[i].id==4004) {
				emp=e[i];
				
				
			}
		}System.out.println(emp.name+" "+emp.age+" "+emp.id+" "+emp.salary+" "+emp.gender);
	}

}
