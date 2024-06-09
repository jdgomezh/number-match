package co.edu.poligran.kernel.core.domain.value;

/**
 * Enumeration representing the types of cards in the game. Each card type is
 * associated with a specific card class.
 */
public enum CardType {
	NUMBER(NumberCard.class), // Associated with the NumberCard class
	QUANTITY(QuantityCard.class); // Associated with the QuantityCard class

	private final Class<? extends Card> type;

	/**
	 * CardType constructor.
	 *
	 * @param type
	 *            The card class associated with this card type.
	 */
	CardType(Class<? extends Card> type) {
		this.type = type;
	}

	/**
	 * Gets the card class associated with this card type.
	 *
	 * @return The associated card class.
	 */
	public Class<? extends Card> getType() {
		return type;
	}

	/**
	 * Gets the card type corresponding to the given card class.
	 *
	 * @param cardClass
	 *            The card class.
	 * @return The corresponding card type.
	 * @throws IllegalArgumentException
	 *             if there is no card type corresponding to the given class.
	 */
	public static CardType fromClass(Class<? extends Card> cardClass) {
		for (CardType cardType : CardType.values()) {
			if (cardType.getType().equals(cardClass)) {
				return cardType;
			}
		}
		throw new IllegalArgumentException("No CardType for class " + cardClass.getName());
	}
}
