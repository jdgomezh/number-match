package co.edu.poligran.kernel.core.domain.value;

/**
 * Represents a quantity card in the game. A quantity card is a type of card
 * that has a number and an object type associated with it.
 */
public class QuantityCard extends Card {
	private final ObjectType object;

	/**
	 * Constructs a new quantity card with the given number and object type.
	 *
	 * @param number
	 *            The number associated with this card.
	 * @param object
	 *            The object type associated with this card.
	 */
	public QuantityCard(int number, ObjectType object) {
		super(number);
		this.object = object;
	}

	/**
	 * Gets the object type associated with this card.
	 *
	 * @return The object type associated with this card.
	 */
	public ObjectType getObject() {
		return this.object;
	}
}
