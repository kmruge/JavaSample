package clctionsone;

public class Employee {
	private String name;
	private int id;
	private String gender;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	Employee(String name, int id, String gender, int salary){
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.salary=salary;
	}
	public String toString() {
		return "NAME : "+name+" ID : "+id+" SALARY : "+salary+" GENDER : "+gender;
	}

}
