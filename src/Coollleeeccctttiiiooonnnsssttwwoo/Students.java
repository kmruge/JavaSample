package Coollleeeccctttiiiooonnnsssttwwoo;

public class Students {
	private int id;
	private String name;
	private String gender;
	private char section;
	private int mark;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section=section;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark=mark;
	}
	Students(String name, int id, String gender, char section,int mark ){
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.section=section;
		this.mark=mark;
	}
	public String toString() {
		return "NAME: "+name+" ID: "+id+", GENDER: "+gender+", SECTION:"+section+", MARK: "+mark;
	}

}
