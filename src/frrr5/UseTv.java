package frrr5;

public class UseTv {

	public static void main(String[] args) {
		Tv t1=new Tv();
		Tv t2=new Tv();
		Tv t3=new Tv();
		
		t1.brand="ONIDA";
		t1.price=40000;
		
		t2.brand="SAMSUNG";
		t2.price=45000;
		
		t3.brand="SONY";
		t3.price=60000;
		int max=0;
		String a="";
		
		Tv[] t= {t1,t2,t3};
		
		for(int i=0;i<t.length;i++) {
			
			if(t[i].price>max) {
				max=t[i].price;
				a=t[i].brand;
			}
		}System.out.println(max-max*10/100+" ,"+a);
		
		
	}

}
