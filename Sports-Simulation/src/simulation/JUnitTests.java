package simulation;

import simulation.League;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JUnitTests {

	// Create player
	Player p1;

	// Various positions
	int[] position0 = { 0 };
	int[] position1 = { 1 };
	int[] position2 = { 2 };
	int[] position3 = { 2, 3, 4 };
	int[] position4 = { 3, 4 };
	int[] position5 = { 4, 5 };

	// Create coach
	Coach c1;

	// Create roster
	Athlete[] roster, roster1, roster2;

	// Create team
	Team t1, t2;
	
	Team OneHundred;
	Team NinetyFive;
	Team Ninety;
	Team EightyFive;
	Team Eighty;
	Team SeventyFive;
	Team Seventy;
	Team SixtyFive;
	Team Sixty;
	Team FiftyFive;
	Team Fifty;
	Team FourtyFive;
	Team Fourty;
	Team ThirtyFive;
	Team Thirty;
	int numberSimulations = 1000;

	@Before
	public void setUp() {
		// Create player
		p1 = new Player("First", "Last", 80, 60, position3, 5, 2, 25);

		// Create coach
		c1 = new Coach("First", "Last", 80, 60, position0, 5, 2, 25);

		// Create team
		roster = new Athlete[7];
		roster[0] = new Coach("First", "Last", 50, 50, position0, 5, 2, 25);
		roster[1] = new Player("First", "Last", 50, 50, position1, 5, 2, 25);
		roster[2] = new Player("First", "Last", 50, 50, position2, 5, 2, 25);
		roster[3] = new Player("First", "Last", 50, 50, position3, 5, 2, 25);
		roster[4] = new Player("First", "Last", 50, 50, position4, 5, 2, 25);
		roster[5] = new Player("First", "Last", 50, 50, position5, 5, 2, 25);
		roster[6] = new Player("First", "Last", 50, 50, position3, 5, 2, 25);

		t1 = new Team("Team", roster);

		// Create another team
		roster1 = new Athlete[7];
		roster1[0] = new Coach("First", "Last", 30, 30, position0, 5, 2, 25);
		roster1[1] = new Player("First", "Last", 30, 30, position1, 5, 2, 25);
		roster1[2] = new Player("First", "Last", 40, 40, position2, 5, 2, 25);
		roster1[3] = new Player("First", "Last", 50, 50, position3, 5, 2, 25);
		roster1[4] = new Player("First", "Last", 60, 60, position4, 5, 2, 25);
		roster1[5] = new Player("First", "Last", 70, 70, position5, 5, 2, 25);
		roster1[6] = new Player("First", "Last", 70, 70, position3, 5, 2, 25);

		t2 = new Team("Team", roster1);

		// Create a large team
		roster2 = new Athlete[16];
		roster2[0] = new Player("First", "Last", 50, 50, position1, 5, 2, 25);
		roster2[1] = new Player("First", "Last", 50, 50, position1, 5, 2, 25);
		roster2[2] = new Player("First", "Last", 50, 50, position2, 5, 2, 25);
		roster2[3] = new Player("First", "Last", 50, 50, position3, 5, 2, 25);
		roster2[4] = new Player("First", "Last", 50, 50, position4, 5, 2, 25);
		roster2[5] = new Player("First", "Last", 50, 50, position5, 5, 2, 25);
		roster2[6] = new Player("First", "Last", 50, 50, position3, 5, 2, 25);
		roster2[7] = new Player("First", "Last", 50, 50, position1, 5, 2, 25);
		roster2[8] = new Player("First", "Last", 50, 50, position1, 5, 2, 25);
		roster2[9] = new Player("First", "Last", 50, 50, position2, 5, 2, 25);
		roster2[10] = new Player("First", "Last", 50, 50, position3, 5, 2, 25);
		roster2[11] = new Player("First", "Last", 50, 50, position4, 5, 2, 25);
		roster2[12] = new Player("First", "Last", 50, 50, position5, 5, 2, 25);
		roster2[13] = new Player("First", "Last", 50, 50, position3, 5, 2, 25);
		roster2[14] = new Player("First", "Last", 50, 50, position1, 5, 2, 25);
		roster2[15] = new Player("First", "Last", 50, 50, position1, 5, 2, 25);
		
		OneHundred = new Team("100", League.createOneHundredRoster());
		NinetyFive = new Team("95", League.createNinetyFiveRoster());
		Ninety = new Team("90", League.createNinetyRoster());
		EightyFive = new Team("85", League.createEightyFiveRoster());
		Eighty = new Team("80", League.createEightyRoster());
		SeventyFive = new Team("75", League.createSeventyFiveRoster());
		Seventy = new Team("70", League.createSeventyRoster());
		SixtyFive = new Team("65", League.createSixtyFiveRoster());
		Sixty = new Team("60", League.createSixtyRoster());
		FiftyFive = new Team("55", League.createFiftyFiveRoster());
		Fifty = new Team("50", League.createFiftyRoster());
		FourtyFive = new Team("45", League.createFourtyFiveRoster());
		Fourty = new Team("40", League.createFourtyRoster());
		ThirtyFive = new Team("35", League.createThirtyFiveRoster());
		Thirty = new Team("30", League.createThirtyRoster());
	}

	// -------------------------Player Class-----------------------

	@Test
	public void playerConstructor() {
		Player player = new Player("Player", "Name", 75, 60, position1, 5, 2, 30);
		assertEquals(player.getFirstName(), "Player");
		assertEquals(player.getLastName(), "Name");
		assertEquals(player.getOffenseRating(), 75);
		assertEquals(player.getDefenseRating(), 60);
		assertArrayEquals(position1, new int[] { 1 });
		assertEquals(player.getContractAmount(), 5, .01);
		assertEquals(player.getContractYears(), 2);
		assertEquals(player.getAge(), 30);
	}

	@Test
	public void playergetFirstName() {
		assertEquals("First", p1.getFirstName());
	}

	@Test
	public void playersetFirstName() {
		p1.setFirstName("Second");
		assertEquals("Second", p1.getFirstName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void playersetFirstNameInvalidLength() {
		p1.setFirstName("ThisNameIsMuchTooLong");
	}

	@Test(expected = IllegalArgumentException.class)
	public void playersetFirstNameInvalidSpace() {
		p1.setFirstName("Illegal Name");
	}

	@Test
	public void playergetLastName() {
		assertEquals("Last", p1.getLastName());
	}

	@Test
	public void playersetLastName() {
		p1.setLastName("Second");
		assertEquals("Second", p1.getLastName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void playersetLastNameInvalidLength() {
		p1.setLastName("ThisNameIsMuchTooLong");
	}

	@Test(expected = IllegalArgumentException.class)
	public void playersetLastNameInvalidSpace() {
		p1.setLastName("Illegal Name");
	}

	@Test
	public void playergetOffenseRating() {
		assertEquals(80, p1.getOffenseRating());
	}

	@Test
	public void playergetDefenseRating() {
		assertEquals(60, p1.getDefenseRating());
	}

	@Test
	public void playersetOffenseRating() {
		p1.setOffenseRating(75);
		assertEquals(75, p1.getOffenseRating());
	}

	@Test(expected = IllegalArgumentException.class)
	public void playerSetOffenseRatingInvalid1() {
		p1.setOffenseRating(29);
	}

	@Test(expected = IllegalArgumentException.class)
	public void playerSetOffenseRatingInvalid2() {
		p1.setOffenseRating(101);
	}

	@Test
	public void playersetDefenseRating() {
		p1.setDefenseRating(95);
		assertEquals(95, p1.getDefenseRating());
	}

	@Test(expected = IllegalArgumentException.class)
	public void playerSetDefenseRatingInvalid1() {
		p1.setOffenseRating(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void playerSetDefenseRatingInvalid2() {
		p1.setOffenseRating(101);
	}

	@Test
	public void playergetOverallRating() {
		assertEquals(70, p1.getOverallRating());
	}

	@Test
	public void playerGetPosition() {
		assertArrayEquals(p1.getPosition(), position3);
	}

	@Test
	public void playerSetPosition() {
		int[] newPosition = { 1, 2, 3, 4, 5, 6 };
		p1.setPosition(newPosition);
		assertArrayEquals(p1.getPosition(), newPosition);
	}

	@Test(expected = IllegalArgumentException.class)
	public void playerSetPositionInvalid1() {
		p1.setPosition(new int[] { 1, 2, 0 });
	}

	@Test(expected = IllegalArgumentException.class)
	public void playerSetPositionInvalid2() {
		p1.setPosition(new int[] { 1, 7, 2 });
	}

	@Test
	public void playerGetContractAmount() {
		assertEquals(p1.getContractAmount(), 5, .01);
	}

	@Test
	public void playerSetContractAmount() {
		p1.setContractAmount(7.25);
		assertEquals(p1.getContractAmount(), 7.25, .01);
	}

	@Test(expected = IllegalArgumentException.class)
	public void playerSetContractAmountInvalid() {
		p1.setContractAmount(-.1);
	}

	@Test
	public void playerGetContractYears() {
		assertEquals(p1.getContractYears(), 2);
	}

	@Test
	public void playerSetContractYears() {
		p1.setContractYears(4);
		assertEquals(p1.getContractYears(), 4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void playerSetContractYearsInvalid() {
		p1.setContractYears(-1);
	}

	@Test
	public void playerGetAge() {
		assertEquals(25, p1.getAge());
	}

	@Test
	public void playerSetAge() {
		p1.setAge(30);
		assertEquals(30, p1.getAge());
	}

	// ----------------------------Coach Class---------------------------------

	@Test
	public void coachConstructor() {
		Coach coach = new Coach("Coach", "Name", 75, 60, position0, 5, 2, 30);
		assertEquals(coach.getFirstName(), "Coach");
		assertEquals(coach.getLastName(), "Name");
		assertEquals(coach.getOffenseRating(), 75);
		assertEquals(coach.getDefenseRating(), 60);
		assertArrayEquals(position0, new int[] { 0 });
		assertEquals(coach.getContractAmount(), 5, .01);
		assertEquals(coach.getContractYears(), 2);
		assertEquals(coach.getAge(), 30);
	}

	@Test
	public void coachgetFirstName() {
		assertEquals("First", c1.getFirstName());
	}

	@Test
	public void coachsetFirstName() {
		c1.setFirstName("Second");
		assertEquals("Second", c1.getFirstName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachsetFirstNameInvalidLength() {
		c1.setFirstName("ThisNameIsMuchTooLong");
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachsetFirstNameInvalidSpace() {
		c1.setFirstName("Illegal Name");
	}

	@Test
	public void coachgetLastName() {
		assertEquals("Last", c1.getLastName());
	}

	@Test
	public void coachsetLastName() {
		c1.setLastName("Second");
		assertEquals("Second", c1.getLastName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachsetLastNameInvalidLength() {
		c1.setLastName("ThisNameIsMuchTooLong");
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachsetLastNameInvalidSpace() {
		c1.setLastName("Illegal Name");
	}

	@Test
	public void coachgetOffenseRating() {
		assertEquals(80, c1.getOffenseRating());
	}

	@Test
	public void coachgetDefenseRating() {
		assertEquals(60, c1.getDefenseRating());
	}

	@Test
	public void coachsetOffenseRating() {
		c1.setOffenseRating(75);
		assertEquals(75, c1.getOffenseRating());
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachSetOffenseRatingInvalid1() {
		c1.setOffenseRating(-1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachSetOffenseRatingInvalid2() {
		c1.setOffenseRating(101);
	}

	@Test
	public void coachsetDefenseRating() {
		c1.setDefenseRating(95);
		assertEquals(95, c1.getDefenseRating());
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachSetDefenseRatingInvalid1() {
		c1.setOffenseRating(29);
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachSetDefenseRatingInvalid2() {
		c1.setOffenseRating(101);
	}

	@Test
	public void coachGetPosition() {
		assertArrayEquals(c1.getPosition(), position0);
	}

	@Test
	public void coachSetPosition() {
		c1.setPosition(position0);
		assertArrayEquals(c1.getPosition(), position0);
	}

	@Test
	public void coachSetPositionInvalid() {
		c1.setPosition(position3);
		assertArrayEquals(c1.getPosition(), position0);
	}

	@Test
	public void coachGetContractAmount() {
		assertEquals(c1.getContractAmount(), 5, .01);
	}

	@Test
	public void coachSetContractAmount() {
		c1.setContractAmount(7.25);
		assertEquals(c1.getContractAmount(), 7.25, .01);
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachSetContractAmountInvalid() {
		c1.setContractAmount(-.1);
	}

	@Test
	public void coachGetContractYears() {
		assertEquals(c1.getContractYears(), 2);
	}

	@Test
	public void coachSetContractYears() {
		c1.setContractYears(4);
		assertEquals(c1.getContractYears(), 4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachSetContractYearsInvalid() {
		c1.setContractYears(-1);
	}

	@Test
	public void coachgetOverallRating() {
		assertEquals(70, c1.getOverallRating());
	}

	// ------------------------------Team Class----------------------------------

	@Test
	public void teamConstructor() {
		Team team = new Team("Team Name", roster1);
		assertEquals(team.getTeamName(), "Team Name");
		assertArrayEquals(team.getRoster(), roster1);
		assertEquals(team.getTeamOffensiveRating(), 50);
		assertEquals(team.getTeamDefensiveRating(), 50);
		assertEquals(team.getTeamOverallRating(), 50);
		assertEquals(team.getSalaryCap(), 35, .01);
	}

	@Test
	public void getTeamName() {
		assertEquals("Team", t1.getTeamName());
	}

	@Test
	public void setTeamName() {
		t1.setTeamName("New Name");
		assertEquals("New Name", t1.getTeamName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void setTeamNameInvalid() {
		t1.setTeamName("This Name Has Too Many Characters In It");
	}

	@Test
	public void teamGetRoster() {
		assertArrayEquals(roster, t1.getRoster());
		assertArrayEquals(roster1, t2.getRoster());
	}

	@Test
	public void teamSetRoster() {
		t1.setRoster(roster1);
		t2.setRoster(roster);
		assertArrayEquals(roster1, t1.getRoster());
		assertArrayEquals(roster, t2.getRoster());
	}

	@Test(expected = IllegalArgumentException.class)
	public void teamSetRosterInvalid() {
		t1.setRoster(roster2);
	}

	@Test
	public void teamSetPlayer() {
		Player newPlayer = new Player("New", "Name", 30, 30, position1, 5, 2, 25);
		t1.setPlayer(2, newPlayer);
		assertEquals(newPlayer, t1.getRoster()[2]);
	}

	@Test
	public void teamGetTeamOffensiveRating() {
		assertEquals(50, t2.getTeamOffensiveRating());
	}

	@Test
	public void teamGetTeamDefensiveRating() {
		assertEquals(50, t2.getTeamDefensiveRating());
	}

	@Test
	public void teamGetTeamOverallRating() {
		assertEquals(50, t2.getTeamOverallRating());
	}

	// @Test
	// public void teamUpdatePlayers() {
	// assertEquals(t1.getRoster()[1].getOffenseRating(), 45);
	// assertEquals(t1.getRoster()[1].getDefenseRating(), 45);
	// assertEquals(t1.getRoster()[2].getOffenseRating(), 50);
	// assertEquals(t1.getRoster()[2].getDefenseRating(), 50);
	// assertEquals(t1.getRoster()[3].getOffenseRating(), 50);
	// assertEquals(t1.getRoster()[3].getDefenseRating(), 50);
	// assertEquals(t1.getRoster()[4].getOffenseRating(), 45);
	// assertEquals(t1.getRoster()[4].getDefenseRating(), 45);
	// assertEquals(t1.getRoster()[5].getOffenseRating(), 45);
	// assertEquals(t1.getRoster()[5].getDefenseRating(), 45);
	// }

	@Test
	public void teamGetSalaryCap() {
		assertEquals(35, t1.getSalaryCap(), .01);
	}

	// ---------------------- Helper Class -----------------
	
	@Test
	public void helperContainsSpacesYes() {
		String space = "Has space";
		assertTrue(Helper.containsSpaces(space));
	}
	
	@Test
	public void helperContainsSpacesNo() {
		String noSpace = "NoSpace";
		assertFalse(Helper.containsSpaces(noSpace));
	}

	// ---------------GameSimulation Class--------------

	// TODO Once final scoring algorithm is determined, write JUnit tests for it
	
	@Test
	public void OneHundredVSOneHundred() throws IOException {
		
		Team team1 = OneHundred;
		Team team2 = OneHundred;
		
		double team1LowerWinPercentage = .7;
		double team1UpperWinPercentage = .8;
		
		double team2LowerWinPercentage = .2;
		double team2UpperWinPercentage = .3;
		
		double team1LowerAverageScore = 100;
		double team1UpperAverageScore = 106;
		
		double team2LowerAverageScore = 100;
		double team2UpperAverageScore = 106;
		
		GameSimulation gs = new GameSimulation(team1, team2, 1);
		gs.runSimulations(numberSimulations, team1, team2);
		
		double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
		double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
		
		if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage > team1LowerWinPercentage) || (team2WinPercentage < team2UpperWinPercentage && team2WinPercentage > team2LowerWinPercentage))) || (!((gs.getTeam1AverageScore() < team1UpperAverageScore && gs.getTeam1AverageScore() > team1LowerAverageScore) || (gs.getTeam2AverageScore() < team2UpperAverageScore && gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
			String failMessage = Helper.createString(team1.getTeamOverallRating(), team2.getTeamOverallRating(), gs, team1LowerWinPercentage, team1UpperWinPercentage, team1WinPercentage, team1LowerAverageScore, team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage, team2UpperWinPercentage, team2WinPercentage, team2LowerAverageScore, team2UpperAverageScore, gs.getTeam2AverageScore());
			fail(failMessage);
		}
		
		assertTrue(true);
	}
	
	
	
}