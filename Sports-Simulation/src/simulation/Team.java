package simulation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Represents a basketball team. Stores name and rating.
 * 
 * @author Matthew Orth
 *
 */
public class Team {

	/**
	 * Stores the roster for the team
	 */
	private Player[] roster = new Player[15];

	/**
	 * Stores the players currently on the court
	 */
	private Player[] onCourt = new Player[5];

	/**
	 * Stores the players currently on the bench
	 */
	private Player[] onBench = new Player[15];

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
	 * Stores the maximum team size
	 */
	private int maximumTeamSize = 15;

	/**
	 * Stores the maximum number of players on the court at a time per team
	 */
	private int numPlayersOnCourt = 5;

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

		// checkValidRotationPossessions();

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

		setOnCourt();
		setOnBench();
		generateNewTeamOffensiveRating();
		generateNewTeamDefensiveRating();
		generateNewTeamOverallRating();
		generateNewTeamSalary();

		// checkValidRotationPossessions();
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

		// checkValidRotationPossessions();
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
	 * Sets the coach of the team. It also resets the coach boost ratings of the
	 * players on the team.
	 * 
	 * @param The
	 *            new coach of the team
	 */
	public void setCoach(Coach coach) {

		if (this.coach != null) {
			removeCoachRatingsBoost();
		}

		this.coach = coach;

		coachBoostPlayerRatings();
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

		for (i = 0; i < onCourt.length && onCourt[i] != null; i++) {
			overall += onCourt[i].getOffensiveRating();
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

		for (i = 0; i < onCourt.length && onCourt[i] != null; i++) {
			overall += onCourt[i].getDefensiveRating();
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
	 * Returns the onCourt rating of the player
	 * 
	 * @return The onCourt rating of the player
	 */
	public Player[] getOnCourt() {
		return onCourt;
	}

	/**
	 * Sets the onCourt rating of the player
	 * 
	 * @param The
	 *            new onCourt rating of the player
	 */
	public void setOnCourt() {
		onCourt = new Player[numPlayersOnCourt];

		for (int i = 0; i < numPlayersOnCourt; i++) {
			onCourt[i] = roster[i];
		}

	}

	/**
	 * Returns the onBench rating of the player
	 * 
	 * @return The onBench rating of the player
	 */
	public Player[] getOnBench() {
		return onBench;
	}

	/**
	 * Sets the onBench rating of the player
	 * 
	 * @param The
	 *            new onBench rating of the player
	 */
	public void setOnBench() {
		onBench = new Player[maximumTeamSize - numPlayersOnCourt];
		int benchLocation = 0;

		for (int i = numPlayersOnCourt; i < maximumTeamSize && roster[i] != null; i++, benchLocation++) {
			onBench[benchLocation] = roster[i];
		}

	}

	/**
	 * Updates the player ratings on the team based on the coach's overall rating in
	 * categories. Used when a coach is added to the team.
	 */
	public void coachBoostPlayerRatings() {
		for (int i = 0; i < roster.length && roster[i] != null; i++) {

			// Offensive Boosts
			roster[i]
					.setInsideScoring(roster[i].getInsideScoring() + (int) Math.round(coach.getInsideScoring() / 20.0));
			roster[i].setMidRangeScoring(
					roster[i].getMidRangeScoring() + (int) Math.round(coach.getMidRangeScoring() / 20.0));
			roster[i].setThreePointScoring(
					roster[i].getThreePointScoring() + (int) Math.round(coach.getThreePointScoring() / 20.0));
			roster[i].setFreeThrow(roster[i].getFreeThrow() + (int) Math.round(coach.getFreeThrow() / 20.0));
			roster[i].setOffensiveRebounding(
					roster[i].getOffensiveRebounding() + (int) Math.round(coach.getDefensiveRebounding() / 20.0));
			roster[i].setBallHandling(roster[i].getBallHandling() + (int) Math.round(coach.getBallHandling() / 20.0));
			roster[i].setPassing(roster[i].getPassing() + (int) Math.round(coach.getPassing() / 20.0));

			// Defensive Boosts
			roster[i].setPostDefense(roster[i].getPostDefense() + (int) Math.round(coach.getPostDefense() / 20.0));
			roster[i].setPerimeterDefense(
					roster[i].getPerimeterDefense() + (int) Math.round(coach.getPerimeterDefense() / 20.0));
			roster[i].setDefensiveRebounding(
					roster[i].getDefensiveRebounding() + (int) Math.round(coach.getDefensiveRebounding() / 20.0));
			roster[i].setSteal(roster[i].getSteal() + (int) Math.round(coach.getSteal() / 20.0));
			roster[i].setBlock(roster[i].getBlock() + (int) Math.round(coach.getBlock() / 20.0));

			// General Boosts
			// roster[i].setHeight(roster[i].getHeight() + (int) coachOverallBoost);
			roster[i].setSpeed(roster[i].getSpeed() + (int) Math.round(coach.getSpeed() / 20.0));
			roster[i].setStamina(roster[i].getStamina() + (int) Math.round(coach.getStamina() / 20.0));
			roster[i].setInjury(roster[i].getInjury() + (int) Math.round(coach.getInjury() / 20.0));
			roster[i].setPotential(roster[i].getPotential() + (int) Math.round(coach.getPotential() / 20.0));
		}
	}

	/**
	 * Updates the player ratings on the team based on the coach's overall rating in
	 * categories. Used when a coach is removed from the team.
	 */
	public void removeCoachRatingsBoost() {
		for (int i = 0; i < roster.length && roster[i] != null; i++) {

			// Offensive Boosts
			roster[i]
					.setInsideScoring(roster[i].getInsideScoring() - (int) Math.round(coach.getInsideScoring() / 20.0));
			roster[i].setMidRangeScoring(
					roster[i].getMidRangeScoring() - (int) Math.round(coach.getMidRangeScoring() / 20.0));
			roster[i].setThreePointScoring(
					roster[i].getThreePointScoring() - (int) Math.round(coach.getThreePointScoring() / 20.0));
			roster[i].setFreeThrow(roster[i].getFreeThrow() - (int) Math.round(coach.getFreeThrow() / 20.0));
			roster[i].setOffensiveRebounding(
					roster[i].getOffensiveRebounding() - (int) Math.round(coach.getDefensiveRebounding() / 20.0));
			roster[i].setBallHandling(roster[i].getBallHandling() - (int) Math.round(coach.getBallHandling() / 20.0));
			roster[i].setPassing(roster[i].getPassing() - (int) Math.round(coach.getPassing() / 20.0));

			// Defensive Boosts
			roster[i].setPostDefense(roster[i].getPostDefense() - (int) Math.round(coach.getPostDefense() / 20.0));
			roster[i].setPerimeterDefense(
					roster[i].getPerimeterDefense() - (int) Math.round(coach.getPerimeterDefense() / 20.0));
			roster[i].setDefensiveRebounding(
					roster[i].getDefensiveRebounding() - (int) Math.round(coach.getDefensiveRebounding() / 20.0));
			roster[i].setSteal(roster[i].getSteal() - (int) Math.round(coach.getSteal() / 20.0));
			roster[i].setBlock(roster[i].getBlock() - (int) Math.round(coach.getBlock() / 20.0));

			// General Boosts
			// roster[i].setHeight(roster[i].getHeight() + (int) coachOverallBoost);
			roster[i].setSpeed(roster[i].getSpeed() - (int) Math.round(coach.getSpeed() / 20.0));
			roster[i].setStamina(roster[i].getStamina() - (int) Math.round(coach.getStamina() / 20.0));
			roster[i].setInjury(roster[i].getInjury() - (int) Math.round(coach.getInjury() / 20.0));
			roster[i].setPotential(roster[i].getPotential() - (int) Math.round(coach.getPotential() / 20.0));

		}
	}

	/**
	 * Substitutes a player on the bench with a player on the court if necessary
	 * 
	 * @param possessions
	 *            The number of possessions remaining in the game
	 */
	public void substitutePlayers(int possessions) {

		// Check sub for Point Guard
		if (onCourt[0].getStamina() <= 0 || onCourt[0].getRotationPossessionsRemaining() <= 0) {
			int sub = selectPlayer(onCourt[0], possessions);
			if (sub != -1) {
				Player temp = onCourt[0];
				onCourt[0] = onBench[sub];
				onBench[sub] = temp;
			}
		}

		// Check sub for Shooting Guard
		if (onCourt[1].getStamina() <= 0 || onCourt[1].getRotationPossessionsRemaining() <= 0) {
			int sub = selectPlayer(onCourt[1], possessions);
			if (sub != -1) {
				Player temp = onCourt[1];
				onCourt[1] = onBench[sub];
				onBench[sub] = temp;
			}
		}

		// Check sub for Small Forward
		if (onCourt[2].getStamina() <= 0 || onCourt[2].getRotationPossessionsRemaining() <= 0) {
			int sub = selectPlayer(onCourt[2], possessions);
			if (sub != -1) {
				Player temp = onCourt[2];
				onCourt[2] = onBench[sub];
				onBench[sub] = temp;
			}
		}

		// Check sub for Power Forward
		if (onCourt[3].getStamina() <= 0 || onCourt[3].getRotationPossessionsRemaining() <= 0) {
			int sub = selectPlayer(onCourt[3], possessions);
			if (sub != -1) {
				Player temp = onCourt[3];
				onCourt[3] = onBench[sub];
				onBench[sub] = temp;
			}
		}

		// Check sub for Center
		if (onCourt[4].getStamina() <= 0 || onCourt[4].getRotationPossessionsRemaining() <= 0) {
			int sub = selectPlayer(onCourt[4], possessions);
			if (sub != -1) {
				Player temp = onCourt[4];
				onCourt[4] = onBench[sub];
				onBench[sub] = temp;
			}
		}

		generateNewTeamOffensiveRating();
		generateNewTeamDefensiveRating();
		generateNewTeamOverallRating();

	}

	/**
	 * Selects the player to sub into the game based on their stamina and rotations
	 * possessions remaining
	 * 
	 * @param possessions
	 *            The number of possessions remaining in the game
	 * @return The player on the bench to sub into the game
	 */
	public int selectPlayer(Player subOut, int possessions) {

		boolean isEmptyBench = true;

		for (int i = 0; i < onBench.length && onBench[i] != null; i++) {
			if (onBench[i] != null && !(onBench[i].equals(new Player()))) {
				isEmptyBench = false;
			}
		}

		if (isEmptyBench == true) {
			return -1;
		}

		int subPlayer = -1;
		int maxMinutes = 0;

		for (int i = 0; i < onBench.length; i++) {
			if (onBench[i] != null) {
				if (onBench[i].getRotationPossessionsRemaining() > maxMinutes && onBench[i].getStamina() > 30
						&& subOut.getStamina() >= 30 && subOut.getRotationPossessionsRemaining() >= 0) {
					subPlayer = i;
					maxMinutes = onBench[i].getRotationPossessionsRemaining();
				}
			}
		}

		// for (int i = 0; i < onBench.length && onBench[i] != null; i++) {
		// if (onBench[i].getRotationPossessionsRemaining() >= possessions &&
		// onBench[i].getStamina() >= 25) {
		// subPlayer = i;
		// break;
		// }
		// // if (onBench[i].getRotationPossessionsRemaining() > maxMinutes &&
		// // onBench[i].getStamina() > 75) {
		// // subPlayer = i;
		// // }
		// }
		//
		// // If no sub has been found, select the bench player with the most rotation
		// // minutes remaining
		// if (subPlayer == -1) {
		// for (int i = 0; i < onBench.length; i++) {
		// if (onBench[i] != null) {
		// if (onBench[i].getRotationPossessionsRemaining() >= maxMinutes) {
		// subPlayer = i;
		// maxMinutes = onBench[i].getRotationPossessionsRemaining();
		// }
		// }
		// }
		// }

		if (subPlayer == -1) {
			return 1;
		}

		return subPlayer;

	}

	/**
	 * Prints the team rosters to the console
	 * 
	 * @throws IOException
	 *             Throws IOException if file is not found
	 */
	public void printTeamRosters() throws IOException {

		// Setup file saving location
		String d = System.getProperty("user.home");
		String dir = d + File.separator + "Documents" + File.separator + "Basketball-Simulation" + File.separator
				+ "Rosters.txt";
		final File file = new File(dir);
		file.getParentFile().mkdirs();// all directories down

		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);

		// Write the headers of the output
		bw.write(teamName);
		bw.newLine();

		// Print the coach information
		bw.write(
				"Position\tFirst_Name\t\tLast_Name\t\tOverall\tOffense\tDefense\tAge\tContract_Amount\tContract_Years\tInside_Scoring\tMid-Range_Scoring\t3-Point_Scoring\tFree_Throw\tOffensive_Rebounding\tBall_Handling\tPassing\tPost_Defense\tPerimeter_Defense\tDefensive_Rebounding\tSteal\tBlock\tHeight\tSpeed\tStamina\tInjury\tPotential");
		bw.newLine();
		System.out.printf("");
		System.out.println(
				"Position\tFirst_Name\t\tLast_Name\tOverall\tOffense\tDefense\tAge\tContract_Amount\tContract_Years\tInside_Scoring\tMid-Range Scoring\t3-Point_Scoring\tFree_Throw\tOffensive_Rebounding\tBall_Handling\tPassing\tPost_Defense\tPerimeter_Defense\tDefensive_Rebounding\tSteal\tBlock\tHeight\tSpeed\tStamina\tInjury\tPotential");

		String coachInformation = String.format("%d\t\t\t%-15s\t%-15s\t%d\t\t%d\t\t%d\t\t%d\t%.1f\t\t\t\t%d",
				coach.getPosition(), coach.getFirstName(), coach.getLastName(), coach.getOverallRating(),
				coach.getOffensiveRating(), coach.getDefensiveRating(), coach.getAge(), coach.getContractAmount(),
				coach.getContractYears());

		bw.write(coachInformation);
		bw.newLine();

		// Print the player information
		for (int i = 0; i < roster.length && roster[i] != null; i++) {

			// Format print player information
			String playerInformation = String.format(
					"%d\t\t\t%-15s\t%-15s\t%d\t\t%d\t\t%d\t\t%d\t%.1f\t\t\t\t%d\t\t\t\t%d\t\t\t\t%d\t\t\t\t\t%d\t\t\t\t%d\t\t\t%d\t\t\t\t\t\t%d\t\t\t\t%d\t\t%d\t\t\t\t%d\t\t\t\t\t%d\t\t\t\t\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d",
					roster[i].getPosition(), roster[i].getFirstName(), roster[i].getLastName(),
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

		TestMatchups tm = new TestMatchups();

		int noCoachRating = 30;

		Coach ct1 = new Coach(1, "First", "Last", 25, 5, 2, noCoachRating, noCoachRating, noCoachRating, noCoachRating,
				noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating,
				noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating);
		Team t1 = new Team(tm.getOneHundred().getTeamName(), tm.getOneHundred().getRoster(), ct1);

		t1.printTeamRosters();

	}

	/**
	 * Calculates and returns the total shooting rating of the players currently in
	 * the game
	 * 
	 * @return The total shooting rating of the players currently in the game
	 */
	public int calculateTotalShootingRating() {
		int totalShootingRating = 0;

		for (int i = 0; i < onCourt.length && onCourt[i] != null; i++) {
			totalShootingRating += onCourt[i].getAverageShootingRating();
		}

		return totalShootingRating;
	}

	/**
	 * Calculates and returns the total passing rating of the players currently in
	 * the game
	 * 
	 * @return The total passing rating of the players currently in the game
	 */
	public int calculateTotalPassingRating() {
		int totalPassingRating = 0;

		for (int i = 0; i < onCourt.length && onCourt[i] != null; i++) {
			totalPassingRating += onCourt[i].getPassing();
		}

		return totalPassingRating;
	}

	/**
	 * Calculates and returns the total rebounding rating of the players currently
	 * in the game
	 * 
	 * @return The total rebounding rating of the player currently in the game
	 */
	public int getTotalReboundingRating() {
		int totalReboundingRating = 0;

		for (int i = 0; i < onCourt.length && onCourt[i] != null; i++) {
			totalReboundingRating += onCourt[i].getOffensiveRebounding() + onCourt[i].getDefensiveRebounding();
		}

		return totalReboundingRating / 2;
	}

	/**
	 * Determines whether the rotation possessions specified are valid. Valid means
	 * the total rotation minutes for the team adds up to 1000 possessions.
	 * 
	 * @throws IllegalStateException
	 *             Throws an IllegalStateException if the rotation possessions of
	 *             the team does not add up to 1000 possessions
	 */
	public void checkValidRotationPossessions() {

		int rotationPossessions = 0;

		for (int i = 0; i < roster.length; i++) {
			if (roster[i] != null) {
				rotationPossessions += roster[i].getInitialRotationPossessions();
			}
		}

		if (rotationPossessions != 1000) {
			throw new IllegalStateException("The total rotation possessions of the team must add up to 1000.");
		}

	}

	/**
	 * Increases each player's current stamina level by 25 at the end of the 1st and
	 * 3rd quarter
	 */
	public void updatePlayerStaminaQuarter() {
		for (int i = 0; i < roster.length && roster[i] != null; i++) {
			roster[i].setStamina(roster[i].getStamina() + 25);
		}
	}

	/**
	 * Increases each player's current stamina level by 50 at the end of halftime
	 */
	public void updatePlayerStaminaHalf() {
		for (int i = 0; i < roster.length && roster[i] != null; i++) {
			roster[i].setStamina(roster[i].getStamina() + 50);
		}
	}

	// /**
	// * Updates the player's ratings based on their current stamina remaining
	// */
	// public void updatePlayerRatingsStamina() {
	// for (int i = 0; i < roster.length; i++) {
	// if (roster[i] != null) {
	// roster[i].setInsideScoring(roster[i].getInsideScoring() - (20 - ((int)
	// roster[i].getStamina() / 100)*20));
	// roster[i].setMidRangeScoring(roster[i].getMidRangeScoring() - (20 - ((int)
	// roster[i].getStamina() / 100)*20));
	// roster[i].setThreePointScoring(roster[i].getThreePointScoring() - (20 -
	// ((int) roster[i].getStamina() / 100)*20));
	// roster[i].setFreeThrow(roster[i].getFreeThrow() - (20 - ((int)
	// roster[i].getStamina() / 100)*20));
	// roster[i].setOffensiveRebounding(roster[i].getOffensiveRebounding() - (20 -
	// ((int) roster[i].getStamina() / 100)*20));
	// roster[i].setBallHandling(roster[i].getBallHandling() - (20 - ((int)
	// roster[i].getStamina() / 100)*20));
	// roster[i].setPassing(roster[i].getPassing() - (20 - ((int)
	// roster[i].getStamina() / 100)*20));
	// roster[i].setPostDefense(roster[i].getPostDefense() - (20 - ((int)
	// roster[i].getStamina() / 100)*20));
	// roster[i].setPerimeterDefense(roster[i].getPerimeterDefense() - (20 - ((int)
	// roster[i].getStamina() / 100)*20));
	// roster[i].setDefensiveRebounding(roster[i].getDefensiveRebounding() - (20 -
	// ((int) roster[i].getStamina() / 100)*20));
	// roster[i].setSteal(roster[i].getSteal() - (20 - ((int) roster[i].getStamina()
	// / 100)*20));
	// roster[i].setBlock(roster[i].getBlock() - (20 - ((int) roster[i].getStamina()
	// / 100)*20));
	// roster[i].setHeight(roster[i].getHeight() - (20 - ((int)
	// roster[i].getStamina() / 100)*20));
	// roster[i].setSpeed(roster[i].getSpeed() - (20 - ((int) roster[i].getStamina()
	// / 100)*20));
	// roster[i].setInjury(roster[i].getInjury() - (20 - ((int)
	// roster[i].getStamina() / 100)*20));
	// roster[i].setPotential(potential);
	// roster[i].setInitialRotationPossessions(rotationPossessions);
	// roster[i].setRotationPossessionsRemaining(rotationPossessions);
	// roster[i].setPosition(position);
	// }
	// }
	// }

}