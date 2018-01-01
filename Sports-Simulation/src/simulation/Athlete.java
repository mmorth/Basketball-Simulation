package simulation;

/**
 * Represents an athlete on a basketball team. Stores the common methods between
 * the Player and Coach class Will later be used when other types of players or
 * coaches are created An Athlete currently represents either a Coach or a
 * Player
 * 
 * @author Matthew Orth
 *
 */
public interface Athlete {

	/**
	 * Returns the first name of the athlete
	 * 
	 * @return Name of the athlete
	 */
	public String getFirstName();

	/**
	 * Sets the first name of the athlete
	 * 
	 * @param athleteFirstName
	 *            New first name for athlete
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgumentException if the name is greater than 15
	 *             characters or contains spaces.
	 */
	public void setFirstName(String athleteFirstName);

	/**
	 * Returns the last name of the athlete
	 *
	 * @return Last name of athlete
	 */
	public String getLastName();

	/**
	 * Sets the last name of the athlete
	 * 
	 * @param athleteLastName
	 *            New last name for athlete
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgumentException if the name is greater than 15
	 *             characters or contains spaces.
	 */
	public void setLastName(String athleteLastName);

	/**
	 * Returns the position of the athlete
	 * 
	 * @return Position of athlete
	 */
	public int getPosition();

	/**
	 * Sets a new position for a athlete
	 * 
	 * @param position
	 *            The new position of the athlete
	 */
	public void setPosition(int position);

	/**
	 * Returns the overallRating rating of the athlete
	 * 
	 * @return The overallRating rating of the athlete
	 */
	public int getOverallRating();

	/**
	 * Returns the offensiveRating rating of the athlete
	 * 
	 * @return The offensiveRating rating of the athlete
	 */
	public int getOffensiveRating();

	/**
	 * Returns the defensiveRating rating of the athlete
	 * 
	 * @return The defensiveRating rating of the athlete
	 */
	public int getDefensiveRating();

	/**
	 * Returns the contract amount for current athlete
	 * 
	 * @return Contract amount for current athlete
	 */
	public double getContractAmount();

	/**
	 * Sets the contract amount to a new value
	 * 
	 * @param contractAmount
	 *            New contract amount
	 */
	public void setContractAmount(double contractAmount);

	/**
	 * Returns the number of years left on current athlete's contract
	 * 
	 * @return Number of years left on contract
	 */
	public int getContractYears();

	/**
	 * Sets the number of contract years to a new value
	 * 
	 * @param contractYears
	 *            New number of years left on contract
	 */
	public void setContractYears(int contractYears);

	/**
	 * Returns the age of the athlete
	 * 
	 * @return Age of athlete
	 */
	public int getAge();

	/**
	 * Sets the age of the athlete to a new value
	 * 
	 * @param age
	 *            New age of athlete
	 */
	public void setAge(int age);

	/**
	 * Returns the insideScoring rating of the athlete
	 * 
	 * @return The insideScoring rating of the athlete
	 */
	public int getInsideScoring();

	/**
	 * Sets the insideScoring rating of the athlete
	 * 
	 * @param The
	 *            new insideScoring rating of the athlete
	 */
	public void setInsideScoring(int insideScoring);

	/**
	 * Returns the midRangeScoring rating of the athlete
	 * 
	 * @return The midRangeScoring rating of the athlete
	 */
	public int getMidRangeScoring();

	/**
	 * Sets the midRangeScoring rating of the athlete
	 * 
	 * @param The
	 *            new midRangeScoring rating of the athlete
	 */
	public void setMidRangeScoring(int midRangeScoring);

	/**
	 * Returns the threePointScoring rating of the athlete
	 * 
	 * @return The threePointScoring rating of the athlete
	 */
	public int getThreePointScoring();

	/**
	 * Sets the threePointScoring rating of the athlete
	 * 
	 * @param The
	 *            new threePointScoring rating of the athlete
	 */
	public void setThreePointScoring(int threePointScoring);

	/**
	 * Returns the freeThrow rating of the athlete
	 * 
	 * @return The freeThrow rating of the athlete
	 */
	public int getFreeThrow();

	/**
	 * Sets the freeThrow rating of the athlete
	 * 
	 * @param The
	 *            new freeThrow rating of the athlete
	 */
	public void setFreeThrow(int freeThrow);

