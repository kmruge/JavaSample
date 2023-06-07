package Home;

public class ChemistryTeacher extends Teacher {
	public String does(String working) {
		return working;
	}
	public String mainSubject(String mainSubject) {
		return mainSubject;
	}
	ChemistryTeacher(String designation,String collegeName){
		super(designation,collegeName);
	}
	public String toString()
	{
		return super.toString();
	}

}
