package co.edu.poligran.kernel.core.domain.value;

/**
 * Enumeration representing the types of objects in the game. Each object type
 * is associated with a specific name.
 */
public enum ObjectType {
	APPLE("apple"),
	STAR("star"),
	SUN("sun"),
	DOG("dog"),
	STONE("stone"),
	CAT("cat"),
	HEART("heart"),
	;

	private final String name;

	/**
	 * ObjectType constructor.
	 *
	 * @param name
	 *            The name associated with this object type.
	 */
	ObjectType(String name) {
		this.name = name.toLowerCase();
	}

	/**
	 * Gets the name associated with this object type.
	 *
	 * @return The associated name.
	 */
	public String getName() {
		return name;
	}
}
