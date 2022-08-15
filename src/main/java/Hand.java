import java.util.ArrayList;

public class Hand {

    //3 cards the player holds
    public ArrayList<Card> hand;

    //3 cards face up
    public ArrayList<Card> upHand;

    //3 cards face down
    public ArrayList<Card> downHand;

    //cards players have played
    private ArrayList<Card> playedHand;

    public ArrayList<Deck> pickUpDeck;

    private Boolean visible;

    //constructor
    public Hand() {
        hand = new ArrayList<Card>();
        upHand = new ArrayList<Card>();
        downHand = new ArrayList<Card>();
        playedHand = new ArrayList<Card>();
       // pickUpDeck = this.deck;
    }

    //methods
    public void addCard(Card card) {
        hand.add(card);
    }


    public String showHand() {
        String string = "hand = \n";

        for (Card card : hand) {
                    string += card + "\n";
                }

        string += "\nup hand \n";

        for (Card card2 : upHand) {
            if (card2.visible) {
                string += card2 + "\n";
            }
        }

        string += "\ndown hand \n";


        for (Card card3 : downHand) {
            card3.visible = false;
            if (card3.visible) {
                string += card3 + "\n";
            }
            else{
                string += "Back of card\n";
            }
        }
        return string;
        }


    public void flipCards() {
        for (Card card : hand) {
            card.flipCard();
        }
    }

}
