public class GameLogic {

    public static void main(String[] args) {
        Card card = new Card (Suit.HEARTS, Rank.FIVE);

        card.toString();
        Deck deck = new Deck();

        deck.populateDeck();

        deck.shuffle();

        System.out.println(deck.showDeck());

        System.out.println(deck.deckSize());
    }
}
