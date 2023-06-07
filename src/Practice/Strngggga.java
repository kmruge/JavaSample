package Practice;

public class Strngggga {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70};
		int count=0;
		int total=0;
		for(int i=0; i<a.length;i++)
		{
			count=count+1;
			total=total+a[i];
			
		}
		System.out.println("count "+count);
		System.out.println("total "+total);
		System.out.println("avg "+total/count);
	}
	}


