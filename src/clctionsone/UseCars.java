package clctionsone;

import java.util.ArrayList;

public class UseCars {

	public static void main(String[] args) {
		Cars c1=new Cars("SWIFT",200000,"RED",1200);
		Cars c2=new Cars("Ford",250000,"BLUE",1000);
		Cars c3=new Cars("MISTRUBISHI",150000,"ORRANGE",900);
		Cars c4=new Cars("KIA",180000,"BLACK",1500);
		Cars c5=new Cars("TOYOTA",200000,"WHITE",1700);
		Cars c6=new Cars("Ford",25000,"GREEN",1800);
		Cars c7=new Cars("Swift",280000,"WHITE",1900);
		Cars c8=new Cars("KIA",2500000,"RED",1800);
		Cars c9=new Cars("HYNDAI",280000,"RED",2000);
		Cars c10=new Cars("TATA",260000,"RED",1500);
		ArrayList<Cars> c=new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(c6);
		c.add(c7);
		c.add(c8);
		c.add(c9);
		c.add(c10);
		
		for(int i=0;i<c.size();i++) {
			System.out.println(c.get(i));
		}
		for(Cars d:c) {
			if(d.getEngineCapacity()>1500) {
				System.out.println(d.getBrand());
			}
		}
		
	}

}
