package st.learningis1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a deck of playing cards (52 cards, no jokers).
 */
public class DeckOfCards {
    private static final int NUM_SUITS = 4;   // Hearts, Diamonds, Clubs, Spades
    private static final int NUM_VALUES = 13; // Ace, 2, 3, ..., 10, Jack, Queen, King

    public Card[][] cards;

    /**
     * Constructor for the DeckOfCards class.
     */
    public DeckOfCards() {
        cards = new Card[NUM_SUITS][NUM_VALUES]; // 4 suits, 13 values
        initializeDeck();
    }

    /**
     * Initializes the deck with 52 cards.
     */
    private void initializeDeck() {
        Suit[] suits = Suit.values();

        for (int row = 0; row < suits.length; row++) {
            for (int col = 0; col < NUM_VALUES; col++) {
                cards[row][col] = new Card(col + 1, suits[row]);
            }
        }
    }

    /**
     * Shuffles the deck of cards.
     */
    public void shuffle() {
        List<Card> cardList = new ArrayList<>();

        // Add all cards to a list
        for (int row = 0; row < NUM_SUITS; row++) {
            Collections.addAll(cardList, cards[row]);
        }

        Collections.shuffle(cardList); // Shuffle the list

        // Add cards back to the array
        for (int row = 0; row < NUM_SUITS; row++) {
            for (int col = 0; col < NUM_VALUES; col++) {
                cards[row][col] = cardList.remove(0);
            }
        }
    }

    /**
     * Gets the number of remaining cards in the deck.
     *
     * @return The number of remaining cards.
     */
    public int getNumRemainingCards() {
        int numRemainingCards = 0;

        // Count the number of cards that are not discarded
        for (int row = 0; row < NUM_SUITS; row++) {
            for (int col = 0; col < NUM_VALUES; col++) {
                if (!cards[row][col].isDiscarded()) {
                    numRemainingCards++;
                }
            }
        }

        return numRemainingCards;
    }
}
