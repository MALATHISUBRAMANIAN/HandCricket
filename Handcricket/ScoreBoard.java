package main.Handcricket;

public class ScoreBoard {

	/**
	 * inningsDetails is used to display the innings detail before the innings
	 * 
	 * @param player1
	 * @param player2
	 * @param target
	 */
	public void inningsDetails(String player1, String player2, int target) {
		System.out.println(player1 + " Bats");
		System.out.println(player2 + " Bowls");
		System.out.println("No.of Balls remaining : 10");
		System.out.println((target == 0) ? "First Innings" : "Second Innings");
		System.out.println("------");
	}
	
	public void afterFirstInning(int target) {
		System.out.println("Target to win is : " + target);
		System.out.println("-------");
	}

	public void finalScore(Innings firstInning, Innings secondInnings, int target) {
		if (secondInnings.getTotalScore() >= target) {
			System.out.println(secondInnings.getBatsMan() + " wins with " + secondInnings.getBalls() + " balls to spare");
		} else {
			int difference = firstInning.getTotalScore()-secondInnings.getTotalScore();
			System.out.println(secondInnings.getBowler() + " wins by " + difference + " runs ");
		}
	}

}
