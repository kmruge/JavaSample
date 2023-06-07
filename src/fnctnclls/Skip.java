package fnctnclls;

public class Skip {
	public void skp(int a) {
		for(int i=0;i<a;i++) {
			if(i%2==0) {
			
				continue;
			}
			else {
				System.out.println(i+" is not divisible/2");
			}
		}
	}
	public static void main(String[] args) {
		Skip s=new Skip();
		int a=10;
		s.skp(a);
	}

}
