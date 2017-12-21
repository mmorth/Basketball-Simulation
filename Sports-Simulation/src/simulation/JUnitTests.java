package simulation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class JUnitTests {

	// Create player
	Player p1, ct1;

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
	Player[] roster, roster1, roster2;

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
		p1 = new Player(1, "First", "Last", 25, 5, 2, 30, 35, 40, 45, 50, 57, 60, 65, 70, 75, 80, 85, 90, 95, 100, 31,
				99);

		// Create coach
		c1 = new Coach("First", "Last", 80, 60, 25, 5, 2);

		// Create team
		int team1Rating = 50;
		int noCoachRating = 30;

		roster = new Player[7];
		ct1 = new Player(1, "First", "Last", 25, 5, 2, noCoachRating, noCoachRating, noCoachRating, noCoachRating,
				noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating,
				noCoachRating, noCoachRating, noCoachRating, noCoachRating, noCoachRating);
		roster[0] = new Player(1, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster[1] = new Player(2, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster[2] = new Player(3, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster[3] = new Player(4, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster[4] = new Player(5, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster[5] = new Player(3, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);

		t1 = new Team("Team", roster, ct1);

		int rating = 30;
		int rating2 = 40;
		int rating3 = 50;
		int rating4 = 60;
		int rating5 = 70;

		// Create another team
		roster1 = new Player[7];
		roster1[0] = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating, rating, rating);
		roster1[1] = new Player(2, "First", "Last", 25, 5, 2, rating2, rating2, rating2, rating2, rating2, rating2,
				rating2, rating2, rating2, rating2, rating2, rating2, rating2, rating2, rating2, rating2, rating2);
		roster1[2] = new Player(3, "First", "Last", 25, 5, 2, rating3, rating3, rating3, rating3, rating3, rating3,
				rating3, rating3, rating3, rating3, rating3, rating3, rating3, rating3, rating3, rating3, rating3);
		roster1[3] = new Player(4, "First", "Last", 25, 5, 2, rating4, rating4, rating4, rating4, rating4, rating4,
				rating4, rating4, rating4, rating4, rating4, rating4, rating4, rating4, rating4, rating4, rating4);
		roster1[4] = new Player(5, "First", "Last", 25, 5, 2, rating5, rating5, rating5, rating5, rating5, rating5,
				rating5, rating5, rating5, rating5, rating5, rating5, rating5, rating5, rating5, rating5, rating5);

		t2 = new Team("Team", roster1, ct1);

		// Create a large team
		roster2 = new Player[20];
		roster2[0] = new Player(1, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[1] = new Player(2, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[2] = new Player(3, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[3] = new Player(4, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[4] = new Player(5, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[5] = new Player(1, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[6] = new Player(2, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[7] = new Player(3, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[8] = new Player(4, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[9] = new Player(5, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[10] = new Player(1, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[11] = new Player(2, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[12] = new Player(3, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[13] = new Player(4, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[14] = new Player(5, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[15] = new Player(1, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[16] = new Player(2, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[17] = new Player(3, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[18] = new Player(4, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);
		roster2[19] = new Player(5, "First", "Last", 25, 5, 2, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating, team1Rating,
				team1Rating, team1Rating, team1Rating, team1Rating, team1Rating);

//		Coach genCoach = new Coach("First", "Last", 100, 100, 25, 5, 2);
		OneHundred = new Team("100", TestMatchups.createOneHundredRoster(), ct1);
		NinetyFive = new Team("95", TestMatchups.createNinetyFiveRoster(), ct1);
		Ninety = new Team("90", TestMatchups.createNinetyRoster(), ct1);
		EightyFive = new Team("85", TestMatchups.createEightyFiveRoster(), ct1);
		Eighty = new Team("80", TestMatchups.createEightyRoster(), ct1);
		SeventyFive = new Team("75", TestMatchups.createSeventyFiveRoster(), ct1);
		Seventy = new Team("70", TestMatchups.createSeventyRoster(), ct1);
		SixtyFive = new Team("65", TestMatchups.createSixtyFiveRoster(), ct1);
		Sixty = new Team("60", TestMatchups.createSixtyRoster(), ct1);
		FiftyFive = new Team("57", TestMatchups.createFiftyFiveRoster(), ct1);
		Fifty = new Team("50", TestMatchups.createFiftyRoster(), ct1);
		FourtyFive = new Team("45", TestMatchups.createFourtyFiveRoster(), ct1);
		Fourty = new Team("40", TestMatchups.createFourtyRoster(), ct1);
		ThirtyFive = new Team("35", TestMatchups.createThirtyFiveRoster(), ct1);
		Thirty = new Team("30", TestMatchups.createThirtyRoster(), ct1);
	}

	// -------------------------Player Class-----------------------

	@Test
	public void playerConstructor() {
		Player player = new Player(3, "Player", "Name", 25, 5, 2, 30, 35, 40, 45, 50, 57, 60, 65, 70, 75, 80, 85, 90,
				95, 100, 31, 99);
		assertEquals(player.getPlayerFirstName(), "Player");
		assertEquals(player.getPlayerLastName(), "Name");
		assertEquals(player.getPosition(), 3);
		assertEquals(player.getContractAmount(), 5, .01);
		assertEquals(player.getContractYears(), 2);
		assertEquals(player.getAge(), 25);
		assertEquals(player.getInsideScoring(), 30);
		assertEquals(player.getMidRangeScoring(), 35);
		assertEquals(player.getThreePointScoring(), 40);
		assertEquals(player.getFreeThrow(), 45);
		assertEquals(player.getOffensiveRebounding(), 50);
		assertEquals(player.getBallHandling(), 57);
		assertEquals(player.getPassing(), 60);
		assertEquals(player.getPostDefense(), 65);
		assertEquals(player.getPerimeterDefense(), 70);
		assertEquals(player.getDefensiveRebounding(), 75);
		assertEquals(player.getSteal(), 80);
		assertEquals(player.getBlock(), 85);
		assertEquals(player.getHeight(), 90);
		assertEquals(player.getSpeed(), 95);
		assertEquals(player.getStamina(), 100);
		assertEquals(player.getInjury(), 31);
		assertEquals(player.getPotential(), 99);

		assertEquals(player.getOffensiveRating(), 0);
		assertEquals(player.getDefensiveRating(), 0);
		assertEquals(player.getOverallRating(), 0);
	}

	@Test
	public void playergetFirstName() {
		assertEquals("First", p1.getPlayerFirstName());
	}

	@Test
	public void playersetFirstName() {
		p1.setPlayerFirstName("Second");
		assertEquals("Second", p1.getPlayerFirstName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void playersetFirstNameInvalidLength() {
		p1.setPlayerFirstName("ThisNameIsMuchTooLong");
	}

	@Test(expected = IllegalArgumentException.class)
	public void playersetFirstNameInvalidSpace() {
		p1.setPlayerFirstName("Illegal Name");
	}

	@Test
	public void playergetLastName() {
		assertEquals("Last", p1.getPlayerLastName());
	}

	@Test
	public void playersetLastName() {
		p1.setPlayerLastName("Second");
		assertEquals("Second", p1.getPlayerLastName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void playersetLastNameInvalidLength() {
		p1.setPlayerLastName("ThisNameIsMuchTooLong");
	}

	@Test(expected = IllegalArgumentException.class)
	public void playersetLastNameInvalidSpace() {
		p1.setPlayerLastName("Illegal Name");
	}

	@Test
	public void playergetOffenseRating() {
		assertEquals(0, p1.getOffensiveRating());
	}

	@Test
	public void playergetDefenseRating() {
		assertEquals(0, p1.getDefensiveRating());
	}

	@Test
	public void playergetOverallRating() {
		assertEquals(0, p1.getOverallRating());
	}

	@Test
	public void playerGetPosition() {
		assertEquals(p1.getPosition(), 1);
	}

	@Test
	public void playerSetPosition() {
		p1.setPosition(1);
		assertEquals(p1.getPosition(), 1);
		p1.setPosition(2);
		assertEquals(p1.getPosition(), 2);
		p1.setPosition(3);
		assertEquals(p1.getPosition(), 3);
		p1.setPosition(4);
		assertEquals(p1.getPosition(), 4);
		p1.setPosition(5);
		assertEquals(p1.getPosition(), 5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void playerSetPositionInvalid1() {
		p1.setPosition(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void playerSetPositionInvalid2() {
		p1.setPosition(6);
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

	@Test
	public void playerGetInsideScoring() {
		assertEquals(p1.getInsideScoring(), 30);
	}

	@Test
	public void playerSetInsideScoring() {
		p1.setInsideScoring(77);
		assertEquals(p1.getInsideScoring(), 77);
	}

	@Test
	public void playerSetInsideScoringInvalid1() {
		p1.setInsideScoring(29);
		assertEquals(p1.getInsideScoring(), 30);
	}

	@Test
	public void playerSetInsideScoringInvalid2() {
		p1.setInsideScoring(101);
		assertEquals(p1.getInsideScoring(), 100);
	}

	@Test
	public void playerGetMidRangeScoring() {
		assertEquals(p1.getMidRangeScoring(), 35);
	}

	@Test
	public void playerSetMidRangeScoring() {
		p1.setMidRangeScoring(77);
		assertEquals(p1.getMidRangeScoring(), 77);
	}

	@Test
	public void playerSetMidRangeScoringInvalid1() {
		p1.setMidRangeScoring(29);
		assertEquals(p1.getMidRangeScoring(), 30);
	}

	@Test
	public void playerSetMidRangeScoringInvalid2() {
		p1.setMidRangeScoring(101);
		assertEquals(p1.getMidRangeScoring(), 100);
	}

	@Test
	public void playerGetThreePointScoring() {
		assertEquals(p1.getThreePointScoring(), 40);
	}

	@Test
	public void playerSetThreePointScoring() {
		p1.setThreePointScoring(77);
		assertEquals(p1.getThreePointScoring(), 77);
	}

	@Test
	public void playerSetThreePointScoringInvalid1() {
		p1.setThreePointScoring(29);
		assertEquals(p1.getThreePointScoring(), 30);
	}

	@Test
	public void playerSetThreePointScoringInvalid2() {
		p1.setThreePointScoring(101);
		assertEquals(p1.getThreePointScoring(), 100);
	}

	@Test
	public void playerGetFreeThrow() {
		assertEquals(p1.getFreeThrow(), 45);
	}

	@Test
	public void playerSetFreeThrow() {
		p1.setFreeThrow(77);
		assertEquals(p1.getFreeThrow(), 77);
	}

	@Test
	public void playerSetFreeThrowInvalid1() {
		p1.setFreeThrow(29);
		assertEquals(p1.getFreeThrow(), 30);
	}

	@Test
	public void playerSetFreeThrowInvalid2() {
		p1.setFreeThrow(101);
		assertEquals(p1.getFreeThrow(), 100);
	}

	@Test
	public void playerGetOffensiveRebounding() {
		assertEquals(p1.getOffensiveRebounding(), 50);
	}

	@Test
	public void playerSetOffensiveRebounding() {
		p1.setOffensiveRebounding(77);
		assertEquals(p1.getOffensiveRebounding(), 77);
	}

	@Test
	public void playerSetOffensiveReboundingInvalid1() {
		p1.setOffensiveRebounding(29);
		assertEquals(p1.getOffensiveRebounding(), 30);
	}

	@Test
	public void playerSetOffensiveReboundingInvalid2() {
		p1.setOffensiveRebounding(101);
		assertEquals(p1.getOffensiveRebounding(), 100);
	}

	@Test
	public void playerGetBallHandling() {
		assertEquals(p1.getBallHandling(), 57);
	}

	@Test
	public void playerSetBallHandling() {
		p1.setBallHandling(77);
		assertEquals(p1.getBallHandling(), 77);
	}

	@Test
	public void playerSetBallHandlingInvalid1() {
		p1.setBallHandling(29);
		assertEquals(p1.getBallHandling(), 30);
	}

	@Test
	public void playerSetInvalid2() {
		p1.setBallHandling(101);
		assertEquals(p1.getBallHandling(), 100);
	}

	@Test
	public void playerGetPassing() {
		assertEquals(p1.getPassing(), 60);
	}

	@Test
	public void playerSetPassing() {
		p1.setPassing(77);
		assertEquals(p1.getPassing(), 77);
	}

	@Test
	public void playerSetPassingInvalid1() {
		p1.setPassing(29);
		assertEquals(p1.getPassing(), 30);
	}

	@Test
	public void playerSetPassingInvalid2() {
		p1.setPassing(101);
		assertEquals(p1.getPassing(), 100);
	}

	@Test
	public void playerGetPostDefense() {
		assertEquals(p1.getPostDefense(), 65);
	}

	@Test
	public void playerSetPostDefense() {
		p1.setPostDefense(77);
		assertEquals(p1.getPostDefense(), 77);
	}

	@Test
	public void playerSetPostDefenseInvalid1() {
		p1.setPostDefense(29);
		assertEquals(p1.getPostDefense(), 30);
	}

	@Test
	public void playerSetPostDefenseInvalid2() {
		p1.setPostDefense(101);
		assertEquals(p1.getPostDefense(), 100);
	}

	@Test
	public void playerGetPerimeterDefense() {
		assertEquals(p1.getPerimeterDefense(), 70);
	}

	@Test
	public void playerSetPerimeterDefense() {
		p1.setPerimeterDefense(77);
		assertEquals(p1.getPerimeterDefense(), 77);
	}

	@Test
	public void playerSetPerimeterDefenseInvalid1() {
		p1.setPerimeterDefense(29);
		assertEquals(p1.getPerimeterDefense(), 30);
	}

	@Test
	public void playerSetPerimeterDefenseInvalid2() {
		p1.setPerimeterDefense(101);
		assertEquals(p1.getPerimeterDefense(), 100);
	}

	@Test
	public void playerGetDefensiveRebounding() {
		assertEquals(p1.getDefensiveRebounding(), 75);
	}

	@Test
	public void playerSetDefensiveRebounding() {
		p1.setDefensiveRebounding(77);
		assertEquals(p1.getDefensiveRebounding(), 77);
	}

	@Test
	public void playerSetDefensiveReboundingInvalid1() {
		p1.setDefensiveRebounding(29);
		assertEquals(p1.getDefensiveRebounding(), 30);
	}

	@Test
	public void playerSetDefensiveReboundingInvalid2() {
		p1.setDefensiveRebounding(101);
		assertEquals(p1.getDefensiveRebounding(), 100);
	}

	@Test
	public void playerGetSteal() {
		assertEquals(p1.getSteal(), 80);
	}

	@Test
	public void playerSetSteal() {
		p1.setSteal(77);
		assertEquals(p1.getSteal(), 77);
	}

	@Test
	public void playerSetStealInvalid1() {
		p1.setSteal(29);
		assertEquals(p1.getSteal(), 30);
	}

	@Test
	public void playerSetStealInvalid2() {
		p1.setSteal(101);
		assertEquals(p1.getSteal(), 100);
	}

	@Test
	public void playerGetBlock() {
		assertEquals(p1.getBlock(), 85);
	}

	@Test
	public void playerSetBlock() {
		p1.setBlock(77);
		assertEquals(p1.getBlock(), 77);
	}

	@Test
	public void playerSetBlockInvalid1() {
		p1.setBlock(29);
		assertEquals(p1.getBlock(), 30);
	}

	@Test
	public void playerSetBlockInvalid2() {
		p1.setBlock(101);
		assertEquals(p1.getBlock(), 100);
	}

	@Test
	public void playerGetHeight() {
		assertEquals(p1.getHeight(), 90);
	}

	@Test
	public void playerSetHeight() {
		p1.setHeight(77);
		assertEquals(p1.getHeight(), 77);
	}

	@Test
	public void playerSetHeightInvalid1() {
		p1.setHeight(29);
		assertEquals(p1.getHeight(), 30);
	}

	@Test
	public void playerSetHeightInvalid2() {
		p1.setHeight(101);
		assertEquals(p1.getHeight(), 100);
	}

	@Test
	public void playerGetSpeed() {
		assertEquals(p1.getSpeed(), 95);
	}

	@Test
	public void playerSetSpeed() {
		p1.setSpeed(77);
		assertEquals(p1.getSpeed(), 77);
	}

	@Test
	public void playerSetSpeedInvalid1() {
		p1.setSpeed(29);
		assertEquals(p1.getSpeed(), 30);
	}

	@Test
	public void playerSetSpeedInvalid2() {
		p1.setSpeed(101);
		assertEquals(p1.getSpeed(), 100);
	}

	@Test
	public void playerGetStamina() {
		assertEquals(p1.getStamina(), 100);
	}

	@Test
	public void playerSetStamina() {
		p1.setStamina(77);
		assertEquals(p1.getStamina(), 77);
	}

	@Test
	public void playerSetStaminaInvalid1() {
		p1.setStamina(29);
		assertEquals(p1.getStamina(), 30);
	}

	@Test
	public void playerSetStaminaInvalid2() {
		p1.setStamina(101);
		assertEquals(p1.getStamina(), 100);
	}

	@Test
	public void playerGetInjury() {
		assertEquals(p1.getInjury(), 31);
	}

	@Test
	public void playerSetInjury() {
		p1.setInjury(77);
		assertEquals(p1.getInjury(), 77);
	}

	@Test
	public void playerSetInjuryInvalid1() {
		p1.setInjury(29);
		assertEquals(p1.getInjury(), 30);
	}

	@Test
	public void playerSetInjuryInvalid2() {
		p1.setInjury(101);
		assertEquals(p1.getInjury(), 100);
	}

	@Test
	public void playerGetPotential() {
		assertEquals(p1.getPotential(), 99);
	}

	@Test
	public void playerSetPotential() {
		p1.setPotential(77);
		assertEquals(p1.getPotential(), 77);
	}

	@Test
	public void playerSetPotentialInvalid1() {
		p1.setPotential(29);
		assertEquals(p1.getPotential(), 30);
	}

	@Test
	public void playerSetPotentialInvalid2() {
		p1.setPotential(101);
		assertEquals(p1.getPotential(), 100);
	}
	
	@Before
	public void playerPositionRatings() {
		p1.setPosition(0);
		assertEquals(p1.getOverallRating(), );
		assertEquals(p1.getOffensiveRating(), );
		assertEquals(p1.getDefensiveRating(), );
		p1.setPosition(1);
		assertEquals(p1.getOverallRating(), );
		assertEquals(p1.getOffensiveRating(), );
		assertEquals(p1.getDefensiveRating(), );
		p1.setPosition(2);
		assertEquals(p1.getOverallRating(), );
		assertEquals(p1.getOffensiveRating(), );
		assertEquals(p1.getDefensiveRating(), );
		p1.setPosition(3);
		assertEquals(p1.getOverallRating(), );
		assertEquals(p1.getOffensiveRating(), );
		assertEquals(p1.getDefensiveRating(), );
		p1.setPosition(4);
		assertEquals(p1.getOverallRating(), );
		assertEquals(p1.getOffensiveRating(), );
		assertEquals(p1.getDefensiveRating(), );
		p1.setPosition(5);
		assertEquals(p1.getOverallRating(), );
		assertEquals(p1.getOffensiveRating(), );
		assertEquals(p1.getDefensiveRating(), );
		
		p1.calculateBestPosition();
		assertEquals(p1.getOverallRating(), );
		assertEquals(p1.getOffensiveRating(), );
		assertEquals(p1.getDefensiveRating(), );
	}

	// ----------------------------Coach Class---------------------------------

	@Test
	public void coachConstructor() {
		Coach coach = new Coach("Coach", "Name", 75, 60, 30, 5, 2);
		assertEquals(coach.getCoachFirstName(), "Coach");
		assertEquals(coach.getCoachLastName(), "Name");
		assertEquals(coach.getOffenseRating(), 75);
		assertEquals(coach.getDefenseRating(), 60);
		assertEquals(coach.getPosition(), 0);
		assertEquals(coach.getContractAmount(), 5, .01);
		assertEquals(coach.getContractYears(), 2);
		assertEquals(coach.getAge(), 30);
	}

	@Test
	public void coachgetFirstName() {
		assertEquals("First", c1.getCoachFirstName());
	}

	@Test
	public void coachsetFirstName() {
		c1.setCoachFirstName("Second");
		assertEquals("Second", c1.getCoachFirstName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachsetFirstNameInvalidLength() {
		c1.setCoachFirstName("ThisNameIsMuchTooLong");
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachsetFirstNameInvalidSpace() {
		c1.setCoachFirstName("Illegal Name");
	}

	@Test
	public void coachgetLastName() {
		assertEquals("Last", c1.getCoachLastName());
	}

	@Test
	public void coachsetLastName() {
		c1.setCoachLastName("Second");
		assertEquals("Second", c1.getCoachLastName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachsetLastNameInvalidLength() {
		c1.setCoachLastName("ThisNameIsMuchTooLong");
	}

	@Test(expected = IllegalArgumentException.class)
	public void coachsetLastNameInvalidSpace() {
		c1.setCoachLastName("Illegal Name");
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
		assertEquals(c1.getPosition(), 0);
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
		Team team = new Team("Team Name", roster1, ct1);
		assertEquals(team.getTeamName(), "Team Name");
		assertArrayEquals(team.getRoster(), roster1);
		assertEquals(team.getTeamOffensiveRating(), 0);
		assertEquals(team.getTeamDefensiveRating(), 0);
		assertEquals(team.getTeamOverallRating(), 0);
		assertEquals(team.getSalaryCap(), 25, .01);
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
		Player newPlayer = new Player(3, "Player", "Name", 25, 5, 2, 30, 35, 40, 45, 50, 57, 60, 65, 70, 75, 80, 85, 90,
				95, 100, 31, 99);
		t1.setPlayer(2, newPlayer);
		assertEquals(newPlayer, t1.getRoster()[2]);
	}

	@Test
	public void teamGetTeamOffensiveRating() {
		assertEquals(0, t2.getTeamOffensiveRating());
	}

	@Test
	public void teamGetTeamDefensiveRating() {
		assertEquals(0, t2.getTeamDefensiveRating());
	}

	@Test
	public void teamGetTeamOverallRating() {
		assertEquals(0, t2.getTeamOverallRating());
	}

	@Test
	public void teamGetSalaryCap() {
		assertEquals(30, t1.getSalaryCap(), .01);
	}
	
	@Test
	public void teamCoachRatingsBoost() {

		int rating = 30;
		
		Player coach1 = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
				rating, rating, rating, rating, rating, rating, rating, rating,
				rating, rating, rating, rating, rating);
		
		Team boost = new Team("Boost", roster, coach1);
		
		for (rating = 30; rating <= 100; rating++) {
			Player coach = new Player(1, "First", "Last", 25, 5, 2, rating, rating, rating, rating,
					rating, rating, rating, rating, rating, rating, rating, rating,
					rating, rating, rating, rating, rating);
			
			boost.setCoach(coach);
			
			for (int i = 0; i < roster.length && roster[i] != null; i++) {
				if (rating < 50) {
					assertEquals(roster[i].getInsideScoring(), 54);
					assertEquals(roster[i].getMidRangeScoring(), 54);
					assertEquals(roster[i].getThreePointScoring(), 54);
					assertEquals(roster[i].getFreeThrow(), 54);
					assertEquals(roster[i].getOffensiveRebounding(), 54);
					assertEquals(roster[i].getBallHandling(), 54);
					assertEquals(roster[i].getPassing(), 54);
					assertEquals(roster[i].getPostDefense(), 54);
					assertEquals(roster[i].getPerimeterDefense(), 54);
					assertEquals(roster[i].getDefensiveRebounding(), 54);
					assertEquals(roster[i].getSteal(), 54);
					assertEquals(roster[i].getBlock(), 54);
					assertEquals(roster[i].getSpeed(), 54);
					assertEquals(roster[i].getStamina(), 54);
					assertEquals(roster[i].getInjury(), 54);
					assertEquals(roster[i].getPotential(), 54);
					assertEquals(roster[i].getHeight(), 50);
				} else if (rating < 70) {
					assertEquals(roster[i].getInsideScoring(), 55);
					assertEquals(roster[i].getMidRangeScoring(), 55);
					assertEquals(roster[i].getThreePointScoring(), 55);
					assertEquals(roster[i].getFreeThrow(), 55);
					assertEquals(roster[i].getOffensiveRebounding(), 55);
					assertEquals(roster[i].getBallHandling(), 55);
					assertEquals(roster[i].getPassing(), 55);
					assertEquals(roster[i].getPostDefense(), 55);
					assertEquals(roster[i].getPerimeterDefense(), 55);
					assertEquals(roster[i].getDefensiveRebounding(), 55);
					assertEquals(roster[i].getSteal(), 55);
					assertEquals(roster[i].getBlock(), 55);
					assertEquals(roster[i].getSpeed(), 55);
					assertEquals(roster[i].getStamina(), 55);
					assertEquals(roster[i].getInjury(), 55);
					assertEquals(roster[i].getPotential(), 55);
					assertEquals(roster[i].getHeight(), 50);
				} else if (rating < 90) {
					assertEquals(roster[i].getInsideScoring(), 56);
					assertEquals(roster[i].getMidRangeScoring(), 56);
					assertEquals(roster[i].getThreePointScoring(), 56);
					assertEquals(roster[i].getFreeThrow(), 56);
					assertEquals(roster[i].getOffensiveRebounding(), 56);
					assertEquals(roster[i].getBallHandling(), 56);
					assertEquals(roster[i].getPassing(), 56);
					assertEquals(roster[i].getPostDefense(), 56);
					assertEquals(roster[i].getPerimeterDefense(), 56);
					assertEquals(roster[i].getDefensiveRebounding(), 56);
					assertEquals(roster[i].getSteal(), 56);
					assertEquals(roster[i].getBlock(), 56);
					assertEquals(roster[i].getSpeed(), 56);
					assertEquals(roster[i].getStamina(), 56);
					assertEquals(roster[i].getInjury(), 56);
					assertEquals(roster[i].getPotential(), 56);
					assertEquals(roster[i].getHeight(), 50);
				} else {
					assertEquals(roster[i].getInsideScoring(), 57);
					assertEquals(roster[i].getMidRangeScoring(), 57);
					assertEquals(roster[i].getThreePointScoring(), 57);
					assertEquals(roster[i].getFreeThrow(), 57);
					assertEquals(roster[i].getOffensiveRebounding(), 57);
					assertEquals(roster[i].getBallHandling(), 57);
					assertEquals(roster[i].getPassing(), 57);
					assertEquals(roster[i].getPostDefense(), 57);
					assertEquals(roster[i].getPerimeterDefense(), 57);
					assertEquals(roster[i].getDefensiveRebounding(), 57);
					assertEquals(roster[i].getSteal(), 57);
					assertEquals(roster[i].getBlock(), 57);
					assertEquals(roster[i].getSpeed(), 57);
					assertEquals(roster[i].getStamina(), 57);
					assertEquals(roster[i].getInjury(), 57);
					assertEquals(roster[i].getPotential(), 57);
					assertEquals(roster[i].getHeight(), 50);
				}
			}
			
		}
		
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

	// @Test
	// public void () throws IOException {
	//
	// Team team1 = ;
	// Team team2 = ;
	//
	// double team1LowerWinPercentage = ;
	// double team1UpperWinPercentage = ;
	//
	// double team2LowerWinPercentage = ;
	// double team2UpperWinPercentage = ;
	//
	// double team1LowerAverageScore = ;
	// double team1UpperAverageScore = ;
	//
	// double team2LowerAverageScore = ;
	// double team2UpperAverageScore = ;
	//
	// GameSimulation gs = new GameSimulation(team1, team2, 1);
	// gs.runSimulations(numberSimulations, team1, team2);
	//
	// double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
	// double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
	//
	// if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage >
	// team1LowerWinPercentage) || (team2WinPercentage < team2UpperWinPercentage &&
	// team2WinPercentage > team2LowerWinPercentage))) ||
	// (!((gs.getTeam1AverageScore() < team1UpperAverageScore &&
	// gs.getTeam1AverageScore() > team1LowerAverageScore) ||
	// (gs.getTeam2AverageScore() < team2UpperAverageScore &&
	// gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
	// String failMessage = Helper.createString(team1.getTeamOverallRating(),
	// team2.getTeamOverallRating(), gs, team1LowerWinPercentage,
	// team1UpperWinPercentage, team1WinPercentage, team1LowerAverageScore,
	// team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage,
	// team2UpperWinPercentage, team2WinPercentage, team2LowerAverageScore,
	// team2UpperAverageScore, gs.getTeam2AverageScore());
	// fail(failMessage);
	// }
	//
	// assertTrue(true);
	// }

	// @Test
	// public void OneHundredVSOneHundred() throws IOException {
	//
	// Team team1 = OneHundred;
	// Team team2 = OneHundred;
	//
	// double team1LowerWinPercentage = .45;
	// double team1UpperWinPercentage = .57;
	//
	// double team2LowerWinPercentage = .45;
	// double team2UpperWinPercentage = .57;
	//
	// double team1LowerAverageScore = 98;
	// double team1UpperAverageScore = 108;
	//
	// double team2LowerAverageScore = 98;
	// double team2UpperAverageScore = 108;
	//
	// GameSimulation gs = new GameSimulation(team1, team2, 1);
	// gs.runSimulations(numberSimulations, team1, team2);
	//
	// double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
	// double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
	//
	// if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage >
	// team1LowerWinPercentage)
	// || (team2WinPercentage < team2UpperWinPercentage && team2WinPercentage >
	// team2LowerWinPercentage)))
	// || (!((gs.getTeam1AverageScore() < team1UpperAverageScore
	// && gs.getTeam1AverageScore() > team1LowerAverageScore)
	// || (gs.getTeam2AverageScore() < team2UpperAverageScore
	// && gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
	// String failMessage = Helper.createString(team1.getTeamOverallRating(),
	// team2.getTeamOverallRating(), gs,
	// team1LowerWinPercentage, team1UpperWinPercentage, team1WinPercentage,
	// team1LowerAverageScore,
	// team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage,
	// team2UpperWinPercentage,
	// team2WinPercentage, team2LowerAverageScore, team2UpperAverageScore,
	// gs.getTeam2AverageScore());
	// fail(failMessage);
	// }
	//
	// assertTrue(true);
	// }
	//
	// @Test
	// public void OneHundredVSNinetyFive() throws IOException {
	//
	// Team team1 = OneHundred;
	// Team team2 = NinetyFive;
	//
	// double team1LowerWinPercentage = .5;
	// double team1UpperWinPercentage = .6;
	//
	// double team2LowerWinPercentage = .4;
	// double team2UpperWinPercentage = .5;
	//
	// double team1LowerAverageScore = 99;
	// double team1UpperAverageScore = 109;
	//
	// double team2LowerAverageScore = 97;
	// double team2UpperAverageScore = 107;
	//
	// GameSimulation gs = new GameSimulation(team1, team2, 1);
	// gs.runSimulations(numberSimulations, team1, team2);
	//
	// double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
	// double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
	//
	// if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage >
	// team1LowerWinPercentage)
	// || (team2WinPercentage < team2UpperWinPercentage && team2WinPercentage >
	// team2LowerWinPercentage)))
	// || (!((gs.getTeam1AverageScore() < team1UpperAverageScore
	// && gs.getTeam1AverageScore() > team1LowerAverageScore)
	// || (gs.getTeam2AverageScore() < team2UpperAverageScore
	// && gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
	// String failMessage = Helper.createString(team1.getTeamOverallRating(),
	// team2.getTeamOverallRating(), gs,
	// team1LowerWinPercentage, team1UpperWinPercentage, team1WinPercentage,
	// team1LowerAverageScore,
	// team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage,
	// team2UpperWinPercentage,
	// team2WinPercentage, team2LowerAverageScore, team2UpperAverageScore,
	// gs.getTeam2AverageScore());
	// fail(failMessage);
	// }
	//
	// assertTrue(true);
	// }
	//
	// @Test
	// public void OneHundredVSNinety() throws IOException {
	//
	// Team team1 = OneHundred;
	// Team team2 = Ninety;
	//
	// double team1LowerWinPercentage = .57;
	// double team1UpperWinPercentage = .65;
	//
	// double team2LowerWinPercentage = .35;
	// double team2UpperWinPercentage = .45;
	//
	// double team1LowerAverageScore = 100;
	// double team1UpperAverageScore = 110;
	//
	// double team2LowerAverageScore = 97;
	// double team2UpperAverageScore = 107;
	//
	// GameSimulation gs = new GameSimulation(team1, team2, 1);
	// gs.runSimulations(numberSimulations, team1, team2);
	//
	// double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
	// double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
	//
	// if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage >
	// team1LowerWinPercentage)
	// || (team2WinPercentage < team2UpperWinPercentage && team2WinPercentage >
	// team2LowerWinPercentage)))
	// || (!((gs.getTeam1AverageScore() < team1UpperAverageScore
	// && gs.getTeam1AverageScore() > team1LowerAverageScore)
	// || (gs.getTeam2AverageScore() < team2UpperAverageScore
	// && gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
	// String failMessage = Helper.createString(team1.getTeamOverallRating(),
	// team2.getTeamOverallRating(), gs,
	// team1LowerWinPercentage, team1UpperWinPercentage, team1WinPercentage,
	// team1LowerAverageScore,
	// team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage,
	// team2UpperWinPercentage,
	// team2WinPercentage, team2LowerAverageScore, team2UpperAverageScore,
	// gs.getTeam2AverageScore());
	// fail(failMessage);
	// }
	//
	// assertTrue(true);
	// }
	//
	// @Test
	// public void OneHundredVSEighty() throws IOException {
	//
	// Team team1 = OneHundred;
	// Team team2 = Eighty;
	//
	// double team1LowerWinPercentage = .65;
	// double team1UpperWinPercentage = .75;
	//
	// double team2LowerWinPercentage = .25;
	// double team2UpperWinPercentage = .35;
	//
	// double team1LowerAverageScore = 102;
	// double team1UpperAverageScore = 112;
	//
	// double team2LowerAverageScore = 96;
	// double team2UpperAverageScore = 106;
	//
	// GameSimulation gs = new GameSimulation(team1, team2, 1);
	// gs.runSimulations(numberSimulations, team1, team2);
	//
	// double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
	// double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
	//
	// if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage >
	// team1LowerWinPercentage)
	// || (team2WinPercentage < team2UpperWinPercentage && team2WinPercentage >
	// team2LowerWinPercentage)))
	// || (!((gs.getTeam1AverageScore() < team1UpperAverageScore
	// && gs.getTeam1AverageScore() > team1LowerAverageScore)
	// || (gs.getTeam2AverageScore() < team2UpperAverageScore
	// && gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
	// String failMessage = Helper.createString(team1.getTeamOverallRating(),
	// team2.getTeamOverallRating(), gs,
	// team1LowerWinPercentage, team1UpperWinPercentage, team1WinPercentage,
	// team1LowerAverageScore,
	// team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage,
	// team2UpperWinPercentage,
	// team2WinPercentage, team2LowerAverageScore, team2UpperAverageScore,
	// gs.getTeam2AverageScore());
	// fail(failMessage);
	// }
	//
	// assertTrue(true);
	// }
	//
	// @Test
	// public void OneHundredVSSeventy() throws IOException {
	//
	// Team team1 = OneHundred;
	// Team team2 = Seventy;
	//
	// double team1LowerWinPercentage = .75;
	// double team1UpperWinPercentage = .85;
	//
	// double team2LowerWinPercentage = .15;
	// double team2UpperWinPercentage = .25;
	//
	// double team1LowerAverageScore = 104;
	// double team1UpperAverageScore = 114;
	//
	// double team2LowerAverageScore = 95;
	// double team2UpperAverageScore = 105;
	//
	// GameSimulation gs = new GameSimulation(team1, team2, 1);
	// gs.runSimulations(numberSimulations, team1, team2);
	//
	// double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
	// double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
	//
	// if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage >
	// team1LowerWinPercentage)
	// || (team2WinPercentage < team2UpperWinPercentage && team2WinPercentage >
	// team2LowerWinPercentage)))
	// || (!((gs.getTeam1AverageScore() < team1UpperAverageScore
	// && gs.getTeam1AverageScore() > team1LowerAverageScore)
	// || (gs.getTeam2AverageScore() < team2UpperAverageScore
	// && gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
	// String failMessage = Helper.createString(team1.getTeamOverallRating(),
	// team2.getTeamOverallRating(), gs,
	// team1LowerWinPercentage, team1UpperWinPercentage, team1WinPercentage,
	// team1LowerAverageScore,
	// team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage,
	// team2UpperWinPercentage,
	// team2WinPercentage, team2LowerAverageScore, team2UpperAverageScore,
	// gs.getTeam2AverageScore());
	// fail(failMessage);
	// }
	//
	// assertTrue(true);
	// }
	//
	// @Test
	// public void OneHundredVSFifty() throws IOException {
	//
	// Team team1 = OneHundred;
	// Team team2 = Fifty;
	//
	// double team1LowerWinPercentage = .95;
	// double team1UpperWinPercentage = 1.05;
	//
	// double team2LowerWinPercentage = -.05;
	// double team2UpperWinPercentage = .05;
	//
	// double team1LowerAverageScore = 118;
	// double team1UpperAverageScore = 128;
	//
	// double team2LowerAverageScore = 88;
	// double team2UpperAverageScore = 98;
	//
	// GameSimulation gs = new GameSimulation(team1, team2, 1);
	// gs.runSimulations(numberSimulations, team1, team2);
	//
	// double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
	// double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
	//
	// if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage >
	// team1LowerWinPercentage)
	// || (team2WinPercentage < team2UpperWinPercentage && team2WinPercentage >
	// team2LowerWinPercentage)))
	// || (!((gs.getTeam1AverageScore() < team1UpperAverageScore
	// && gs.getTeam1AverageScore() > team1LowerAverageScore)
	// || (gs.getTeam2AverageScore() < team2UpperAverageScore
	// && gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
	// String failMessage = Helper.createString(team1.getTeamOverallRating(),
	// team2.getTeamOverallRating(), gs,
	// team1LowerWinPercentage, team1UpperWinPercentage, team1WinPercentage,
	// team1LowerAverageScore,
	// team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage,
	// team2UpperWinPercentage,
	// team2WinPercentage, team2LowerAverageScore, team2UpperAverageScore,
	// gs.getTeam2AverageScore());
	// fail(failMessage);
	// }
	//
	// assertTrue(true);
	// }
	//
	// @Test
	// public void OneHundredVSThirty() throws IOException {
	//
	// Team team1 = OneHundred;
	// Team team2 = Thirty;
	//
	// double team1LowerWinPercentage = .95;
	// double team1UpperWinPercentage = 1.05;
	//
	// double team2LowerWinPercentage = -.05;
	// double team2UpperWinPercentage = .05;
	//
	// double team1LowerAverageScore = 120;
	// double team1UpperAverageScore = 130;
	//
	// double team2LowerAverageScore = 91;
	// double team2UpperAverageScore = 101;
	//
	// GameSimulation gs = new GameSimulation(team1, team2, 1);
	// gs.runSimulations(numberSimulations, team1, team2);
	//
	// double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
	// double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
	//
	// if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage >
	// team1LowerWinPercentage)
	// || (team2WinPercentage < team2UpperWinPercentage && team2WinPercentage >
	// team2LowerWinPercentage)))
	// || (!((gs.getTeam1AverageScore() < team1UpperAverageScore
	// && gs.getTeam1AverageScore() > team1LowerAverageScore)
	// || (gs.getTeam2AverageScore() < team2UpperAverageScore
	// && gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
	// String failMessage = Helper.createString(team1.getTeamOverallRating(),
	// team2.getTeamOverallRating(), gs,
	// team1LowerWinPercentage, team1UpperWinPercentage, team1WinPercentage,
	// team1LowerAverageScore,
	// team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage,
	// team2UpperWinPercentage,
	// team2WinPercentage, team2LowerAverageScore, team2UpperAverageScore,
	// gs.getTeam2AverageScore());
	// fail(failMessage);
	// }
	//
	// assertTrue(true);
	// }
	//
	// @Test
	// public void EightyVSEighty() throws IOException {
	//
	// Team team1 = Eighty;
	// Team team2 = Eighty;
	//
	// double team1LowerWinPercentage = .45;
	// double team1UpperWinPercentage = .57;
	//
	// double team2LowerWinPercentage = .45;
	// double team2UpperWinPercentage = .57;
	//
	// double team1LowerAverageScore = 98;
	// double team1UpperAverageScore = 108;
	//
	// double team2LowerAverageScore = 98;
	// double team2UpperAverageScore = 108;
	//
	// GameSimulation gs = new GameSimulation(team1, team2, 1);
	// gs.runSimulations(numberSimulations, team1, team2);
	//
	// double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
	// double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
	//
	// if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage >
	// team1LowerWinPercentage)
	// || (team2WinPercentage < team2UpperWinPercentage && team2WinPercentage >
	// team2LowerWinPercentage)))
	// || (!((gs.getTeam1AverageScore() < team1UpperAverageScore
	// && gs.getTeam1AverageScore() > team1LowerAverageScore)
	// || (gs.getTeam2AverageScore() < team2UpperAverageScore
	// && gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
	// String failMessage = Helper.createString(team1.getTeamOverallRating(),
	// team2.getTeamOverallRating(), gs,
	// team1LowerWinPercentage, team1UpperWinPercentage, team1WinPercentage,
	// team1LowerAverageScore,
	// team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage,
	// team2UpperWinPercentage,
	// team2WinPercentage, team2LowerAverageScore, team2UpperAverageScore,
	// gs.getTeam2AverageScore());
	// fail(failMessage);
	// }
	//
	// assertTrue(true);
	// }
	//
	// @Test
	// public void ThirtyVSThirty() throws IOException {
	//
	// Team team1 = Thirty;
	// Team team2 = Thirty;
	//
	// double team1LowerWinPercentage = .45;
	// double team1UpperWinPercentage = .57;
	//
	// double team2LowerWinPercentage = .45;
	// double team2UpperWinPercentage = .57;
	//
	// double team1LowerAverageScore = 98;
	// double team1UpperAverageScore = 108;
	//
	// double team2LowerAverageScore = 98;
	// double team2UpperAverageScore = 108;
	//
	// GameSimulation gs = new GameSimulation(team1, team2, 1);
	// gs.runSimulations(numberSimulations, team1, team2);
	//
	// double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
	// double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
	//
	// if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage >
	// team1LowerWinPercentage)
	// || (team2WinPercentage < team2UpperWinPercentage && team2WinPercentage >
	// team2LowerWinPercentage)))
	// || (!((gs.getTeam1AverageScore() < team1UpperAverageScore
	// && gs.getTeam1AverageScore() > team1LowerAverageScore)
	// || (gs.getTeam2AverageScore() < team2UpperAverageScore
	// && gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
	// String failMessage = Helper.createString(team1.getTeamOverallRating(),
	// team2.getTeamOverallRating(), gs,
	// team1LowerWinPercentage, team1UpperWinPercentage, team1WinPercentage,
	// team1LowerAverageScore,
	// team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage,
	// team2UpperWinPercentage,
	// team2WinPercentage, team2LowerAverageScore, team2UpperAverageScore,
	// gs.getTeam2AverageScore());
	// fail(failMessage);
	// }
	//
	// assertTrue(true);
	// }
	//
	// @Test
	// public void EightyVSThirty() throws IOException {
	//
	// Team team1 = Eighty;
	// Team team2 = Thirty;
	//
	// double team1LowerWinPercentage = .95;
	// double team1UpperWinPercentage = 1.05;
	//
	// double team2LowerWinPercentage = -.05;
	// double team2UpperWinPercentage = .05;
	//
	// double team1LowerAverageScore = 118;
	// double team1UpperAverageScore = 128;
	//
	// double team2LowerAverageScore = 88;
	// double team2UpperAverageScore = 98;
	//
	// GameSimulation gs = new GameSimulation(team1, team2, 1);
	// gs.runSimulations(numberSimulations, team1, team2);
	//
	// double team1WinPercentage = (double) gs.getTeam1Wins() / numberSimulations;
	// double team2WinPercentage = (double) gs.getTeam2Wins() / numberSimulations;
	//
	// if ((!((team1WinPercentage < team1UpperWinPercentage && team1WinPercentage >
	// team1LowerWinPercentage)
	// || (team2WinPercentage < team2UpperWinPercentage && team2WinPercentage >
	// team2LowerWinPercentage)))
	// || (!((gs.getTeam1AverageScore() < team1UpperAverageScore
	// && gs.getTeam1AverageScore() > team1LowerAverageScore)
	// || (gs.getTeam2AverageScore() < team2UpperAverageScore
	// && gs.getTeam2AverageScore() > team2LowerAverageScore)))) {
	// String failMessage = Helper.createString(team1.getTeamOverallRating(),
	// team2.getTeamOverallRating(), gs,
	// team1LowerWinPercentage, team1UpperWinPercentage, team1WinPercentage,
	// team1LowerAverageScore,
	// team1UpperAverageScore, gs.getTeam1AverageScore(), team2LowerWinPercentage,
	// team2UpperWinPercentage,
	// team2WinPercentage, team2LowerAverageScore, team2UpperAverageScore,
	// gs.getTeam2AverageScore());
	// fail(failMessage);
	// }
	//
	// assertTrue(true);
	// }

}