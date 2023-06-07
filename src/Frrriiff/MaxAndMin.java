package Frrriiff;

public class MaxAndMin {

	public static void main(String[] args) {
		int[] a= {24,102,67,-112,-80,72,-82};
		int min=a[0];
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<max) {
				max=max+a[i];
			}
			else {
				min=+min+a[i];
			}
		}System.out.println(max+" is min values in the given");
		System.out.println(min+" is max values");
		}
	
	}


