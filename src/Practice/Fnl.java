package Practice;

class Fnl1 {
	
	    void showData() {
	        System.out.println("This is a method of final Parent class");
	    }
	}

	class Thiru extends Fnl1
	{
	    void showData() 
	    {
	        System.out.println("This is a method of Child class");
	    }
	}
	class Fnl
	{
	    public static void main(String arg[])
	    {
	        Fnl1 obj = new Thiru();
	        obj.showData();
	    }
	}


