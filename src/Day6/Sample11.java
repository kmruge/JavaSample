package Day6;

public class Sample11 {

	public static void main(String[] args) {
		String game="Gothenberg";
		String name=game.toLowerCase();
		if (name.startsWith("g")&&name.endsWith("g")) {
			System.out.println("starts and ends with g");
			
		}
		else {
			System.out.println("not starts and ends with g");
		}
	} 
	

}
