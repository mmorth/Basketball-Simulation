package simulation;

/**
 * Represents a basketball coach. Stores name and ratings.
 * 
 * @author Matthew Orth
 *
 */
public class Coach implements Athlete {

	/**
	 * Stores coach's first name
	 */
	private String coachFirstName;

	/**
	 * Stores coach's last name
	 */
	private String coachLastName;

	/**
	 * Stores coach position
	 */
	private int position = 0;

	/**
	 * Stores coach contract amount in millions per year
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
	 * Stores the overall rating of the coach
	 */
	private int overallRating;

	/**
	 * Stores the offensive rating of the coach
	 */
	private int offensiveRating;

	/**
	 * Stores the defensive rating of the coach
	 */
	private int defensiveRating;

	// Offense Ratings:

	/**
	 * Stores the insideScoring rating of the coach
	 */
	private int insideScoring;

	/**
	 * Stores the midRangeScoring rating of the coach
	 */
	private int midRangeScoring;

	/**
	 * Stores the threePointScoring rating of the coach
	 */
	private int threePointScoring;

	/**
	 * Stores the freeThrow rating of the coach
	 */
	private int freeThrow;

	/**
	 * Stores the offensiveRebounding rating of the coach
	 */
	private int offensiveRebounding;

	/**
	 * Stores the ballHandling rating of the coach
	 */
	private int ballHandling;

	/**
	 * Stores the passing rating of the coach
	 */
	private int passing;

	// Defense Ratings:

	/**
	 * Stores the postDefense rating of the coach
	 */
	private int postDefense;

	/**
	 * Stores the perimeterDefense rating of the coach
	 */
	private int perimeterDefense;

	/**
	 * Stores the defensiveRebounding rating of the coach
	 */
	private int defensiveRebounding;

	/**
	 * Stores the steal rating of the coach
	 */
	private int steal;

	/**
	 * Stores the block rating of the coach
	 */
	private int block;

	// General Ratings:

	/**
	 * Stores the height rating of the coach
	 */
	private int height;

	/**
	 * Stores the speed rating of the coach
	 */
	private int speed;

	/**
	 * Stores the stamina rating of the coach
	 */
	private double stamina;

	/**
	 * Stores the injury rating of the coach
	 */
	private int injury;

	/**
	 * Stores the potential rating of the coach
	 */
	private int potential;

	/**
	 * Default Constructor: Remove after testing!
	 */
	public Coach() {

	}

	/**
	 * Constructs a new coach object
	 * 
	 * @param coachFirstName
	 *            The first name of the coach
	 * @param coachLastName
	 *            The last name of the coach
	 * @param position
	 *            The position of the coach
	 * @param contractAmount
	 *            The contract amount of the coach
	 * @param contractYears
	 *            The contract years of the coach
	 * @param age
	 *            The age of the coach
	 * @param insideScoring
	 *            The inside scoring rating of the coach
	 * @param midRangeScoring
	 *            The mid-range scoring range of the coach
	 * @param threePointScoring
	 *            The 3-point scoring rating of the coach
	 * @param freeThrow
	 *            The free throw rating of the coach
	 * @param offensiveRebounding
	 *            The offensive rebounding rating of the coach
	 * @param ballHandling
	 *            The ball handling rating of the coach
	 * @param passing
	 *            The passing rating of the coach
	 * @param postDefense
	 *            The post defense rating of the coach
	 * @param perimeterDefense
	 *            The perimeter defense rating of the coach
	 * @param defensiveRebounding
	 *            The defensive rebounding rating of the coach
	 * @param steal
	 *            The steal rating of the coach
	 * @param block
	 *            The block rating of the coach
	 * @param height
	 *            The height rating of the coach
	 * @param speed
	 *            The speed rating of the coach
	 * @param stamina
	 *            The stamina rating of the coach
	 * @param injury
	 *            The injury rating of the coach
	 * @param potential
	 *            The potential rating of the coach
	 */
	public Coach(int position, String coachFirstName, String coachLastName, int age, double contractAmount,
			int contractYears, int insideScoring, int midRangeScoring, int threePointScoring, int freeThrow,
			int offensiveRebounding, int ballHandling, int passing, int postDefense, int perimeterDefense,
			int defensiveRebounding, int steal, int block, int height, int speed, int stamina, int injury,
			int potential) {
		setFirstName(coachFirstName);
		setLastName(coachLastName);
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
		calculateCoachRatings();

	}

