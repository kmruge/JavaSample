package Day6;

public class AcTemppp {
	public static void main(String[] args) {
	int actemp=16;
	if((actemp>=25)&&(actemp<=30)) {
		System.out.println("Low electricity bills");
	}
		else if((actemp>=20)&&(actemp<=25)) {
			System.out.println("Average electricity bills");
		}
		else if((actemp>=16)&&(actemp<=20)){
			System.out.println("High electricity bills");
		}
		else {
			System.out.println("plugged off");
}
}
	}