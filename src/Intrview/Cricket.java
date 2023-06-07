package Intrview;

public class Cricket {
	private String playerName;
	private boolean isBatsMan;
	private int playerScore;
	private int playerAge;
	private int wicketTaken;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public boolean isBatsMan() {
		return isBatsMan;
	}
	public void setBatsMan(boolean isBatsMan) {
		this.isBatsMan = isBatsMan;
	}
	public int getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
	public int getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	public int getWicketTaken() {
		return wicketTaken;
	}
	public void setWicketTaken(int wicketTaken) {
		this.wicketTaken = wicketTaken;
	}
	public Cricket(String playerName, boolean isBatsMan, int playerScore, int playerAge, int wicketTaken) {
		super();
		this.playerName = playerName;
		this.isBatsMan = isBatsMan;
		this.playerScore = playerScore;
		this.playerAge = playerAge;
		this.wicketTaken = wicketTaken;
	}
	@Override
	public String toString() {
		return "Cricket [playerName=" + playerName + ", isBatsMan=" + isBatsMan + ", playerScore=" + playerScore
				+ ", playerAge=" + playerAge + ", wicketTaken=" + wicketTaken + "]";
	}
	
	
}
