package clctionsone;

import java.util.ArrayList;

public class Exmple2 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("THIRU");
		a.add("MURUGAN");
		a.add("VARMA");
		a.add("ARUN");
		a.add("NAVIN");
		a.add("RAMBO");
		for(int i=a.size()-1;i>=0;i--) {
			if(a.get(i).equals("RAMBO")) {
				System.out.println(a.get(i));
			}
			else {
			System.out.println("NOT MATCH");
		}
		}
		for(String b:a) {
			if(b.equals("THIRU")) {
				System.out.println("THIRU MURUGAN");
			}
			else {
				System.out.println("NO MATCH");
			}
		}
		a.forEach((c)->
		System.out.println(c));
	}

}
