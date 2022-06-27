public enum Suit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    //private fields
    private final String suitText;

    //constructor
    private Suit(String suitText) {
        this.suitText = suitText;
    }

    //public method
    public String getSuitText() {
        return suitText;
    }

}


