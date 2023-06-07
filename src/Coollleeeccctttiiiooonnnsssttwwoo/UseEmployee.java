package Coollleeeccctttiiiooonnnsssttwwoo;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"THIRU");
		Employee e2=new Employee(102,"MURUGAN");
		Employee e3=new Employee(103,"MANI");
		Employee e4=new Employee(104,"KARTHIK");
		Employee e5=new Employee(105,"KEERTHANA");
		Employee e6=new Employee(106,"SRUTHIKA");
		Employee e7=new Employee(107,"MOHAN");
		Employee e8=new Employee(108,"USHA");
		Employee e9=new Employee(109,"MASI");
		Employee e10=new Employee(110,"AMSU");
		
		HashMap<Integer,Employee> emp=new HashMap<>();
		emp.put(e1.getId(),e1);
		emp.put(e2.getId(),e2);
		emp.put(e2.getId(),e3);
		emp.put(e4.getId(),e4);
		emp.put(e5.getId(),e5);
		emp.put(e6.getId(),e6);
		emp.put(e7.getId(),e7);
		emp.put(e8.getId(),e8);
		emp.put(e9.getId(),e9);
		emp.put(e10.getId(),e10);
		Iterator itr=emp.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator its=emp.values().iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		emp.forEach((a,b)-> {if(a>105) {
			System.out.println(b);
		}
		});
		emp.forEach((a,b)-> {if(b.getId()==106) {
			System.out.println(b);
		}});
		Iterator ita=emp.values().iterator();
		while(ita.hasNext()) {
			Employee e=(Employee) ita.next();
			if(e.getName().equalsIgnoreCase("THIRU")) {
				System.out.println(e);
			}
		}
	}

}
