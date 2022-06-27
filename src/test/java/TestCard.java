
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class TestCard {

    Card card = new Card (Suit.Hearts, Rank.ACE, 14);


    @Test
    public void testToString() {
        assertEquals(card.cardToString(), "ACE Hearts");
    }

    //card.cardToString()
}