	/**
	 * Returns the first name of the coach
	 * 
	 * @return Name of the coach
	 */
	@Override
	public String getFirstName() {
		return coachFirstName;
	}

	/**
	 * Sets the first name of the coach
	 * 
	 * @param coachFirstName
	 *            New first name for coach
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgumentException if the name is greater than 15
	 *             characters or contains spaces.
	 */
	@Override
	public void setFirstName(String coachFirstName) {
		if (coachFirstName.length() > 15 || Helper.containsSpaces(coachFirstName)) {
			throw new IllegalArgumentException(
					"coach first name must be 15 or fewer characters and may not contain any spaces.");
		}
		this.coachFirstName = coachFirstName;
	}

	/**
	 * Returns the last name of the coach
	 *
	 * @return Last name of coach
	 */
	@Override
	public String getLastName() {
		return coachLastName;
	}

	/**
	 * Sets the last name of the coach
	 * 
	 * @param coachLastName
	 *            New last name for coach
	 * @throws IllegalArgumentException
	 *             Throws an IllegalArgumentException if the name is greater than 15
	 *             characters or contains spaces.
	 */
	@Override
	public void setLastName(String coachLastName) {
		if (coachLastName.length() > 15 || Helper.containsSpaces(coachLastName)) {
			throw new IllegalArgumentException(
					"coach last name must be 15 or fewer characters and may not contain any spaces.");
		}
		this.coachLastName = coachLastName;
	}

	/**
	 * Returns the position of the coach
	 * 
	 * @return Position of coach
	 */
	@Override
	public int getPosition() {
		return position;
	}

	/**
	 * Sets a new position for a coach, which is always set to 0
	 * 
	 * @param position
	 *            The new position of the coach
	 */
	@Override
	public void setPosition(int position) {
		this.position = 0;
	}

	/**
	 * Returns the overallRating rating of the coach
	 * 
	 * @return The overallRating rating of the coach
	 */
	@Override
	public int getOverallRating() {
		return overallRating;
	}

	/**
	 * Returns the offensiveRating rating of the coach
	 * 
	 * @return The offensiveRating rating of the coach
	 */
	@Override
	public int getOffensiveRating() {
		return offensiveRating;
	}

