package Coollleeeccctttiiiooonnnsssttwwoo;

import java.util.HashMap;

public class UseMarker {

	public static void main(String[] args) {
		Marker m1=new Marker("CELLO",100,true,"RED");
		Marker m2=new Marker("Renoylds",200,false,"Black");
		Marker m3=new Marker("Flair",300,true,"Blue");
		Marker m4=new Marker("Britto",300,false,"Black");
		Marker m5=new Marker("Parker",100,false,"Blue");
		
		HashMap<Integer,Marker> hm=new HashMap<>();
		hm.put(11, m1);
		hm.put(12,m2);
		hm.put(13, m3);
		hm.put(14, m4);
		hm.put(15, m5);
	int max=m2.getBrand().length();
//		for(Marker m:hm.values()) {
//			if(m.getColor().equalsIgnoreCase("BLUE")&&m.getIsRefillable()==true) {
//				System.out.println(m.getPrice());
//			}
//		}
//		for(Marker n:hm.values()) {
//			if(n.getBrand().contains("a")||n.getBrand().contains("e")||n.getBrand().contains("i")||n.getBrand().contains("o")||n.getBrand().contains("u")) {
//				System.out.println(n.getBrand().charAt(0)+" "+n.getBrand().charAt(n.getBrand().length()-1));
//			}
//		}
//		for(Marker o:hm.values()) {
//			System.out.println(o.getPrice()/10+"% is the discount percent of "+o.getBrand()+" And Price: "+o.getPrice());
//		}
//		hm.forEach((a,b)-> {
//			if(b.getPrice()>100) {
//				System.out.println(b.getBrand());
//			}
//		});
		for(Marker kl:hm.values()) {
			if(kl.getIsRefillable()==true) {
				System.out.println(kl.getPrice());
			
			}
			if(kl.getIsRefillable()==true&&kl.getBrand().contains("a")||kl.getBrand().contains("e")||kl.getBrand().contains("i")||kl.getBrand().contains("o")||kl.getBrand().contains("u")) {
				max=kl.getBrand().length();
			}
			
			if(kl.getBrand().length()>max) {
				max=kl.getBrand().length();;
			}
		}
	
		
		
	}

}


