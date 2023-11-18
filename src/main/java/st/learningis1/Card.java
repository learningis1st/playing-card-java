package st.learningis1;

/**
 * Represents a playing card.
 */
public class Card {
    private static final int ACE = 1;
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;

    private final int value;               // Numeric value of the card (1 to 13)
    private final String fullDescription;  // Example: "the Ace of Spades"
    private final String shortDescription; // Example: "A♠"
    private boolean isFaceUp;
    private boolean isDiscarded;

    /**
     * Constructor for the Card class.
     *
     * @param value The numeric value of the card (1 to 13).
     * @param suit  The suit of the card (Clubs, Diamonds, Hearts, Spades).
     */
    public Card(int value, Suit suit) {
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("Invalid card value: " + value);
        }
        this.value = value;
        this.fullDescription = String.format("the %s of %s", getValueFullDescription(), suit);
        this.shortDescription = getValueShortDescription() + suit.getEmoji();
        this.isFaceUp = false; // Cards are face down when created
        this.isDiscarded = false; // Cards are not discarded when created
    }

    /**
     * Gets the textual description of the card's value.
     *
     * @return The full description of the card's value.
     */
    private String getValueFullDescription() {
        return switch (value) {
            case JACK -> "Jack";
            case QUEEN -> "Queen";
            case KING -> "King";
            case ACE -> "Ace";
            default -> String.valueOf(value);
        };
    }

    /**
     * Gets the short description of the card.
     *
     * @return The short description of the card's value.
     */
    private String getValueShortDescription() {
        return switch (value) {
            case JACK -> "J";
            case QUEEN -> "Q";
            case KING -> "K";
            case ACE -> "A";
            default -> String.valueOf(value);
        };
    }

    /**
     * Gets the numeric value of the card.
     *
     * @return The numeric value of the card.
     */
    public int getValue() {
        return value;
    }

    /**
     * Gets the full description of the card.
     *
     * @return The full description of the card.
     */
    public String getFullDescription() {
        return fullDescription;
    }

    /**
     * Gets the short description of the card.
     *
     * @return The short description of the card.
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Flips the card to the opposite side.
     */
    public void flipSide() {
        isFaceUp = !isFaceUp;
    }

    /**
     * Checks if the card is face up.
     *
     * @return True if the card is face up, false otherwise.
     */
    public boolean isFaceUp() {
        return isFaceUp;
    }

    /**
     * Discards the card.
     */
    public void discard() {
        isDiscarded = true;
    }

    /**
     * Checks if the card is discarded.
     *
     * @return True if the card is hidden, false otherwise.
     */
    public boolean isDiscarded() {
        return isDiscarded;
    }
}
