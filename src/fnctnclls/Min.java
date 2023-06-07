package fnctnclls;

public class Min {
	public int lngth(String a, String b, String c) {
		int l1=a.length();
		int l2=b.length();
		int l3=c.length();
		if (l1<l2&&l1<l3) {
			return l1;
			
		}
		else if(l2<l3&&l2<l1) {
			return l2;
		}
		else {
			return l3;
		}
		
	}
	public static void main(String[] args) {
		Min m=new Min();
		String a="THIRU";
		String b="MURUGAN";
		String c="MASILAMANI";
		
		System.out.println(m.lngth(a, b, c));
	}

}


