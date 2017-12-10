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
	 * @throws IllegalArgumentException
	 * 			  Throws an IllegalArgumentException is the new team name is 30 characters or more
	 */
	public void setTeamName(String teamName) {
		if (teamName.length() > 30) {
			throw new IllegalArgumentException("Team name must be 30 characters or fewer.");
		}
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
	 * @throws IOException 
	 * 		Throws IOException if file is not found
	 */
	public void printTeamRosters() throws IOException {

//			FileWriter fw = new FileWriter("C:\\Users\\Owner\\OneDrive\\Basketball\\Rosters.txt", true);
			FileWriter fw = new FileWriter("/home/mmorth/Coding/Storage_Files/Rosters.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Team: " + teamName);
			bw.newLine();
			bw.write("Position\tFirst Name\tLast Name\tAge\tOffense\tDefense\tContract\tYears");
			bw.newLine();
			System.out.printf("");
			System.out.println("Position\tFirst Name\tLast Name\tAge\tOffense\tDefense\tContract\tYears");

			for (int i = 0; i < roster.length; i++) {
				String positionString = "";
				for (int j = 0; j < roster[i].getPosition().length; j++) {
					positionString += Integer.toString(roster[i].getPosition()[j]);
					positionString += " ";
				}
				
//				String playerInformation = String.format("%-15s%-20s%-10d%-10d%-10d%-10d%.1f\n", positionString, roster[i].getName(),
//						roster[i].getAge(), roster[i].getOffenseRating(), roster[i].getDefenseRating(), roster[i].getContractYears(), 
//						roster[i].getContractAmount());
				
				String playerInformation = String.format("%-10s\t%-15s\t%-15s\t%d\t%d\t%d\t%.1f\t\t%d\n", positionString,
						roster[i].getFirstName(), roster[i].getLastName(), roster[i].getAge(), roster[i].getOffenseRating(),
						roster[i].getDefenseRating(), roster[i].getContractAmount(), roster[i].getContractYears());
				bw.write(playerInformation);
				System.out.print(playerInformation);
				//bw.newLine();
			}

			bw.newLine();
			bw.newLine();

			fw.flush();
			bw.flush();

			fw.close();
			bw.close();

		

	}

	public static void main(String[] args) throws IOException {

		Team t1 = new Team(League.getDragons().getTeamName(), League.getDragons().getRoster());

		t1.printTeamRosters();
		
	}

}
