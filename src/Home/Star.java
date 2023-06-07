package Home;

public class Star {

	public static void main(String[] args) {
		
		int num=Integer.parseInt(args[0]);
		int a=0; int i=0; int b=0;
		while(i<=num) {
			a=a+i;
			b=b+a;
			i++;
	}
		System.out.println(b);
	

}
}