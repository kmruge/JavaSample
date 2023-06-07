package ColllleeccttiioonnssThrrreeee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exmpl4 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(13);
		al.add(20);
		al.add(50);
		al.add(35);
		al.add(45);
		List<Integer> li=al.stream().filter(a->a>=15).map(b->b).collect(Collectors.toList());
		System.out.println(li);
		li.forEach(c->System.out.println(c));
	}

}
