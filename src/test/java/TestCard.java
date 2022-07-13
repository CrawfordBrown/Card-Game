import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCard {

    Card card = new Card (Suit.HEARTS, Rank.FIVE);
    Card card2 = new Card (Suit.HEARTS, Rank.ACE);


    @Test
    public void testToString() {

        assertEquals(card.toString(), "5 of Hearts");
    }

    @Test
    public void testAceToString() {
        assertEquals(card2.toString(), "Ace of Hearts");
    }

    @Test
    public void testGetValue() {
        assertEquals(card2.getRankValue(), 14);
    }

    
}
