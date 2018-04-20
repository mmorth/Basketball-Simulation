package simulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class creates a basketball league either from an ArrayList or reading
 * from a file
 * 
 * @author Matthew Orth
 *
 */
public class League {

	/**
	 * Stores the teams in the league
	 */
	ArrayList<Team> leagueTeams = new ArrayList<>();;

	/**
	 * Creates a league with teams from the leagueTeams ArrayList
	 * 
	 * @param leagueTeams
	 *            The teams in the league
	 */
	public League(ArrayList<Team> leagueTeams) {
		this.leagueTeams = leagueTeams;
	}

	/**
	 * Creates a basketball league from reading from a file
	 * 
	 * @param file
	 *            The file that is read to create the basketball leauge
	 * @throws FileNotFoundException
	 *             Throws a FileNotFoundException if the specified file is not found
	 */
	public League(File file) throws FileNotFoundException {

		// Read through the file
		Scanner fileReader = new Scanner(file);

		// While there are lines in the file
		while (fileReader.hasNextLine()) {
			// Read in the first line
			String line = fileReader.nextLine();
			// Skip line if empty
			if (line.isEmpty()) {
				continue;
			}

			// The first line contains the teamName
			String teamName = line;

			Coach coach = new Coach();

			ArrayList<Player> roster = new ArrayList<>();

			while (fileReader.hasNextLine()) {
				// Read in information for the players and coach
				String playerLine = fileReader.nextLine();
				// Split the read in information
				String[] playerInfo = playerLine.trim().split("\\s+");
				// Stop reading information for this team if line is empty
				if (playerLine.isEmpty()) {
					break;
				}
				// Continue if line is comment or the heading line
				if (playerInfo[0].equals("//") || playerInfo[0].equals("Position")) {
					continue;
				}

				// Read in the coach information
				if (Integer.parseInt(playerInfo[0]) == 0) {
					coach = new Coach(Integer.parseInt(playerInfo[0]), playerInfo[1], playerInfo[2],
							Integer.parseInt(playerInfo[6]), Double.parseDouble(playerInfo[7]),
							Integer.parseInt(playerInfo[8]), Integer.parseInt(playerInfo[9]),
							Integer.parseInt(playerInfo[10]), Integer.parseInt(playerInfo[11]),
							Integer.parseInt(playerInfo[12]), Integer.parseInt(playerInfo[13]),
							Integer.parseInt(playerInfo[14]), Integer.parseInt(playerInfo[15]),
							Integer.parseInt(playerInfo[16]), Integer.parseInt(playerInfo[17]),
							Integer.parseInt(playerInfo[18]), Integer.parseInt(playerInfo[19]),
							Integer.parseInt(playerInfo[20]), Integer.parseInt(playerInfo[21]),
							Integer.parseInt(playerInfo[22]), Integer.parseInt(playerInfo[23]),
							Integer.parseInt(playerInfo[24]), Integer.parseInt(playerInfo[25]));
				} else {

					// Read in the player information
					Player player = new Player(Integer.parseInt(playerInfo[0]), playerInfo[1], playerInfo[2],
							Integer.parseInt(playerInfo[6]), Double.parseDouble(playerInfo[7]),
							Integer.parseInt(playerInfo[8]), Integer.parseInt(playerInfo[9]),
							Integer.parseInt(playerInfo[10]), Integer.parseInt(playerInfo[11]),
							Integer.parseInt(playerInfo[12]), Integer.parseInt(playerInfo[13]),
							Integer.parseInt(playerInfo[14]), Integer.parseInt(playerInfo[15]),
							Integer.parseInt(playerInfo[16]), Integer.parseInt(playerInfo[17]),
							Integer.parseInt(playerInfo[18]), Integer.parseInt(playerInfo[19]),
							Integer.parseInt(playerInfo[20]), Integer.parseInt(playerInfo[21]),
							Integer.parseInt(playerInfo[22]), Integer.parseInt(playerInfo[23]),
							Integer.parseInt(playerInfo[24]), Integer.parseInt(playerInfo[25]),
							Integer.parseInt(playerInfo[26]));
					roster.add(player);
				}
			}

			// Create the team read from the file and add it to the league
			Team team = new Team(teamName, roster.toArray(new Player[roster.size()]), coach);
			leagueTeams.add(team);
		}

		fileReader.close();

	}

	// TODO Remove main method when testing is complete
	public static void main(String args[]) throws FileNotFoundException, IOException {
		File file = new File("/home/mmorth/Coding/Storage_Files/Data.txt");
		League league = new League(file);

		for (int i = 0; i < league.leagueTeams.size(); i++) {
			league.leagueTeams.get(i).printTeamRosters();
		}
	}

}