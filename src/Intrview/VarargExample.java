package Intrview;

class VarargExample {

	  public int sumNumber(int ...   args){
	    System.out.println("argument length: " + args.length);

	    int sum = 0;
	    for(int x: args){
	        sum += x;
	    }
	    
	    return sum;
	  }

	  public static void main( String[] args ) {

	    VarargExample ex = new VarargExample();

	    int sum2 = ex.sumNumber(2, 4);
	    System.out.println("sum2 = " + sum2);

	    int sum4 = ex.sumNumber(1, 3, 5, 7);
	    System.out.println("sum4 = " + sum4);
	  }
	}