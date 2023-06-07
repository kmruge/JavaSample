package Oooopthree;

public class UseCat {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		c.walk();
		c.sleep();
		c.sound();
		System.out.println(c.eat()+c.sleep()+c.sound()+c.walk());
	}

}
