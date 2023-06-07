package Intrview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Fruit {
	public static void main(String[] args) {
		String[] fruits= {"Apple","Orrange","pomo","Green Apple","Lemon","Pineapple"};
		List<String> s=new ArrayList<>();
		for(int i=0;i<fruits.length;i++) {
			s.add(fruits[i]);
		}
//		System.out.println(s);
//		Collections.sort(s, Collections.reverseOrder()); 
//		System.out.println(s);
		List<String> a=s.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(a);
		
	}

}
