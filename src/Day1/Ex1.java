package Day1;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {3,3,3,3,3,4,4,4};
		int [] num1= {3,3,3,3,4,4,4,3};
		int a=0;
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num1.length;j++)
			{
				if(num[i]==num1[j])
				{
				a++;
				}

			}
			
		}
		System.out.println(a);

		

	}

}
