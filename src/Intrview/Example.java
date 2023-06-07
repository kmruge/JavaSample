package Intrview;

public class Example {
	
	public String max(int a,int b) {
		if(a>b) {
			return (a+"is maximum");
					
		}
		else {
			return (b+"is maximum");
				
					
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Example e=new Example();
		System.out.println(e.max(10,5));
		

		
		
	}
}



