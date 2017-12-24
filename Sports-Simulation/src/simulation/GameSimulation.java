package simulation;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Simulates a basketball game
 * 
 * @author Matthew Orth
 *
 */
public class GameSimulation {

	public static int DEBUG = 0;

	// /**
	// * Makes calls to the simulation methods to simulate
	// *
	// * @param args
	// * Passed in command line arguments
	// * @throws IOException
	// */
	// public static void main(String[] args) throws IOException {
	//
	// /*
	// * NOTE: The below loop code is used for testing purposes. This will be
	// removed
	// * after testing is complete.
	// */
	//
	// // TODO Remove DEBUG line once finished testing
	// if (DEBUG == 1) {
	// //
	// // boolean underdogWins = false;
	// // int games = 0;
	// //
	// // while (!underdogWins) {
	//
	// // games++;
	// //
	// double team1Average = 0;
	// double team2Average = 0;
	// int team1Wins = 0;
	// int team2Wins = 0;
	//
	// int i;
	//
	// for (i = 0; i < 1000; i++) {
	//
	// Team Dragons = League.getDragons();
	//
	// Team Gators = League.getGators();
	//
	// GameSimulation s1 = new GameSimulation(Dragons, Gators);
	//
	// // Dragons.printTeamRosters();
	// //
	// // Gators.printTeamRosters();
	// //
	// // System.out.println(League.getDragons().getTeamOffensiveRating());
	//
	// s1.processSimulation(League.getDragons(), League.getGators());
	//
	// team1Average += team1Score;
	// team2Average += team2Score;
	//
	// if (team1Score > team2Score) {
	// team1Wins++;
	// } else {
	// team2Wins++;
	// }
	//
	// team1Score = 0;
	// team2Score = 0;
	//
	// }
	//
	// team1Average /= i;
	// team2Average /= i;
	//
	// System.out.println("Higher Team Average Score: " + team1Average);
	// System.out.println("Lower Team Average Score: " + team2Average);
	// System.out.println("Higher Team Wins: " + team1Wins);
	// System.out.println("Lower Team Wins: " + team2Wins);
	//
	// // if (team2Score > team1Score) {
	// // underdogWins = true;
	// // }
	// //
	// // team1Score = 0;
	// // team2Score = 0;
	// //
	// // }
	// //
	// // System.out.println("Games until upset: " + games);
	//
	// } else {
	// Team Dragons = League.getDragons();
	//
	// Team Gators = League.getGators();
	//
	// GameSimulation s1 = new GameSimulation(Dragons, Gators);
	//
	// s1.processSimulation(League.getDragons(), League.getGators());
	// }
	//
	// }

	/**
	 * Represents team1 in the simulation
	 */
	private Team team1;

	/**
	 * Represents team2 in the simulation
	 */
	private Team team2;

	/**
	 * Represents the score of team1
	 */
	private static int team1Score;

	/**
	 * Represents the score of team2
	 */
	private static int team2Score;

	/**
	 * Represents team1's offensive rating relative to team2's defensive rating
	 */
	private double team1RelativeRating;

	/**
	 * Represents team2's offensive rating relative to team1's defensive rating
	 */
	private double team2RelativeRating;

	/**
	 * Makes it easier for team1 to score if they have a higher offensive rating
	 * compared to the other team2's defensive rating
	 */
	private double team1Boost;

	/**
	 * Makes it easier for team2 to score if they have a higher offensive rating
	 * compared to the other team1's defensive rating
	 */
	private double team2Boost;

	// TODO Remove once testing is complete
	private int team1Wins = 0;
	private int team2Wins = 0;
	private double team1AverageScore = 0;
	private double team2AverageScore = 0;

	/**
	 * Accepts user input
	 */
	static Scanner input = new Scanner(System.in);

