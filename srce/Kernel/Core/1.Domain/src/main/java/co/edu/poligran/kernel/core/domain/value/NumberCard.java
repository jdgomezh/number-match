package co.edu.poligran.kernel.core.domain.value;

/**
 * Represents a number card in the game. A number card is a type of card that
 * has a number associated with it.
 */
public class NumberCard extends Card {
	/**
	 * Constructs a new number card with the given number.
	 *
	 * @param number
	 *            The number associated with this card.
	 */
	public NumberCard(int number) {
		super(number);
	}
}
