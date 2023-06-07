package Intrview;

public class Example1 {
	
	
	
	public long findMax(int [] a) {
		int max=0;
		long fact=1;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				
			
			max=a[i]; 
			}
		}
		for(int j=1;j<=max;j++) {
			
		fact=fact*j;
				
			}
	
		return fact;
		
	}
	
			
	
	public static void main(String[] args) {
		int [] a= {10,20,5,6};
		
		Example1 e=new Example1();
		
		System.out.println(e.findMax(a));
		
		
	}

}
