package Coollleeeccctttiiiooonnnsssttwwoo;

import java.util.HashMap;

public class Exmpl1 {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<>();
		h.put(11, "RAMBO");
		h.put(12,"KHATIJA");
		h.put(13,"KANMANI");
		h.put(14, "ROCKY");
		
		
		for(Integer s: h.keySet()) {
			System.out.println(s);
			
		}
		for(String f:h.values()) {
			System.out.println(f);
		}
		h.forEach((x,z)->System.out.println(x+","+z));
	}

}
