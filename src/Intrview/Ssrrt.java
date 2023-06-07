package Intrview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ssrrt {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String s1=scanner.nextLine();
		String s2=scanner.nextLine();
		String s3=scanner.nextLine();
		String[] s4= {s1,s2,s3};
		List<String>list=new ArrayList<>();
		list.add(s4[0]);
		list.add(s4[1]);
		list.add(s4[2]);
		List<String>s5=list.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
		s5.forEach(a->System.out.println(s5));

		
	}

}
