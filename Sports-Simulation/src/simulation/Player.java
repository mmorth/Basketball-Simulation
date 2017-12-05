package simulation;

/**
 * Represents a basketball player. Stores name and ratings.
 * 
 * @author Owner
 *
 */
public class Player implements Athlete {

	/**
	 * Stores player name
	 */
	private String playerName;

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
	 * @param playerName
	 * 		Name of the player
	 * @param offenseRating
	 * 		The offensive rating of the player
	 * @param defenseRating
	 * 		The defensive rating of the player
	 * @param position
	 * 		The position(s) of the player
	 * @param contractAmount
	 * 		The yearly salary of the player
	 * @param contractYears
	 * 		The number of years left on the player's contract
	 * @param age
	 * 		The age of the player
	 */
	public Player(String playerName, int offenseRating, int defenseRating, int[] position, double contractAmount, int contractYears,
			int age) {

		setName(playerName);

		setOffenseRating(offenseRating);

		setDefenseRating(defenseRating);

		setPosition(position);

		setContractAmount(contractAmount);

		setContractYears(contractYears);

		setAge(age);

	}

	/**
	 * Returns the name of the player
	 * 
	 * @return Name of the player
	 */
	@Override
	public String getName() {
		return playerName;
	}

	/**
	 * Sets the player name to playerName
	 * 
	 * @param playerName
	 *            New name for player
	 */
	@Override
	public void setName(String playerName) {
		// Check for valid character inputs?
		this.playerName = playerName;
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
	 * @param position
	 * 		The new position of the player
	 */
	@Override
	public void setPosition(int[] position) {
//		try {
			for (int i = 0; i < position.length; i++) {
				if (position[i] < 0 || position[i] > 6) {
					throw new IllegalArgumentException("All listed positions must be between 0 and 6 inclusive");
				}
			}
//		} catch (IllegalArgumentException e) {
//			e.getMessage();
//		}

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
	 */
	@Override
	public void setOffenseRating(int offenseRating) {
//		try {
			if (offenseRating < 0 || offenseRating > 100) {
				throw new IllegalArgumentException("Offensive rating needs to be between 0 and 100 inclusive");
			}
//		} catch (IllegalArgumentException e) {
//			e.getMessage();
//			// END OR REPROMPT FOR INPUT
//		}

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
	 */
	@Override
	public void setDefenseRating(int defenseRating) {
//		try {
			if (defenseRating < 0 || defenseRating > 100) {
				throw new IllegalArgumentException("Defensive rating needs to be between 0 and 100 inclusive");
			}
//		} catch (IllegalArgumentException e) {
//			e.getMessage();
//		}

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
	 */
	@Override
	public void setContractAmount(double contractAmount) {
//		try {
			if (contractAmount < 0) {
				throw new IllegalArgumentException("Contract amount must be greater than or equal to zero.");
			}
//		} catch (IllegalArgumentException e) {
//			e.getMessage();
//		}
		
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
	 */
	@Override
	public void setContractYears(int contractYears) {
//		try {
			if (contractYears < 0) {
				throw new IllegalArgumentException("Contract years must be greater than or equal to zero.");
			}
//		} catch (IllegalArgumentException e) {
//			e.getMessage();
//		}
		
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
	 */
	@Override
	public void setAge(int age) {
//		try {
			if (age < 0) {
				throw new IllegalArgumentException("Age of player must be greater than zero.");
			}
//		} catch (IllegalArgumentException e) {
//			e.getMessage();
//		}
		
		this.age = age;
	}

}
