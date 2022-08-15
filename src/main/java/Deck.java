import java.util.ArrayList;
import java.util.Random;

public class Deck {

    //private fields
    static ArrayList<Card> deck;

    //constructor
    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    Random random = new Random();

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

    //shuffle method
    public void shuffle() {
        for (int i = deck.size() -1; i > 0; i--) {
            //swap random card with last card of loop
            int pick = random.nextInt(i);
            Card randCard = deck.get(pick);
            Card lastCard = deck.get(i);
            deck.set(i, randCard);
            deck.set(pick, lastCard);
        }
    }

    public static void deal(Player player) {
        for (int i = 0; i <= 2; i++) {
            Card dealCard = deck.get(0);
            deck.remove(0);
            player.downHand.add(dealCard);
        }
        for (int i = 0; i <= 2; i++) {
            Card dealCard = deck.get(0);
            deck.remove(0);
            player.upHand.add(dealCard);
        }
        for (int i = 0; i <= 2; i++) {
            Card dealCard = deck.get(0);
            deck.remove(0);
            player.hand.add(dealCard);
        }
    }


}