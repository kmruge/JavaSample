package Oooopthree;

public abstract class CentralGov {
	public abstract String noPlateColor(String color);
	
	public void font() {
		System.out.println("TIMES NEW ROMAN");
	}

}
 class Tamilnadu extends CentralGov {
	public String noPlateColor(String color) {
		if (color.equalsIgnoreCase("BLACK AND WHITE")) {
			return "private VEHICHLE";
		}
		else if(color.equalsIgnoreCase("YELLOW AND black")) {
			return "Commercial Vehicle";
		}
		else if(color.equalsIgnoreCase("GREEN AND WHITE")) {
			return "Electric vehicle";
		}
		else if(color.equalsIgnoreCase("RED AND WHITE")) {
			return "NEW REG VEHICHLE";
		}
		else {
			return "INVALID";
		}
	}
}
