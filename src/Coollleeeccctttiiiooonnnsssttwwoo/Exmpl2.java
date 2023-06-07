package Coollleeeccctttiiiooonnnsssttwwoo;

import java.util.HashMap;

public class Exmpl2 {

	public static void main(String[] args) {
		HashMap<Integer,Float> h=new HashMap<>();
		h.put(101, 12.5f);
		h.put(102,13.5f);
		h.put(103,14.5f);
		h.put(104, 15.5f);
		
		
		for(Integer s: h.keySet()) {
			System.out.println(s);
			
		}
		for(Float f:h.values()) {
			System.out.println(f);
		}
		h.forEach((x,z)->System.out.println(x+","+z));
	}

}
