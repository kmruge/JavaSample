package Oooopone;

public class College {
	private String name;
	private int code;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getCode() {
		return code;
	}
	public void setName(int code) {
		this.code=code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	College(String name, int code, String type){
		this.name=name;
		this.code=code;
		this.type=type;
	}
		public String toString() {
			return "NAME"+name+" COde "+code+" type "+type;
					}
	}


