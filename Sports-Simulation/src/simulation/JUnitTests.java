package simulation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class JUnitTests {
	
	// Create player
	Player p1;
	
	int[] position0 = {0};
	int[] position1 = {1};
	int[] position2 = {2};
	int[] position3 = {2, 3, 4};
	int[] position4 = {3, 4};
	int[] position5 = {4, 5};
	
	// Create coach
	Coach c1;
	
	// Create roster
	Athlete[] roster, roster1, roster2;
	
	// Create team
	Team t1, t2;
	
	@Before
	public void setUp() {
		// Create player
		p1 = new Player("First", 80, 60, position3, 5, 2, 25);
		
		// Create coach
		c1 = new Coach("First", 80, 60, position0, 5, 2, 25);
		
		// Create team
		roster = new Athlete[7];
		roster[0] = new Coach("First", 50, 50, position0, 5, 2, 25);
		roster[1] = new Player("First", 50, 50, position1, 5, 2, 25);
		roster[2] = new Player("First", 50, 50, position2, 5, 2, 25);
		roster[3] = new Player("First", 50, 50, position3, 5, 2, 25);
		roster[4] = new Player("First", 50, 50, position4, 5, 2, 25);
		roster[5] = new Player("First", 50, 50, position5, 5, 2, 25);
		roster[6] = new Player("First", 50, 50, position3, 5, 2, 25);
		
		t1 = new Team("Team", roster);
		
		roster1 = new Athlete[7];
		roster1[0] = new Coach("First", 20, 20, position0, 5, 2, 25);
		roster1[1] = new Player("First", 30, 30, position1, 5, 2, 25);
		roster1[2] = new Player("First", 40, 40, position2, 5, 2, 25);
		roster1[3] = new Player("First", 50, 50, position3, 5, 2, 25);
		roster1[4] = new Player("First", 60, 60, position4, 5, 2, 25);
		roster1[5] = new Player("First", 70, 70, position5, 5, 2, 25);
		roster1[6] = new Player("First", 80, 80, position3, 5, 2, 25);
		
		t2 = new Team("Team", roster1);
		
		roster2 = new Athlete[16];
		roster2[0] = new Player("First", 50, 50, position1, 5, 2, 25);
		roster2[1] = new Player("First", 50, 50, position1, 5, 2, 25);
		roster2[2] = new Player("First", 50, 50, position2, 5, 2, 25);
		roster2[3] = new Player("First", 50, 50, position3, 5, 2, 25);
		roster2[4] = new Player("First", 50, 50, position4, 5, 2, 25);
		roster2[5] = new Player("First", 50, 50, position5, 5, 2, 25);
		roster2[6] = new Player("First", 50, 50, position3, 5, 2, 25);
		roster2[7] = new Player("First", 50, 50, position1, 5, 2, 25);
		roster2[8] = new Player("First", 50, 50, position1, 5, 2, 25);
		roster2[9] = new Player("First", 50, 50, position2, 5, 2, 25);
		roster2[10] = new Player("First", 50, 50, position3, 5, 2, 25);
		roster2[11] = new Player("First", 50, 50, position4, 5, 2, 25);
		roster2[12] = new Player("First", 50, 50, position5, 5, 2, 25);
		roster2[13] = new Player("First", 50, 50, position3, 5, 2, 25);
		roster2[14] = new Player("First", 50, 50, position1, 5, 2, 25);
		roster2[15] = new Player("First", 50, 50, position1, 5, 2, 25);
	}
	
// -------------------------Player Class-----------------------
	
	@Test
	public void playerConstructor() {
		Player player = new Player("Coach Name", 75, 60, position1, 5, 2, 30);
		assertEquals(player.getName(), "Coach Name");
		assertEquals(player.getOffenseRating(), 75);
		assertEquals(player.getDefenseRating(), 60);
		assertArrayEquals(position1, new int[] {1});
		assertEquals(player.getContractAmount(), 5, .01);
		assertEquals(player.getContractYears(), 2);
		assertEquals(player.getAge(), 30);
	}
	
	@Test
	public void playergetName() {
		assertEquals("First", p1.getName());
	}
	
	@Test
	public void playersetName() {
		p1.setName("Second");
		assertEquals("Second", p1.getName());
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
		p1.setOffenseRating(-1);
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
		int[] newPosition = {1,2,3,4,5,6};
		p1.setPosition(newPosition);
		assertArrayEquals(p1.getPosition(), newPosition);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void playerSetPositionInvalid1() {
		p1.setPosition(new int[] {1,2,0});
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void playerSetPositionInvalid2() {
		p1.setPosition(new int[] {1,7,2});
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
		Coach coach = new Coach("Coach Name", 75, 60, position0, 5, 2, 30);
		assertEquals(coach.getName(), "Coach Name");
		assertEquals(coach.getOffenseRating(), 75);
		assertEquals(coach.getDefenseRating(), 60);
		assertArrayEquals(position0, new int[] {0});
		assertEquals(coach.getContractAmount(), 5, .01);
		assertEquals(coach.getContractYears(), 2);
		assertEquals(coach.getAge(), 30);
	}
	
	@Test
	public void coachgetName() {
		assertEquals("First", c1.getName());
	}
	
	@Test
	public void coachsetName() {
		c1.setName("Second");
		assertEquals("Second", c1.getName());
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
		c1.setOffenseRating(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void coachSetDefenseRatingInvalid2() {
		c1.setOffenseRating(101);
	}
	
	@Test
	public void coachGetPosition() {
		assertArrayEquals(position0, new int[] {0});
	}
	
	@Test
	public void coachSetPosition() {
		assertArrayEquals(position0, new int[] {0});
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
		Player newPlayer = new Player("Name", 10, 10, position1, 5, 2, 25);
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
	
	@Test
	public void teamUpdatePlayers() {
		assertEquals(t1.getRoster()[1].getOffenseRating(), 45);
		assertEquals(t1.getRoster()[1].getDefenseRating(), 45);
		assertEquals(t1.getRoster()[2].getOffenseRating(), 50);
		assertEquals(t1.getRoster()[2].getDefenseRating(), 50);
		assertEquals(t1.getRoster()[3].getOffenseRating(), 50);
		assertEquals(t1.getRoster()[3].getDefenseRating(), 50);
		assertEquals(t1.getRoster()[4].getOffenseRating(), 45);
		assertEquals(t1.getRoster()[4].getDefenseRating(), 45);
		assertEquals(t1.getRoster()[5].getOffenseRating(), 45);
		assertEquals(t1.getRoster()[5].getDefenseRating(), 45);
	}
	
	@Test
	public void teamGetSalaryCap() {
		assertEquals(35, t1.getSalaryCap(), .01);
	}
	
// ------------------------------Simulation Class----------------------------------
	
	
	
}