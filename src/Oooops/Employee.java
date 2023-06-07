package Oooops;

public class Employee {
	public int FindNetSalary(int salary) {
		return salary-salary*5/100;
	}

}
class Doctor extends Employee {
	public int FindNetSalary(int salary) {
		return salary;
	}

}
class SoftwareEngineer extends Employee {
	public int FindNetSalary(int salary) {
		return salary-salary*10/100;
	}

}
class Architechture extends Employee {
	public int FindNetSalary(int salary) {
		return salary-salary*8/100;
	}

}
