import java.util.ArrayList;

public class Player extends Hand {

    private String name;
//    private ArrayList<ArrayList<Card>> pHand;
//
//    public Player() {
//        pHand = new ArrayList<ArrayList<Card>>();
//    }

        public Player(String name) {
            this.name = name;
        }

        public void pickUp() {
            Card pickUpCard = Deck.deck.get(0);
            hand.add(pickUpCard);
            Deck.deck.remove(pickUpCard);

        }

}
