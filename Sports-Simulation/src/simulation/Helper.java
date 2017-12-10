package simulation;

/**
 * Helper methods for the classes of the simulation package
 * 
 * @author Matthew Orth
 *
 */
class Helper {

	/**
	 * Determines if a string contains a space
	 * @param word
	 * 		The string to determine if it contains a space
	 * @return
	 * 		True if the string contains a space, false otherwise
	 */
	static boolean containsSpaces(String word) {

		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == ' ') {
				return true;
			}
		}

		return false;

	}

}
