package simulation;

/**
 * Represents a basketball player. Stores name and ratings.
 * 
 * @author Owner
 *
 */
public class Player {

	/**
	 * Stores player name
	 */
	private String playerName;

	/**
	 * Stores player offensive rating
	 */
	private int offense;

	/**
	 * Stores player defensive rating
	 */
	private int defense;

	/**
	 * Stores player position
	 */
	private int[] position;

	/**
	 * Stores player contract amount in millions per year
	 */
	private double contractAmount;

	/**
	 * Stores number of years left on contract
	 */
	private int contractYears;

	/**
	 * Stores age of player
	 */
	private int age;

	/**
	 * Constructs a new Player object
	 * 
	 * @param playerName
	 *            Name of the player
	 * @param offense
	 *            Offensive rating of the player
	 * @param defense
	 *            Defensive rating of the player
	 * @param position
	 *            Position of the player
	 */
	public Player(String playerName, int offense, int defense, int[] position, double contractAmount, int contractYears,
			int age) {

		setPlayerName(playerName);

		setOffense(offense);

		setDefense(defense);

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
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * Sets the player name to playerName
	 * 
	 * @param playerName
	 *            New name for player
	 */
	public void setPlayerName(String playerName) {
		// Check for valid character inputs?
		this.playerName = playerName;
	}

	/**
	 * Returns the position of the player
	 * 
	 * @return Position of player
	 */
	public int[] getPosition() {
		return position;
	}

	/**
	 * Sets the position of the player
	 * 
	 * @param position
	 *            New position of the player
	 */
	public void setPosition(int[] position) {
		try {
			for (int i = 0; i < position.length; i++) {
				if (position[i] < 0 || position[i] > 6) {
					throw new IllegalArgumentException("All listed positions must be between 0 and 6 inclusive");
				}
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}

		this.position = position;
	}

	/**
	 * Returns the offensive rating of the player
	 * 
	 * @return Offensive rating of the player
	 */
	public int getOffense() {
		return offense;
	}

	/**
	 * Sets the offensive rating of the player
	 * 
	 * @param offense
	 *            New offensive rating of player
	 */
	public void setOffense(int offense) {
		try {
			if (offense < 0 || offense > 100) {
				throw new IllegalArgumentException("Offensive rating needs to be between 0 and 100 inclusive");
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
			// END OR REPROMPT FOR INPUT
		}

		this.offense = offense;
	}

	/**
	 * Returns the defensive rating of the player
	 * 
	 * @return Defensive rating of the player
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * Sets the defensive rating of the player
	 * 
	 * @param defense
	 *            New defensive rating of the player
	 */
	public void setDefense(int defense) {
		try {
			if (defense < 0 || defense > 100) {
				throw new IllegalArgumentException("Defensive rating needs to be between 0 and 100 inclusive");
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}

		this.defense = defense;
	}

	/**
	 * Returns the overall rating of the player
	 * 
	 * @return Overall rating of player
	 */
	public int getOverall() {
		return (offense + defense) / 2;
	}

	/**
	 * Returns the contract amount for current player
	 * 
	 * @return Contract amount for current player
	 */
	public double getContractAmount() {
		return contractAmount;
	}

	/**
	 * Sets the contract amount to a new value
	 * 
	 * @param contractAmount
	 *            New contract amount
	 */
	public void setContractAmount(double contractAmount) {
		try {
			if (contractAmount < 0) {
				throw new IllegalArgumentException("Contract amount must be greater than or equal to zero.");
			} else {
				this.contractAmount = contractAmount;
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}
	}

	/**
	 * Returns the number of years left on current player's contract
	 * 
	 * @return Number of years left on contract
	 */
	public int getContractYears() {
		return contractYears;
	}

	/**
	 * Sets the number of contract years to a new value
	 * 
	 * @param contractYears
	 *            New number of years left on contract
	 */
	public void setContractYears(int contractYears) {
		try {
			if (contractYears < 0) {
				throw new IllegalArgumentException("Contract years must be greater than or equal to zero.");
			} else {
				this.contractYears = contractYears;
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}
	}

	/**
	 * Returns the age of the player
	 * 
	 * @return Age of player
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age of the player to a new value
	 * 
	 * @param age
	 *            New age of player
	 */
	public void setAge(int age) {
		try {
			if (age < 0) {
				throw new IllegalArgumentException("Age of player must be greater than zero.");
			} else {
				this.age = age;
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}
	}

}
