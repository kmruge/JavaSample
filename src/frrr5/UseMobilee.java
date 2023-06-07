package frrr5;

public class UseMobilee {

	public static void main(String[] args) {
		Mobilee m1=new Mobilee();
		Mobilee m2=new Mobilee();
		Mobilee m3=new Mobilee();
		
		m1.brand="REALME";
		m1.price=2;
		m1.isAndroid=true;
		
		m2.brand="IPHONE";
		m2.price=40;
		m2.isAndroid=false;
		
		m3.brand="OPPO";
		m3.price=18000;
		m3.isAndroid=true;
		
		Mobilee[] m={m1,m2,m3};
		
		int max=0;
		String n="";
		boolean b=false;
		int smax=0;
		
		for(int i=0;i<m.length;i++) {
			
			if(m[i].price>max) {
				
				smax=max;
				max=m[i].price;
				
			}
			else if(m[i].price>smax) {
				smax=m[i].price;
				n=m[i].brand;
				b=m[i].isAndroid;
			}
		
		System.out.println(smax+""+n+""+b);
		}
		
		
	}
}


