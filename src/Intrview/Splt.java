package Intrview;

public class Splt {

	public static void main(String[] args) {
		String str=new String("Hello-world-and-Vanakkam-Tamilnadu");
		for(String ss:str.split("\\W")) {
			System.out.println(ss);
		}
	}

}
