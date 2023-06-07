package Day6;

public class vowee {

	public static void main(String[] args) {
		String b="rAm";
		String a=b.toLowerCase();
		if (a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
			System.out.println("vowels exists");
		}
		else {
			System.out.println("vowels not exists");
		}
	}

}
