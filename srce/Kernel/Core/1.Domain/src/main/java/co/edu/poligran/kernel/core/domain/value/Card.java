package co.edu.poligran.kernel.core.domain.value;

/**
 * Represents a card in the game. This is an abstract class that is extended by
 * specific types of cards. The type of card is determined by the class that
 * extends this class.
 */
public abstract class Card {
	private final CardType type;
	private final int number;

	/**
	 * Constructs a new card with the given number. The type of card is determined
	 * by the class that extends this class.
	 *
	 * @param number
	 *            The number associated with this card. Must be greater than 0.
	 * @throws IllegalArgumentException
	 *             if the given number is less than 1.
	 */
	public Card(int number) {
		if (number < 1) {
			throw new IllegalArgumentException("Number must be greater than 0");
		}

		this.number = number;
		this.type = CardType.fromClass(this.getClass());
	}

	/**
	 * Gets the type of this card.
	 *
	 * @return The type of this card.
	 */
	public CardType getType() {
		return this.type;
	}

	/**
	 * Gets the number associated with this card.
	 *
	 * @return The number associated with this card.
	 */
	public int getNumber() {
		return this.number;
	}

	/**
	 * Checks if this card matches the given card. Two cards match if they have the
	 * same number.
	 *
	 * @param otherCard
	 *            The card to check for a match.
	 * @return True if this card matches the given card, false otherwise.
	 */
	public boolean match(Card otherCard) {
		return this.number == otherCard.getNumber();
	}
}
