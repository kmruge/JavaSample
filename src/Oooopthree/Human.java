package Oooopthree;

public interface Human {
	public void eat();
	public void sleep();

}
abstract class Employee implements Human {
	String name;
	int salaryPerHr;
	
	abstract int calculateSalary(int salaryPerHr, int workinghr);
	Employee(String name, int salaryPerHr){
		this.name=name;
		this.salaryPerHr=salaryPerHr;
	}
	public String toString() {
		return name+" "+salaryPerHr;
	}
}
class Programmer extends Employee {
	int workinghr;
	public void eat() {
		System.out.println("EATING");
	}
	public void sleep() {
		System.out.println("SLEEPING");
	}
	public int calculateSalary(int salaryPerHr,int workinghr) {
		return salaryPerHr*workinghr;
	}
	Programmer(String name, int salaryPerHr, int workinghr){
		super(name,salaryPerHr);
				this.workinghr=workinghr;
	}
	public String toString() {
		return super.toString()+" "+workinghr;
	}
}
