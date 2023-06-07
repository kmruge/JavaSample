package Oooopone;

public class UseUniversity {

	public static void main(String[] args) {
		College c=new College("SSN",2502,"ENGG");
		University u=new University("ANNA UNIV","CHENNAI",c);
		System.out.println(u);
	}

}
