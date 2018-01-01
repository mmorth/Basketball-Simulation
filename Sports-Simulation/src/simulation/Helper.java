package simulation;

/**
 * Helper methods for the classes of the simulation package
 * 
 * @author Matthew Orth
 *
 */
class Helper {

	/**
	 * Determines if a string contains a space
	 * 
	 * @param word
	 *            The string to determine if it contains a space
	 * @return True if the string contains a space, false otherwise
	 */
	static boolean containsSpaces(String word) {

		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == ' ') {
				return true;
			}
		}

		return false;

	}

	/**
	 * Creates a string to output for the fail messages for the JUnit tests
	 * 
	 * @param team1OverallRating
	 * @param team2OverallRating
	 * @param gs
	 *            The Game Simulation
	 * @param team1LowerWinPercentage
	 * @param team1UpperWinPercentage
	 * @param team1WinPercentage
	 * @param team1LowerAverageScore
	 * @param team1UpperAverageScore
	 * @param team1AverageScore
	 * @param team2LowerWinPercentage
	 * @param team2UpperWinPercentage
	 * @param team2WinPercentage
	 * @param team2LowerAverageScore
	 * @param team2UpperAverageScore
	 * @param team2AverageScore
	 * @return
	 */
	static String createString(int team1OverallRating, int team2OverallRating, GameSimulation gs,
			double team1LowerWinPercentage, double team1UpperWinPercentage, double team1WinPercentage,
			double team1LowerAverageScore, double team1UpperAverageScore, double team1AverageScore,
			double team2LowerWinPercentage, double team2UpperWinPercentage, double team2WinPercentage,
			double team2LowerAverageScore, double team2UpperAverageScore, double team2AverageScore) {
		return String.format("\nTEAM1 Rating: " + team1OverallRating + "\nWin Percentage -> Lower Bound: "
				+ team1LowerWinPercentage + " Actual Percentage: " + team1WinPercentage + " Upper Bound: "
				+ team1UpperWinPercentage + "\nAverage Score -> Lower Bound: " + team1LowerAverageScore
				+ " Actual Score: " + gs.getTeam1AverageScore() + " Upper Bound: " + team1UpperAverageScore + "\n"
				+ "TEAM2 Rating: " + team2OverallRating + "\nWin Percentage -> Lower Bound: " + team2LowerWinPercentage
				+ " Actual Percentage: " + team2WinPercentage + " Upper Bound: " + team2UpperWinPercentage
				+ "\nAverage Score -> Lower Bound: " + team2LowerAverageScore + " Actual Score: "
				+ gs.getTeam2AverageScore() + " Upper Bound: " + team2UpperAverageScore + "\n");
	}

}