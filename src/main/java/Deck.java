import java.util.ArrayList;

public class Deck {

    //private fields
    private ArrayList<Card> deck;

    //constructor
    public Deck() {
        deck = new ArrayList<Card>();
    }

    //methods
    //create deck method
    public void populateDeck() {
        for (Suit suit: Suit.values() ) {
            for (Rank rank: Rank.values()) {
                Card card = new Card(suit, rank);
                this.deck.add(card);
            }
        }
    }

    //size of deck method
    public int deckSize() {
        return deck.size();
    }

}