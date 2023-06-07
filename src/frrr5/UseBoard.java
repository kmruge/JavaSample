package frrr5;

public class UseBoard {

	public static void main(String[] args) {
		Board b1=new Board();
		Board b2=new Board();
		Board b3=new Board();
		
		b1.name="white";
		b1.price=1500;
		
		b2.name="black";
		b2.price=1700;
		
		b3.name="green";
		b3.price=2000;
		
		Board[] b= {b1,b2,b3};
		for(Board bd:b) {
			if(bd.name.equalsIgnoreCase("white")) {
				System.out.println("Board color: "+bd.name+" Price: "+bd.price);
			}
		}
	}

}
