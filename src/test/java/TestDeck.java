import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDeck {

    Deck deck = new Deck();

    @Test
    public void testPopulate() {
        deck.populateDeck();
        assertEquals(deck.deckSize(), 52);
    }
}