	/**
	 * Constructs a new GameSimulation object
	 * 
	 * @param team1
	 *            The first team in the game simulation
	 * @param team2
	 *            The second team in the game simulation
	 */
	public GameSimulation(Team team1, Team team2, int debug) {

		this.team1 = team1;
		this.team2 = team2;

		team1Score = 0;
		team2Score = 0;

		team1RelativeRating = (team1.getTeamOffensiveRating() - team2.getTeamDefensiveRating() + 100) / 2;
		team2RelativeRating = (team2.getTeamOffensiveRating() - team1.getTeamDefensiveRating() + 100) / 2;

		team1BoostCalculation();
		team2BoostCalculation();
		
		DEBUG = debug;

	}

	/**
	 * Makes calls to other methods to accept user input on what to simulate based
	 * on the user input. Also displays the final score. There are simulation
	 * options for the possession, quarter, game, overtime, and ending the game
	 * 
	 * @param team1
	 *            The first team in simulated game
	 * @param team2
	 *            The second team in simulated game
	 * @throws IOException
	 */
	public void processSimulation(Team team1, Team team2, int numSimulations) throws IOException {

		// Stores the scores for team1 for each quarter and overtime
		int team1FirstQuarterScore = 0;
		int team1SecondQuarterScore = 0;
		int team1ThirdQuarterScore = 0;
		int team1FourthQuarterScore = 0;
		int team1OvertimeScore = 0;

		// Stores the scores for team2 for each quarter and overtime
		int team2FirstQuarterScore = 0;
		int team2SecondQuarterScore = 0;
		int team2ThirdQuarterScore = 0;
		int team2FourthQuarterScore = 0;
		int team2OvertimeScore = 0;

		// Stores the user's choice for how much of the game they want to simulate
		char choice = ' ';

		// Continues the simulation process for 100 possessions for each team
		for (int possessions = 1; possessions <= 100; possessions++) {
			// If the user choose to simulate the game, then simulate the game by quarters
			if (choice != 'g') {

				//TODO Remove after testing
				if (DEBUG == 0) {
					printOptions(possessions, team1Score, team2Score);
				}

				// TODO Remove DEBUG line once finished testing
				if (DEBUG == 1) {
					choice = 'g';
				} else {
					choice = input.next().charAt(0);
				}

				// Simulate based on user's choice
				if (choice == 'p') {
					simulatePossession(possessions);
				} else if (choice == 'q') {
					possessions = simulatePossessionsQuarter(possessions);
				} else if (choice == 'g') {
					possessions = simulatePossessionsQuarter(possessions);
				} else if (choice == 'e') {
					break;
				} else {
					possessions--;
				}

			} else if (choice == 'g' && possessions < 100) {
				possessions = simulatePossessionsQuarter(possessions);
			}

			// Calculate the number of points scored by the team during the quarter
			if (possessions == 25) {
				team1FirstQuarterScore = team1Score;
				team2FirstQuarterScore = team2Score;
			} else if (possessions == 50) {
				team1SecondQuarterScore = team1Score - team1FirstQuarterScore;
				team2SecondQuarterScore = team2Score - team2FirstQuarterScore;
			} else if (possessions == 75) {
				team1ThirdQuarterScore = team1Score - team1SecondQuarterScore - team1FirstQuarterScore;
				team2ThirdQuarterScore = team2Score - team2SecondQuarterScore - team2FirstQuarterScore;
			} else if (possessions == 100) {
				team1FourthQuarterScore = team1Score - team1SecondQuarterScore - team1ThirdQuarterScore
						- team1FirstQuarterScore;
				team2FourthQuarterScore = team2Score - team2SecondQuarterScore - team2ThirdQuarterScore
						- team2FirstQuarterScore;
			}

		}

		// Check if the user ended the game
		if (choice != 'e') {
			// Overtime simulation. Only happens when the two team's scores are tied at the
			// end of the game
			while (team1Score == team2Score) {
				for (int possessions = 101; possessions <= 110; possessions++) {
					
					//TODO Remove after testing
					if (DEBUG == 0) {
						System.out.println("\n\nPress p to simulate possession or g to end game");
					}

					// TODO Remove DEBUG line once finished testing
					if (DEBUG == 1) {
						choice = 'g';
					} else {
						choice = input.next().charAt(0);
					}

					if (choice == 'p') {
						simulatePossession(possessions);
						
						//TODO Remove after testing
						if (DEBUG == 0) {
							printScoreboard(team1Score, team2Score);
						}
						
					} else {
						possessions = simulatePossessionsQuarter(possessions);
					}
				}

				// Calculate the number of points scored by each team in overtime
				team1OvertimeScore = team1Score - team1FourthQuarterScore - team1SecondQuarterScore
						- team1ThirdQuarterScore - team1FirstQuarterScore;
				team2OvertimeScore = team2Score - team2FourthQuarterScore - team2SecondQuarterScore
						- team2ThirdQuarterScore - team2FirstQuarterScore;
			}

			//TODO Remove after testing
			if (DEBUG == 0) {
				printFinalScores(team1FirstQuarterScore, team1SecondQuarterScore, team1ThirdQuarterScore,
						team1FourthQuarterScore, team1OvertimeScore, team2FirstQuarterScore, team2SecondQuarterScore,
						team2ThirdQuarterScore, team2FourthQuarterScore, team2OvertimeScore);
			}

		} else {
			System.out.println("Game ended. Draw.");
		}

	}

