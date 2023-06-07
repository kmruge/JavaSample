package Home;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"thiru","java","Male",23);
		Student s2=new Student(102,"priya","Html","female",25);
		Student s3=new Student(103,"Gopika","Java","female",26);
		Student s4=new Student(104,"gokul","C++","male",27);
		Student s5=new Student(105,"keethi","Java","female",31);
		
		ArrayList<Student> s=new ArrayList<>();
		s.add( s1);
		s.add(s2);
		s.add(s3);
		s.add( s4);
		s.add(s5);
		
		//System.out.println(s);
		
		Map<Integer,Student> hm=s.stream().collect(Collectors.toMap(x-> x.getAge(), y-> y));
		for(Integer gj:hm.keySet()) {
			System.out.println(gj);
		}
		
		
		
	}

}
