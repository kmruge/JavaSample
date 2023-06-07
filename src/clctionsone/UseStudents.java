package clctionsone;

import java.util.ArrayList;

public class UseStudents {

	public static void main(String[] args) {
		Students s1=new Students("THIRU",499,123,true);
		Students s2=new Students("MURUGAN",450,124,true);
		Students s3=new Students("RAMBO",350,125,true);
		Students s4=new Students("ROCKY",451,126,true);
		Students s5=new Students("VIKRAM",250,127,false);
		Students s6=new Students("ANIL",150,128,false);
		Students s7=new Students("MADDY",170,129,false);
		Students s8=new Students("RAM",190,130,false);
		Students s9=new Students("JAANU",120,131,false);
		Students s10=new Students("KANMANI",120,132,false);
		
		ArrayList<Students> s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.add(s7);
		s.add(s8);
		s.add(s9);
		s.add(s10);
		for(Students a:s) {
		for(char i='A';i<i+26;i++) {
			if(a.getName().charAt(0)==i) {
				System.out.println(a);
				continue;
			}
		}
			
			
		}
	}

}
