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

	/**
	 * Stores the overall rating of the player
	 */
	private int overallRating;

	/**
	 * Stores the offensive rating of the player
	 */
	private int offensiveRating;

	/**
	 * Stores the defensive rating of the player
	 */
	private int defensiveRating;

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
	 * Stores the number of possessions remaining that the player will be on the
	 * court for
	 */
	private int rotationPossessionsRemaining;

	/**
	 * Stores the initial number of possessions that a player plays in a game
	 */
	private int initialRotationPossessions;

	/**
	 * Stores the decrease in stamina for every possession for the player
	 */
	private int staminaDecrease;

	// Player Game Statistics

	/**
	 * Stores the player's points during a game
	 */
	private int pointsGame;

	/**
	 * Stores the player's rebounds during a game
	 */
	private int reboundsGame;

	/**
	 * Stores the player's assists during a game
	 */
	private int assistsGame;

	/**
	 * Stores the player's blocks during a game
	 */
	private int blocksGame;

	/**
	 * Stores the player's steals during a game
	 */
	private int stealsGame;

	/**
	 * Stores the player's turnovers during a game
	 */
	private int turnoversGame;

	/**
	 * Default Constructor: Remove after testing!
	 */
	public Player() {

	}

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
	 * @param rotationPossessions
	 *            The number of possessions for the player in the rotation
	 * 
	 */
	public Player(int position, String playerFirstName, String playerLastName, int age, double contractAmount,
			int contractYears, int insideScoring, int midRangeScoring, int threePointScoring, int freeThrow,
			int offensiveRebounding, int ballHandling, int passing, int postDefense, int perimeterDefense,
			int defensiveRebounding, int steal, int block, int height, int speed, int stamina, int injury,
			int potential, int rotationPossessions) {
		setFirstName(playerFirstName);
		setLastName(playerLastName);
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
		setStamina(100);
		setStaminaDecrease(stamina / 25);
		setInjury(injury);
		setPotential(potential);
		setInitialRotationPossessions(rotationPossessions);
		setRotationPossessionsRemaining(rotationPossessions);
		setPosition(position);
		setPointsGame(pointsGame);
		setReboundsGame(reboundsGame);
		setAssistsGame(assistsGame);
		setBlocksGame(blocksGame);
		setStealsGame(stealsGame);
		setTurnoversGame(turnoversGame);

		pointsGame = 0;
		reboundsGame = 0;
		assistsGame = 0;
		blocksGame = 0;
		stealsGame = 0;
		turnoversGame = 0;

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
					"player first name must be 15 or fewer characters and may not contain any spaces.");
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
					"player last name must be 15 or fewer characters and may not contain any spaces.");
		}
		this.playerLastName = playerLastName;
	}

	/**
	 * Returns the position of the player
	 * 
	 * @return Position of player
	 */
	@Override
	public int getPosition() {
		return position;
	}

	/**
	 * Sets a new position for a player. If position is less than 0, then the
	 * position is set to 0. If position is greater that 6, then position is set to
	 * 6.
	 * 
	 * @param position
	 *            The new position of the player
	 */
	@Override
	public void setPosition(int position) {
		if (position < 0) {
			this.position = 0;
		} else if (position > 6) {
			this.position = 6;
		} else {
			this.position = position;
		}

		calculatePositionRating();
	}

	/**
	 * Returns the overallRating rating of the player
	 * 
	 * @return The overallRating rating of the player
	 */
	@Override
	public int getOverallRating() {
		return overallRating;
	}

	/**
	 * Returns the offensiveRating rating of the player
	 * 
	 * @return The offensiveRating rating of the player
	 */
	@Override
	public int getOffensiveRating() {
		return offensiveRating;
	}

	/**
	 * Returns the defensiveRating rating of the player
	 * 
	 * @return The defensiveRating rating of the player
	 */
	@Override
	public int getDefensiveRating() {
		return defensiveRating;
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
	 * Returns the number of years left on current player's contract
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
	 * Returns the age of the player
	 * 
	 * @return Age of player
	 */
	@Override
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age of the player to a new value. If age is less than 0, then the
	 * age is set to 0.
	 * 
	 * @param age
	 *            New age of player
	 */
	@Override
	public void setAge(int age) {
		if (age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	/**
	 * Returns the insideScoring rating of the player
	 * 
	 * @return The insideScoring rating of the player
	 */
	@Override
	public int getInsideScoring() {
		return insideScoring;
	}

	/**
	 * Sets the insideScoring rating of the player. If insideScoring is less than
	 * 30, then the inside scoring of the player is set to 30. If insideScoring is
	 * greater than 100, then the inside scoring is set to 100.
	 * 
	 * @param The
	 *            new insideScoring rating of the player
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
	 * Returns the midRangeScoring rating of the player
	 * 
	 * @return The midRangeScoring rating of the player
	 */
	@Override
	public int getMidRangeScoring() {
		return midRangeScoring;
	}

	/**
	 * Sets the midRangeScoring rating of the player. If midRangeScoring is less
	 * than 30, then the mid range scoring of the player is set to 30. If
	 * midRangeScoring is greater than 100, then the mid range scoring of the player
	 * is set to 100.
	 * 
	 * @param The
	 *            new midRangeScoring rating of the player
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
	 * Returns the threePointScoring rating of the player
	 * 
	 * @return The threePointScoring rating of the player
	 */
	@Override
	public int getThreePointScoring() {
		return threePointScoring;
	}

	/**
	 * Sets the threePointScoring rating of the player. If threePointScoring is less
	 * than 30, then the three point scoring of the player is set to 30. If
	 * threePointScoring is greater than 100, then the three point scoring of the
	 * player is set to 100.
	 * 
	 * @param The
	 *            new threePointScoring rating of the player
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
	 * Returns the freeThrow rating of the player
	 * 
	 * @return The freeThrow rating of the player
	 */
	@Override
	public int getFreeThrow() {
		return freeThrow;
	}

	/**
	 * Sets the freeThrow rating of the player. If freeThrow is less than 30, then
	 * the free throw of the player is set to 30. If freeThrow is greater than 100,
	 * then the free throw of the player is set to 100.
	 * 
	 * @param The
	 *            new freeThrow rating of the player
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
	 * Returns the offensiveRebounding rating of the player
	 * 
	 * @return The offensiveRebounding rating of the player
	 */
	@Override
	public int getOffensiveRebounding() {
		return offensiveRebounding;
	}

	/**
	 * Sets the offensiveRebounding rating of the player. If offensiveRebounding is
	 * less than 30, then the offensive rebounding of the player is set to 30. If
	 * offensiveRebounding is greater than 100, then the offensive rebounding of the
	 * player is set to 100.
	 * 
	 * @param The
	 *            new offensiveRebounding rating of the player
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
	 * Returns the ballHandling rating of the player
	 * 
	 * @return The ballHandling rating of the player
	 */
	@Override
	public int getBallHandling() {
		return ballHandling;
	}

	/**
	 * Sets the ballHandling rating of the player. If ballHandling is less than 30,
	 * then the ball handling of the player is set to 30. If ballHandling is greater
	 * than 100, then the ball handling of the player is set to 100.
	 * 
	 * @param The
	 *            new ballHandling rating of the player
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
	 * Returns the passing rating of the player
	 * 
	 * @return The passing rating of the player
	 */
	@Override
	public int getPassing() {
		return passing;
	}

	/**
	 * Sets the passing rating of the player. If passing is less than 30, then the
	 * passing of the player is set to 30. If passing is greater than 100, then the
	 * passing of the player is set to 100.
	 * 
	 * @param The
	 *            new passing rating of the player
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
	 * Returns the postDefense rating of the player
	 * 
	 * @return The postDefense rating of the player
	 */
	@Override
	public int getPostDefense() {
		return postDefense;
	}

	/**
	 * Sets the postDefense rating of the player. If postDefense is less than 30,
	 * then the post defense of the player is set to 30. If postDefense is greater
	 * than 100, then the post defense of the player is set to 100.
	 * 
	 * @param The
	 *            new postDefense rating of the player
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
	 * Returns the perimeterDefense rating of the player
	 * 
	 * @return The perimeterDefense rating of the player
	 */
	@Override
	public int getPerimeterDefense() {
		return perimeterDefense;
	}

	/**
	 * Sets the perimeterDefense rating of the player. If perimeterDefense is less
	 * than 30, then the perimeter defense of the player is set to 30. If
	 * perimeterDefense is greater than 100, then the perimeter defense of the
	 * player is set to 100.
	 * 
	 * @param The
	 *            new perimeterDefense rating of the player
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
	 * Returns the defensiveRebounding rating of the player
	 * 
	 * @return The defensiveRebounding rating of the player
	 */
	@Override
	public int getDefensiveRebounding() {
		return defensiveRebounding;
	}

	/**
	 * Sets the defensiveRebounding rating of the player. If defensiveRebounding is
	 * less than 30, then the defensive rebounding of the player is set to 30. If
	 * defensiveRebounding is greater than 100, then the defensive rebounding of the
	 * player is set to 100.
	 * 
	 * @param The
	 *            new defensiveRebounding rating of the player
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
	 * Returns the steal rating of the player
	 * 
	 * @return The steal rating of the player
	 */
	@Override
	public int getSteal() {
		return steal;
	}

	/**
	 * Sets the steal rating of the player. If steal is less than 30, then the steal
	 * of the player is set to 30. If steal is greater than 100, then the steal of
	 * the player is set to 100.
	 * 
	 * @param The
	 *            new steal rating of the player
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
	 * Returns the block rating of the player
	 * 
	 * @return The block rating of the player
	 */
	@Override
	public int getBlock() {
		return block;
	}

	/**
	 * Sets the block rating of the player. If block is less than 30, then the block
	 * of the player is set to 30. If block is greater than 100, then the block of
	 * the player is set to 100.
	 * 
	 * @param The
	 *            new block rating of the player
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
	 * Returns the height rating of the player
	 * 
	 * @return The height rating of the player
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * Sets the height rating of the player. If height is less than 30, then the
	 * height of the player is set to 30. If height is greater than 100, then the
	 * height of the player is set to 100.
	 * 
	 * @param The
	 *            new height rating of the player
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
	 * Returns the speed rating of the player
	 * 
	 * @return The speed rating of the player
	 */
	@Override
	public int getSpeed() {
		return speed;
	}

	/**
	 * Sets the speed rating of the player. If speed is less than 30, then the speed
	 * of the player is set to 30. If speed is greater than 100, then the speed of
	 * the player is set to 100.
	 * 
	 * @param The
	 *            new speed rating of the player
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
	 * Returns the stamina rating of the player
	 * 
	 * @return The stamina rating of the player
	 */
	@Override
	public int getStamina() {
		return stamina;
	}

	/**
	 * Sets the stamina rating of the player. If stamina is less than 30, then the
	 * stamina of the player is set to 30. If stamina is greater than 100, then the
	 * stamina of the player is set to 100.
	 * 
	 * @param The
	 *            new stamina rating of the player
	 */
	@Override
	public void setStamina(int stamina) {
		if (stamina < 30) {
			this.stamina = 30;
		} else if (stamina > 100) {
			this.stamina = 100;
		} else {
			this.stamina = stamina;
		}
	}

	/**
	 * Returns the injury rating of the player
	 * 
	 * @return The injury rating of the player
	 */
	@Override
	public int getInjury() {
		return injury;
	}

	/**
	 * Sets the injury rating of the player. If injury is less than 30, then the
	 * injury of the player is set to 30. If injury is greater than 100, then the
	 * injury of the player is set to 100.
	 * 
	 * @param The
	 *            new injury rating of the player
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
	 * Returns the potential rating of the player
	 * 
	 * @return The potential rating of the player
	 */
	@Override
	public int getPotential() {
		return potential;
	}

	/**
	 * Sets the potential rating of the player. If potential is less than 30, then
	 * the potential of the player is set to 30. If potential is greater than 100,
	 * then the potential of the player is set to 100.
	 * 
	 * @param The
	 *            new potential rating of the player
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
	 * Returns the rotationPossessionsRemaining rating of the player
	 * 
	 * @return The rotationPossessionsRemaining rating of the player
	 */
	public int getRotationPossessionsRemaining() {
		return rotationPossessionsRemaining;
	}

	/**
	 * Sets the rotationPossessionsRemaining rating of the player. If
	 * rotationPossessionsRemaining is less than 0, then the rotations possessions
	 * remaining of the player is set to 0. If rotationPossessionsRemaining is
	 * greater than 200, then the rotation possessions remaining of the player is
	 * set to 200.
	 * 
	 * @param The
	 *            new rotationPossessionsRemaining rating of the player
	 */
	public void setRotationPossessionsRemaining(int rotationPossessionsRemaining) {
		if (rotationPossessionsRemaining < 0) {
			this.rotationPossessionsRemaining = 0;
		} else if (rotationPossessionsRemaining > 200) {
			this.rotationPossessionsRemaining = 200;
		} else {
			this.rotationPossessionsRemaining = rotationPossessionsRemaining;
		}
	}

	/**
	 * Returns the initialRotationPossessions rating of the player
	 * 
	 * @return The initialRotationPossessions rating of the player
	 */
	public int getInitialRotationPossessions() {
		return initialRotationPossessions;
	}

	/**
	 * Sets the initialRotationPossessions rating of the player. If
	 * initialRotationPossessions is less than 0, then the initial rotation
	 * possessions of the player is set to 0. If initialRotationPossessions is
	 * greater than 200, then the initial rotation possessions of the player is set
	 * to 200.
	 * 
	 * @param The
	 *            new initialRotationPossessions rating of the player
	 */
	public void setInitialRotationPossessions(int initialRotationPossessions) {
		if (initialRotationPossessions < 0) {
			this.initialRotationPossessions = 0;
		} else if (initialRotationPossessions > 200) {
			this.initialRotationPossessions = 200;
		} else {
			this.initialRotationPossessions = initialRotationPossessions;
		}
	}

	/**
	 * Returns the staminaDecrease rating of the player
	 * 
	 * @return The staminaDecrease rating of the player
	 */
	public int getStaminaDecrease() {
		return staminaDecrease;
	}

	/**
	 * Sets the staminaDecrease rating of the player. If staminaDecrease is less
	 * than 1, then the stamina decrease of the player is set to 1. If
	 * staminaDecrease is greater than 100, then the stamina decrease of the player
	 * is set to 100.
	 * 
	 * @param The
	 *            new staminaDecrease rating of the player
	 */
	public void setStaminaDecrease(int staminaDecrease) {
		if (staminaDecrease < 1) {
			this.staminaDecrease = 1;
		} else if (staminaDecrease > 100) {
			this.staminaDecrease = 100;
		} else {
			this.staminaDecrease = staminaDecrease;
		}
	}

	/**
	 * Calculates the average overall shooting rating of the player
	 * 
	 * @return The average overall shooting rating of the player
	 */
	public double getAverageShootingRating() {
		return insideScoring + midRangeScoring + threePointScoring;
	}

	/**
	 * Returns the pointsGame rating of the player
	 * 
	 * @return The pointsGame rating of the player
	 */
	public int getPointsGame() {
		return pointsGame;
	}

	/**
	 * Sets the pointsGame rating of the player. If pointsGame is less than 0,
	 * points game is set to 0.
	 * 
	 * @param The
	 *            new pointsGame rating of the player
	 */
	public void setPointsGame(int pointsGame) {
		if (pointsGame < 0) {
			this.pointsGame = 0;
		} else {
			this.pointsGame = pointsGame;
		}
	}

	/**
	 * Returns the reboundsGame rating of the player
	 * 
	 * @return The reboundsGame rating of the player
	 */
	public int getReboundsGame() {
		return reboundsGame;
	}

	/**
	 * Sets the reboundsGame rating of the player. If reboundsGame is less than 0,
	 * rebounds game is set to 0.
	 * 
	 * @param The
	 *            new reboundsGame rating of the player
	 */
	public void setReboundsGame(int reboundsGame) {
		if (reboundsGame < 0) {
			this.reboundsGame = 0;
		} else {
			this.reboundsGame = reboundsGame;
		}
	}

	/**
	 * Returns the assistsGame rating of the player
	 * 
	 * @return The assistsGame rating of the player
	 */
	public int getAssistsGame() {
		return assistsGame;
	}

	/**
	 * Sets the assistsGame rating of the player. If assistsGame is less than 0,
	 * assists game is set to 0.
	 * 
	 * @param The
	 *            new assistsGame rating of the player
	 */
	public void setAssistsGame(int assistsGame) {
		if (assistsGame < 0) {
			this.assistsGame = 0;
		} else {
			this.assistsGame = assistsGame;
		}
	}

	/**
	 * Returns the blocksGame rating of the player
	 * 
	 * @return The blocksGame rating of the player
	 */
	public int getBlocksGame() {
		return blocksGame;
	}

	/**
	 * Sets the blocksGame rating of the player. If blocksGame is less than 0,
	 * blocks game is set to 0.
	 * 
	 * @param The
	 *            new blocksGame rating of the player
	 */
	public void setBlocksGame(int blocksGame) {
		if (blocksGame < 0) {
			this.blocksGame = 0;
		} else {
			this.blocksGame = blocksGame;
		}
	}

	/**
	 * Returns the stealsGame rating of the player
	 * 
	 * @return The stealsGame rating of the player
	 */
	public int getStealsGame() {
		return stealsGame;
	}

	/**
	 * Sets the stealsGame rating of the player. If stealsGame is less than 0,
	 * steals game is set to 0.
	 * 
	 * @param The
	 *            new stealsGame rating of the player
	 */
	public void setStealsGame(int stealsGame) {
		if (stealsGame < 0) {
			this.stealsGame = 0;
		} else {
			this.stealsGame = stealsGame;
		}
	}

	/**
	 * Returns the turnoversGame rating of the player
	 * 
	 * @return The turnoversGame rating of the player
	 */
	public int getTurnoversGame() {
		return turnoversGame;
	}

	/**
	 * Sets the turnoversGame rating of the player. If turnoversGame is less than 0,
	 * turnovers game is set to 0.
	 * 
	 * @param The
	 *            new turnoversGame rating of the player
	 */
	public void setTurnoversGame(int turnoversGame) {
		if (turnoversGame < 0) {
			this.turnoversGame = 0;
		} else {
			this.turnoversGame = turnoversGame;
		}
	}

	/**
	 * Resets the player's game statistics after a game has ended
	 */
	public void resetGameStats() {
		pointsGame = 0;
		assistsGame = 0;
		reboundsGame = 0;
		blocksGame = 0;
		stealsGame = 0;
		turnoversGame = 0;
		rotationPossessionsRemaining = initialRotationPossessions;
		stamina = 100;
	}

	/**
	 * Determines and stores the rating of the player for their given position
	 *
	 */
	public void calculatePositionRating() {
		if (position == 1) {
			calculatePointGuardRating();
		} else if (position == 2) {
			calculateShootingGuardRating();
		} else if (position == 3) {
			calculateSmallForwardRating();
		} else if (position == 4) {
			calculatePowerForwardRating();
		} else {
			calculateCenterRating();
		}
	}

	/**
	 * Calculates the overall, offensive, and defensive ratings if the player is in
	 * the Point Guard position
	 */
	public void calculatePointGuardRating() {
		offensiveRating = (int) Math.round((.06) * (insideScoring) + (.08) * (midRangeScoring)
				+ (.12) * (threePointScoring) + (.1) * (freeThrow) + (.02) * (offensiveRebounding)
				+ (.24) * (ballHandling) + (.2) * (passing) + (.15) * (speed) + (.03) * (height));
		defensiveRating = (int) Math
				.round((.07) * (postDefense) + (.3) * (perimeterDefense) + (.08) * (defensiveRebounding)
						+ (.15) * (steal) + (.05) * (block) + (.3) * (speed) + (.05) * (height));
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 1;
	}

	/**
	 * Calculates the overall, offensive, and defensive ratings if the player is in
	 * the Shooting Guard position
	 */
	public void calculateShootingGuardRating() {
		offensiveRating = (int) Math.round((.1) * (insideScoring) + (.1) * (midRangeScoring)
				+ (.15) * (threePointScoring) + (.1) * (freeThrow) + (.05) * (offensiveRebounding)
				+ (.18) * (ballHandling) + (.12) * (passing) + (.12) * (speed) + (.08) * (height));
		defensiveRating = (int) Math.round((.1) * (postDefense) + (.28) * (perimeterDefense)
				+ (.1) * (defensiveRebounding) + (.1) * (steal) + (.07) * (block) + (.25) * (speed) + (.1) * (height));
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 2;
	}

	/**
	 * Calculates the overall, offensive, and defensive ratings if the player is in
	 * the Small Forward position
	 */
	public void calculateSmallForwardRating() {
		offensiveRating = (int) Math.round((.12) * (insideScoring) + (.12) * (midRangeScoring)
				+ (.12) * (threePointScoring) + (.08) * (freeThrow) + (.08) * (offensiveRebounding)
				+ (.1) * (ballHandling) + (.1) * (passing) + (.15) * (speed) + (.13) * (height));
		defensiveRating = (int) Math
				.round((.12) * (postDefense) + (.15) * (perimeterDefense) + (.15) * (defensiveRebounding)
						+ (.1) * (steal) + (.12) * (block) + (.21) * (speed) + (.15) * (height));
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 3;
	}

	/**
	 * Calculates the overall, offensive, and defensive ratings if the player is in
	 * the Power Forward position
	 */
	public void calculatePowerForwardRating() {
		offensiveRating = (int) Math.round((.15) * (insideScoring) + (.1) * (midRangeScoring)
				+ (.11) * (threePointScoring) + (.07) * (freeThrow) + (.12) * (offensiveRebounding)
				+ (.09) * (ballHandling) + (.09) * (passing) + (.12) * (speed) + (.15) * (height));
		defensiveRating = (int) Math
				.round((.15) * (postDefense) + (.12) * (perimeterDefense) + (.17) * (defensiveRebounding)
						+ (.08) * (steal) + (.15) * (block) + (.15) * (speed) + (.18) * (height));
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 4;
	}

	/**
	 * Calculates the overall, offensive, and defensive ratings if the player is in
	 * the Center position
	 */
	public void calculateCenterRating() {
		offensiveRating = (int) Math.round((.18) * (insideScoring) + (.12) * (midRangeScoring)
				+ (.08) * (threePointScoring) + (.06) * (freeThrow) + (.2) * (offensiveRebounding)
				+ (.03) * (ballHandling) + (.06) * (passing) + (.1) * (speed) + (.17) * (height));
		defensiveRating = (int) Math.round((.18) * (postDefense) + (.08) * (perimeterDefense)
				+ (.26) * (defensiveRebounding) + (.03) * (steal) + (.15) * (block) + (.1) * (speed) + (.2) * (height));
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 5;
	}

	/**
	 * Determines the best position for a player to play based on their ratings and
	 * sets their position to the position with the highest overall rating. The
	 * method then sets the overall, offensive, and defensive rating of the player
	 * to the ratings for that positoin.
	 */
	public void determineBestPosition() {
		int maxRating = 0;
		int maxPosition = 0;

		calculatePointGuardRating();
		if (overallRating > maxRating) {
			maxRating = overallRating;
			maxPosition = 1;
		}

		calculateShootingGuardRating();
		if (overallRating > maxRating) {
			maxRating = overallRating;
			maxPosition = 0;
		}

		calculateSmallForwardRating();
		if (overallRating > maxRating) {
			maxRating = overallRating;
			maxPosition = 0;
		}

		calculatePowerForwardRating();
		if (overallRating > maxRating) {
			maxRating = overallRating;
			maxPosition = 0;
		}

		calculateCenterRating();
		if (overallRating > maxRating) {
			maxRating = overallRating;
			maxPosition = 0;
		}

		if (maxPosition == 1) {
			calculatePointGuardRating();
		} else if (maxPosition == 2) {
			calculateShootingGuardRating();
		} else if (maxPosition == 3) {
			calculateSmallForwardRating();
		} else if (maxPosition == 4) {
			calculatePowerForwardRating();
		} else {
			calculateCenterRating();
		}

	}

}