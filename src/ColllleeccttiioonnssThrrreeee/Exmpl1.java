package ColllleeccttiioonnssThrrreeee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exmpl1 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(23);
		al.add(32);
		al.add(44);
		al.add(45);
		al.add(55);
		
		List<Integer> l=al.stream().map((y)->y+10).collect(Collectors.toList());
		System.out.println(l);
		for(Integer c:l) {
			System.out.println(c);
		}
		l.forEach((f)->System.out.println(f));
		List<Boolean> bb=l.stream().map((m)->m>30).collect(Collectors.toList());
		
		for(Boolean g:bb) {
			System.out.println(g);
		}
	}

}
