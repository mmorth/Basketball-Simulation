package simulation;

/**
 * Represents a basketball coach. Stores name and ratings.
 * @author Owner
 *
 */
public class Coach {

	/**
	 * Stores coache's name
	 */
	private String coachName;

	/**
	 * Stores offensive rating of coach
	 */
	private int offense;

	/**
	 * Stores defensive rating of coach
	 */
	private int defense;

	/**
	 * Constructs a new Coach object
	 * 
	 * @param playerName
	 *            Name of the Coach
	 * @param offense
	 *            Offensive rating of the Coach
	 * @param defense
	 *            Defensive rating of the Coach
	 * @param position
	 *            Position of the Coach
	 */
	public Coach(String coachName, int offense, int defense) {
		this.coachName = coachName;

		try {
			if (offense < 0 || offense > 100) {
				throw new IllegalArgumentException("Defensive rating needs to be between 0 and 100 inclusive");
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}

		this.offense = offense;

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
	 * Returns the name of the coach
	 * 
	 * @return Name of the coach
	 */
	public String getCoachName() {
		return coachName;
	}

	/**
	 * Sets the player name to coachName
	 * 
	 * @param coachName
	 *            New name for coach
	 */
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	/**
	 * Returns the offensive rating of the coach
	 * 
	 * @return Offensive rating of the coach
	 */
	public int getOffense() {
		return offense;
	}

	/**
	 * Sets the offensive rating of the coach
	 * 
	 * @param offense
	 *            New offensive rating of coach
	 */
	public void setOffense(int offense) {
		try {
			if (offense < 0 || offense > 100) {
				throw new IllegalArgumentException("Defensive rating needs to be between 0 and 100 inclusive");
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}

		this.offense = offense;
	}

	/**
	 * Returns the defensive rating of the coach
	 * 
	 * @return Defensive rating of the coach
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * Sets the defensive rating of the coach
	 * 
	 * @param defense
	 *            New defensive rating of the coach
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
	 * Retruns the overall rating of the coach
	 * 
	 * @return Overall rating of coach
	 */
	public int getOverall() {
		return (offense + defense) / 2;
	}

}

