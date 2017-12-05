package simulation;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Represents a basketball team. Stores name and rating.
 * 
 * @author Owner
 *
 */
public class Team {

	/**
	 * Stores the roster for the team
	 */
	private Athlete[] roster = new Athlete[7];

	/**
	 * Stores team name
	 */
	private String teamName;

	/**
	 * Constructs a new Team object
	 * 
	 * @param roster
	 *            Roster for team
	 */
	public Team(String teamName, Athlete[] roster) {

		this.teamName = teamName;

		try {
			if (roster.length != 7) {
				throw new IllegalArgumentException("The roster needs to be of 7 players length");
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}

		this.roster = roster;
	}

	/**
	 * Returns the team name
	 * 
	 * @return Team name
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * Sets the new team name
	 * 
	 * @param name
	 *            New team name
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * Returns the roster for the team
	 * 
	 * @return Roster of the team
	 */
	public Athlete[] getRoster() {
		return roster;
	}

	/**
	 * Sets new roster of the team
	 * 
	 * @param roster
	 *            New team roster
	 */
	public void setRoster(Athlete[] roster) {
		try {
			if (roster.length != 7) {
				throw new IllegalArgumentException("The roster needs to be of 7 players length");
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}

		this.roster = roster;
	}

	/**
	 * Changes a player at a specified position for the roster of the team
	 * 
	 * @param position
	 *            Position to replace
	 * @param player
	 *            New replacement player
	 */
	public void changeRoster(int position, Athlete player) {
		roster[position] = player;
	}

	/**
	 * Returns the offensive rating of the team
	 * 
	 * @return Offensive rating of team
	 */
	public int getTeamOffensiveRating() {
		int overall = 0;

		for (Athlete a : roster) {
			overall += a.getOffenseRating();
		}

		return overall;
	}

	/**
	 * Returns the defensive rating of the team
	 * 
	 * @return Defensive rating of team
	 */
	public int getTeamDefensiveRating() {
		int overall = 0;

		for (Athlete a : roster) {
			overall += a.getDefenseRating();
		}

		return overall;
	}

	/**
	 * Returns overall rating of team
	 * 
	 * @return Overall rating of team
	 */
	public int getTeamOverallRating() {
		return getTeamDefensiveRating() + getTeamOffensiveRating();
	}

	/**
	 * Updates each player's rating based on if they are in their correct
	 * position A 10% decrease in offensive and defensive rating of the player
	 * will occur if they are placed in a position not in their position[]
	 * array.
	 */
	public void updatePlayers() {

		for (int i = 1; i <= 5; i++) {
			Athlete current = roster[i];
			boolean inCorrectPosition = false;
			for (int j = 0; j < current.getPosition().length; j++) {
				if (current.getPosition()[j] == i) {
					inCorrectPosition = true;
					break;
				}
			}

			if (!inCorrectPosition) {
				current.setOffenseRating((int) (current.getOffenseRating() * .9));
				current.setDefenseRating((int) (current.getDefenseRating() * .9));
			}
		}

	}

	/**
	 * Returns the team salary cap
	 * 
	 * @return Team salary cap
	 */
	public double getSalaryCap() {
		double totalSalary = 0;

		for (int i = 0; i < roster.length; i++) {
			totalSalary += roster[i].getContractAmount();
		}

		return totalSalary;
	}

	/**
	 * Prints the team rosters to the console
	 */
	public void printTeamRosters() {
		try {

			FileWriter fw = new FileWriter("C:\\Users\\Owner\\OneDrive\\Basketball\\Rosters.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(teamName);
			bw.newLine();
			bw.write("Position\t\tName\t\t\t\tAge\t\tOffense\t\tDefense\t\tContract\t\tYears");
			bw.newLine();
			System.out.println("Position\t\tName\t\t\t\tAge\t\tOffense\t\tDefense\t\tContract\t\tYears");
			
			for (int i = 0; i < roster.length; i++) {
				for (int j = 0; j < roster[i].getPosition().length; j++) {
					String playerPosition = String.format("%d ", roster[i].getPosition()[j]);
					System.out.print(playerPosition);
					bw.write(playerPosition);
				}
				String playerInformation = String.format("\t\t%-20s\t%d\t%d\t%d\t%.1f\t\t%d\n",
						roster[i].getName(), roster[i].getAge(), roster[i].getOffenseRating(), roster[i].getDefenseRating(),
						roster[i].getContractAmount(), roster[i].getContractYears());
				bw.write(playerInformation);
				System.out.print(playerInformation);
				bw.newLine();
			}
			
			bw.newLine();
			bw.newLine();
			
			fw.flush();
			bw.flush();
			
			fw.close();
			bw.close();

		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}

	}

	public static void main(String[] args) {

		Team t1 = new Team("Test", League.getDragons().getRoster());

		t1.printTeamRosters();
	}

}
