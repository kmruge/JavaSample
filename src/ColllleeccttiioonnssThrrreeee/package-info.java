package ColllleeccttiioonnssThrrreeee;



//List<String> li=markers.stream().filter(a->a.getColor().contains("E")).map(c->c.getName().substring(1,c.getName().length()-1)).collect(Collectors.toList());
//
//System.out.println(li);
//
//List<Marker> l1=markers.stream().filter(c->c.getColor().startsWith("R")).map(d->d).collect(Collectors.toList());
//
//
//for(Marker m:l1) {
//	System.out.println(m.getName().substring(1, m.getName().length()-1));
//}
//l1.forEach(e->System.out.println(e.getName().substring(2, 5)));
//int tot=0;
//List<Marker> l2=markers.stream().filter(f->f.getPrice()>=50).collect(Collectors.toList());
//for(Marker k:l2) {
//tot=tot+k.getPrice();
//}System.out.println(tot);
//int total=0;
//List<Marker> l3=markers.stream().filter(g->g.getColor().contains("L")).collect(Collectors.toList());
//for(Marker ma:l3) {
//total=total+ma.getPrice();
//}
//System.out.println(total/10+"  is percent of total  "+total);
//String ar="";
//int max=0;
//List<String> l4=markers.stream().filter(i->i.getIsRefillable()==false&&i.getColor().contains("O")).map(z->z.getColor().toUpperCase()).collect(Collectors.toList());
//
//for(String re:l4) {
//	if(re.length()>max) {
//		ar=ar+re;
//	}
//}System.out.println(ar);