	/**
	 * Simulates a basketball possession
	 * 
	 * @param offenseTeam
	 *            Current offensive team
	 * @param defenseTeam
	 *            Current defensive team
	 * @return Points scored by offensive team on current possession
	 */
	public void simulatePossession(int possessions) {

//		Random rng = new Random();
//
//		double shotMultiplier = 0;
//
//		// Team1 scoring calculations
//		double team1ShotSelection = rng.nextDouble();
//		int team1Shot = 0;
//
//		if (team1ShotSelection <= .1) {
//			shotMultiplier = .5;
//			team1Shot = 1;
//		} else if (team1ShotSelection <= .7) {
//			shotMultiplier = 1;
//			team1Shot = 2;
//		} else {
//			shotMultiplier = 1.2;
//			team1Shot = 3;
//		}
//
//		if (team1Boost * rng.nextDouble() * team1RelativeRating > ((team1RelativeRating / 2.5) + 5) * shotMultiplier) {
//			team1Score += team1Shot;
//		}
//
//		// Team2 scoring calculations
//		double team2ShotSelection = rng.nextDouble();
//		int team2Shot = 0;
//
//		if (team2ShotSelection <= .1) {
//			shotMultiplier = .5;
//			team2Shot = 1;
//		} else if (team2ShotSelection <= .7) {
//			shotMultiplier = 1;
//			team2Shot = 2;
//		} else {
//			shotMultiplier = 1.2;
//			team2Shot = 3;
//		}
//
//		if (team2Boost * rng.nextDouble() * team2RelativeRating > ((team2RelativeRating / 2.5) + 5) * shotMultiplier) {
//			team2Score += team2Shot;
//		}
		
		for (int i = 0; i < team1.getOnCourt().length; i++) {
			team1.getOnCourt()[i].setStamina(team1.getOnCourt()[i].getStaminaDecrease());
			team1.getOnCourt()[i].setRotationPossessionsRemaining(team1.getOnCourt()[i].getRotationPossessionsRemaining()-1);
			team2.getOnCourt()[i].setStamina(team2.getOnCourt()[i].getStaminaDecrease());
			team2.getOnCourt()[i].setRotationPossessionsRemaining(team2.getOnCourt()[i].getRotationPossessionsRemaining()-1); 
		}
		
		team1.substitutePlayers(possessions);
		team2.substitutePlayers(possessions);

		// Determine what player ratings go into determining if the team scores
		
		// Have a random number generator determine who will shoot the ball with weight going toward players with higher shooting ratings
		// Have random number generator determine who passed the ball to the player who will shoot with weight toward players with higher passing ratings
		// Compare the pass and ball handling and steal ratings of the two players who passed the ball and who scored to see if ball was turnover
		// Use the different player ratings for offense and defense to determine if the player scored the ball

	}

