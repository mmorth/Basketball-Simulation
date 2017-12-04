package simulation;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Simulates a basketball game
 * 
 * @author Owner
 *
 */
public class Simulation {

	/**
	 * Makes calls to the simulation methods to simulate
	 * 
	 * @param args
	 *            Passed in command line arguments
	 */
	public static void main(String[] args) {

		Simulation s1 = new Simulation();

		Team Dragons = League.getDragons();
		
		Dragons.printTeamRosters();

		// System.out.println(League.getDragons().getTeamOffensiveRating());

		//s1.processSimulation(League.getDragons(), League.getGators());

	}

	/**
	 * Accepts user input
	 */
	static Scanner input = new Scanner(System.in);

	/**
	 * Makes calls to other methods to accept user input on what to simulate and
	 * simulate based on the user input Also displays the final score There are
	 * simulation options for the possession, quarter, game, overtime, and
	 * ending the game
	 * 
	 * @param team1
	 *            The first team in simulated game
	 * @param team2
	 *            The second team in simulated game
	 */
	public void processSimulation(Team team1, Team team2) {
		int totalTeam1 = 0;
		int totalTeam2 = 0;

		for (int i = 1; i <= 100; i++) {
			// Simulate based on user's choice
			printOptions(101 - i, totalTeam1, totalTeam2);
			char choice = input.next().charAt(0);

			if (choice == 'p') {

				totalTeam1 += simulatePossession(team1, team2);
				totalTeam2 += simulatePossession(team2, team1);

			} else if (choice == 'q') {

				if (i < 25) {
					totalTeam1 += simulateQuarter(25 - i, team1, team2);
					totalTeam2 += simulateQuarter(25 - i, team2, team1);
					i = 25;
				} else if (i < 50) {
					totalTeam1 += simulateQuarter(50 - i, team1, team2);
					totalTeam2 += simulateQuarter(50 - i, team2, team1);
					i = 50;
				} else if (i < 75) {
					totalTeam1 += simulateQuarter(75 - i, team1, team2);
					totalTeam2 += simulateQuarter(75 - i, team2, team1);
					i = 75;
				} else {
					totalTeam1 += simulateGame(100 - i, team1, team2);
					totalTeam2 += simulateGame(100 - i, team2, team1);
					i = 100;
				}

			} else if (choice == 'g') {

				totalTeam1 += simulateGame(100 - i, team1, team2);
				totalTeam2 += simulateGame(100 - i, team2, team1);
				i = 100;

			} else if (choice == 'e') {

				break;

			} else {

				i--;

			}

		}

		// Overtime simulation
		while (totalTeam1 == totalTeam2) {
			for (int i = 0; i < 10; i++) {
				System.out.println("\n\nPress p to simulate possession or g to end game");
				char choice = input.next().charAt(0);
				if (choice == 'p') {
					totalTeam1 += simulatePossession(team1, team2);
					totalTeam2 += simulatePossession(team2, team1);
					printScoreboard(totalTeam1, totalTeam2);
				} else {
					totalTeam1 += simulateQuarter(10, team1, team2);
					totalTeam2 += simulateQuarter(10, team2, team1);
					i = 10;
				}
			}
		}

		try {
			
			FileWriter fw = new FileWriter("C:\\Users\\Owner\\OneDrive\\Basketball\\GameResults.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Final Score: ");
			bw.newLine();
			bw.write(team1.getTeamName() + ": " + totalTeam1);
			bw.newLine();
			bw.write(team2.getTeamName() + ": " + totalTeam2);
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
		System.out.println("\n\nFinal Score: ");
		System.out.println(team1.getTeamName() + ": " + totalTeam1);
		System.out.println(team2.getTeamName() + " " + totalTeam2);

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
	public int simulatePossession(Team offenseTeam, Team defenseTeam) {
		int offensiveRating = (int) ((Math.random() * 100) + 1) * offenseTeam.getTeamOffensiveRating();
		int defensiveRating = (int) ((Math.random() * 100) + 1) * defenseTeam.getTeamDefensiveRating();

		int difference = offensiveRating - defensiveRating;

		if (difference < 0) {
			return 0;
		} else if (difference < 3500) {
			return 1;
		} else if (difference < 40000) {
			return 2;
		} else {
			return 3;
		}
	}

	/**
	 * Simulates a basketball quarter (25 possessions)
	 * 
	 * @param possessions
	 *            Number of possessions to simulate until end of the quarter
	 * @param offenseTeam
	 *            Current team on offense
	 * @param defenseTeam
	 *            Current team on defense
	 * @return Number of points scored by current offensive team in quarter
	 */
	public int simulateQuarter(int possessions, Team offenseTeam, Team defenseTeam) {
		int total = 0;

		for (int i = 0; i < possessions; i++) {
			total += simulatePossession(offenseTeam, defenseTeam);
		}

		return total;
	}

	/**
	 * Simulates until the end of the basketball game
	 * 
	 * @param remainingPossessions
	 *            Number of possessions to simulate until end of the game
	 * @param offenseTeam
	 *            Current team on offense
	 * @param defenseTeam
	 *            Current team on defense
	 * @return Number of points scored by current offensive team in the game
	 */
	public int simulateGame(int remainingPossessions, Team offenseTeam, Team defenseTeam) {
		int total = 0;

		for (int i = 0; i < remainingPossessions; i++) {
			total += simulatePossession(offenseTeam, defenseTeam);
		}

		return total;
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

}