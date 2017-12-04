package league;

import java.util.Scanner;

public class Team2Simulation {

	private Team team1;

	private Team team2;

	static Scanner input = new Scanner(System.in);

	public Team2Simulation(Team team1, Team team2) {
		this.team1 = team1;
		this.team2 = team2;
	}

	public static void main(String[] args) {

	}

	public void processSimulation() {
		int totalTeam1 = 0;
		int totalTeam2 = 0;

		for (int i = 1; i <= 100; i++) {
			printOptions(101 - i, totalTeam1, totalTeam2);
			char choice = input.next().charAt(0);

			if (choice == 'p') {

				totalTeam1 += simulatePossession();
				totalTeam2 += simulatePossession();

			} else if (choice == 'q') {

				if (i < 25) {
					totalTeam1 += simulateQuarter(25 - i);
					totalTeam2 += simulateQuarter(25 - i);
					i = 25;
				} else if (i < 50) {
					totalTeam1 += simulateQuarter(50 - i);
					totalTeam2 += simulateQuarter(50 - i);
					i = 50;
				} else if (i < 75) {
					totalTeam1 += simulateQuarter(75 - i);
					totalTeam2 += simulateQuarter(75 - i);
					i = 75;
				} else {
					totalTeam1 += simulateGame(100 - i);
					totalTeam2 += simulateGame(100 - i);
					i = 100;
				}

			} else if (choice == 'g') {

				totalTeam1 += simulateGame(100 - i);
				totalTeam2 += simulateGame(100 - i);
				i = 100;

			} else if (choice == 'e') {

				break;

			} else {

				i--;

			}

		}

		while (totalTeam1 == totalTeam2) {
			for (int i = 0; i < 10; i++) {
				System.out.println("\n\nPress p to simulate possession or g to end game");
				char choice = input.next().charAt(0);
				if (choice == 'p') {
					totalTeam1 += simulatePossession();
					totalTeam2 += simulatePossession();
					printScoreboard(totalTeam1, totalTeam2);
				} else {
					totalTeam1 += simulateQuarter(10);
					totalTeam2 += simulateQuarter(10);
					i = 10;
				}
			}
		}

		System.out.println("Final Score: ");
		System.out.println("Team 1: " + totalTeam1);
		System.out.println("Team 2: " + totalTeam2);

	}

	public int simulatePossession() {
		int offensiveRating = (int) ((Math.random() * 100) + 1);
		int defensiveRating = (int) ((Math.random() * 100) + 1);

		int difference = offensiveRating - defensiveRating;

		if (difference < 0) {
			return 0;
		} else if (difference < 1500) {
			return 1;
		} else if (difference < 22500) {
			return 2;
		} else {
			return 3;
		}
	}

	public int simulateQuarter(int possessions) {
		int total = 0;

		for (int i = 0; i < possessions; i++) {
			total += simulatePossession();
		}

		return total;
	}

	public int simulateGame(int remainingPossessions) {
		int total = 0;

		for (int i = 0; i < remainingPossessions; i++) {
			total += simulatePossession();
		}

		return total;
	}

	public void printScoreboard(int pointsTeam1, int pointsTeam2) {
		System.out.println("\n");
		System.out.println("Score: ");
		System.out.println("Team 1: " + pointsTeam1);
		System.out.println("Team 2: " + pointsTeam2);
	}

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
