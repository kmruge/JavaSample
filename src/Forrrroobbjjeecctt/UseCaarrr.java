package Forrrroobbjjeecctt;

public class UseCaarrr {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="BMW";
		c1.colour="RED";
		c1.price=1500000;
		
		Car c2=new Car();
		c2.brand="AUDI";
		c2.colour="BLUE";
		c2.price=1700;
		
		Car c3=new Car();
		c3.brand="FERRARI";
		c3.colour="ORRANGE";
		c3.price=2000;
		
		Car c4=new Car();
		c4.brand="MISTRUBUSHI";
		c4.colour="GREEN";
		c4.price=1800;
		
		Car c5=new Car();
		c5.brand="FORD";
		c5.colour="APPLE GREEN";
		c5.price=1575;
		
		Car c6=new Car();
		c6.brand="MARUTI SUZUKI";
		c6.colour="GREY";
		c6.price=1500;
		
		Car c7=new Car();
		c7.brand="TATA";
		c7.colour="WHITE";
		c7.price=4500;
		
		Car c8=new Car();
		c8.brand="MAHENDRA";
		c8.colour="PEARL WHITE";
		c8.price=3500;
		
		Car c9=new Car();
		c9.brand="CITRION";
		c9.colour="BLACK";
		c9.price=3500;
		
		Car c10=new Car();
		c10.brand="KIA";
		c10.colour="METAL BLACK";
		c10.price=5000;
		
		Car[] c={c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
		
		//for(int i=0;i<c.length;i++) {

			//System.out.println(c[i].brand+" Lower Case is "+c[i].brand.toLowerCase());
			//System.out.println(c[i].brand.toUpperCase());
		//}
		for(int i=c.length/2;i<c.length;i++) {
			System.out.println(c[i].brand+" "+c[i].colour+" "+c[i].price);
		}
	}

}
