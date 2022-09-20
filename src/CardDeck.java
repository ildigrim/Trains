import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

    private final List <Card> deck = new ArrayList<>();

    public CardDeck (){
        createDeck();
        deckShuffle();
    }

    public void createDeck (){
        fillDeck(Card.PINC, 12);
        fillDeck(Card.WHITE, 12);
        fillDeck(Card.BLACK, 12);
        fillDeck(Card.BLUE, 12);
        fillDeck(Card.YELLOW, 12);
        fillDeck(Card.ORANGE, 12);
        fillDeck(Card.RED, 12);
        fillDeck(Card.GREEN, 12);
        fillDeck(Card.LOCOMOTIVE, 14);
    }

    private void fillDeck(Card card, int count){
        for (int i = 0; i<count; i++){
            deck.add(card);
        }
    }

    public void deckDisplay(){
        for (Card card: deck){
            System.out.println(card);
        }
    }

    public void deckShuffle(){
        Collections.shuffle(deck);
    }

    public Card getCard(){
        Card card = deck.get(0);
        deck.remove(0);
        // todo check emptiness
        return card;
    }
}
