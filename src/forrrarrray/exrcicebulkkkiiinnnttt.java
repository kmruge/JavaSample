package forrrarrray;

public class exrcicebulkkkiiinnnttt {

	public static void main(String[] args) {
		int[] a= {7,2,48,8,26,27,55,14};
		int count=0;
		int total=0;
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
			count=count+1;
			total=total+a[i];
			
		}
		System.out.println("count "+count);
		System.out.println("total "+total);
		System.out.println("avg"+total/count);
	}

}
