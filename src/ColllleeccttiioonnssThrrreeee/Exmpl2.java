package ColllleeccttiioonnssThrrreeee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exmpl2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Java");
		al.add("C++");
		al.add("PYTHON");
		al.add("JAVA SCRIPT");
		al.add("ANGULAR JAVA");
		List<Boolean> l1=al.stream().map(a->a.equals("Java")).collect(Collectors.toList());
		for(Boolean b:l1) {
			System.out.println(b);
		}
		List<String> l2=al.stream().map(c->c.concat(c)).collect(Collectors.toList());
		l2.forEach((d)->System.out.println(d));
	
		List<Integer> l3=al.stream().map(e->e.length()).collect(Collectors.toList());
		
		l3.forEach((f)-> System.out.println(f));
		
		List<String> l4=al.stream().map((g)->g.substring(0, g.length()-1)).collect(Collectors.toList());
		l4.forEach((h)-> System.out.println(h));
		
		List<String> l5=al.stream().map(j->j.toLowerCase()).collect(Collectors.toList());
		l5.forEach(i->System.out.println(i));
		
		List<Boolean> l6=al.stream().map(k->k.startsWith("J")).collect(Collectors.toList());
		l6.forEach(m->System.out.println(m));
		List<Boolean> l7=al.stream().map(n->n.contains("A")).collect(Collectors.toList());
		l7.forEach(o-> System.out.println(o));
		
		List<Integer> l8=al.stream().map(p->p.indexOf("A")).collect(Collectors.toList());
		
		l8.forEach(q->System.out.println(q));
		
		List<Character> l9=al.stream().map(r->r.charAt(1)).collect(Collectors.toList());
		l9.forEach(s->System.out.println(s));
	}
	
		

}
