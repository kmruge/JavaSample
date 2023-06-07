package Intrview;

public class Srt {
	private String name;
	private String gender;
	private int age;
	private boolean isWorking;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMale() {
		return gender;
	}
	public void setMale(String male) {
		this.gender = male;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isWorking() {
		return isWorking;
	}
	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	public Srt(String name, String gender, int age, boolean isWorking) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.isWorking = isWorking;
	}
	@Override
	public String toString() {
		return "Srt [name=" + name + ", Gender=" + gender + ", age=" + age + ", isWorking=" + isWorking + "]";
	}
	


}
