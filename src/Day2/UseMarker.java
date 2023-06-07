package Day2;

public class UseMarker {

	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.color="blue";
		m1.size=8;
		m1.prize=100;
		m1.brand="cello";
		m1.isWriting=true;
		m1.discount=20;
		m1.tax=2;
		m1.netPrize=m1.prize-m1.discount+m1.tax;
		System.out.println(m1.color+" "+m1.size+" "+m1.prize+" "+m1.brand+" "+m1.isWriting+" "+m1.discount+" "+m1.netPrize);
		Marker m2=new Marker();
		m2.color="red";
		m2.size=6;
		m2.prize=100;
		m2.brand="parker";
		m2.isWriting=true;
		m2.discount=20;
		m2.tax=4;
		m2.netPrize=m2.prize-m2.discount+m2.tax;
		System.out.println("color"+m2.color+" Size-"+m2.size+" Prize-"+m2.prize+" Brand name-"+m2.brand+" Is writing-"+m2.isWriting+" discount-"+m2.discount+"net.prize-"+m2.netPrize);
	}

}
