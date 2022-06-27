import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestCard {

    Card card = new Card (Suit.HEARTS, Rank.FIVE);


    @Test
    public void testToString() {
        assertEquals(card.toString(), "5 of Hearts");
    }

//    @Test
//    public void testToString() {
//        assertEquals(card.cardToString(), "ACE Hearts");
//    }

//    @Test
//    public void testGetValue() {
//        assertEquals(card.getValue(), 14);
//    }
}