	/**
	 * Returns the offensiveRebounding rating of the athlete
	 * 
	 * @return The offensiveRebounding rating of the athlete
	 */
	public int getOffensiveRebounding();

	/**
	 * Sets the offensiveRebounding rating of the athlete
	 * 
	 * @param The
	 *            new offensiveRebounding rating of the athlete
	 */
	public void setOffensiveRebounding(int offensiveRebounding);

	/**
	 * Returns the ballHandling rating of the athlete
	 * 
	 * @return The ballHandling rating of the athlete
	 */
	public int getBallHandling();

	/**
	 * Sets the ballHandling rating of the athlete
	 * 
	 * @param The
	 *            new ballHandling rating of the athlete
	 */
	public void setBallHandling(int ballHandling);

	/**
	 * Returns the passing rating of the athlete
	 * 
	 * @return The passing rating of the athlete
	 */
	public int getPassing();

	/**
	 * Sets the passing rating of the athlete
	 * 
	 * @param The
	 *            new passing rating of the athlete
	 */
	public void setPassing(int passing);

	/**
	 * Returns the postDefense rating of the athlete
	 * 
	 * @return The postDefense rating of the athlete
	 */
	public int getPostDefense();

	/**
	 * Sets the postDefense rating of the athlete
	 * 
	 * @param The
	 *            new postDefense rating of the athlete
	 */
	public void setPostDefense(int postDefense);

	/**
	 * Returns the perimeterDefense rating of the athlete * @throws
	 * IllegalArgumentException Throws an IllegalArgument exception if there are
	 * more than 5 elements in position or if a position is not between 1 and 6
	 * 
	 * @return The perimeterDefense rating of the athlete
	 */
	public int getPerimeterDefense();

	/**
	 * Sets the perimeterDefense rating of the athlete
	 * 
	 * @param The
	 *            new perimeterDefense rating of the athlete
	 */
	public void setPerimeterDefense(int perimeterDefense);

	/**
	 * Returns the defensiveRebounding rating of the athlete
	 * 
	 * @return The defensiveRebounding rating of the athlete
	 */
	public int getDefensiveRebounding();

	/**
	 * Sets the defensiveRebounding rating of the athlete
	 * 
	 * @param The
	 *            new defensiveRebounding rating of the athlete
	 */
	public void setDefensiveRebounding(int defensiveRebounding);

	/**
	 * Returns the steal rating of the athlete
	 * 
	 * @return The steal rating of the athlete
	 */
	public int getSteal();

	/**
	 * Sets the steal rating of the athlete
	 * 
	 * @param The
	 *            new steal rating of the athlete
	 */
	public void setSteal(int steal);

	/**
	 * Returns the block rating of the athlete
	 * 
	 * @return The block rating of the athlete
	 */
	public int getBlock();

	/**
	 * Sets the block rating of the athlete
	 * 
	 * @param The
	 *            new block rating of the athlete
	 */
	public void setBlock(int block);

	/**
	 * Returns the height rating of the athlete
	 * 
	 * @return The height rating of the athlete
	 */
	public int getHeight();

	/**
	 * Sets the height rating of the athlete
	 * 
	 * @param The
	 *            new height rating of the athlete
	 */
	public void setHeight(int height);

	/**
	 * Returns the speed rating of the athlete
	 * 
	 * @return The speed rating of the athlete
	 */
	public int getSpeed();

	/**
	 * Sets the speed rating of the athlete
	 * 
	 * @param The
	 *            new speed rating of the athlete
	 */
	public void setSpeed(int speed);

	/**
	 * Returns the stamina rating of the athlete
	 * 
	 * @return The stamina rating of the athlete
	 */
	public int getStamina();

	/**
	 * Sets the stamina rating of the athlete
	 * 
	 * @param The
	 *            new stamina rating of the athlete
	 */
	public void setStamina(int stamina);

	/**
	 * Returns the injury rating of the athlete
	 * 
	 * @return The injury rating of the athlete
	 */
	public int getInjury();

	/**
	 * Sets the injury rating of the athlete
	 * 
	 * @param The
	 *            new injury rating of the athlete
	 */
	public void setInjury(int injury);

	/**
	 * Returns the potential rating of the athlete
	 * 
	 * @return The potential rating of the athlete
	 */
	public int getPotential();

	/**
	 * Sets the potential rating of the athlete
	 * 
	 * @param The
	 *            new potential rating of the athlete
	 */
	public void setPotential(int potential);

}