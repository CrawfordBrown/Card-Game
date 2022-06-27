import java.util.List;

public class Card {

    //private fields
    private Suit suit;
    private Rank rank;
    private Boolean visible;
//    private int value;

    //constructor
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        visible = true;
//        this.value = value;

    }


    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String toString() {
        String str = "";
        if(visible) {
            str += rank.getRank() + " of " + suit.getSuitText();
        }
        else
        {
            str = "Back of Card";
        }
        return str;
    }


//    public String cardToString() {
//        return this.rank + " " + this.suit;
//    }




}

