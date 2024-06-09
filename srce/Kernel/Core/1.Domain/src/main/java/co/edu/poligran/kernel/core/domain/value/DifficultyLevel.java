package co.edu.poligran.kernel.core.domain.value;

/**
 * Enumeration representing the difficulty levels in the game. Each difficulty
 * level is associated with a specific maximum number and board size.
 */
public enum DifficultyLevel {
	EASY(5,2),
	INTERMEDIATE(10,3),
	ADVANCED(15,5),
	EXPERT(20,8),
	MASTER(25,13),
	LEGENDARY(30,21),
	;

	private final int maxNumber;
	private final int boardSize;

	/**
	 * DifficultyLevel constructor.
	 *
	 * @param maxNumber
	 *            The maximum number associated with this difficulty level.
	 * @param boardSize
	 *            The board size associated with this difficulty level.
	 */
	DifficultyLevel(int maxNumber, int boardSize) {
		this.maxNumber = maxNumber;
		this.boardSize = boardSize;
	}

	/**
	 * Gets the maximum number associated with this difficulty level.
	 *
	 * @return The associated maximum number.
	 */
	public int getMaxNumber() {
		return maxNumber;
	}

	/**
	 * Gets the board size associated with this difficulty level.
	 *
	 * @return The associated board size.
	 */
	public int getBoardSize() {
		return boardSize;
	}
}
