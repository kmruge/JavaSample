package Home;

public class Teacher {
	private String designation;
	private String collegeName;
	
	public String getDesignantion() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName=collegeName;
	}
	public String does(String work) {
		return work;
	}
	Teacher(String designation,String collegeName){
		this.designation=designation;
		this.collegeName=collegeName;
	}
	public String toString() {
		return designation+" "+collegeName;
	}

}

