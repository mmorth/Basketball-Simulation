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
		

		int offensiveRating = 100;
		int defensiveRating = 100;

		int[] position0 = {0};
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		
		int[] position1 = {1};
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		
		int[] position2 = {2};
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		
		int[] position3 = {1,2,3,4,5};
		roster[3] = new Player("AAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAA", offensiveRating, defensiveRating, position3, 5, 2, 25);
		
		int[] position4 = {3,4};
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		
		int[] position5 = {5};
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		
		int[] position6 = {6};
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		
		
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
		
		int offensiveRating = 90;
		int defensiveRating = 90;

		int[] position0 = {0};
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		
		int[] position1 = {1};
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		
		int[] position2 = {2};
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		
		int[] position3 = {2,3};
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		
		int[] position4 = {3,4};
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		
		int[] position5 = {5};
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		
		int[] position6 = {6};
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		
		
		return roster;
	}

}