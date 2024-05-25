# Simple Card Deck Implementation

This Java program provides a simple implementation of a deck of playing cards and individual card objects.

## Card Class

The `Card` class represents a playing card with properties such as value, suit, and description.

- **Properties**:
  - `value`: Numeric value of the card (1 to 13).
  - `fullDescription`: Full textual description of the card (e.g., "the Ace of Spades").
  - `shortDescription`: Short textual description of the card (e.g., "A♠").
  - `isFaceUp`: Indicates if the card is face up.
  - `isDiscarded`: Indicates if the card is discarded.

## DeckOfCards Class

The `DeckOfCards` class represents a deck of playing cards, containing 52 cards with no jokers.

- **Properties**:
  - `cards`: 2D array representing the deck of cards.

- **Methods**:
  - `initializeDeck()`: Initializes the deck with 52 cards.
  - `shuffle()`: Shuffles the deck of cards.
  - `getNumRemainingCards()`: Gets the number of remaining cards in the deck.

## Suit Enum

The `Suit` enum represents the suit of a playing card.

- **Properties**:
  - `emoji`: Emoji associated with the suit.