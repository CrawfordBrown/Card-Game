import java.util.ArrayList;

public class Deck {

    //private fields
    private ArrayList<Card> deck;

    //constructor
    public Deck() {
        this.deck = new ArrayList<Card>();
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
        return this.deck.size();
    }

    //print deck method
    public String showDeck() {
        String cards = "";
        for (Card card: this.deck) {
            cards += card.toString() + "\n";
        }
        return cards;
    }
}