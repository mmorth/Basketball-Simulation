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
 * @author Owner
 *
 */
public class GameSimulation {

	/**
	 * Makes calls to the simulation methods to simulate
	 * 
	 * @param args
	 *            Passed in command line arguments
	 */
	public static void main(String[] args) {
		//
		// boolean underdogWins = false;
		// int games = 0;
		//
		// while (!underdogWins) {

		// games++;

		double team1Average = 0;
		double team2Average = 0;
		int team1Wins = 0;
		int team2Wins = 0;

		int i;

		for (i = 0; i < 1000; i++) {

			Team Dragons = League.getDragons();

			Team Gators = League.getGators();

			GameSimulation s1 = new GameSimulation(Dragons, Gators);

			// Dragons.printTeamRosters();
			//
			// Gators.printTeamRosters();
			//
			// System.out.println(League.getDragons().getTeamOffensiveRating());

			s1.processSimulation(League.getDragons(), League.getGators());

			team1Average += team1Score;
			team2Average += team2Score;

			if (team1Score > team2Score) {
				team1Wins++;
			} else {
				team2Wins++;
			}

			team1Score = 0;
			team2Score = 0;

		}

		team1Average /= i;
		team2Average /= i;

		System.out.println("Higher Team Average Score: " + team1Average);
		System.out.println("Lower Team Average Score: " + team2Average);
		System.out.println("Higher Team Wins: " + team1Wins);
		System.out.println("Lower Team Wins: " + team2Wins);

		// if (team2Score > team1Score) {
		// underdogWins = true;
		// }
		//
		// team1Score = 0;
		// team2Score = 0;
		//
		// }
		//
		// System.out.println("Games until upset: " + games);

	}

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
	 * Accepts user input
	 */
	static Scanner input = new Scanner(System.in);

	/**
	 * Constructs a new SImulation object
	 * 
	 * @param team1
	 *            The first team in the game simulation
	 * @param team2
	 *            The second team in the game simulation
	 */
	public GameSimulation(Team team1, Team team2) {

		this.team1 = team1;
		this.team2 = team2;

		team1Score = 0;
		team2Score = 0;

		team1RelativeRating = (team1.getTeamOffensiveRating() - team2.getTeamDefensiveRating() + 100) / 2;
		team2RelativeRating = (team2.getTeamOffensiveRating() - team1.getTeamDefensiveRating() + 100) / 2;

	}

