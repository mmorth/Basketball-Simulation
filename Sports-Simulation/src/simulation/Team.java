package simulation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
	private Player[] roster = new Player[15];

	/**
	 * Stores the coach of the team
	 */
	private Coach coach;

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
	public Team(String teamName, Player[] roster, Coach coach) {

		setTeamName(teamName);

		setRoster(roster);

		setCoach(coach);

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
	 * @param teamName
	 *            New team name
	 * @throws IllegalArgumentException
	 *             teamName Throws an IllegalArgumentException is the new team name
	 *             is 30 characters or more
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
	public Player[] getRoster() {
		return roster;
	}

	/**
	 * Sets new roster of the team
	 * 
	 * @param roster
	 *            New team roster
	 */
	public void setRoster(Player[] roster) {
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
	public void setPlayer(int position, Player player) {
		roster[position] = player;

		generateNewTeamOffensiveRating();
		generateNewTeamDefensiveRating();
		generateNewTeamOverallRating();
		generateNewTeamSalary();
	}

	/**
	 * Returns the coach of the team
	 * 
	 * @return The coach of the team
	 */
	public Coach getCoach() {
		return coach;
	}

	/**
	 * Sets the coach of the team
	 * 
	 * @param The
	 *            new coach of the team
	 */
	public void setCoach(Coach coach) {
		this.coach = coach;
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
		int i = 0;

		for (i = 0; i < roster.length && roster[i] != null; i++) {
			overall += roster[i].getOffensiveRating();
		}

		teamOffensiveRating = overall / i;
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
		int i = 0;

		for (i = 0; i < roster.length && roster[i] != null; i++) {
			overall += roster[i].getDefensiveRating();
		}

		teamDefensiveRating = overall / i;
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
			if (roster[i] != null) {
				totalSalary += roster[i].getContractAmount();
			}
		}

		totalTeamSalary = totalSalary;
	}

	/**
	 * Prints the team rosters to the console
	 * 
	 * @throws IOException
	 *             Throws IOException if file is not found
	 */
	public void printTeamRosters() throws IOException {

		String d = System.getProperty("user.home");
		String dir = d + File.separator + "Documents" + File.separator + "Basketball-Simulation" + File.separator
				+ "Rosters.txt";
		final File file = new File(dir);
		file.getParentFile().mkdirs();// all directories down
		// PrintWriter restoreNo = new PrintWriter(new FileOutputStream(new File(file,
		// "restoreNo.txt")));

		// Setup the file saving location
		// FileWriter("C:\\Users\\Owner\\OneDrive\\Basketball\\Rosters.txt", true);
		// FileWriter fw = new
		// FileWriter("/home/mmorth/Coding/Storage_Files/Rosters.txt", true);
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);

		// Write the headers of the output
		bw.write(teamName);
		bw.newLine();
		bw.write(
				"Position\tFirst_Name\t\tLast_Name\t\tOverall\tOffense\tDefense\tAge\tContract_Amount\tContract_Years\tInside_Scoring\tMid-Range_Scoring\t3-Point_Scoring\tFree_Throw\tOffensive_Rebounding\tBall_Handling\tPassing\tPost_Defense\tPerimeter_Defense\tDefensive_Rebounding\tSteal\tBlock\tHeight\tSpeed\tStamina\tInjury\tPotential");
		bw.newLine();
		System.out.printf("");
		System.out.println(
				"Position\tFirst_Name\t\tLast_Name\tOverall\tOffense\tDefense\tAge\tContract_Amount\tContract_Years\tInside_Scoring\tMid-Range Scoring\t3-Point_Scoring\tFree_Throw\tOffensive_Rebounding\tBall_Handling\tPassing\tPost_Defense\tPerimeter_Defense\tDefensive_Rebounding\tSteal\tBlock\tHeight\tSpeed\tStamina\tInjury\tPotential");

		String coachInformation = String.format("%d\t\t\t%-15s\t%-15s\t%d\t\t%d\t\t%d\t\t%d\t%.1f\t\t\t\t%d", coach.getPosition(), coach.getCoachFirstName(), coach.getCoachLastName(), coach.getOverallRating(), coach.getOffenseRating(), coach.getDefenseRating(), coach.getAge(), coach.getContractAmount(), coach.getContractYears());
		
		bw.write(coachInformation);
		bw.newLine();
		
		// Display the position information
		for (int i = 0; i < roster.length && roster[i] != null; i++) {
			// String positionString = "";
			// for (int j = 0; j < roster[i].getPosition().length; j++) {
			// positionString += Integer.toString(roster[i].getPosition()[j]);
			// positionString += " ";
			// }

			// Format print player information
			String playerInformation = String.format(
					"%d\t\t\t%-15s\t%-15s\t%d\t\t%d\t\t%d\t\t%d\t%.1f\t\t\t\t%d\t\t\t\t%d\t\t\t\t%d\t\t\t\t\t%d\t\t\t\t%d\t\t\t%d\t\t\t\t\t\t%d\t\t\t\t%d\t\t%d\t\t\t\t%d\t\t\t\t\t%d\t\t\t\t\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d",
					roster[i].getPosition(), roster[i].getPlayerFirstName(), roster[i].getPlayerLastName(),
					roster[i].getOverallRating(), roster[i].getOffensiveRating(), roster[i].getDefensiveRating(),
					roster[i].getAge(), roster[i].getContractAmount(), roster[i].getContractYears(),
					roster[i].getInsideScoring(), roster[i].getMidRangeScoring(), roster[i].getThreePointScoring(),
					roster[i].getFreeThrow(), roster[i].getOffensiveRebounding(), roster[i].getBallHandling(),
					roster[i].getPassing(), roster[i].getPostDefense(), roster[i].getPerimeterDefense(),
					roster[i].getDefensiveRebounding(), roster[i].getSteal(), roster[i].getBlock(),
					roster[i].getHeight(), roster[i].getSpeed(), roster[i].getStamina(), roster[i].getInjury(),
					roster[i].getPotential());

			bw.write(playerInformation);
			bw.newLine();
			System.out.println(playerInformation);
			// bw.newLine();
		}

		bw.newLine();
		bw.newLine();

		fw.flush();
		bw.flush();

		fw.close();
		bw.close();

	}

	// TODO Remove main method once testing is complete
	public static void main(String[] args) throws IOException {

		Coach genCoach = new Coach("First", "Last", 100, 100, 25, 5, 2);
		Team t1 = new Team(TestMatchups.getOneHundred().getTeamName(), TestMatchups.getOneHundred().getRoster(), genCoach);

		t1.printTeamRosters();

	}

}