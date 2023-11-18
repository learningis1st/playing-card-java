package st.learningis1;

import org.junit.jupiter.api.Test;

public class ShuffleTest {

    /**
     * Test the shuffling of a deck of cards.
     */
    @Test
    public void testDeckShuffling() {
        // Create a new deck of cards
        DeckOfCards deck = new DeckOfCards();

        // Print the deck before shuffling
        System.out.println("Deck of Cards Before Shuffling:");
        printDeck(deck);

        // Shuffle the deck
        deck.shuffle();

        // Print the deck after shuffling
        System.out.println("\nDeck of Cards After Shuffling:");
        printDeck(deck);
    }

    /**
     * Print the cards in the deck.
     *
     * @param deck The deck of cards to print.
     */
    private static void printDeck(DeckOfCards deck) {
        for (int suitIndex = 0; suitIndex < 4; suitIndex++) {
            for (int valueIndex = 0; valueIndex < 13; valueIndex++) {
                Card card = deck.cards[suitIndex][valueIndex];
                if (card != null) {
                    System.out.println(card.getFullDescription());
                }
            }
        }
    }
}
