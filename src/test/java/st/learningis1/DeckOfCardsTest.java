package st.learningis1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeckOfCardsTest {

    /**
     * Test case for the constructor.
     */
    @Test
    public void testDeckInitialization() {
        DeckOfCards deck = new DeckOfCards();
        int expectedTotalCards = 52;
        Assertions.assertEquals(expectedTotalCards, deck.getNumRemainingCards(), "Deck initialization test failed");
    }

    /**
     * Test case for the shuffle method.
     */
    @Test
    public void testDeckShuffling() {
        DeckOfCards deckBeforeShuffle = new DeckOfCards();
        DeckOfCards deckAfterShuffle = new DeckOfCards();
        deckAfterShuffle.shuffle();
        Assertions.assertNotEquals(deckBeforeShuffle, deckAfterShuffle, "Deck shuffling test failed");
    }

    /**
     * Test case for the getNumRemainingCards method.
     */
    @Test
    public void testGetNumRemainingCards() {
        // Create a new deck of cards
        DeckOfCards deck = new DeckOfCards();

        // Shuffle the deck
        deck.shuffle();

        // Initial number of cards should be 52
        int initialCount = 52;
        Assertions.assertEquals(initialCount, deck.getNumRemainingCards());

        // Discard 3 cards
        deck.cards[0][0].discard();
        deck.cards[1][1].discard();
        deck.cards[2][2].discard();

        // After deleting, the number of remaining cards should be 49
        Assertions.assertEquals(initialCount - 3, deck.getNumRemainingCards());
    }
}
