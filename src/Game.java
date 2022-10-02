import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> playerList = new ArrayList<>();
    private Table table;
    private Discard discard;
    private CardDeck deck;

    public Game(int countOfPlayers) {
        deck = new CardDeck();         //колода карт
        discard = new Discard();       //відбій
        table = new Table();           //карти викладені на стіл
        cardOnTable();

        createPlayer("First", PlayersColors.YELLOW);
        createPlayer("Second", PlayersColors.GREEN);
    }

    public List<Player> getPlayers(){
        return playerList;
    }

    public Table getTable(){
        return table;
    }

    public void createPlayer(String name, PlayersColors color){         //створення гравця
        List<Card> cards = new ArrayList<>();
        for (int j = 0; j<5; j++){                  //виділення карт для гравця
            cards.add(getCardFromDeck());
        }
        playerList.add(new Player(cards, name, color));

    }

    private void cardOnTable(){                           // викладення карт на стіл
        while (table.getCards().size() < 5) {
            table.addCard(getCardFromDeck());
            if (table.hasThreeLocomotives()){
                clearTable();
            }
        }
    }

    private Card getCardFromDeck(){
        if (deck.isDeckEmpty()){
            deck.addToDeck(discard.getCards());
            deck.deckShuffle();
            discard.getCards().clear();
        }
        return deck.getCard();
    }

    private void clearTable(){                            //скидання стола при викладенні трьох локомотивів
        for(Card card: table.getCards()){
            discard.addCard(card);
        }
        table.getCards().clear();
    }

    //todo buildWay
    //todo check tunnel


}
