package Coollleeeccctttiiiooonnnsssttwwoo;

import java.util.HashMap;

public class Exmpl3 {

	public static void main(String[] args) {
		HashMap<String,String> str=new HashMap<>();
		str.put("THIRU", "MURUGAN");
		str.put("ARUN", "KUMAR");
		str.put("KULOTHUNGA", "VARMA");
		str.put("NAVIN","KUMAR");
		for(String d:str.keySet()) {
			System.out.println(d);
		}
		for(String e:str.values()) {
			System.out.println(e);
		}
		str.forEach((a,b)->System.out.println(a+" "+b));
	}

}
