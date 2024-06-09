package co.edu.poligran.kernel.core.domain.entity;
/**
 * Represents a player in the game. A player has a name and a score, and can
 * play cards.
 */
public class Player {
	private String name;
	private int score;

	/**
	 * Constructs a new player with the given name.
	 *
	 * @param name
	 *            The name of the player.
	 */
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
}
