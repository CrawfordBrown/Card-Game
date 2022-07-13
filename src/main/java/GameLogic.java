public class GameLogic {

    public static void main(String[] args) {
        Card card = new Card (Suit.HEARTS, Rank.FIVE);

        card.toString();
        Deck deck = new Deck();

        deck.populateDeck();


        System.out.println(deck.showDeck());
    }
}
