package fnctnclls;

public class Name {
	public String max(String a,String b,String c,String d,String e) {
		if(a.length()>b.length()&&a.length()>c.length()&&a.length()>d.length()&&a.length()>e.length()) {
			return a;
		}
		else if(b.length()>a.length()&&b.length()>c.length()&&b.length()>d.length()&&b.length()>e.length()) {
			return b;
		}
		else if(c.length()>a.length()&&c.length()>b.length()&&c.length()>d.length()&&c.length()>e.length()) {
			return c;
		}
		else if(d.length()>a.length()&&d.length()>b.length()&&d.length()>c.length()&&d.length()>e.length()) {
			return d;
		}
		else if(e.length()>a.length()&&e.length()>b.length()&&e.length()>c.length()&&e.length()>d.length()) {
			return e;
		}
		else {
			return "no";
		}
	}
	
	public static void main(String[] args) {
		Name n=new Name();
		String a="JAVA";
		String b="PYTHON";
		String c="C++";
		String d="JAVA SCRIPT";
		String e="ANGULAR JAVA";
		
		System.out.println("BIG STRING IS "+n.max(a, b, c, d, e));
	}

}