	/**
	 * Makes calls to other methods to accept user input on what to simulate and
	 * simulate based on the user input Also displays the final score There are
	 * simulation options for the possession, quarter, game, overtime, and ending
	 * the game
	 * 
	 * @param team1
	 *            The first team in simulated game
	 * @param team2
	 *            The second team in simulated game
	 */
	public void processSimulation(Team team1, Team team2) {

		int team1FirstQuarterScore = 0;
		int team1SecondQuarterScore = 0;
		int team1ThirdQuarterScore = 0;
		int team1FourthQuarterScore = 0;
		int team1OvertimeScore = 0;

		int team2FirstQuarterScore = 0;
		int team2SecondQuarterScore = 0;
		int team2ThirdQuarterScore = 0;
		int team2FourthQuarterScore = 0;
		int team2OvertimeScore = 0;

		char choice = ' ';

		for (int possessions = 1; possessions <= 100; possessions++) {
			// Simulate based on user's choice
			if (choice != 'g') {

				printOptions(possessions, team1Score, team2Score);
				choice = 'g';
				// choice = input.next().charAt(0);

				if (choice == 'p') {

					simulatePossession();

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

		// Overtime simulation
		while (team1Score == team2Score) {
			for (int possessions = 101; possessions <= 110; possessions++) {
				System.out.println("\n\nPress p to simulate possession or g to end game");
				choice = 'g';
				// choice = input.next().charAt(0);
				if (choice == 'p') {
					simulatePossession();
					printScoreboard(team1Score, team2Score);
				} else {
					possessions = simulatePossessionsQuarter(possessions);
				}
			}
			team1OvertimeScore = team1Score - team1FourthQuarterScore - team1SecondQuarterScore - team1ThirdQuarterScore
					- team1FirstQuarterScore;
			team2OvertimeScore = team2Score - team2FourthQuarterScore - team2SecondQuarterScore - team2ThirdQuarterScore
					- team2FirstQuarterScore;
		}

		String scoreHeader = String.format("Team\t\tQ1\tQ2\tQ3\tQ4\tOT\tFinal");
		String team1Results = String.format("%s\t\t%d\t%d\t%d\t%d\t%d\t%d", team1.getTeamName(), team1FirstQuarterScore,
				team1SecondQuarterScore, team1ThirdQuarterScore, team1FourthQuarterScore, team1OvertimeScore,
				team1Score);
		String team2Results = String.format("%s\t\t%d\t%d\t%d\t%d\t%d\t%d", team2.getTeamName(), team2FirstQuarterScore,
				team2SecondQuarterScore, team2ThirdQuarterScore, team2FourthQuarterScore, team2OvertimeScore,
				team2Score);

		try {

			FileWriter fw = new FileWriter("C:\\Users\\Owner\\OneDrive\\Basketball\\GameResults.txt", true);
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

		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}

		// Display final results
		System.out.println(scoreHeader);
		System.out.println(team1Results);
		System.out.println(team2Results);

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
	public void simulatePossession() {

		Random rng = new Random();
		
		double shotMultiplier = 0;

		double team1ShotSelection = rng.nextDouble();
		int team1Shot = 0;
			
		if (team1ShotSelection <= .1) {
			shotMultiplier = .5;
			team1Shot = 1;
		} else if (team1ShotSelection <= .7) {
			shotMultiplier = 1;
			team1Shot = 2;
		} else {
			shotMultiplier = 1.2;
			team1Shot = 3;
		}

		if (rng.nextDouble() * team1RelativeRating > ((team1RelativeRating / 2.5) + 5) * shotMultiplier) {
			team1Score += team1Shot;
		}
		
		double team2ShotSelection = rng.nextDouble();
		int team2Shot = 0;
			
		if (team2ShotSelection <= .1) {
			shotMultiplier = .5;
			team2Shot = 1;
		} else if (team2ShotSelection <= .7) {
			shotMultiplier = 1;
			team2Shot = 2;
		} else {
			shotMultiplier = 1.2;
			team2Shot = 3;
		}

		if (rng.nextDouble() * team2RelativeRating > ((team2RelativeRating / 2.5) + 5) * shotMultiplier) {
			team2Score += team2Shot;
		}

		// double team1ShotMakeValue = 20 * (1-(team1RelativeRating / 100));
		//
		// int team1ShotSelection = rng.nextInt(3) + 1;
		// double team1ShotModifier = 0;
		//
		// if (team1ShotSelection == 1) {
		// team1ShotModifier = .8;
		// } else if (team1ShotSelection == 2) {
		// team1ShotModifier = .5;
		// } else {
		// team1ShotModifier = .32;
		// }
		//
		// double team2ShotMakeValue = 20 * (1-(team2RelativeRating / 100));
		// int team2ShotSelection = rng.nextInt(3) + 1;
		// double team2ShotModifier = 0;
		//
		// if (team2ShotSelection == 1) {
		// team2ShotModifier = .8;
		// } else if (team2ShotSelection == 2) {
		// team2ShotModifier = .5;
		// } else {
		// team2ShotModifier = .32;
		// }
		//
		// double weight = .2;
		//
		// double team1ShotResult = ((team1RelativeRating * weight + rng.nextDouble() *
		// 100 * (1 - weight)) / 2) * team1ShotModifier;
		// double team2ShotResult = ((team2RelativeRating * weight + rng.nextDouble() *
		// 100 * (1 - weight)) / 2) * team2ShotModifier;
		//
		// if (team1ShotResult >= team1ShotMakeValue) {
		// team1Score += team1ShotSelection;
		// }
		//
		// if (team2ShotResult >= team2ShotMakeValue) {
		// team2Score += team2ShotSelection;
		// }

		// int offensiveRating = (int) ((Math.random() * 100 +1) *
		// offenseTeam.getTeamOffensiveRating());
		// int defensiveRating = (int) ((Math.random() * 100 + 1) *
		// defenseTeam.getTeamDefensiveRating());
		//
		// int difference = offensiveRating - defensiveRating;
		//
		// if (difference < 0) {
		// return 0;
		// } else if (difference < 750) {
		// return 1;
		// } else if (difference < 7500) {
		// return 2;
		// } else if (difference < 9950) {
		// return 3;
		// } else {
		// return 4;
		// }
	}

	// /**
	// * Simulates a basketball quarter (25 possessions)
	// *
	// * @param possessions
	// * Number of possessions to simulate until end of the quarter
	// * @param offenseTeam
	// * Current team on offense
	// * @param defenseTeam
	// * Current team on defense
	// * @return Number of points scored by current offensive team in quarter
	// */
	// public int simulateQuarter(int possessions) {
	// int total = 0;
	//
	// for (int i = 0; i < possessions; i++) {
	// total += simulatePossession();
	// }
	//
	// return total;
	// }
	//
	// /**
	// * Simulates until the end of the basketball game
	// *
	// * @param remainingPossessions
	// * Number of possessions to simulate until end of the game
	// * @param offenseTeam
	// * Current team on offense
	// * @param defenseTeam
	// * Current team on defense
	// * @return Number of points scored by current offensive team in the game
	// */
	// public int simulateGame(int remainingPossessions) {
	// int total = 0;
	//
	// for (int i = 0; i < remainingPossessions; i++) {
	// total += simulatePossession();
	// }
	//
	// return total;
	// }

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
		System.out.println(remainingPossessions + " possessions remaining");
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
				simulatePossession();
			}
			possessions = 25;
		} else if (possessions <= 50) {
			for (int i = possessions; i <= 50; i++) {
				simulatePossession();
			}
			possessions = 50;
		} else if (possessions <= 75) {
			for (int i = possessions; i <= 75; i++) {
				simulatePossession();
			}
			possessions = 75;
		} else if (possessions <= 100) {
			for (int i = possessions; i <= 100; i++) {
				simulatePossession();
			}
			possessions = 100;
		} else {
			for (int i = possessions; i <= 110; i++) {
				simulatePossession();
			}
			possessions = 110;
		}

		return possessions;
	}

}