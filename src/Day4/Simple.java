package Day4;

public class Simple {

	public static void main(String[] args) {
		String[] word=args[0].split(",");
		int a=Integer.parseInt(word[0]);
		String b=(word[1]);
		float c=Float.parseFloat(word[2]);
		boolean d=Boolean.parseBoolean(word[3]);
		long e=Long.parseLong(word[4]);
		double f=Double.parseDouble(word[5]);
		System.out.println(a+"  "+b+"  "+c+"  "+d+"  "+e+"  "+f);
		
		
	}

}
