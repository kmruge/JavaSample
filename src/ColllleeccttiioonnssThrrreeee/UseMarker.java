package ColllleeccttiioonnssThrrreeee;

import java.util.ArrayList;
import java.util.List;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker("camlin",10,"BLUE",true);
		Marker m2=new Marker("faberCastle",30,"Black",true);
		Marker m3=new Marker("rEYNOLDS",25,"Yellow",false);
		Marker m4=new Marker("cello",15,"red",true);
		Marker m5=new Marker("ink",20,"Brown",false);
		
		ArrayList<Marker> markers=new ArrayList<>();
		markers.add(m1);
		markers.add(m2);
		markers.add(m3);
		markers.add(m4);
		markers.add(m5);
		
		List<Marker> tt=markers.stream().filter(l->l.getName().charAt(0)>='i'&&l.getName().charAt(0)<'p'))).collect(Collectors.toList());
		System.out.println(tt);
		List<Marker> tm=markers.stream().filter(z->z.getName().charAt(0)>='p'&&z.getName().charAt(0)<='z'))).collect(Collectors.toList());
		
		for(Marker tl:tm) {
			System.out.println(tl.getName());
		}
		List<Marker> lk=markers.stream().filter(g->g.setIsRefillable()==true).collect(Collectors.toList());
		for(Marker mk:lk) {
			if(mk.getName().length()>max.length()) {
				max=mk.getName();
			}
		}System.out.println(max.charAt(max.length()/2));
		
	}
}



