package simulation;

public class TestMatchups {

	private static Team[] teams;

	int noCoachRating = 30;

	Coach ct1 = new Coach(1, "First", "Last", 25, 5, 2, noCoachRating, noCoachRating, noCoachRating, noCoachRating,
			noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating,
			noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating);

	private Team OneHundred = new Team("100", createOneHundredRoster(), ct1);
	private Team NinetyFive = new Team("95", createNinetyFiveRoster(), ct1);
	private Team Ninety = new Team("90", createNinetyRoster(), ct1);
	private Team EightyFive = new Team("85", createEightyFiveRoster(), ct1);
	private Team Eighty = new Team("80", createEightyRoster(), ct1);
	private Team SeventyFive = new Team("75", createSeventyFiveRoster(), ct1);
	private Team Seventy = new Team("70", createSeventyRoster(), ct1);
	private Team SixtyFive = new Team("65", createSixtyFiveRoster(), ct1);
	private Team Sixty = new Team("60", createSixtyRoster(), ct1);
	private Team FiftyFive = new Team("55", createFiftyFiveRoster(), ct1);
	private Team Fifty = new Team("50", createFiftyRoster(), ct1);
	private Team FourtyFive = new Team("45", createFourtyFiveRoster(), ct1);
	private Team Fourty = new Team("40", createFourtyRoster(), ct1);
	private Team ThirtyFive = new Team("35", createThirtyFiveRoster(), ct1);
	private Team Thirty = new Team("30", createThirtyRoster(), ct1);

	public TestMatchups() {

	}

	public static void main(String[] args) {

	}

