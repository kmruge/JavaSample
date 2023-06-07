package Coollleeeccctttiiiooonnnsssttwwoo;

import java.util.HashMap;
import java.util.Iterator;

public class Exmpl4 {

	public static void main(String[] args) {
		HashMap<Integer,String> st=new HashMap<>();
		st.put(12,"THIRU");
		st.put(13, "MURUGAN");
		st.put(14, "MOHAN");
		st.put(15,"RAJ");
		
		Iterator itr=st.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		
		}
		Iterator its=st.values().iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
	}

}
