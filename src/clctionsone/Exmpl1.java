package clctionsone;

import java.util.ArrayList;

public class Exmpl1 {

	public static void main(String[] args) {
		ArrayList<Float> m=new ArrayList<>();
		m.add(1.55f);
		m.add(2.35f);
		m.add(3.5f);
		m.add(5.8f);
		m.add(4.7f);
	
		
		for(int i=0;i<m.size()-1;i++) {
			System.out.println(m.get(i)/2);
		}
		for(Float a:m) {
			System.out.println(a);
		}
		m.forEach((b)->System.out.println(b));
		
	}

}
