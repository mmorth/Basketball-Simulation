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
	private Athlete[] roster = new Athlete[15];

	/**
	 * Stores team name
	 */
	private String teamName;
	
	/**
	 * Stores the team salary
	 */
	private double totalTeamSalary;
	
	/**
	 * Stores the team's offensive rating
	 */
	private int teamOffensiveRating;
	
	/**
	 * Stores the team's defensive rating
	 */
	private int teamDefensiveRating;
	
	/**
	 * Stores the team's overall rating
	 */
	private int teamOverallRating;

	/**
	 * Constructs a new Team object
	 * 
	 * @param roster
	 *            Roster for team
	 * @param teamName
	 *            The name of the team
	 */
	public Team(String teamName, Athlete[] roster) {

		setTeamName(teamName);
		
		setRoster(roster);
		
		generateNewTeamOffensiveRating();
		generateNewTeamDefensiveRating();
		generateNewTeamOverallRating();
		generateNewTeamSalary();
		
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
		if (roster.length > 15) {
			throw new IllegalArgumentException("The roster may not exceed 15 players");
		}

		this.roster = roster;
		
		generateNewTeamOffensiveRating();
		generateNewTeamDefensiveRating();
		generateNewTeamOverallRating();
		generateNewTeamSalary();
	}

	/**
	 * Changes a player at a specified position for the roster of the team
	 * 
	 * @param position
	 *            Position to replace
	 * @param player
	 *            New replacement player
	 */
	public void setPlayer(int position, Athlete player) {
		roster[position] = player;
		
		generateNewTeamOffensiveRating();
		generateNewTeamDefensiveRating();
		generateNewTeamOverallRating();
		generateNewTeamSalary();
	}
	
	/**
	 * Returns the offensive rating of the team
	 * 
	 * @return Offensive rating of team
	 */
	public int getTeamOffensiveRating() {
		return teamOffensiveRating;
	}

	/**
	 * Returns the offensive rating of the team
	 * 
	 * @return Offensive rating of team
	 */
	private void generateNewTeamOffensiveRating() {
		int overall = 0;

		for (Athlete a : roster) {
			overall += a.getOffenseRating();
		}

		teamOffensiveRating = overall / roster.length;
	}
	
	/**
	 * Returns the defensive rating of the team
	 * 
	 * @return Defensive rating of team
	 */
	public int getTeamDefensiveRating() {
		return teamDefensiveRating;
	}

	/**
	 * Returns the defensive rating of the team
	 * 
	 * @return Defensive rating of team
	 */
	public void generateNewTeamDefensiveRating() {
		int overall = 0;

		for (Athlete a : roster) {
			overall += a.getDefenseRating();
		}

		teamDefensiveRating = overall / roster.length;
	}
	
	/**
	 * Returns overall rating of team
	 * 
	 * @return Overall rating of team
	 */
	public int getTeamOverallRating() {
		return teamOverallRating;
	}

	/**
	 * Returns overall rating of team
	 * 
	 * @return Overall rating of team
	 */
	public void generateNewTeamOverallRating() {
		teamOverallRating = (teamOffensiveRating + teamDefensiveRating) / 2;
	}

//	/**
//	 * Updates each player's rating based on if they are in their correct position A
//	 * 10% decrease in offensive and defensive rating of the player will occur if
//	 * they are placed in a position not in their position[] array.
//	 */
//	private void updatePlayers() {
//
//		for (int i = 1; i <= 5; i++) {
//			Athlete current = roster[i];
//			boolean inCorrectPosition = false;
//			for (int j = 0; j < current.getPosition().length; j++) {
//				if (current.getPosition()[j] == i) {
//					inCorrectPosition = true;
//					break;
//				}
//			}
//
//			if (!inCorrectPosition) {
//				current.setOffenseRating((int) (current.getOffenseRating() * .9));
//				current.setDefenseRating((int) (current.getDefenseRating() * .9));
//			}
//		}
//
//	}
	
	/**
	 * Returns the team salary cap
	 * 
	 * @return Team salary cap
	 */
	public double getSalaryCap() {
		return totalTeamSalary;
	}

	/**
	 * Returns the team salary cap
	 * 
	 * @return Team salary cap
	 */
	public void generateNewTeamSalary() {
		double totalSalary = 0;

		for (int i = 0; i < roster.length; i++) {
			totalSalary += roster[i].getContractAmount();
		}

		totalTeamSalary = totalSalary;
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
			System.out.printf("");
			System.out.println("Position\tName\t\t\tAge\tOffense\tDefense\tContract/t\tYears");

			for (int i = 0; i < roster.length; i++) {
				String positionString = "";
				for (int j = 0; j < roster[i].getPosition().length; j++) {
					positionString += Integer.toString(roster[i].getPosition()[j]);
					positionString += " ";
					//String playerPosition = String.format("%d ", roster[i].getPosition()[j]);
//					System.out.print(playerPosition);
//					bw.write(playerPosition);
				}
				
//				String playerInformation = String.format("%-15s%-20s%-10d%-10d%-10d%-10d%.1f\n", positionString, roster[i].getName(),
//						roster[i].getAge(), roster[i].getOffenseRating(), roster[i].getDefenseRating(), roster[i].getContractYears(), 
//						roster[i].getContractAmount());
				
				String playerInformation = String.format("%-10s\t%-20s\t%d\t%d\t%d\t%.1f\t\t%d\n", positionString,
						roster[i].getName(), roster[i].getAge(), roster[i].getOffenseRating(),
						roster[i].getDefenseRating(), roster[i].getContractAmount(), roster[i].getContractYears());
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

		Team t1 = new Team(League.getDragons().getTeamName(), League.getDragons().getRoster());

		t1.printTeamRosters();
	}

}
