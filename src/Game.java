import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> playerList = new ArrayList<>();
    private Table table;
    private Discard discard;
    private CardDeck deck;

    public Game(int countOfPlayers) {
        deck = new CardDeck();
        discard = new Discard();
        table = new Table();
        cardOnTable();


        for (int i = 0; i< countOfPlayers; i++){
            List<Card> cards = new ArrayList<>();
            for (int j = 0; j<5; j++){
                cards.add(deck.getCard());
            }
            playerList.add(new Player(cards, "name", PlayersColors.BLACK));
            // todo createPlayer()
        }
        deck.deckDisplay();
    }

    private void cardOnTable(){
        while (table.getCards().size() <= 5) {
            table.addCard(deck.getCard());
            if (table.hasThreeLocomotives()){
                clearTable();
            }
        }
    }

    private void clearTable(){
        for(Card card: table.getCards()){
            discard.addCard(card);
        }
        table.getCards().clear();
    }


}
