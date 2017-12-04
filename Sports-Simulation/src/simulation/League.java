package simulation;

public class League {
	
	private static Team[] teams;

	private static Team Gators = new Team("Gators", createGatorsRoster());

	private static Team Dragons = new Team("Dragons", createDragonsRoster());

	public static void main(String[] args) {

		Dragons = new Team("Dragons", createDragonsRoster());
		Gators = new Team("Gators", createGatorsRoster());
		
	}

	public static Team getDragons() {
		return Dragons;
	}

	public static void setDragons(Team dragons) {
		Dragons = dragons;
	}
	
	public static Player[] createDragonsRoster() {
		Player[] roster = new Player[7];
		

		int[] position0 = {0};
		roster[0] = new Player("Travis Johnson", 100, 100, position0, 5, 2, 25);
		
		int[] position1 = {1};
		roster[1] = new Player("Dayton", 100, 100, position1, 5, 2, 25);
		
		int[] position2 = {2,3,4};
		roster[2] = new Player("Doug Martin", 100, 100, position2, 5, 2, 25);
		
		int[] position3 = {2,3};
		roster[3] = new Player("Ryan Jax", 100, 100, position3, 5, 2, 25);
		
		int[] position4 = {4,5};
		roster[4] = new Player("Travis Davis", 100, 100, position4, 5, 2, 25);
		
		int[] position5 = {5};
		roster[5] = new Player("Greg Gates", 100, 100, position5, 5, 2, 25);
		
		int[] position6 = {6};
		roster[6] = new Player("Clyde Glaxondale", 100, 100, position6, 5, 2, 25);
		
		
		return roster;
	}

	public static Team getGators() {
		return Gators;
	}

	public static void setGators(Team gators) {
		Gators = gators;
	}

	public static Player[] createGatorsRoster() {
		Player[] roster = new Player[7];
		

		int[] position0 = {0};
		roster[0] = new Player("Dennis Smith", 95, 95, position0, 5, 2, 25);
		
		int[] position1 = {1};
		roster[1] = new Player("Isaiah Tate", 95, 95, position1, 5, 2, 25);
		
		int[] position2 = {2};
		roster[2] = new Player("Curtis Baron", 95, 95, position2, 5, 2, 25);
		
		int[] position3 = {2,3};
		roster[3] = new Player("Steve Wells", 1000, 1000, position3, 5, 2, 25);
		
		int[] position4 = {3,4};
		roster[4] = new Player("Kenny Carter", 95, 95, position4, 5, 2, 25);
		
		int[] position5 = {5};
		roster[5] = new Player("Brock Lyons", 95, 95, position5, 5, 2, 25);
		
		int[] position6 = {6};
		roster[6] = new Player("Steve Wells Jr.", 95, 95, position6, 5, 2, 25);
		
		
		return roster;
	}

}