package Day2;

public class UseVegitable {

	public static void main(String[] args) {
		Vegitable v1=new Vegitable();	
		v1.name="carrot";
		v1.Taste="sweet";
		v1.kg=2;
		v1.prize=v1.kg*40;
		v1.isFresh=true;
		v1.size=1.5f;
		System.out.println("VEGITABLE -  "+v1.name+" TASTE - "+v1.Taste+"KILOGRAM"+v1.kg+"PRIZE"+v1.prize+"IS THE VEGITABE FRESH - "+v1.isFresh+"SIZE - "+v1.size);
		Vegitable v2=new Vegitable();	
		v2.name="chilli";
		v2.Taste="spice";
		v2.kg=3;
		v2.prize=v2.kg*50;
		v2.isFresh=true;
		v2.size=0.75f;
		System.out.println("VEGITABLE -  "+v2.name+" TASTE - "+v2.Taste+"KILOGRAM"+v2.kg+"PRIZE"+v2.prize+"IS THE VEGITABE FRESH - "+v2.isFresh+"SIZE - "+v2.size);
		Vegitable v3=new Vegitable();	
		v3.name="BEETROOT";
		v3.Taste="sweet";
		v3.kg=5;
		v3.prize=v3.kg*12;
		v3.isFresh=false;
		v3.size=2.5f;
		System.out.println("VEGITABLE -  "+v3.name+" TASTE - "+v3.Taste+"KILOGRAM"+v3.kg+"PRIZE"+v3.prize+"IS THE VEGITABE FRESH - "+v3.isFresh+"SIZE - "+v3.size);
		v3.initial='b';
		System.out.println(v3.initial+ " "+v3.initial+" "+v3.initial);


	}

}
