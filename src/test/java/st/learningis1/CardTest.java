package st.learningis1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {

    /**
     * Test case for creating a card with a valid value.
     */
    @Test
    public void testGoodCardCreation() {
        Card card = new Card(5, Suit.Diamonds);
        Assertions.assertNotNull(card, "Card creation test failed");
    }

    /**
     * Test case for creating a card with an invalid value.
     */
    @Test
    public void testBadCardCreation() {
        // The 15 of Clubs is not a valid card
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Card(15, Suit.Clubs));
    }

    /**
     * Test case for the value of a card.
     */
    @Test
    public void testCardValue() {
        Card card = new Card(11, Suit.Diamonds);
        Assertions.assertEquals(11, card.getValue(), "Card value test failed");
    }

    /**
     * Test case for the full description of a card.
     */
    @Test
    public void testCardFullDescription() {
        Card card = new Card(1, Suit.Spades);
        String expectedDescription = "the Ace of Spades";
        Assertions.assertEquals(expectedDescription, card.getFullDescription(), "Card long description test failed");
    }

    /**
     * Test case for the short description of a card.
     */
    @Test
    public void testCardShortDescription() {
        Card card = new Card(12, Suit.Hearts);
        String expectedDescription = "Q" + "♥";
        Assertions.assertEquals(expectedDescription, card.getShortDescription(), "Card short description test failed");
    }

    /**
     * Test case for flipping a card twice.
     */
    @Test
    public void testCardFlipAlternation() {
        Card card = new Card(6, Suit.Spades);

        card.flipSide();
        Assertions.assertTrue(card.isFaceUp(), "Card flip face up test failed");

        card.flipSide();
        Assertions.assertFalse(card.isFaceUp(), "Card flip face down test failed");
    }

    /**
     * Test case for whether a card is face up when it is created.
     */
    @Test
    public void testCardIsFaceUp() {
        Card card = new Card(2, Suit.Spades);
        Assertions.assertFalse(card.isFaceUp(), "Card is face up test failed");
    }

    /**
     * Test case for discarding a card.
     */
    @Test
    public void testCardDiscard() {
        Card card = new Card(4, Suit.Diamonds);
        card.discard();
        Assertions.assertTrue(card.isDiscarded(), "Card discard test failed");
    }

    /**
     * Test case for whether a card is discarded when it is created.
     */
    @Test
    public void testCardIsDiscarded() {
        Card card = new Card(13, Suit.Clubs);
        Assertions.assertFalse(card.isDiscarded(), "Card is discarded test failed");
    }
}
