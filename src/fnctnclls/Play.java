package fnctnclls;

public class Play {
	public float getsqre(int a) {
		return a*a;
	}
	public double getCbe(float b) {
		return b*b*b;
	}
	public static void main(String[] args) {
		Play p=new Play();
		int a=20;
		float b=1.04f;
		float sqre=p.getsqre(a);
		double cbe=p.getCbe(b);
		
		System.out.println("sqre "+sqre+" cube"+cbe);
	}
}
