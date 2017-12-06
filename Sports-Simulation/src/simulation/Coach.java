package simulation;

/**
 * Represents a basketball coach. Stores name and ratings.
 * 
 * @author Matthew Orth
 *
 */
public class Coach implements Athlete {

	/**
	 * Stores coach's name
	 */
	private String coachName;

	/**
	 * Stores offensive rating of coach
	 */
	private int offenseRating;

	/**
	 * Stores defensive rating of coach
	 */
	private int defenseRating;

	/**
	 * Stores coach's position, which is 0
	 */
	private int[] position;

	/**
	 * Stores coach contract amount, in millions, per year
	 */
	private double contractAmount;

	/**
	 * Stores number of years left on coach contract
	 */
	private int contractYears;

	/**
	 * Stores age of coach
	 */
	private int age;

	/**
	 * Creates a new basketball player with various attributes
	 * 
	 * @param coachName
	 *            Name of the Coach
	 * @param offenseRating
	 *            The offensive rating of the coach
	 * @param defenseRating
	 *            The defensive rating of the coach
	 * @param position
	 *            The position(s) of the coach
	 * @param contractAmount
	 *            The yearly salary of the coach
	 * @param contractYears
	 *            The number of years left on the coach's contract
	 * @param age
	 *            The age of the coach
	 */
	public Coach(String coachName, int offenseRating, int defenseRating, int[] position, double contractAmount,
			int contractYears, int age) {

		setName(coachName);

		setOffenseRating(offenseRating);

		setDefenseRating(defenseRating);

		setPosition(position);

		setContractAmount(contractAmount);

		setContractYears(contractYears);

		setAge(age);

	}

	/**
	 * Returns the name of the coach
	 * 
	 * @return Name of the coach
	 */
	@Override
	public String getName() {
		return coachName;
	}

	/**
	 * Sets the coach name
	 * 
	 * @param coachName
	 *            New name for coach
	 */
	@Override
	public void setName(String coachName) {
		this.coachName = coachName;
	}

	/**
	 * Returns the offensive rating of the coach
	 * 
	 * @return Offensive rating of the coach
	 */
	@Override
	public int getOffenseRating() {
		return offenseRating;
	}

	/**
	 * Sets the offensive rating of the coach
	 * 
	 * @param offenseRating
	 *            New offensive rating of coach
	 */
	@Override
	public void setOffenseRating(int offenseRating) {
		if (offenseRating < 0 || offenseRating > 100) {
			throw new IllegalArgumentException("Defensive rating needs to be between 0 and 100 inclusive");
		}

		this.offenseRating = offenseRating;
	}

	/**
	 * Returns the defensive rating of the coach
	 * 
	 * @return Defensive rating of the coach
	 */
	@Override
	public int getDefenseRating() {
		return defenseRating;
	}

	/**
	 * Sets the defensive rating of the coach
	 * 
	 * @param defenseRating
	 *            New defensive rating of the coach
	 */
	@Override
	public void setDefenseRating(int defenseRating) {
		if (defenseRating < 0 || defenseRating > 100) {
			throw new IllegalArgumentException("Defensive rating needs to be between 0 and 100 inclusive");
		}

		this.defenseRating = defenseRating;

	}

	/**
	 * Returns the position of the coach
	 * 
	 * @return Position of player
	 */
	@Override
	public int[] getPosition() {
		return position;
	}

	/**
	 * Sets a new position for a coach The position of the coach will always be set
	 * to 0 no matter what the user enters for the position argument to this method.
	 * 
	 * @param position
	 *            The new position of the coach
	 */
	@Override
	public void setPosition(int[] position) {
		this.position = new int[] { 0 };
	}

	/**
	 * Returns the overall rating of the coach
	 * 
	 * @return Overall rating of coach
	 */
	@Override
	public int getOverallRating() {
		return (offenseRating + defenseRating) / 2;
	}

	/**
	 * Returns the contract amount for current coach
	 * 
	 * @return Contract amount for current coach
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
		if (contractAmount < 0) {
			throw new IllegalArgumentException("Contract amount must be greater than or equal to zero.");
		}

		this.contractAmount = contractAmount;

	}

	/**
	 * Returns the number of years left on current coach's contract
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
		if (contractYears < 0) {
			throw new IllegalArgumentException("Contract years must be greater than or equal to zero.");
		}

		this.contractYears = contractYears;
	}

	/**
	 * Returns the age of the coach
	 * 
	 * @return Age of coach
	 */
	@Override
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age of the coach to a new value
	 * 
	 * @param age
	 *            New age of coach
	 */
	@Override
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age of player must be greater than zero.");
		}

		this.age = age;
	}

}
