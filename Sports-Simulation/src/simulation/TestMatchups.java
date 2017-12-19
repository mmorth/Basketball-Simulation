package simulation;

public class TestMatchups {

	private static Team[] teams;

	static Coach genCoach = new Coach("First", "Last", 100, 100, 25, 5, 2);
	private static Team OneHundred = new Team("100", createOneHundredRoster(), genCoach);
	private static Team NinetyFive = new Team("95", createNinetyFiveRoster(), genCoach);
	private static Team Ninety = new Team("90", createNinetyRoster(), genCoach);
	private static Team EightyFive = new Team("85", createEightyFiveRoster(), genCoach);
	private static Team Eighty = new Team("80", createEightyRoster(), genCoach);
	private static Team SeventyFive = new Team("75", createSeventyFiveRoster(), genCoach);
	private static Team Seventy = new Team("70", createSeventyRoster(), genCoach);
	private static Team SixtyFive = new Team("65", createSixtyFiveRoster(), genCoach);
	private static Team Sixty = new Team("60", createSixtyRoster(), genCoach);
	private static Team FiftyFive = new Team("55", createFiftyFiveRoster(), genCoach);
	private static Team Fifty = new Team("50", createFiftyRoster(), genCoach);
	private static Team FourtyFive = new Team("45", createFourtyFiveRoster(), genCoach);
	private static Team Fourty = new Team("40", createFourtyRoster(), genCoach);
	private static Team ThirtyFive = new Team("35", createThirtyFiveRoster(), genCoach);
	private static Team Thirty = new Team("30", createThirtyRoster(), genCoach);

	public static void main(String[] args) {

	}

	public static Player[] createOneHundredRoster() {
		Player[] roster = new Player[7];
		int rating = 100;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createNinetyFiveRoster() {
		Player[] roster = new Player[7];
		int rating = 95;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createNinetyRoster() {
		Player[] roster = new Player[7];
		int rating = 90;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createEightyFiveRoster() {
		Player[] roster = new Player[7];
		int rating = 85;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createEightyRoster() {
		Player[] roster = new Player[7];
		int rating = 80;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createSeventyFiveRoster() {
		Player[] roster = new Player[7];
		int rating = 75;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createSeventyRoster() {
		Player[] roster = new Player[7];
		int rating = 70;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createSixtyFiveRoster() {
		Player[] roster = new Player[7];
		int rating = 65;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createSixtyRoster() {
		Player[] roster = new Player[7];
		int rating = 60;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createFiftyFiveRoster() {
		Player[] roster = new Player[7];
		int rating = 55;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createFiftyRoster() {
		Player[] roster = new Player[7];
		int rating = 50;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createFourtyFiveRoster() {
		Player[] roster = new Player[7];
		int rating = 45;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createFourtyRoster() {
		Player[] roster = new Player[7];
		int rating = 40;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createThirtyFiveRoster() {
		Player[] roster = new Player[7];
		int rating = 35;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createThirtyRoster() {
		Player[] roster = new Player[7];
		int rating = 30;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
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