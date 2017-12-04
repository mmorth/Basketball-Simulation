package simulation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JUnitTests {
	
	// Create player
	Player p1;
	
	int[] position1 = {2};
	int[] position2 = {2};
	int[] position3 = {2, 3, 4};
	int[] position4 = {3};
	int[] position5 = {4};
	
	// Create coach
	Coach c1;
	
	// Create roster
	Player[] roster, roster1;
	
	// Create team
	Team t1, t2;
	
	@Before
	public void setUp() {
		// Create player
		p1 = new Player("First", 80, 60, position1, 5, 2, 25);
		
		// Create coach
		c1 = new Coach("First", 80,60);
		
		// Create team
		roster = new Player[7];
		roster[0] = new Player("First", 50, 50, position1, 5, 2, 25);
		roster[1] = new Player("First", 50, 50, position1, 5, 2, 25);
		roster[2] = new Player("First", 50, 50, position2, 5, 2, 25);
		roster[3] = new Player("First", 50, 50, position3, 5, 2, 25);
		roster[4] = new Player("First", 50, 50, position4, 5, 2, 25);
		roster[5] = new Player("First", 50, 50, position5, 5, 2, 25);
		roster[6] = new Player("First", 50, 50, position3, 5, 2, 25);
		
		t1 = new Team("Team", roster);
		
		roster1 = new Player[7];
		roster1[0] = new Player("First", 20, 20, position1, 5, 2, 25);
		roster1[1] = new Player("First", 30, 30, position1, 5, 2, 25);
		roster1[2] = new Player("First", 40, 40, position2, 5, 2, 25);
		roster1[3] = new Player("First", 50, 50, position3, 5, 2, 25);
		roster1[4] = new Player("First", 60, 60, position4, 5, 2, 25);
		roster1[5] = new Player("First", 70, 70, position5, 5, 2, 25);
		roster1[6] = new Player("First", 80, 80, position3, 5, 2, 25);
		
		t2 = new Team("Team", roster1);
	}
	
// -------------------------Player Class-----------------------
	
	@Test
	public void playerGetPlayerName() {
		assertEquals("First", p1.getPlayerName());
	}
	
	@Test
	public void playerSetPlayerName() {
		p1.setPlayerName("Second");
		assertEquals("Second", p1.getPlayerName());
	}
	
	@Test
	public void playerGetOffense() {
		assertEquals(80, p1.getOffense());
	}
	
	@Test
	public void playerGetDefense() {
		assertEquals(60, p1.getDefense());
	}
	
	@Test
	public void playerSetOffense() {
		p1.setOffense(75);
		assertEquals(75, p1.getOffense());
	}
	
	@Test
	public void playerSetDefense() {
		p1.setDefense(95);
		assertEquals(95, p1.getDefense());
	}
	
	@Test
	public void playerGetOverall() {
		assertEquals(70, p1.getOverall());
	}
	
	@Test
	public void playerGetPosition() {
		for (int i = 0; i < p1.getPosition().length; i++) {
			if (i == 0) {
				assertEquals(2, p1.getPosition()[0]);
			} else {
				assertEquals(2, p1.getPosition()[1]);
			}
		}	
	}
	
	@Test
	public void playerGetContractAmount() {
		assertEquals(5, p1.getContractAmount(), .01);
	}
	
	@Test
	public void playerSetContractAmount() {
		p1.setContractAmount(10);
		assertEquals(10, p1.getContractAmount(), .01);
	}
	
	@Test
	public void playerGetContractYears() {
		assertEquals(2, p1.getContractYears());
	}
	
	@Test
	public void playerSetContractYears() {
		p1.setContractYears(4);
		assertEquals(4, p1.getContractYears());
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
	public void coachGetPlayerName() {
		assertEquals("First", c1.getCoachName());
	}
	
	@Test
	public void coachSetPlayerName() {
		c1.setCoachName("Second");
		assertEquals("Second", c1.getCoachName());
	}
	
	@Test
	public void coachGetOffense() {
		assertEquals(80, c1.getOffense());
	}
	
	@Test
	public void coachGetDefense() {
		assertEquals(60, c1.getDefense());
	}
	
	@Test
	public void coachSetOffense() {
		c1.setOffense(75);
		assertEquals(75, c1.getOffense());
	}
	
	@Test
	public void coachSetDefense() {
		c1.setDefense(95);
		assertEquals(95, c1.getDefense());
	}
	
	@Test
	public void coachGetOverall() {
		assertEquals(70, c1.getOverall());
	}
	
// ------------------------------Team Class----------------------------------

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
	}
	
	@Test
	public void teamSetRoster() {
		t1.setRoster(roster1);
		assertArrayEquals(roster1, t1.getRoster());
	}
	
	@Test
	public void teamChangeRoster() {
		t1.changeRoster(2, new Player("Name", 10, 10, position1, 5, 2, 25));
		assertEquals("Name", t1.getRoster()[2].getPlayerName());
	}
	
	@Test
	public void teamGetTeamOffensiveRating() {
		assertEquals(350, t2.getTeamOffensiveRating());
	}
	
	@Test
	public void teamGetTeamDefensiveRating() {
		assertEquals(350, t2.getTeamDefensiveRating());
	}
	
	@Test
	public void teamGetTeamOverallRating() {
		assertEquals(700, t2.getTeamOverallRating());
	}
	
	@Test
	public void teamUpdatePlayers() {
		t1.updatePlayers();
		assertEquals(t1.getRoster()[1].getOffense(), 45);
		assertEquals(t1.getRoster()[1].getDefense(), 45);
		assertEquals(t1.getRoster()[2].getOffense(), 50);
		assertEquals(t1.getRoster()[2].getDefense(), 50);
		assertEquals(t1.getRoster()[3].getOffense(), 50);
		assertEquals(t1.getRoster()[3].getDefense(), 50);
		assertEquals(t1.getRoster()[4].getOffense(), 45);
		assertEquals(t1.getRoster()[4].getDefense(), 45);
		assertEquals(t1.getRoster()[5].getOffense(), 45);
		assertEquals(t1.getRoster()[5].getDefense(), 45);
	}
	
	@Test
	public void teamGetSalaryCap() {
		assertEquals(35, t1.getSalaryCap(), .01);
	}
	
// ------------------------------Simulation Class----------------------------------
	
	
	
}