package Oooopthree;

public class UseBus {

	public static void main(String[] args) {
		Bus bs=new Bus();
		String a="BLOW";
		int b=120;
		String c="POWER BRAKE";
		int d=4;
		String e="POWER";
		int f=1200;
		System.out.println(bs.accelator(e)+" "+bs.brake(c)+bs.engineCc(f)+bs.horn(a)+bs.speed(b)+bs.tyre(d));
}
}