package Day4;

public class New {

	public static void main(String[] args) {
		String name=args[0];
		int age=Integer.parseInt(args[1]);
		int weight=Integer.parseInt(args[2]);
		long number=Long.parseLong(args[3]);
		double accbal=Double.parseDouble(args[4]);
		boolean ismale=Boolean.parseBoolean(args[5]);
		System.out.println(name+" "+age+" "+weight+" "+number+" "+accbal+" "+ismale);
	}

}
