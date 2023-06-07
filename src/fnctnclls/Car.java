package fnctnclls;

public class Car {
	public int add(int a,int b) {
		return a+b;
	}
		public String getName(String a, String b) {
			return a+" "+b;
		}
		public float money(float a,int b) {
			return a-b;
			
		}
		public boolean today(boolean a) {
			return a;
		}
		public void show(char a, int b, float c, String d) {
			System.out.println(a+" "+b+" "+c+" "+d);
		}
		public static void main(String[] args) {
			Car c=new Car();
			System.out.println(c.add(2, 3));
	System.out.println(c.money(23.5f, 8));
		System.out.println(c.today(true));
	    c.show('C',20,25.3f, "THIRU");
		System.out.println(c.getName("THIRU","murugan"));
		}
	
}