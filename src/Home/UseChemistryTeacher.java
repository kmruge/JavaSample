package Home;

public class UseChemistryTeacher {

	public static void main(String[] args) {
		String designation=args[0];
		String collegeName=args[1];
		String working=args[2];
		String mainSubject=args[3];
		
		ChemistryTeacher c=new ChemistryTeacher(designation,collegeName);
		System.out.println(c.does(working));
		System.out.println(c.mainSubject(mainSubject));
		System.out.println(c.getDesignantion());
		System.out.println(c.getCollegeName());
	}

}
