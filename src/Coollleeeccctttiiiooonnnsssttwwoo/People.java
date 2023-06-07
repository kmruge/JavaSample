package Coollleeeccctttiiiooonnnsssttwwoo;

public class People {
	private String name;
	private int aadhar;
	private String city;
	private int salary;
	private String empType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAadhar() {
		return aadhar;
	}
	public void setAadhar(int aadhar) {
		this.aadhar=aadhar;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public String getEmpType() {
		return empType;
	}
	People(String name, int aadhar, String city, int salary, String empType){
		this.name=name;
		this.aadhar=aadhar;
		this.city=city;
		this.salary=salary;
		this.empType=empType;
	}
	public String toString() {
		return "NAME= "+name+" AADHAR NUMBER= "+aadhar+", CITY= "+city+", SALARY= "+salary+", EMP TYPE"+empType;
	}

}
