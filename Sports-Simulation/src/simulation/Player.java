package simulation;

/**
 * Represents a basketball player. Stores name and ratings.
 * 
 * @author Matthew Orth
 *
 */

public class Player {

	/**
	 * Stores player's first name
	 */
	private String playerFirstName;

	/**
	 * Stores player's last name
	 */
	private String playerLastName;

	/**
	 * Stores player position
	 */
	private int position;

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

	// Offense Ratings:

	/**
	 * Stores the insideScoring rating of the player
	 */
	private int insideScoring;

	/**
	 * Stores the midRangeScoring rating of the player
	 */
	private int midRangeScoring;

	/**
	 * Stores the threePointScoring rating of the player
	 */
	private int threePointScoring;

	/**
	 * Stores the freeThrow rating of the player
	 */
	private int freeThrow;

	/**
	 * Stores the offensiveRebounding rating of the player
	 */
	private int offensiveRebounding;

	/**
	 * Stores the ballHandling rating of the player
	 */
	private int ballHandling;

	/**
	 * Stores the passing rating of the player
	 */
	private int passing;

	// Defense Ratings:

	/**
	 * Stores the postDefense rating of the player
	 */
	private int postDefense;

	/**
	 * Stores the perimeterDefense rating of the player
	 */
	private int perimeterDefense;

	/**
	 * Stores the defensiveRebounding rating of the player
	 */
	private int defensiveRebounding;

	/**
	 * Stores the steal rating of the player
	 */
	private int steal;

	/**
	 * Stores the block rating of the player
	 */
	private int block;

	// General Ratings:

	/**
	 * Stores the height rating of the player
	 */
	private int height;

	/**
	 * Stores the speed rating of the player
	 */
	private int speed;

	/**
	 * Stores the stamina rating of the player
	 */
	private int stamina;

	/**
	 * Stores the injury rating of the player
	 */
	private int injury;

	/**
	 * Stores the potential rating of the player
	 */
	private int potential;

	/**
	 * Constructs a new Player object
	 * 
	 * @param playerFirstName
	 *            The first name of the player
	 * @param playerLastName
	 *            The last name of the player
	 * @param position
	 *            The position of the player
	 * @param contractAmount
	 *            The contract amount of the player
	 * @param contractYears
	 *            The contract years of the player
	 * @param age
	 *            The age of the player
	 * @param insideScoring
	 *            The inside scoring rating of the player
	 * @param midRangeScoring
	 *            The mid-range scoring range of the player
	 * @param threePointScoring
	 *            The 3-point scoring rating of the player
	 * @param freeThrow
	 *            The free throw rating of the player
	 * @param offensiveRebounding
	 *            The offensive rebounding rating of the player
	 * @param ballHandling
	 *            The ball handling rating of the player
	 * @param passing
	 *            The passing rating of the player
	 * @param postDefense
	 *            The post defense rating of the player
	 * @param perimeterDefense
	 *            The perimeter defense rating of the player
	 * @param defensiveRebounding
	 *            The defensive rebounding rating of the player
	 * @param steal
	 *            The steal rating of the player
	 * @param block
	 *            The block rating of the player
	 * @param height
	 *            The height rating of the player
	 * @param speed
	 *            The speed rating of the player
	 * @param stamina
	 *            The stamina rating of the player
	 * @param injury
	 *            The injury rating of the player
	 * @param potential
	 *            The potential rating of the player
	 */
	public Player(int position, String playerFirstName, String playerLastName, int age, double contractAmount,
			int contractYears, int insideScoring, int midRangeScoring, int threePointScoring, int freeThrow,
			int offensiveRebounding, int ballHandling, int passing, int postDefense, int perimeterDefense,
			int defensiveRebounding, int steal, int block, int height, int speed, int stamina, int injury,
			int potential) {
		setPlayerFirstName(playerFirstName);
		setPlayerLastName(playerLastName);
		setPosition(position);
		setContractAmount(contractAmount);
		setContractYears(contractYears);
		setAge(age);
		setInsideScoring(insideScoring);
		setMidRangeScoring(midRangeScoring);
		setThreePointScoring(threePointScoring);
		setFreeThrow(freeThrow);
		setOffensiveRebounding(offensiveRebounding);
		setBallHandling(ballHandling);
		setPassing(passing);
		setPostDefense(postDefense);
		setPerimeterDefense(perimeterDefense);
		setDefensiveRebounding(defensiveRebounding);
		setSteal(steal);
		setBlock(block);
		setHeight(height);
		setSpeed(speed);
		setStamina(stamina);
		setInjury(injury);
		setPotential(potential);
	}

