package co.edu.poligran.kernel.core.domain.value;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a game board. A game board is a collection of cards.
 *
 * @param <T>
 *            The type of card that the board can hold. This is determined by
 *            the class that extends the Card class.
 */
public class Board<T extends Card> {
	private final List<T> cards;

	/**
	 * Constructs a new empty game board.
	 */
	public Board() {
		this.cards = new ArrayList<>();
	}

	/**
	 * Adds a card to the game board.
	 *
	 * @param card
	 *            The card to add to the game board. The type of card must be a
	 *            subclass of Card.
	 */
	public void addCard(T card) {
		cards.add(card);
	}

	/**
	 * Selects a card from the game board at the given index.
	 *
	 * @param index
	 *            The index of the card to select.
	 * @return The card at the given index. The type of card is a subclass of Card.
	 */
	public T selectCard(int index) {
		return cards.get(index);
	}
}
