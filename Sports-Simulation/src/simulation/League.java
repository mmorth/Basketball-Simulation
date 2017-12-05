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
	
	public static Athlete[] createDragonsRoster() {
		Athlete[] roster = new Athlete[7];
		

		int[] position0 = {0};
		roster[0] = new Coach("Travis Johnson", 60, 60, position0, 5, 2, 25);
		
		int[] position1 = {1};
		roster[1] = new Player("Dayton", 60, 60, position1, 5, 2, 25);
		
		int[] position2 = {2,3,4};
		roster[2] = new Player("Doug Martin", 60, 60, position2, 5, 2, 25);
		
		int[] position3 = {2,3};
		roster[3] = new Player("Ryan Jax", 60, 60, position3, 5, 2, 25);
		
		int[] position4 = {4,5};
		roster[4] = new Player("Travis Davis", 60, 60, position4, 5, 2, 25);
		
		int[] position5 = {5};
		roster[5] = new Player("Greg Gates", 60, 60, position5, 5, 2, 25);
		
		int[] position6 = {6};
		roster[6] = new Player("Mason Ponder", 60, 60, position6, 5, 2, 25);
		
		
		return roster;
	}

	public static Team getGators() {
		return Gators;
	}

	public static void setGators(Team gators) {
		Gators = gators;
	}

	public static Athlete[] createGatorsRoster() {
		Athlete[] roster = new Athlete[7];
		

		int[] position0 = {0};
		roster[0] = new Coach("Dennis Smith", 40, 40, position0, 5, 2, 25);
		
		int[] position1 = {1};
		roster[1] = new Player("Isaiah Tate", 40, 40, position1, 5, 2, 25);
		
		int[] position2 = {2};
		roster[2] = new Player("Curtis Baron", 40, 40, position2, 5, 2, 25);
		
		int[] position3 = {2,3};
		roster[3] = new Player("Steve Wells", 40, 40, position3, 5, 2, 25);
		
		int[] position4 = {3,4};
		roster[4] = new Player("Kenny Carter", 40, 40, position4, 5, 2, 25);
		
		int[] position5 = {5};
		roster[5] = new Player("Brock Lyons", 40, 40, position5, 5, 2, 25);
		
		int[] position6 = {6};
		roster[6] = new Player("Steve Wells Jr.", 40, 40, position6, 5, 2, 25);
		
		
		return roster;
	}

}