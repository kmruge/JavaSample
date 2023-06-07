package Intrview;

public class Occrance {

	public static void main(String[] args) {
		String[] arr= {"Thirumurugan", "arun", "kumar"};
		String a="u";
		for(int i=0;i<arr.length;i++) {
			if(arr[0].length()>arr[i].length()) {
				a=arr[i];
			}
		}
		System.out.println(a);
	}

}
