package fnctnclls;

public class Arr {
	public void max(int[]ar) {
		float max=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
			
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		Arr a=new Arr();
		int[] ar= {1,2,3,4,9,6,7,9,9};
		a.max(ar);
	}

}
