package Oooopthree;

public interface Board {
	public String writingmaterial();

}
 class WhiteBoard implements Board {
	public String writingmaterial() {
		return "BLACK MARKER";
	}
}
class BlackBoard implements Board{
	public String writingmaterial() {
		return "WHITE Chalk";
	}
}
