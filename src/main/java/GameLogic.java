public class GameLogic {

    public static void main(String[] args) {
       // Card card = new Card (Suit.HEARTS, Rank.FIVE);

       // card.toString();
        Deck deck = new Deck();

        deck.populateDeck();

        deck.shuffle();

//        System.out.println(deck.showDeck());
//
//        System.out.println(deck.deckSize());

        Player player1 = new Player("Crawford");
        Player player2 = new Player("Jennifer");

        Deck.deal(player1);
//        Deck.deal(player2);

        System.out.println(player1.showHand());
//        System.out.println(player2.showHand());

        System.out.println(deck.deckSize());

        player1.pickUp();
        System.out.println(player1.showHand());
        System.out.println(deck.deckSize());


    }
}
