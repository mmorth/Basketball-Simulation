package simulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class League {

	ArrayList<Team> leagueTeams = new ArrayList<>();;

	public League(ArrayList<Team> leagueTeams) {
		this.leagueTeams = leagueTeams;
	}

	public League(File file) throws FileNotFoundException {

		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			String line = fileReader.nextLine();
			if (line.isEmpty()) {
				continue;
			}
			String teamName = line;

			ArrayList<Player> roster = new ArrayList<>();

			while (fileReader.hasNextLine()) {
				String playerLine = fileReader.nextLine();
				String[] playerInfo = playerLine.trim().split("\\s+");
				if (playerLine.isEmpty()) {
					break;
				}
				if (playerInfo[0].equals("//")) {
					continue;
				}
				String[] playerPosition = playerInfo[4].split(",");
				int[] playerPositionArray = new int[playerPosition.length];
				for (int i = 0; i < playerPosition.length; i++) {
					playerPositionArray[i] = Integer.parseInt(playerPosition[i]);
				}
				Player player = new Player(playerInfo[0], playerInfo[1], Integer.parseInt(playerInfo[2]),
						Integer.parseInt(playerInfo[3]), playerPositionArray, Integer.parseInt(playerInfo[5]),
						Integer.parseInt(playerInfo[6]), Integer.parseInt(playerInfo[7]));
				roster.add(player);
			}

			Team team = new Team(teamName, roster.toArray(new Player[roster.size()]));
			leagueTeams.add(team);
		}

		fileReader.close();

	}

	public static void main(String args[]) throws FileNotFoundException, IOException {
		File file = new File("C:\\Users\\Owner\\Dropbox\\Data.txt");
		League league = new League(file);
		
		for (int i = 0; i < league.leagueTeams.size(); i++) {
			league.leagueTeams.get(i).printTeamRosters();
		}
	}

}