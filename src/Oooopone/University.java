package Oooopone;

public class University {
	private String name;
	private String location;
	private College college;
	
	public String getName() {
		return location;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college=college;
	}
	University(String name, String location, College college){
		this.name=name;
		this.location=location;
		this.college=college;
	}
	public String toString() {
		return "COLLEGE NAME"+name+" LOCATION "+location+" COLLEGE "+college;
	}
}
