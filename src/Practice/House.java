package Practice;


public interface House {
	String owener();
	default String rent(String a)
	{
		return a;
	}
	public static int payment(int a)
	{
		return a;
	}
}
class House1 implements House {
	public String owener()
	{
		return ("I am the owener of house");

	}
	public String rent(String a)
	{
		return "Arun";
	}
	
	public static void main(String[] args) {
		House1 h=new House1();
		System.out.println(h.rent("1000"));
		System.out.println(House.payment(20000));
		System.out.println(h.owener());
	}
}
