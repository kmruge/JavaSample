package clctionsone;

import java.util.ArrayList;
import java.util.Collections;

public class Exmpl3 {

	public static void main(String[] args) {

		ArrayList<String> m=new ArrayList<>();
		m.add("BANANA");
		m.add("APPLE");
		m.add("ORRANGE");
		m.add("POMO");
		m.add("STRAWBERRY");
		m.add("KIWI");
		
		ArrayList<String> v=new ArrayList<>(m);
		v.add("CARROT");
		v.add("BEETROOT");
		v.add("ONION");
		v.add("TOMATO");
		v.add("POTATO");
		v.add("MANGO");
		
		Collections.sort(v,Collections.reverseOrder());
		for(String a:v) {
		System.out.println(a);
		}
//		Collections.sort(v,Collections.reverseOrder());
//		System.out.println(v);
		
		
		}

}
