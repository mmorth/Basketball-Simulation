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
			
			Coach coach = new Coach();
			
			while (fileReader.hasNextLine()) {
				String playerLine = fileReader.nextLine();
				String[] playerInfo = playerLine.trim().split("\\s+");
				if (playerLine.isEmpty()) {
					break;
				}
				if (playerInfo[0].equals("//")) {
					continue;
				}
//				String[] playerPosition = playerInfo[0].split(",");
//				int[] playerPositionArray = new int[playerPosition.length];
//				for (int i = 0; i < playerPosition.length; i++) {
//					playerPositionArray[i] = Integer.parseInt(playerPosition[i]);
//				}
				coach = new Coach(playerInfo[0], playerInfo[1], Integer.parseInt(playerInfo[2]),
						Integer.parseInt(playerInfo[3]), Integer.parseInt(playerInfo[8]), Double.parseDouble(playerInfo[7]),
						Integer.parseInt(playerInfo[8]));
			}

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
//				String[] playerPosition = playerInfo[0].split(",");
//				int[] playerPositionArray = new int[playerPosition.length];
//				for (int i = 0; i < playerPosition.length; i++) {
//					playerPositionArray[i] = Integer.parseInt(playerPosition[i]);
//				}
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
						Integer.parseInt(playerInfo[24]), Integer.parseInt(playerInfo[25]));
				roster.add(player);
			}

			Team team = new Team(teamName, roster.toArray(new Player[roster.size()]), coach);
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