	public static Player[] createOneHundredRoster() {
		Player[] roster = new Player[15];
		int rating = 100;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createNinetyFiveRoster() {
		Player[] roster = new Player[15];
		int rating = 95;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createNinetyRoster() {
		Player[] roster = new Player[15];
		int rating = 90;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createEightyFiveRoster() {
		Player[] roster = new Player[15];
		int rating = 85;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createEightyRoster() {
		Player[] roster = new Player[15];
		int rating = 80;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createSeventyFiveRoster() {
		Player[] roster = new Player[15];
		int rating = 75;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createSeventyRoster() {
		Player[] roster = new Player[15];
		int rating = 70;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createSixtyFiveRoster() {
		Player[] roster = new Player[15];
		int rating = 65;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createSixtyRoster() {
		Player[] roster = new Player[15];
		int rating = 60;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createFiftyFiveRoster() {
		Player[] roster = new Player[15];
		int rating = 55;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createFiftyRoster() {
		Player[] roster = new Player[15];
		int rating = 50;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createFourtyFiveRoster() {
		Player[] roster = new Player[15];
		int rating = 45;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createFourtyRoster() {
		Player[] roster = new Player[15];
		int rating = 40;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createThirtyFiveRoster() {
		Player[] roster = new Player[15];
		int rating = 35;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}

	public static Player[] createThirtyRoster() {
		Player[] roster = new Player[15];
		int rating = 30;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		return roster;
	}
	
	public static Player[] createScaledRoster() {
		Player[] roster = new Player[15];
		int rating = 100;
		int rating1 = 95;
		int rating2 = 90;
		int rating3 = 85;
		int rating4 = 80;
		int rating5 = 75;
		int rating6 = 70;
		int rating7 = 65;
		int rating8 = 60;
		int rating9 = 55;
		int rating10 = 50;
		int rating11 = 45;
		int rating12 = 40;
		int rating13 = 35;
		int rating14 = 30;
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster[1] = new Player(1, "First", "Last", 25, 5, 2, rating1, rating1, rating1, rating1, rating1, rating1, rating1,
				rating1, rating1, rating1, rating1, rating1, rating1, rating1, rating1, rating1, rating1, rating1);
		roster[2] = new Player(1, "First", "Last", 25, 5, 2, rating2, rating2, rating2, rating2, rating2, rating2, rating2,
				rating2, rating2, rating2, rating2, rating2, rating2, rating2, rating2, rating2, rating2, rating2);
		roster[3] = new Player(1, "First", "Last", 25, 5, 2, rating3, rating3, rating3, rating3, rating3, rating3, rating3,
				rating3, rating3, rating3, rating3, rating3, rating3, rating3, rating3, rating3, rating3, rating3);
		roster[4] = new Player(1, "First", "Last", 25, 5, 2, rating4, rating4, rating4, rating4, rating4, rating4, rating4,
				rating4, rating4, rating4, rating4, rating4, rating4, rating4, rating4, rating4, rating4, rating4);
		roster[5] = new Player(1, "First", "Last", 25, 5, 2, rating5, rating5, rating5, rating5, rating5, rating5, rating5,
				rating5, rating5, rating5, rating5, rating5, rating5, rating5, rating5, rating5, rating5, rating5);
		roster[6] = new Player(1, "First", "Last", 25, 5, 2, rating6, rating6, rating6, rating6, rating6, rating6, rating6,
				rating6, rating6, rating6, rating6, rating6, rating6, rating6, rating6, rating6, rating6, rating6);
		roster[7] = new Player(1, "First", "Last", 25, 5, 2, rating7, rating7, rating7, rating7, rating7, rating7, rating7,
				rating7, rating7, rating7, rating7, rating7, rating7, rating7, rating7, rating7, rating7, rating7);
		roster[8] = new Player(1, "First", "Last", 25, 5, 2, rating8, rating8, rating8, rating8, rating8, rating8, rating8,
				rating8, rating8, rating8, rating8, rating8, rating8, rating8, rating8, rating8, rating8, rating8);
		roster[9] = new Player(1, "First", "Last", 25, 5, 2, rating9, rating9, rating9, rating9, rating9, rating9, rating9,
				rating9, rating9, rating9, rating9, rating9, rating9, rating9, rating9, rating9, rating9, rating9);
		roster[10] = new Player(1, "First", "Last", 25, 5, 2, rating10, rating10, rating10, rating10, rating10, rating10, rating10,
				rating10, rating10, rating10, rating10, rating10, rating10, rating10, rating10, rating10, rating10, rating10);
		roster[11] = new Player(1, "First", "Last", 25, 5, 2, rating11, rating11, rating11, rating11, rating11, rating11, rating11,
				rating11, rating11, rating11, rating11, rating11, rating11, rating11, rating11, rating11, rating11, rating11);
		roster[12] = new Player(1, "First", "Last", 25, 5, 2, rating12, rating12, rating12, rating12, rating12, rating12, rating12,
				rating12, rating12, rating12, rating12, rating12, rating12, rating12, rating12, rating12, rating12, rating12);
		roster[13] = new Player(1, "First", "Last", 25, 5, 2, rating13, rating13, rating13, rating13, rating13, rating13, rating13,
				rating13, rating13, rating13, rating13, rating13, rating13, rating13, rating13, rating13, rating13, rating13);
		roster[14] = new Player(1, "First", "Last", 25, 5, 2, rating14, rating14, rating14, rating14, rating14, rating14, rating14,
				rating14, rating14, rating14, rating14, rating14, rating14, rating14, rating14, rating14, rating14, rating14);
		return roster;
	}

	public Team getOneHundred() {
		return OneHundred;
	}

	public void setOneHundred(Team oneHundred) {
		OneHundred = oneHundred;
	}

	public Team getNinetyFive() {
		return NinetyFive;
	}

	public void setNinetyFive(Team ninetyFive) {
		NinetyFive = ninetyFive;
	}

	public Team getNinety() {
		return Ninety;
	}

	public void setNinety(Team ninety) {
		Ninety = ninety;
	}

	public Team getEightyFive() {
		return EightyFive;
	}

	public void setEightyFive(Team eightyFive) {
		EightyFive = eightyFive;
	}

	public Team getEighty() {
		return Eighty;
	}

	public void setEighty(Team eighty) {
		Eighty = eighty;
	}

	public Team getSeventyFive() {
		return SeventyFive;
	}

	public void setSeventyFive(Team seventyFive) {
		SeventyFive = seventyFive;
	}

	public Team getSeventy() {
		return Seventy;
	}

	public void setSeventy(Team seventy) {
		Seventy = seventy;
	}

	public Team getSixtyFive() {
		return SixtyFive;
	}

	public void setSixtyFive(Team sixtyFive) {
		SixtyFive = sixtyFive;
	}

	public Team getSixty() {
		return Sixty;
	}

	public void setSixty(Team sixty) {
		Sixty = sixty;
	}

	public Team getFiftyFive() {
		return FiftyFive;
	}

	public void setFiftyFive(Team fiftyFive) {
		FiftyFive = fiftyFive;
	}

	public Team getFifty() {
		return Fifty;
	}

	public void setFifty(Team fifty) {
		Fifty = fifty;
	}

	public Team getFourtyFive() {
		return FourtyFive;
	}

	public void setFourtyFive(Team fourtyFive) {
		FourtyFive = fourtyFive;
	}

	public Team getFourty() {
		return Fourty;
	}

	public void setFourty(Team fourty) {
		Fourty = fourty;
	}

	public Team getThirtyFive() {
		return ThirtyFive;
	}

	public void setThirtyFive(Team thirtyFive) {
		ThirtyFive = thirtyFive;
	}

	public Team getThirty() {
		return Thirty;
	}

	public void setThirty(Team thirty) {
		Thirty = thirty;
	}

}