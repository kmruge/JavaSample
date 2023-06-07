package Day6;

public class Temp1 {
	public static void main(String[] args) {
		int tmp1= 25;
		
		if((tmp1>=16)&&(tmp1<=20)) {
			System.out.println("the temprature is low");
		}
		else if((tmp1>=20)&&(tmp1<=25)) {
			System.out.println("the temperature is average");
		}
		else if((tmp1>=25)&&(tmp1<=30)) {
			System.out.println("the temperatue is high");
			
		}
		else {
			System.out.println("the ac is plugged off");
		}
	}

}


