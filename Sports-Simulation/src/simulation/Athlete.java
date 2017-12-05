package simulation;

/**
 * Represents an athlete on a basketball team.
 * @author Owner
 *
 */
public interface Athlete {

	/**
	 * Returns the name of the athlete
	 * 
	 * @return Name of the athlete
	 */
	String getName();
	
	/**
	 * Sets the athlete name
	 * 
	 * @param playerName
	 *            New name for player
	 */
	void setName(String playerName);
	
	/**
	 * Returns the position of the athlete
	 * 
	 * @return Position of athlete
	 */
	int[] getPosition();
	
	/**
	 * Sets a new position for a athlete
	 * @param position
	 * 		The new position of the athlete
	 */
	void setPosition(int[] position);
	
	/**
	 * Returns the offensive rating of the athlete
	 * 
	 * @return Offensive rating of the athlete
	 */
	int getOffenseRating();
	
	/**
	 * Sets the offensive rating of the athlete
	 * 
	 * @param offense
	 *            New offensive rating of athlete
	 */
	void setOffenseRating(int offense);
	
	/**
	 * Returns the defensive rating of the athlete
	 * 
	 * @return Defensive rating of the athlete
	 */
	int getDefenseRating();
	
	/**
	 * Sets the defensive rating of the athlete
	 * 
	 * @param defense
	 *            New defensive rating of the athlete
	 */
	void setDefenseRating(int defense);
	
	/**
	 * Returns the overall rating of the athlete
	 * 
	 * @return Overall rating of athlete
	 */
	int getOverallRating();
	
	/**
	 * Returns the contract amount for current athlete
	 * 
	 * @return Contract amount for current athlete
	 */
	double getContractAmount();
	
	/**
	 * Sets the contract amount to a new value
	 * 
	 * @param contractAmount
	 *            New contract amount
	 */
	void setContractAmount(double contactAmount);
	
	/**
	 * Returns the number of years left on current athlete's contract
	 * 
	 * @return Number of years left on contract
	 */
	int getContractYears();
	
	/**
	 * Sets the number of contract years to a new value
	 * 
	 * @param contractYears
	 *            New number of years left on contract
	 */
	void setContractYears(int contractYears);
	
	/**
	 * Returns the age of the athlete
	 * 
	 * @return Age of athlete
	 */
	int getAge();
	
	/**
	 * Sets the age of the player to a new value
	 * 
	 * @param age
	 *            New age of athlete
	 */
	void setAge(int age);
	
}
