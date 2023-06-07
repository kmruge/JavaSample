package frrr5;

public class UsePencil {

	public static void main(String[] args) {
		Pencil p1=new Pencil();
		Pencil p2=new Pencil();
		Pencil p3=new Pencil();
		
		p1.name="NATRAJA";
		p1.price=8;
		p1.material="wood";
		
		p2.name="APSARA";
		p2.price=10;
		p2.material="Plastic";
		
		p3.name="PENNCIL";
		p3.price=8;
		p3.material="metal";
		
		Pencil[] p= {p1,p2,p3};
		
		for(Pencil pl:p) {
			if(pl.material.equalsIgnoreCase("WOOD")) {
				System.out.println(pl.name+" "+pl.material+" "+pl.price);
			}
		}
		
		
	}

}
