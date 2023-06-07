package ColllleeccttiioonnssThrrreeee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exmpl3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("JAVA");
		al.add("C++");
		al.add("JAVA SCRIPT");
		al.add("ANGULAR JAVA");
		List<String> l1=al.stream().filter(a->a.startsWith("J")).collect(Collectors.toList());
		for(String b:l1) {
			System.out.println(b);
		}
		for(String c:l1) {
			System.out.println(c.length());
		}
		for(String d:l1) {
			if(d.length()<=4) {
				System.out.println(d);
			}
		}
	}

}
