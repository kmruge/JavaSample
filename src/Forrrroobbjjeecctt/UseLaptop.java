package Forrrroobbjjeecctt;

public class UseLaptop {

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="ACER";
		l1.chargerType='A';
		l1.price=1000;
		
		Laptop l2=new Laptop();
		l2.brand="DELL";
		l2.chargerType='B';
		l2.price=900;
		
		Laptop l3=new Laptop();
		l3.brand="HP";
		l3.chargerType='C';
		l3.price=950;
		
		Laptop l4=new Laptop();
		l4.brand="LENOVO";
		l4.chargerType='C';
		l4.price=957;
		
		Laptop l5=new Laptop();
		l5.brand="XIOMI";
		l5.chargerType='B';
		l5.price=987;
		
		Laptop l6=new Laptop();
		l6.brand="REALME";
		l6.chargerType='D';
		l6.price=999;
		Laptop[] l= {l1,l2,l3,l4,l5,l6};
		int a=0;
		int count=0;
		for(int i=0;i<l.length;i++) {
			a=a+l[i].price;
		}
		System.out.println("the total price of all Laptop is"+a);
	
		for(int i=0;i<l.length/2;i++) {
			a=a+l[i].price;
		}
		System.out.println("the total of FRST HALF is"+a);
		
		for(int i=l.length/2;i<0;i++) {
			a=a+l[i].price;
		}
		System.out.println("the second half is"+a);
		
		for(int i=0;i<l.length;i++) {
		System.out.println("the Charger type of all Laptop is"+l[i].chargerType);
		}
		for (int i=0;i<l.length;i++) {
			count++;
		}
			System.out.println("COUNT OF BRAND"+count);
			for (int i=0;i<l.length;i++) {
				
				System.out.println(l[i].price+l[i].price*1000/100);
			}
			
	}
	}

	

