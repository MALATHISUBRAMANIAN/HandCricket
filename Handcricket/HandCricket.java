package main.Handcricket;

import java.util.Scanner;

public class HandCricket {
	private static String player1 = "Player 1";
	private static String player2 = "Player 2";

	public static void main(String[] args) {
		ScoreBoard scoreBoard = new ScoreBoard();
		
		/** Constant target  */
		int target = 0;

		/** Print the innings details */
		scoreBoard.inningsDetails(player1, player2, target);

		/** To play the first innings */
		Innings firstInning = PlayInnings(target);

		/** Used to swap the teams at the end of the innings */
		swapTeams();
		
		target = firstInning.getTotalScore() + 1;
		scoreBoard.afterFirstInning(target);

		/** Print the innings details */
		scoreBoard.inningsDetails(player1, player2, target);

		/** To play the second innings */
		Innings secondInnings = PlayInnings(target);

		scoreBoard.finalScore(firstInning, secondInnings, target);

	}

	/**
	 * swapTeams is used to change the teams after the innings
	 * 
	 */
	private static void swapTeams() {
		String temp = player1;
		player1 = player2;
		player2 = temp;
	}

	/**
	 * PlayInnings is used to play the hand cricket match by inning wise.
	 * 
	 * @param target
	 * @return Innings
	 */
	private static Innings PlayInnings(int target) {
		Scanner input = new Scanner(System.in);
		Innings currentInnings = new Innings(player1, player2);
		int currentScore = 0;
		currentInnings.setBalls(10);
		int batsmanScore, bowlerScore;
		do {
			currentInnings.balls--;
			System.out.print(currentInnings.getBatsMan() + " throws ");
			batsmanScore = play(currentInnings.getBatsMan());
			System.out.print(currentInnings.getBowler() + " throws ");
			bowlerScore = play(currentInnings.getBowler());
			if (batsmanScore != bowlerScore) {
				currentScore += batsmanScore;
				System.out.print(currentInnings.getBatsMan() + " Score: " + currentScore);
				System.out.println();
				currentInnings.addScore(batsmanScore);
				System.out.println("No. of Balls Remaining : " + currentInnings.balls);
				System.out.println("-------");
			} else {
				System.out.println(currentInnings.getBatsMan() + " is out");
				break;
			}
		} while ((currentInnings.balls >= 1) && (target == 0 || target > currentScore));

		return currentInnings;
	}

	private static int play(String player) {
		boolean flag = false;
		int numb = 0;
		
		do {
			int count =0;
			Scanner input = new Scanner(System.in);
			numb = input.nextInt();
			flag = (numb<=6 && numb>=1)?false: true;
			count = (flag == true)? count+1:count;
			if(count>0) {
				String c = "Throw number between 1 - 6";
				System.out.println(c);
				System.out.print(player+" throws ");
			}
			
		}while(flag);
		
		return numb;
	}

}
