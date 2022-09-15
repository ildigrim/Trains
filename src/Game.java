public class Game {
    public static void main(String[] args) {
        CardDeck.CreateDeck();
        CardDeck.deckDisplay();
        CardDeck.deckShuffle();
        System.out.println();
        CardDeck.deckDisplay();
    }
}