	/**
	 * Returns the defensiveRating rating of the coach
	 * 
	 * @return The defensiveRating rating of the coach
	 */
	@Override
	public int getDefensiveRating() {
		return defensiveRating;
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
	 * Sets the contract amount to a new value. If contractAmount is less than 0,
	 * then the contract amount is set to 0.
	 * 
	 * @param contractAmount
	 *            New contract amount
	 */
	@Override
	public void setContractAmount(double contractAmount) {
		if (contractAmount < 0) {
			this.contractAmount = 0;
		} else {
			this.contractAmount = contractAmount;
		}

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
	 * Sets the number of contract years to a new value. If contractYears is less
	 * than 0, then the contract years is set to 0
	 * 
	 * @param contractYears
	 *            New number of years left on contract
	 */
	@Override
	public void setContractYears(int contractYears) {
		if (contractYears < 0) {
			this.contractYears = 0;
		} else {
			this.contractYears = contractYears;
		}

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
	 * Sets the age of the coach to a new value. If age is less than 18, then the
	 * age is set to 18.
	 * 
	 * @param age
	 *            New age of coach
	 */
	@Override
	public void setAge(int age) {
		if (age < 18) {
			this.age = 18;
		} else {
			this.age = age;
		}
	}

	/**
	 * Returns the insideScoring rating of the coach
	 * 
	 * @return The insideScoring rating of the coach
	 */
	@Override
	public int getInsideScoring() {
		return insideScoring;
	}

	/**
	 * Sets the insideScoring rating of the coach. If insideScoring is less than 30,
	 * then the inside scoring of the player is set to 30. If insideScoring is
	 * greater than 100, then the inside scoring is set to 100.
	 * 
	 * @param The
	 *            new insideScoring rating of the coach
	 */
	@Override
	public void setInsideScoring(int insideScoring) {
		if (insideScoring < 30) {
			this.insideScoring = 30;
		} else if (insideScoring > 100) {
			this.insideScoring = 100;
		} else {
			this.insideScoring = insideScoring;
		}
	}

	/**
	 * Returns the midRangeScoring rating of the coach
	 * 
	 * @return The midRangeScoring rating of the coach
	 */
	@Override
	public int getMidRangeScoring() {
		return midRangeScoring;
	}

	/**
	 * Sets the midRangeScoring rating of the coach. If midRangeScoring is less than
	 * 30, then the mid range scoring of the player is set to 30. If midRangeScoring
	 * is greater than 100, then the mid range scoring of the player is set to 100.
	 * 
	 * @param The
	 *            new midRangeScoring rating of the coach
	 */
	@Override
	public void setMidRangeScoring(int midRangeScoring) {
		if (midRangeScoring < 30) {
			this.midRangeScoring = 30;
		} else if (midRangeScoring > 100) {
			this.midRangeScoring = 100;
		} else {
			this.midRangeScoring = midRangeScoring;
		}
	}

	/**
	 * Returns the threePointScoring rating of the coach
	 * 
	 * @return The threePointScoring rating of the coach
	 */
	@Override
	public int getThreePointScoring() {
		return threePointScoring;
	}

	/**
	 * Sets the threePointScoring rating of the coach. If threePointScoring is less
	 * than 30, then the three point scoring of the player is set to 30. If
	 * threePointScoring is greater than 100, then the three point scoring of the
	 * player is set to 100.
	 * 
	 * @param The
	 *            new threePointScoring rating of the coach
	 */
	@Override
	public void setThreePointScoring(int threePointScoring) {
		if (threePointScoring < 30) {
			this.threePointScoring = 30;
		} else if (threePointScoring > 100) {
			this.threePointScoring = 100;
		} else {
			this.threePointScoring = threePointScoring;
		}
	}

	/**
	 * Returns the freeThrow rating of the coach
	 * 
	 * @return The freeThrow rating of the coach
	 */
	@Override
	public int getFreeThrow() {
		return freeThrow;
	}

	/**
	 * Sets the freeThrow rating of the coach. If freeThrow is less than 30, then
	 * the free throw of the player is set to 30. If freeThrow is greater than 100,
	 * then the free throw of the player is set to 100.
	 * 
	 * @param The
	 *            new freeThrow rating of the coach
	 */
	@Override
	public void setFreeThrow(int freeThrow) {
		if (freeThrow < 30) {
			this.freeThrow = 30;
		} else if (freeThrow > 100) {
			this.freeThrow = 100;
		} else {
			this.freeThrow = freeThrow;
		}
	}

	/**
	 * Returns the offensiveRebounding rating of the coach
	 * 
	 * @return The offensiveRebounding rating of the coach
	 */
	@Override
	public int getOffensiveRebounding() {
		return offensiveRebounding;
	}

	/**
	 * Sets the offensiveRebounding rating of the coach. If offensiveRebounding is
	 * less than 30, then the offensive rebounding of the player is set to 30. If
	 * offensiveRebounding is greater than 100, then the offensive rebounding of the
	 * player is set to 100.
	 * 
	 * @param The
	 *            new offensiveRebounding rating of the coach
	 */
	@Override
	public void setOffensiveRebounding(int offensiveRebounding) {
		if (offensiveRebounding < 30) {
			this.offensiveRebounding = 30;
		} else if (offensiveRebounding > 100) {
			this.offensiveRebounding = 100;
		} else {
			this.offensiveRebounding = offensiveRebounding;
		}
	}

	/**
	 * Returns the ballHandling rating of the coach
	 * 
	 * @return The ballHandling rating of the coach
	 */
	@Override
	public int getBallHandling() {
		return ballHandling;
	}

	/**
	 * Sets the ballHandling rating of the coach. If ballHandling is less than 30,
	 * then the ball handling of the player is set to 30. If ballHandling is greater
	 * than 100, then the ball handling of the player is set to 100.
	 * 
	 * @param The
	 *            new ballHandling rating of the coach
	 */
	@Override
	public void setBallHandling(int ballHandling) {
		if (ballHandling < 30) {
			this.ballHandling = 30;
		} else if (ballHandling > 100) {
			this.ballHandling = 100;
		} else {
			this.ballHandling = ballHandling;
		}
	}

	/**
	 * Returns the passing rating of the coach
	 * 
	 * @return The passing rating of the coach
	 */
	@Override
	public int getPassing() {
		return passing;
	}

	/**
	 * Sets the passing rating of the coach. If passing is less than 30, then the
	 * passing of the player is set to 30. If passing is greater than 100, then the
	 * passing of the player is set to 100.
	 * 
	 * @param The
	 *            new passing rating of the coach
	 */
	@Override
	public void setPassing(int passing) {
		if (passing < 30) {
			this.passing = 30;
		} else if (passing > 100) {
			this.passing = 100;
		} else {
			this.passing = passing;
		}
	}

	/**
	 * Returns the postDefense rating of the coach
	 * 
	 * @return The postDefense rating of the coach
	 */
	@Override
	public int getPostDefense() {
		return postDefense;
	}

	/**
	 * Sets the postDefense rating of the coach. If postDefense is less than 30,
	 * then the post defense of the player is set to 30. If postDefense is greater
	 * than 100, then the post defense of the player is set to 100.
	 * 
	 * @param The
	 *            new postDefense rating of the coach
	 */
	@Override
	public void setPostDefense(int postDefense) {
		if (postDefense < 30) {
			this.postDefense = 30;
		} else if (postDefense > 100) {
			this.postDefense = 100;
		} else {
			this.postDefense = postDefense;
		}
	}

	/**
	 * Returns the perimeterDefense rating of the coach
	 * 
	 * @return The perimeterDefense rating of the coach
	 */
	@Override
	public int getPerimeterDefense() {
		return perimeterDefense;
	}

	/**
	 * Sets the perimeterDefense rating of the coach. If perimeterDefense is less
	 * than 30, then the perimeter defense of the player is set to 30. If
	 * perimeterDefense is greater than 100, then the perimeter defense of the
	 * player is set to 100.
	 * 
	 * @param The
	 *            new perimeterDefense rating of the coach
	 */
	@Override
	public void setPerimeterDefense(int perimeterDefense) {
		if (perimeterDefense < 30) {
			this.perimeterDefense = 30;
		} else if (perimeterDefense > 100) {
			this.perimeterDefense = 100;
		} else {
			this.perimeterDefense = perimeterDefense;
		}
	}

	/**
	 * Returns the defensiveRebounding rating of the coach
	 * 
	 * @return The defensiveRebounding rating of the coach
	 */
	@Override
	public int getDefensiveRebounding() {
		return defensiveRebounding;
	}

	/**
	 * Sets the defensiveRebounding rating of the coach. If defensiveRebounding is
	 * less than 30, then the defensive rebounding of the player is set to 30. If
	 * defensiveRebounding is greater than 100, then the defensive rebounding of the
	 * player is set to 100.
	 * 
	 * @param The
	 *            new defensiveRebounding rating of the coach
	 */
	@Override
	public void setDefensiveRebounding(int defensiveRebounding) {
		if (defensiveRebounding < 30) {
			this.defensiveRebounding = 30;
		} else if (defensiveRebounding > 100) {
			this.defensiveRebounding = 100;
		} else {
			this.defensiveRebounding = defensiveRebounding;
		}
	}

	/**
	 * Returns the steal rating of the coach
	 * 
	 * @return The steal rating of the coach
	 */
	@Override
	public int getSteal() {
		return steal;
	}

	/**
	 * Sets the steal rating of the coach. If steal is less than 30, then the steal
	 * of the player is set to 30. If steal is greater than 100, then the steal of
	 * the player is set to 100.
	 * 
	 * @param The
	 *            new steal rating of the coach
	 */
	@Override
	public void setSteal(int steal) {
		if (steal < 30) {
			this.steal = 30;
		} else if (steal > 100) {
			this.steal = 100;
		} else {
			this.steal = steal;
		}
	}

	/**
	 * Returns the block rating of the coach
	 * 
	 * @return The block rating of the coach
	 */
	@Override
	public int getBlock() {
		return block;
	}

	/**
	 * Sets the block rating of the coach. If block is less than 30, then the block
	 * of the player is set to 30. If block is greater than 100, then the block of
	 * the player is set to 100.
	 * 
	 * @param The
	 *            new block rating of the coach
	 */
	@Override
	public void setBlock(int block) {
		if (block < 30) {
			this.block = 30;
		} else if (block > 100) {
			this.block = 100;
		} else {
			this.block = block;
		}
	}

	/**
	 * Returns the height rating of the coach
	 * 
	 * @return The height rating of the coach
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * Sets the height rating of the coach. If height is less than 30, then the
	 * height of the player is set to 30. If height is greater than 100, then the
	 * height of the player is set to 100.
	 * 
	 * @param The
	 *            new height rating of the coach
	 */
	@Override
	public void setHeight(int height) {
		if (height < 30) {
			this.height = 30;
		} else if (height > 100) {
			this.height = 100;
		} else {
			this.height = height;
		}
	}

	/**
	 * Returns the speed rating of the coach
	 * 
	 * @return The speed rating of the coach
	 */
	@Override
	public int getSpeed() {
		return speed;
	}

	/**
	 * Sets the speed rating of the coach. If speed is less than 30, then the speed
	 * of the player is set to 30. If speed is greater than 100, then the speed of
	 * the player is set to 100.
	 * 
	 * @param The
	 *            new speed rating of the coach
	 */
	@Override
	public void setSpeed(int speed) {
		if (speed < 30) {
			this.speed = 30;
		} else if (speed > 100) {
			this.speed = 100;
		} else {
			this.speed = speed;
		}
	}

	/**
	 * Returns the stamina rating of the coach
	 * 
	 * @return The stamina rating of the coach
	 */
	@Override
	public double getStamina() {
		return stamina;
	}

	/**
	 * Sets the stamina rating of the coach. If stamina is less than 30, then the
	 * stamina of the player is set to 30. If stamina is greater than 100, then the
	 * stamina of the player is set to 100.
	 * 
	 * @param The
	 *            new stamina rating of the coach
	 */
	@Override
	public void setStamina(double stamina) {
		if (stamina < 30) {
			this.stamina = 30;
		} else if (stamina > 100) {
			this.stamina = 100;
		} else {
			this.stamina = stamina;
		}
	}

	/**
	 * Returns the injury rating of the coach
	 * 
	 * @return The injury rating of the coach
	 */
	@Override
	public int getInjury() {
		return injury;
	}

	/**
	 * Sets the injury rating of the coach. If injury is less than 30, then the
	 * injury of the player is set to 30. If injury is greater than 100, then the
	 * injury of the player is set to 100.
	 * 
	 * @param The
	 *            new injury rating of the coach
	 */
	@Override
	public void setInjury(int injury) {
		if (injury < 30) {
			this.injury = 30;
		} else if (injury > 100) {
			this.injury = 100;
		} else {
			this.injury = injury;
		}
	}

	/**
	 * Returns the potential rating of the coach
	 * 
	 * @return The potential rating of the coach
	 */
	@Override
	public int getPotential() {
		return potential;
	}

	/**
	 * Sets the potential rating of the coach. If potential is less than 30, then
	 * the potential of the player is set to 30. If potential is greater than 100,
	 * then the potential of the player is set to 100.
	 * 
	 * @param The
	 *            new potential rating of the coach
	 */
	@Override
	public void setPotential(int potential) {
		if (potential < 30) {
			this.potential = 30;
		} else if (potential > 100) {
			this.potential = 100;
		} else {
			this.potential = potential;
		}
	}

	/**
	 * Calculates the overall, offensive, and defensive ratings of the coach based
	 * on their various ratings
	 */
	public void calculateCoachRatings() {
		double offensiveWeight = .125;
		double defensiveWeight = .167;
		offensiveRating = (int) Math.round((offensiveWeight) * (insideScoring) + (offensiveWeight) * (midRangeScoring)
				+ (offensiveWeight) * (threePointScoring) + (offensiveWeight) * (freeThrow)
				+ (offensiveWeight) * (offensiveRebounding) + (offensiveWeight) * (ballHandling)
				+ (offensiveWeight) * (passing) + (offensiveWeight) * (speed));
		defensiveRating = (int) Math.round((defensiveWeight) * (postDefense) + (defensiveWeight) * (perimeterDefense)
				+ (defensiveWeight) * (defensiveRebounding) + (defensiveWeight) * (steal) + (defensiveWeight) * (block)
				+ (defensiveWeight) * (speed));
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 0;
	}

}