package Coollleeeccctttiiiooonnnsssttwwoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UseStudents {

	public static void main(String[] args) {
		Students s1=new Students("Murugan",101,"MALE",'A',89);
		Students s2=new Students("THIRU",102,"MALE",'B',75);
		Students s3=new Students("Pradhap",103,"MALE",'C',70);
		Students s4=new Students("mayil",104,"FEMALE",'A',65);
		Students s5=new Students("kuzhal",105,"FEMALE",'B',60);
		Students s6=new Students("keerthi",106,"FEMALE",'C',99);
		Students s7=new Students("arun",107,"MALE",'A',35);
		Students s8=new Students("vijay",108,"MALE",'B',45);
		Students s9=new Students("siva",109,"MALE",'C',12);
		Students s10=new Students("ritika",110,"FEMALE",'A',45);
		
		HashMap<Integer,Students> stu=new HashMap<>();
		stu.put(s1.getId(), s1);
		stu.put(s2.getId(), s2);
		stu.put(s3.getId(), s3);
		stu.put(s4.getId(), s4);
		stu.put(s5.getId(), s5);
		stu.put(s6.getId(), s6);
		stu.put(s7.getId(), s7);
		stu.put(s8.getId(), s8);
		stu.put(s9.getId(), s9);
		stu.put(s10.getId(),s10);
		ArrayList<Students> ssMale=new ArrayList<>();
		ArrayList<Students> ssFemale=new ArrayList<>();
		ArrayList<Students> seca=new ArrayList<>();
		ArrayList<Students> secb=new ArrayList<>();
		ArrayList<Students> secc=new ArrayList<>();
		ArrayList<Integer> mrkk=new ArrayList<>();
		ArrayList<Students> sa=new ArrayList<>();
		

		for(Students w:stu.values()) {
			if(w.getGender().contentEquals("MALE")) {
				ssMale.add(w);
			}
			else {
				ssFemale.add(w);
			}
		}
		for(Students x:ssMale) {
			System.out.println("MALE : "+x);
		}
		for(Students y: ssFemale) {
			System.out.println("FEMALE : "+y);
		}
		stu.forEach((a,b)->{ 
			if(b.getMark()>85) {
				mrkk.add(a);
			}
			
		});
		for(Students l:stu.values()) {
			if(l.getSection()=='A') {
				seca.add(l);
			}
			else if(l.getSection()=='B') {
				secb.add(l);
			}
			else {
				secc.add(l);
			}
			
		}
		for(Students k:seca) {
			System.out.println("A SECTION: "+k);
		}
		for(Students v:seca) {
			System.out.println("B SECTION : "+v);
		}
		for(Students m:seca) {
			System.out.println("C SECTION: "+m);
		}
		for(Integer g: mrkk) {
			System.out.println("MARKS ABOVE 85 "+g);
		}
		
		Iterator itr=stu.values().iterator();
		while(itr.hasNext()) {
			Students stt=(Students)itr.next();
			if(stt.getName().startsWith("k")) {
				sa.add(stt);
			}
		}
		sa.forEach((c)-> System.out.println(c));
	}

}


