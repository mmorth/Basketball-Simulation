package simulation;

/**
 * Represents a basketball player. Stores name and ratings.
 * 
 * @author Matthew Orth
 *
 */
public class Player implements Athlete {

	/**
	 * Stores player's first name
	 */
	private String playerFirstName;

	/**
	 * Stores player's last name
	 */
	private String playerLastName;

	/**
	 * Stores player offensive rating
	 */
	private int offenseRating;

	/**
	 * Stores player defensive rating
	 */
	private int defenseRating;

	/**
	 * Stores player position
	 */
	private int[] position;

	/**
	 * Stores player contract amount in millions per year
	 */
	private double contractAmount;

	/**
	 * Stores number of years left on player contract
	 */
	private int contractYears;

	/**
	 * Stores age of player
	 */
	private int age;

	/**
	 * Creates a new basketball player with various attributes
	 * 
	 * @param playerName
	 *            Name of the player
	 * @param offenseRating
	 *            The offensive rating of the player
	 * @param defenseRating
	 *            The defensive rating of the player
	 * @param position
	 *            The position(s) of the player
	 * @param contractAmount
	 *            The yearly salary of the player
	 * @param contractYears
	 *            The number of years left on the player's contract
	 * @param age
	 *            The age of the player
	 */
	public Player(String playerFirstName, String playerLastName, int offenseRating, int defenseRating, int[] position,
			double contractAmount, int contractYears, int age) {

		setFirstName(playerFirstName);

		setLastName(playerLastName);

		setOffenseRating(offenseRating);

		setDefenseRating(defenseRating);

		setPosition(position);

		setContractAmount(contractAmount);

		setContractYears(contractYears);

		setAge(age);

	}

	/**
	 * Returns the first name of the player
	 * 
	 * @return Name of the player
	 */
	@Override
	public String getFirstName() {
		return playerFirstName;
	}

	/**
	 * Sets the first name of the player
	 * 
	 * @param playerFirstName
	 *            New first name for player
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgumentException if the name is greater than 15
	 *             characters or contains spaces.
	 */
	@Override
	public void setFirstName(String playerFirstName) {
		if (playerFirstName.length() > 15 || Helper.containsSpaces(playerFirstName)) {
			throw new IllegalArgumentException(
					"Player first name must be 15 or fewer characters and may not contain any spaces.");
		}
		this.playerFirstName = playerFirstName;
	}

	/**
	 * Returns the last name of the player
	 * 
	 * @return Last name of player
	 */
	@Override
	public String getLastName() {
		return playerLastName;
	}

	/**
	 * Sets the last name of the player
	 * 
	 * @param playerLastName
	 *            New last name for player
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgumentException if the name is greater than 15
	 *             characters or contains spaces.
	 */
	@Override
	public void setLastName(String playerLastName) {
		if (playerLastName.length() > 15 || Helper.containsSpaces(playerLastName)) {
			throw new IllegalArgumentException(
					"Player last name must be 15 or fewer characters and may not contain any spaces.");
		}
		this.playerLastName = playerLastName;
	}

	/**
	 * Returns the position of the player
	 * 
	 * @return Position of player
	 */
	@Override
	public int[] getPosition() {
		return position;
	}

	/**
	 * Sets a new position for a player
	 * 
	 * @param position
	 *            The new position of the player
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgument exception if there are more than 5
	 *             elements in position or if a position is not between 1 and 6
	 */
	@Override
	public void setPosition(int[] position) {
		if (position.length > 6) {
			throw new IllegalArgumentException("All listed positions must be between 0 and 6 inclusive");
		}

		for (int i = 0; i < position.length; i++) {
			if (position[i] < 1 || position[i] > 6) {
				throw new IllegalArgumentException("All listed positions must be between 1 and 6 inclusive");
			}
		}

		this.position = position;
	}

	/**
	 * Returns the offensive rating of the player
	 * 
	 * @return Offensive rating of the player
	 */
	@Override
	public int getOffenseRating() {
		return offenseRating;
	}

	/**
	 * Sets the offensive rating of the player
	 * 
	 * @param offenseRating
	 *            New offensive rating of player
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgument exception if offenseRating is less than
	 *             30 or greater than 100
	 */
	@Override
	public void setOffenseRating(int offenseRating) {
		if (offenseRating < 30 || offenseRating > 100) {
			throw new IllegalArgumentException("Offensive rating needs to be between 0 and 100 inclusive");
		}

		this.offenseRating = offenseRating;
	}

	/**
	 * Returns the defensive rating of the player
	 * 
	 * @return Defensive rating of the player
	 */
	@Override
	public int getDefenseRating() {
		return defenseRating;
	}

	/**
	 * Sets the defensive rating of the player
	 * 
	 * @param defenseRating
	 *            New defensive rating of the player
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgument exception if defenseRating is less than
	 *             30 or greater than 100
	 */
	@Override
	public void setDefenseRating(int defenseRating) {
		if (defenseRating < 30 || defenseRating > 100) {
			throw new IllegalArgumentException("Defensive rating needs to be between 0 and 100 inclusive");
		}

		this.defenseRating = defenseRating;
	}

	/**
	 * Returns the overall rating of the player
	 * 
	 * @return Overall rating of player
	 */
	@Override
	public int getOverallRating() {
		return (offenseRating + defenseRating) / 2;
	}

	/**
	 * Returns the contract amount for current player
	 * 
	 * @return Contract amount for current player
	 */
	@Override
	public double getContractAmount() {
		return contractAmount;
	}

	/**
	 * Sets the contract amount to a new value
	 * 
	 * @param contractAmount
	 *            New contract amount
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgument exception if contractAmount is less
	 *             than 0
	 */
	@Override
	public void setContractAmount(double contractAmount) {
		if (contractAmount < 0) {
			throw new IllegalArgumentException("Contract amount must be greater than or equal to zero.");
		}

		this.contractAmount = contractAmount;

	}

	/**
	 * Returns the number of years left on current player's contract
	 * 
	 * @return Number of years left on contract
	 */
	@Override
	public int getContractYears() {
		return contractYears;
	}

	/**
	 * Sets the number of contract years to a new value
	 * 
	 * @param contractYears
	 *            New number of years left on contract
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgument exception if contractYears is less than
	 *             0
	 */
	@Override
	public void setContractYears(int contractYears) {
		if (contractYears < 0) {
			throw new IllegalArgumentException("Contract years must be greater than or equal to zero.");
		}

		this.contractYears = contractYears;
	}

	/**
	 * Returns the age of the player
	 * 
	 * @return Age of player
	 */
	@Override
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age of the player to a new value
	 * 
	 * @param age
	 *            New age of player
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgument exception if age is less than 0
	 */
	@Override
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age of player must be greater than zero.");
		}

		this.age = age;
	}

}