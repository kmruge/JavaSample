package fnctnclls;

public class Vowls {
	public String vowels(String a) {
		if(a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
			return (a+ " Contains vowels");
		}
		else 
		{
			return (a+" No vowels");
		}
	}

	public static void main(String[] args) {
		Vowls v=new Vowls();
		String a="THIRU MURUGAN".toLowerCase();
		System.out.println(v.vowels(a));
	}
}
