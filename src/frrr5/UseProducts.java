package frrr5;

public class UseProducts {

	public static void main(String[] args) {
		Products p1=new Products();
		Products p2=new Products();
		Products p3=new Products();
		Products p4=new Products();
		Products p5=new Products();
		Products p6=new Products();
		Products p7=new Products();
		Products p8=new Products();
		Products p9=new Products();
		Products p10=new Products();
		
		p1.brand="BRITANIA";
		p1.expiryDate="23.03.2022";
		p1.productType="BISCUIT";
		p1.price=20;
		
		p2.brand="DIARY MILK";
		p2.expiryDate="23.05.2024";
		p2.productType="CHOCLATE";
		p2.price=45;
		
		p3.brand="AACHI";
		p3.expiryDate="20.01.2023";
		p3.productType="POWDER";
		p3.price=55;
		
		p4.brand="WONDERLA";
		p4.expiryDate="24.01.2023";
		p4.productType="CAKE";
		p4.price=25;
		
		p5.brand="GOLD WINNER";
		p5.expiryDate="28.06.2023";
		p5.productType="OIL";
		p5.price=180;
		
		p6.brand="SUN FLOWER";
		p6.expiryDate="23.03.2023";
		p6.productType="OIL";
		p6.price=200;
		
		p7.brand="LAYS";
		p7.expiryDate="23.03.2023";
		p7.productType="CHIPS";
		p7.price=10;
		
		p8.brand="BINGO";
		p8.expiryDate="01.02.2023";
		p8.productType="CHIPS";
		p8.price=25;
		
		p9.brand="ARB";
		p9.expiryDate="23.03.2022";
		p9.productType="GHEE";
		p9.price=20;
		
		p10.brand="TIGER";
		p10.expiryDate="23.03.2022";
		p10.productType="Biscuit";
		p10.price=25;
		int a=0;
	
	Products[] p= {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
	for (int i=0;i<p.length;i++) 
	{
		a=a+p[i].price;
	
		
		if(p[i].productType.equalsIgnoreCase("oil")) {
			System.out.println(p[i].brand+" "+p[i].expiryDate+" "+p[i].price+" "+p[i].productType);
		}
	
	
	
	
	
	
	}
	
	
	
	
	}

}
