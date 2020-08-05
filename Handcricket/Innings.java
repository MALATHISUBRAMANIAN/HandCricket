package main.Handcricket;

public class Innings implements ScoreMaintainer {
	private String batsMan;
	private String bowler;
	int balls;
	private int totalScore;

	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}

	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public Innings(String batsMan, String bowler) {
		this.batsMan=batsMan;
		this.bowler=bowler;
	}
	public String getBowler() {
		return bowler;
	}

	public void setBowler(String bowler) {
		this.bowler = bowler;
	}

	public String getBatsMan() {
		return batsMan;
	}

	public void setBatsMan(String batsMan) {
		this.batsMan = batsMan;
	}

	@Override
	public void addScore(int points) {
		totalScore+=points;
	}

}
