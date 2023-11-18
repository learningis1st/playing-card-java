package st.learningis1;

/**
 * Represents the suit of a playing card.
 */
public enum Suit {
    Clubs("♣"),       // The Clubs suit symbolizes the Peasants
    Diamonds("♦"),    // The Diamonds suit symbolizes the Merchants
    Hearts("♥"),      // The Hearts suit symbolizes the Church
    Spades("♠");      // The Spades suit symbolizes the Military

    private final String emoji;

    /**
     * Constructor for the Suit enum.
     *
     * @param emoji The emoji associated with the suit.
     */
    Suit(String emoji) {
        this.emoji = emoji;
    }

    /**
     * Gets the emoji associated with the suit.
     *
     * @return The emoji for the suit.
     */
    public String getEmoji() {
        return emoji;
    }
}