	/**
	 * Returns the first name of the player
	 * 
	 * @return Name of the player
	 */
	public String getPlayerFirstName() {
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
	public void setPlayerFirstName(String playerFirstName) {
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
	public String getPlayerLastName() {
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
	public void setPlayerLastName(String playerLastName) {
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
	public int getPosition() {
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
	public void setPosition(int position) {
		if (position < 1 || position > 5) {
			throw new IllegalArgumentException("Position must be between 1 and 6 inclusive");
		}

		this.position = position;
	}

	/**
	 * Returns the overallRating rating of the player
	 * 
	 * @return The overallRating rating of the player
	 */
	public int getOverallRating() {
		return 50;
	}

	/**
	 * Returns the offensiveRating rating of the player
	 * 
	 * @return The offensiveRating rating of the player
	 */
	public int getOffensiveRating() {
		return 50;
	}

	/**
	 * Returns the defensiveRating rating of the player
	 * 
	 * @return The defensiveRating rating of the player
	 */
	public int getDefensiveRating() {
		return 50;
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
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgument exception if contractAmount is less
	 *             than 0
	 */
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
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age of player must be greater than zero.");
		}

		this.age = age;
	}

	/**
	 * Returns the insideScoring rating of the player
	 * 
	 * @return The insideScoring rating of the player
	 */
	public int getInsideScoring() {
		return insideScoring;
	}

	/**
	 * Sets the insideScoring rating of the player
	 * 
	 * @param The
	 *            new insideScoring rating of the player
	 */
	public void setInsideScoring(int insideScoring) {
		if (insideScoring < 30 || insideScoring > 100) {
			throw new IllegalArgumentException("Inside Scoring needs to be between 0 and 100 inclusive");
		}
		this.insideScoring = insideScoring;
	}

	/**
	 * Returns the midRangeScoring rating of the player
	 * 
	 * @return The midRangeScoring rating of the player
	 */
	public int getMidRangeScoring() {
		return midRangeScoring;
	}

	/**
	 * Sets the midRangeScoring rating of the player
	 * 
	 * @param The
	 *            new midRangeScoring rating of the player
	 */
	public void setMidRangeScoring(int midRangeScoring) {
		if (midRangeScoring < 30 || midRangeScoring > 100) {
			throw new IllegalArgumentException("Mid-range Scoring needs to be between 0 and 100 inclusive");
		}
		this.midRangeScoring = midRangeScoring;
	}

	/**
	 * Returns the threePointScoring rating of the player
	 * 
	 * @return The threePointScoring rating of the player
	 */
	public int getThreePointScoring() {
		return threePointScoring;
	}

	/**
	 * Sets the threePointScoring rating of the player
	 * 
	 * @param The
	 *            new threePointScoring rating of the player
	 */
	public void setThreePointScoring(int threePointScoring) {
		if (threePointScoring < 30 || threePointScoring > 100) {
			throw new IllegalArgumentException("3-point scoring needs to be between 0 and 100 inclusive");
		}
		this.threePointScoring = threePointScoring;
	}

	/**
	 * Returns the freeThrow rating of the player
	 * 
	 * @return The freeThrow rating of the player
	 */
	public int getFreeThrow() {
		return freeThrow;
	}

	/**
	 * Sets the freeThrow rating of the player
	 * 
	 * @param The
	 *            new freeThrow rating of the player
	 */
	public void setFreeThrow(int freeThrow) {
		if (freeThrow < 30 || freeThrow > 100) {
			throw new IllegalArgumentException("Free Throw needs to be between 0 and 100 inclusive");
		}
		this.freeThrow = freeThrow;
	}

	/**
	 * Returns the offensiveRebounding rating of the player
	 * 
	 * @return The offensiveRebounding rating of the player
	 */
	public int getOffensiveRebounding() {
		return offensiveRebounding;
	}

	/**
	 * Sets the offensiveRebounding rating of the player
	 * 
	 * @param The
	 *            new offensiveRebounding rating of the player
	 */
	public void setOffensiveRebounding(int offensiveRebounding) {
		if (offensiveRebounding < 30 || offensiveRebounding > 100) {
			throw new IllegalArgumentException("Offensive Rebounding needs to be between 0 and 100 inclusive");
		}
		this.offensiveRebounding = offensiveRebounding;
	}

	/**
	 * Returns the ballHandling rating of the player
	 * 
	 * @return The ballHandling rating of the player
	 */
	public int getBallHandling() {
		return ballHandling;
	}

	/**
	 * Sets the ballHandling rating of the player
	 * 
	 * @param The
	 *            new ballHandling rating of the player
	 */
	public void setBallHandling(int ballHandling) {
		if (ballHandling < 30 || ballHandling > 100) {
			throw new IllegalArgumentException("Ball Handling needs to be between 0 and 100 inclusive");
		}
		this.ballHandling = ballHandling;
	}

	/**
	 * Returns the passing rating of the player
	 * 
	 * @return The passing rating of the player
	 */
	public int getPassing() {
		return passing;
	}

	/**
	 * Sets the passing rating of the player
	 * 
	 * @param The
	 *            new passing rating of the player
	 */
	public void setPassing(int passing) {
		if (passing < 30 || passing > 100) {
			throw new IllegalArgumentException("Passing needs to be between 0 and 100 inclusive");
		}
		this.passing = passing;
	}

	/**
	 * Returns the postDefense rating of the player
	 * 
	 * @return The postDefense rating of the player
	 */
	public int getPostDefense() {
		return postDefense;
	}

	/**
	 * Sets the postDefense rating of the player
	 * 
	 * @param The
	 *            new postDefense rating of the player
	 */
	public void setPostDefense(int postDefense) {
		if (postDefense < 30 || postDefense > 100) {
			throw new IllegalArgumentException("Post Defense needs to be between 0 and 100 inclusive");
		}
		this.postDefense = postDefense;
	}

	/**
	 * Returns the perimeterDefense rating of the player
	 * 
	 * @return The perimeterDefense rating of the player
	 */
	public int getPerimeterDefense() {
		return perimeterDefense;
	}

	/**
	 * Sets the perimeterDefense rating of the player
	 * 
	 * @param The
	 *            new perimeterDefense rating of the player
	 */
	public void setPerimeterDefense(int perimeterDefense) {
		if (perimeterDefense < 30 || perimeterDefense > 100) {
			throw new IllegalArgumentException("Perimeter Defense needs to be between 0 and 100 inclusive");
		}
		this.perimeterDefense = perimeterDefense;
	}

	/**
	 * Returns the defensiveRebounding rating of the player
	 * 
	 * @return The defensiveRebounding rating of the player
	 */
	public int getDefensiveRebounding() {
		return defensiveRebounding;
	}

	/**
	 * Sets the defensiveRebounding rating of the player
	 * 
	 * @param The
	 *            new defensiveRebounding rating of the player
	 */
	public void setDefensiveRebounding(int defensiveRebounding) {
		if (defensiveRebounding < 30 || defensiveRebounding > 100) {
			throw new IllegalArgumentException("Defensive Rebounding needs to be between 0 and 100 inclusive");
		}
		this.defensiveRebounding = defensiveRebounding;
	}

	/**
	 * Returns the steal rating of the player
	 * 
	 * @return The steal rating of the player
	 */
	public int getSteal() {
		return steal;
	}

	/**
	 * Sets the steal rating of the player
	 * 
	 * @param The
	 *            new steal rating of the player
	 */
	public void setSteal(int steal) {
		if (steal < 30 || steal > 100) {
			throw new IllegalArgumentException("Steal needs to be between 0 and 100 inclusive");
		}
		this.steal = steal;
	}

	/**
	 * Returns the block rating of the player
	 * 
	 * @return The block rating of the player
	 */
	public int getBlock() {
		return block;
	}

	/**
	 * Sets the block rating of the player
	 * 
	 * @param The
	 *            new block rating of the player
	 */
	public void setBlock(int block) {
		if (block < 30 || block > 100) {
			throw new IllegalArgumentException("Block needs to be between 0 and 100 inclusive");
		}
		this.block = block;
	}

	/**
	 * Returns the height rating of the player
	 * 
	 * @return The height rating of the player
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Sets the height rating of the player
	 * 
	 * @param The
	 *            new height rating of the player
	 */
	public void setHeight(int height) {
		if (height < 30 || height > 100) {
			throw new IllegalArgumentException("Height needs to be between 0 and 100 inclusive");
		}
		this.height = height;
	}

	/**
	 * Returns the speed rating of the player
	 * 
	 * @return The speed rating of the player
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Sets the speed rating of the player
	 * 
	 * @param The
	 *            new speed rating of the player
	 */
	public void setSpeed(int speed) {
		if (speed < 30 || speed > 100) {
			throw new IllegalArgumentException("Speed needs to be between 0 and 100 inclusive");
		}
		this.speed = speed;
	}

	/**
	 * Returns the stamina rating of the player
	 * 
	 * @return The stamina rating of the player
	 */
	public int getStamina() {
		return stamina;
	}

	/**
	 * Sets the stamina rating of the player
	 * 
	 * @param The
	 *            new stamina rating of the player
	 */
	public void setStamina(int stamina) {
		if (stamina < 30 || stamina > 100) {
			throw new IllegalArgumentException("Stamina needs to be between 0 and 100 inclusive");
		}
		this.stamina = stamina;
	}

	/**
	 * Returns the injury rating of the player
	 * 
	 * @return The injury rating of the player
	 */
	public int getInjury() {
		return injury;
	}

	/**
	 * Sets the injury rating of the player
	 * 
	 * @param The
	 *            new injury rating of the player
	 */
	public void setInjury(int injury) {
		if (injury < 30 || injury > 100) {
			throw new IllegalArgumentException("Injury needs to be between 0 and 100 inclusive");
		}
		this.injury = injury;
	}

	/**
	 * Returns the potential rating of the player
	 * 
	 * @return The potential rating of the player
	 */
	public int getPotential() {
		return potential;
	}

	/**
	 * Sets the potential rating of the player
	 * 
	 * @param The
	 *            new potential rating of the player
	 */
	public void setPotential(int potential) {
		if (potential < 30 || potential > 100) {
			throw new IllegalArgumentException("Potential needs to be between 0 and 100 inclusive");
		}
		this.potential = potential;
	}

}