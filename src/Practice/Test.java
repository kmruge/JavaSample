package Practice;

public class Test {
	static void checkStatic() {
		System.out.println("no need to create object");
	}
	public void checkNormalMethod() {
		System.out.println("Must create object");
	}
	public static void main(String[] args) {
		checkStatic();

	}

}
