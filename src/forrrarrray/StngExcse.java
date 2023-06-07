package forrrarrray;

public class StngExcse {

	public static void main(String[] args) {
		String[] a= {"bristol","fjord","gothenberg","malneo","cardiff","eastham"};
		String b=" ";
		//for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
		//}
	//	for(int i=a.length-1;i>=0;i--) {
	//		System.out.println(a[i]);
		//}
		//	for(int i=a.length/2;i<a.length;i++) {
			//	System.out.println(a[i]);
		//	}
		//for(int i=0;i<a.length/2;i++) {
		//	System.out.println(a[i]);
		//}
		//for(int i=a.length/2;i<a.length;i++) {
		//	System.out.println(a[i]);
	//}
	//for(int i=0;i<a.length/2;i++) {
		//	System.out.println(a[i]);
		//}
	for(int i=a[1].length()-1;i>=0;i--) {
		b=b+a[1].charAt(i);
	}
	System.out.println(b);
	}
}
