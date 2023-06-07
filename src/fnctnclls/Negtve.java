package fnctnclls;

public class Negtve {
	public void low(int[] a) {
		int count=0;
		int count1=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				count++;
		}
		else {
			count1++;
		}
	}
	System.out.println(count+" no of NEGATIVE "+count1+" pstive no");
	}
	public static void main(String[] args) {
		Negtve n=new Negtve();
		int[] a= {-1,-2,-3,0,1,2,3,4};
		n.low(a);
	}
}
