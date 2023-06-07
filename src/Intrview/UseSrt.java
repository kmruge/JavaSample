package Intrview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseSrt {

	public static void main(String[] args) {
		Srt s1=new Srt("THIRU","MALE",-1,true);
		Srt s2=new Srt("MALA","FEMALE",23,false);
		Srt s3=new Srt("KAALA","FEMALE",24,true);
		Srt s4=new Srt("SHEELA","FEMALE",25,false);
		Srt s5=new Srt("ARUN","MALE",-26,true);
		Srt s6=new Srt("THANAPAL","MALE",28,false);
		Srt s7=new Srt("STALIN","MALE",29,true);
		ArrayList<Srt> s=new ArrayList<>();
		s.add(s7);
		s.add(s6);
		s.add(s5);
		s.add(s4);
		s.add(s3);
		s.add(s2);
		s.add(s1);
		
		List<Srt> ss=s.stream().filter(f->f.isWorking()==true).sorted(Comparator.comparing(Srt::getAge).reversed()).collect(Collectors.toList());
		
		for(Srt c:ss) {
			System.out.println(c);
		}
		
	}

}
