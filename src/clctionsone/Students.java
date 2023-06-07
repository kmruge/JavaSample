package clctionsone;

public class Students {
	private String name;
	private int marks;
	private int id;
	private boolean isPass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public boolean getIsPass() {
		return isPass;
	}
	public void setIsPass(boolean isPass) {
		this.isPass=isPass;
	}
	Students(String name,int marks, int id, boolean isPass){
		this.name=name;
		this.id=id;
		this.marks=marks;
		this.isPass=isPass;
	}
	public String toString() {
		return "Name= "+name+" ID NUMBER= "+id+" MARKS= "+marks+" IS PASS= "+isPass;
	}

}
