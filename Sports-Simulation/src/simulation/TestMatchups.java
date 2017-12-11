package simulation;

public class TestMatchups {

	private static Team[] teams;

	private static Team OneHundred = new Team("100", createOneHundredRoster());
	private static Team NinetyFive = new Team("95", createNinetyFiveRoster());
	private static Team Ninety = new Team("90", createNinetyRoster());
	private static Team EightyFive = new Team("85", createEightyFiveRoster());
	private static Team Eighty = new Team("80", createEightyRoster());
	private static Team SeventyFive = new Team("75", createSeventyFiveRoster());
	private static Team Seventy = new Team("70", createSeventyRoster());
	private static Team SixtyFive = new Team("65", createSixtyFiveRoster());
	private static Team Sixty = new Team("60", createSixtyRoster());
	private static Team FiftyFive = new Team("55", createFiftyFiveRoster());
	private static Team Fifty = new Team("50", createFiftyRoster());
	private static Team FourtyFive = new Team("45", createFourtyFiveRoster());
	private static Team Fourty = new Team("40", createFourtyRoster());
	private static Team ThirtyFive = new Team("35", createThirtyFiveRoster());
	private static Team Thirty = new Team("30", createThirtyRoster());

	public static void main(String[] args) {

	}

	public static Athlete[] createOneHundredRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 100;
		int defensiveRating = 100;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createNinetyFiveRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 95;
		int defensiveRating = 95;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createNinetyRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 90;
		int defensiveRating = 90;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createEightyFiveRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 85;
		int defensiveRating = 85;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createEightyRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 80;
		int defensiveRating = 80;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createSeventyFiveRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 75;
		int defensiveRating = 75;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createSeventyRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 70;
		int defensiveRating = 70;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createSixtyFiveRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 65;
		int defensiveRating = 65;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createSixtyRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 60;
		int defensiveRating = 60;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createFiftyFiveRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 55;
		int defensiveRating = 55;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createFiftyRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 50;
		int defensiveRating = 50;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createFourtyFiveRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 45;
		int defensiveRating = 45;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createFourtyRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 40;
		int defensiveRating = 40;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createThirtyFiveRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 35;
		int defensiveRating = 35;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}
	
	public static Athlete[] createThirtyRoster() {
		Athlete[] roster = new Athlete[7];
		int offensiveRating = 30;
		int defensiveRating = 30;
		int[] position0 = { 0 };
		roster[0] = new Coach("First", "Last", offensiveRating, defensiveRating, position0, 5, 2, 25);
		int[] position1 = { 1 };
		roster[1] = new Player("First", "Last", offensiveRating, defensiveRating, position1, 5, 2, 25);
		int[] position2 = { 2 };
		roster[2] = new Player("First", "Last", offensiveRating, defensiveRating, position2, 5, 2, 25);
		int[] position3 = { 3 };
		roster[3] = new Player("First", "Last", offensiveRating, defensiveRating, position3, 5, 2, 25);
		int[] position4 = { 4 };
		roster[4] = new Player("First", "Last", offensiveRating, defensiveRating, position4, 5, 2, 25);
		int[] position5 = { 5 };
		roster[5] = new Player("First", "Last", offensiveRating, defensiveRating, position5, 5, 2, 25);
		int[] position6 = { 6 };
		roster[6] = new Player("First", "Last", offensiveRating, defensiveRating, position6, 5, 2, 25);
		return roster;
	}

	public static Team getOneHundred() {
		return OneHundred;
	}

	public static void setOneHundred(Team oneHundred) {
		OneHundred = oneHundred;
	}

	public static Team getNinetyFive() {
		return NinetyFive;
	}

	public static void setNinetyFive(Team ninetyFive) {
		NinetyFive = ninetyFive;
	}

	public static Team getNinety() {
		return Ninety;
	}

	public static void setNinety(Team ninety) {
		Ninety = ninety;
	}

	public static Team getEightyFive() {
		return EightyFive;
	}

	public static void setEightyFive(Team eightyFive) {
		EightyFive = eightyFive;
	}

	public static Team getEighty() {
		return Eighty;
	}

	public static void setEighty(Team eighty) {
		Eighty = eighty;
	}

	public static Team getSeventyFive() {
		return SeventyFive;
	}

	public static void setSeventyFive(Team seventyFive) {
		SeventyFive = seventyFive;
	}

	public static Team getSeventy() {
		return Seventy;
	}

	public static void setSeventy(Team seventy) {
		Seventy = seventy;
	}

	public static Team getSixtyFive() {
		return SixtyFive;
	}

	public static void setSixtyFive(Team sixtyFive) {
		SixtyFive = sixtyFive;
	}

	public static Team getSixty() {
		return Sixty;
	}

	public static void setSixty(Team sixty) {
		Sixty = sixty;
	}

	public static Team getFiftyFive() {
		return FiftyFive;
	}

	public static void setFiftyFive(Team fiftyFive) {
		FiftyFive = fiftyFive;
	}

	public static Team getFifty() {
		return Fifty;
	}

	public static void setFifty(Team fifty) {
		Fifty = fifty;
	}

	public static Team getFourtyFive() {
		return FourtyFive;
	}

	public static void setFourtyFive(Team fourtyFive) {
		FourtyFive = fourtyFive;
	}

	public static Team getFourty() {
		return Fourty;
	}

	public static void setFourty(Team fourty) {
		Fourty = fourty;
	}

	public static Team getThirtyFive() {
		return ThirtyFive;
	}

	public static void setThirtyFive(Team thirtyFive) {
		ThirtyFive = thirtyFive;
	}

	public static Team getThirty() {
		return Thirty;
	}

	public static void setThirty(Team thirty) {
		Thirty = thirty;
	}
	
	

}