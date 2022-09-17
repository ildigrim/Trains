import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class CardDeck {
    public List <Card> deck = new ArrayList<>();

    CardDeck (){
        createDeck();
        deckShuffle();
    }

    public void createDeck (){
        for (int i = 0; i<12; i++) {
            addCard(Card.PINC);
            addCard(Card.WHITE);
            addCard(Card.BLUE);
            addCard(Card.YELLOW);
            addCard(Card.ORANGE);
            addCard(Card.BLACK);
            addCard(Card.RED);
            addCard(Card.GREEN);
            addCard(Card.LOCOMOTIVE);
        }
        addCard(Card.LOCOMOTIVE);
        addCard(Card.LOCOMOTIVE);
    }

    private void addCard(Card card){
        deck.add(card);
    }

    public void deckDisplay(){
        for (Card card: deck){
            System.out.println(card);
        }
    }

    public void deckShuffle(){
        Collections.shuffle(deck);
    }

    void cardsOnTable(){

    }
    void cardsToPlayer(){

    }
}
