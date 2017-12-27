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
	 */
	public Player(int position, String playerFirstName, String playerLastName, int age, double contractAmount,
			int contractYears, int insideScoring, int midRangeScoring, int threePointScoring, int freeThrow,
			int offensiveRebounding, int ballHandling, int passing, int postDefense, int perimeterDefense,
			int defensiveRebounding, int steal, int block, int height, int speed, int stamina, int injury,
			int potential, int rotationPossessions, int pointsGame, int reboundsGame, int assistsGame, int blocksGame,
			int stealsGame, int turnoversGame) {
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
		setStaminaDecrease(stamina / 25);
		setInjury(injury);
		setPotential(potential);
		setInitialRotationPossessions(rotationPossessions);
		setRotationPossessionsRemaining(rotationPossessions);
		determineBestPosition();
		setPointsGame(pointsGame);
		setReboundsGame(reboundsGame);
		setAssistsGame(assistsGame);
		setBlocksGame(blocksGame);
		setStealsGame(stealsGame);
		setTurnoversGame(turnoversGame);

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

		// calculatePositionRating();

	}

	/**
	 * Returns the overallRating rating of the player
	 * 
	 * @return The overallRating rating of the player
	 */
	public int getOverallRating() {
		return overallRating;
	}

	/**
	 * Returns the offensiveRating rating of the player
	 * 
	 * @return The offensiveRating rating of the player
	 */
	public int getOffensiveRating() {
		return offensiveRating;
	}

	/**
	 * Returns the defensiveRating rating of the player
	 * 
	 * @return The defensiveRating rating of the player
	 */
	public int getDefensiveRating() {
		return defensiveRating;
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
	 * Sets the rotationPossessionsRemaining rating of the player
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
	 * Sets the initialRotationPossessions rating of the player
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
	 * Sets the staminaDecrease rating of the player
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
		return (insideScoring + midRangeScoring + threePointScoring) / 3;
	}
	
	

	/**
	 * Returns the pointsGame rating of the player
	 * @return 
	 *		The pointsGame rating of the player
	 */
	public int getPointsGame() {
		return pointsGame;
	}

	/**
	 * Sets the pointsGame rating of the player
	 * @param 
	 * 		The new pointsGame rating of the player
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
	 * @return 
	 *		The reboundsGame rating of the player
	 */
	public int getReboundsGame() {
		return reboundsGame;
	}

	/**
	 * Sets the reboundsGame rating of the player
	 * @param 
	 * 		The new reboundsGame rating of the player
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
	 * @return 
	 *		The assistsGame rating of the player
	 */
	public int getAssistsGame() {
		return assistsGame;
	}

	/**
	 * Sets the assistsGame rating of the player
	 * @param 
	 * 		The new assistsGame rating of the player
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
	 * @return 
	 *		The blocksGame rating of the player
	 */
	public int getBlocksGame() {
		return blocksGame;
	}

	/**
	 * Sets the blocksGame rating of the player
	 * @param 
	 * 		The new blocksGame rating of the player
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
	 * @return 
	 *		The stealsGame rating of the player
	 */
	public int getStealsGame() {
		return stealsGame;
	}

	/**
	 * Sets the stealsGame rating of the player
	 * @param 
	 * 		The new stealsGame rating of the player
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
	 * @return 
	 *		The turnoversGame rating of the player
	 */
	public int getTurnoversGame() {
		return turnoversGame;
	}

	/**
	 * Sets the turnoversGame rating of the player
	 * @param 
	 * 		The new turnoversGame rating of the player
	 */
	public void setTurnoversGame(int turnoversGame) {
		if (turnoversGame < 0) {
			this.turnoversGame = 0;
		} else {
			this.turnoversGame = turnoversGame;
		}
	}

	/**
	 * Determines and stores the rating of the player in a given position
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
	 * Calculates the overall, offensive, and defensive ratings of the coach
	 */
	public void calculateCoachRatings() {
		double offensiveWeight = .125;
		double defensiveWeight = .167;
		offensiveRating = (int) Math.round(((offensiveWeight) * (insideScoring) + (offensiveWeight) * (midRangeScoring)
				+ (offensiveWeight) * (threePointScoring) + (offensiveWeight) * (freeThrow)
				+ (offensiveWeight) * (offensiveRebounding) + (offensiveWeight) * (ballHandling)
				+ (offensiveWeight) * (passing) + (offensiveWeight) * (speed) + (offensiveWeight) * (height)) / 9);
		defensiveRating = (int) Math.round(((defensiveWeight) * (postDefense) + (defensiveWeight) * (perimeterDefense)
				+ (defensiveWeight) * (defensiveRebounding) + (defensiveWeight) * (steal) + (defensiveWeight) * (block)
				+ (defensiveWeight) * (speed) + (defensiveWeight) * (height)) / 7);
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 0;
	}

	/**
	 * Calculates the overall, offensive, and defensive ratings of the point guard
	 */
	public void calculatePointGuardRating() {
		offensiveRating = (int) Math.round(((.06) * (insideScoring) + (.08) * (midRangeScoring)
				+ (.12) * (threePointScoring) + (.1) * (freeThrow) + (.02) * (offensiveRebounding)
				+ (.24) * (ballHandling) + (.2) * (passing) + (.15) * (speed) + (.03) * (height)) / 9);
		defensiveRating = (int) Math
				.round(((.07) * (postDefense) + (.3) * (perimeterDefense) + (.08) * (defensiveRebounding)
						+ (.15) * (steal) + (.05) * (block) + (.3) * (speed) + (.05) * (height)) / 7);
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 1;
	}

	/**
	 * Calculates the overall, offensive, and defensive ratings of the shooting
	 * guard
	 */
	public void calculateShootingGuardRating() {
		offensiveRating = (int) Math.round(((.1) * (insideScoring) + (.1) * (midRangeScoring)
				+ (.15) * (threePointScoring) + (.1) * (freeThrow) + (.05) * (offensiveRebounding)
				+ (.18) * (ballHandling) + (.12) * (passing) + (.12) * (speed) + (.08) * (height)) / 9);
		defensiveRating = (int) Math
				.round(((.1) * (postDefense) + (.28) * (perimeterDefense) + (.1) * (defensiveRebounding)
						+ (.1) * (steal) + (.07) * (block) + (.25) * (speed) + (.1) * (height)) / 7);
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 2;
	}

	/**
	 * Calculates the overall, offensive, and defensive ratings of the small forward
	 */
	public void calculateSmallForwardRating() {
		offensiveRating = (int) Math.round(((.12) * (insideScoring) + (.12) * (midRangeScoring)
				+ (.12) * (threePointScoring) + (.08) * (freeThrow) + (.08) * (offensiveRebounding)
				+ (.1) * (ballHandling) + (.1) * (passing) + (.15) * (speed) + (.13) * (height)) / 9);
		defensiveRating = (int) Math
				.round(((.12) * (postDefense) + (.15) * (perimeterDefense) + (.15) * (defensiveRebounding)
						+ (.1) * (steal) + (.12) * (block) + (.21) * (speed) + (.15) * (height)) / 7);
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 3;
	}

	/**
	 * Calculates the overall, offensive, and defensive ratings of the power forward
	 */
	public void calculatePowerForwardRating() {
		offensiveRating = (int) Math.round(((.15) * (insideScoring) + (.1) * (midRangeScoring)
				+ (.11) * (threePointScoring) + (.07) * (freeThrow) + (.12) * (offensiveRebounding)
				+ (.09) * (ballHandling) + (.09) * (passing) + (.12) * (speed) + (.15) * (height)) / 9);
		defensiveRating = (int) Math
				.round(((.15) * (postDefense) + (.12) * (perimeterDefense) + (.17) * (defensiveRebounding)
						+ (.08) * (steal) + (.15) * (block) + (.15) * (speed) + (.18) * (height)) / 7);
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 4;
	}

	/**
	 * Calculates the overall, offensive, and defensive ratings of the center
	 */
	public void calculateCenterRating() {
		offensiveRating = (int) Math.round(((.18) * (insideScoring) + (.12) * (midRangeScoring)
				+ (.08) * (threePointScoring) + (.06) * (freeThrow) + (.2) * (offensiveRebounding)
				+ (.03) * (ballHandling) + (.06) * (passing) + (.1) * (speed) + (.17) * (height)) / 9);
		defensiveRating = (int) Math
				.round(((.18) * (postDefense) + (.08) * (perimeterDefense) + (.26) * (defensiveRebounding)
						+ (.03) * (steal) + (.15) * (block) + (.1) * (speed) + (.2) * (height)) / 7);
		overallRating = (offensiveRating + defensiveRating) / 2;
		position = 5;
	}

	/**
	 * Determines the best position for a player to play based on their ratings
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