	/**
	 * Prints the current scoreboard for the game
	 * 
	 * @param pointsTeam1
	 *            Current points for team1
	 * @param pointsTeam2
	 *            Current points for team2
	 */
	public void printScoreboard(int pointsTeam1, int pointsTeam2) {
		System.out.println("\n");
		System.out.println("Score: ");
		System.out.println("Team 1: " + pointsTeam1);
		System.out.println("Team 2: " + pointsTeam2);
	}

	/**
	 * Print the final box score for each team at the end of the simulation game.
	 * 
	 * @param team1FirstQuarterScore
	 *            The number of points scored by team 1 in the first quarter
	 * @param team1SecondQuarterScore
	 *            The number of points scored by team 1 in the second quarter
	 * @param team1ThirdQuarterScore
	 *            The number of points scored by team 1 in the third quarter
	 * @param team1FourthQuarterScore
	 *            The number of points scored by team 1 in the fourth quarter
	 * @param team1OvertimeScore
	 *            The number of points scored by team 1 in overtime
	 * @param team2FirstQuarterScore
	 *            The number of points scored by team 2 in the first quarter
	 * @param team2SecondQuarterScore
	 *            The number of points scored by team 2 in the second quarter
	 * @param team2ThirdQuarterScore
	 *            The number of points scored by team 2 in the third quarter
	 * @param team2FourthQuarterScore
	 *            The number of points scored by team 2 in the fourth quarter
	 * @param team2OvertimeScore
	 *            The number of points scored by team 2 in overtime
	 * @throws IOException
	 *             Throws an IOException if the specified file does not exist
	 */
	public void printFinalScores(int team1FirstQuarterScore, int team1SecondQuarterScore, int team1ThirdQuarterScore,
			int team1FourthQuarterScore, int team1OvertimeScore, int team2FirstQuarterScore,
			int team2SecondQuarterScore, int team2ThirdQuarterScore, int team2FourthQuarterScore,
			int team2OvertimeScore) throws IOException {

		// Print team scores
		String scoreHeader = String.format("\nTeam\t\tQ1\tQ2\tQ3\tQ4\tOT\tFinal");
		String team1Results = String.format("%s\t\t%d\t%d\t%d\t%d\t%d\t%d", team1.getTeamName(), team1FirstQuarterScore,
				team1SecondQuarterScore, team1ThirdQuarterScore, team1FourthQuarterScore, team1OvertimeScore,
				team1Score);
		String team2Results = String.format("%s\t\t%d\t%d\t%d\t%d\t%d\t%d", team2.getTeamName(), team2FirstQuarterScore,
				team2SecondQuarterScore, team2ThirdQuarterScore, team2FourthQuarterScore, team2OvertimeScore,
				team2Score);

		// FileWriter fw = new
		// FileWriter("C:\\Users\\Owner\\OneDrive\\Basketball\\GameResults.txt", true);
		FileWriter fw = new FileWriter("/home/mmorth/Coding/Storage_Files/GameResults.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(scoreHeader);
		bw.newLine();
		bw.write(team1Results);
		bw.newLine();
		bw.write(team2Results);
		bw.newLine();
		bw.newLine();
		bw.flush();

		fw.close();
		bw.close();

		// Display final results to console
		System.out.println(scoreHeader);
		System.out.println(team1Results);
		System.out.println(team2Results);
	}

	/**
	 * Print the options menu for the user to choose from
	 * 
	 * @param remainingPossessions
	 *            Number of possessions remaining. Used to print for the user to
	 *            know
	 * @param pointsTeam1
	 *            Number of points team1 has
	 * @param pointsTeam2
	 *            Number of points team2 has
	 */
	public void printOptions(int remainingPossessions, int pointsTeam1, int pointsTeam2) {
		printScoreboard(pointsTeam1, pointsTeam2);
		System.out.println((101 - remainingPossessions) + " possessions remaining");
		System.out.println("Options: ");
		System.out.println("Press p to simulate a possession");
		System.out.println("Press q to simulate a quarter");
		System.out.println("Press g to simulate game");
		System.out.println("Press e to exit");
		System.out.print("Choice: ");
	}

	/**
	 * Simulates a quarter for both teams and updates the number of possessions
	 * remaining in the game.
	 * 
	 * @param team1
	 *            The first team in the game
	 * @param team2
	 *            The second team in the game
	 * @param possessions
	 *            The number of possessions remaining in the game
	 * @return The number of possessions remaining in the game
	 */
	public int simulatePossessionsQuarter(int possessions) {
		if (possessions <= 25) {
			for (int i = possessions; i <= 25; i++) {
				simulatePossession(possessions);
			}
			possessions = 25;
		} else if (possessions <= 50) {
			for (int i = possessions; i <= 50; i++) {
				simulatePossession(possessions);
			}
			possessions = 50;
		} else if (possessions <= 75) {
			for (int i = possessions; i <= 75; i++) {
				simulatePossession(possessions);
			}
			possessions = 75;
		} else if (possessions <= 100) {
			for (int i = possessions; i <= 100; i++) {
				simulatePossession(possessions);
			}
			possessions = 100;
		} else {
			for (int i = possessions; i <= 110; i++) {
				simulatePossession(possessions);
			}
			possessions = 110;
		}

		return possessions;
	}

	/**
	 * Calculates how much increase in chance that team1 scores on this possession
	 */
	public void team1BoostCalculation() {
		double ratio = team1.getTeamOffensiveRating() / team2.getTeamDefensiveRating();

		if (ratio >= 2) {
			team1Boost = 1.1 + .2 * ratio;
		} else if (ratio < 1) {
			team1Boost = 1;
		} else {
			team1Boost = .9 + .1 * ratio;
		}

	}

	/**
	 * Calculates how much increase in change that team2 scores on this possession
	 */
	public void team2BoostCalculation() {
		double ratio = team2.getTeamOffensiveRating() / team1.getTeamDefensiveRating();

		if (ratio >= 2) {
			team2Boost = 1.1 + .2 * ratio;
		} else if (ratio <= 1) {
			team2Boost = 1;
		} else {
			team2Boost = .9 + .1 * ratio;
		}

	}

	// TODO: Remove below methods after testing is complete
	
	/**
	 * Runs the a simulated game numSimulations number of times. Used for automated testing.
	 * @param numSimulations
	 * 		Number of games to simulate
	 * @param team1
	 * 		The first team in the simulations
	 * @param team2
	 * 		The second team in the simulations
	 * @throws IOException
	 * 		Throws an IOException if the files cannot be found
	 */
	public void runSimulations(int numSimulations, Team team1, Team team2) throws IOException {

		int i;

		for (i = 0; i < numSimulations; i++) {

			GameSimulation s1 = new GameSimulation(team1, team2, 1);

			s1.processSimulation(team1, team2, 1000);

			team1AverageScore += team1Score;
			team2AverageScore += team2Score;

			if (team1Score > team2Score) {
				team1Wins++;
			} else {
				team2Wins++;
			}

			team1Score = 0;
			team2Score = 0;

		}

		team1AverageScore /= i;
		team2AverageScore /= i;

	}
	

	public int getTeam1Wins() {
		return team1Wins;
	}

	public double getTeam1AverageScore() {
		return team1AverageScore;
	}

	public double getTeam2AverageScore() {
		return team2AverageScore;
	}

	public int getTeam2Wins() {
		return team2Wins;
	}	

}