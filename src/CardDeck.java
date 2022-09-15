import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum Card {pinc, white, blue, yellow, orange, black, red, green, locomotive}

public class CardDeck {
    public static List <Card> deck = new ArrayList<>();

    public static void CreateDeck (){
        for (int i = 0; i<12; i++) {
            addCard(Card.pinc);
            addCard(Card.white);
            addCard(Card.blue);
            addCard(Card.yellow);
            addCard(Card.orange);
            addCard(Card.black);
            addCard(Card.red);
            addCard(Card.green);
            addCard(Card.locomotive);
        }
        addCard(Card.locomotive);
        addCard(Card.locomotive);
    }

    static void addCard(Card card){
        deck.add(card);
    }

    static void deckDisplay(){
        for (Card card: deck){
            System.out.println(card);
        }
    }

    static void deckShuffle(){
        Collections.shuffle(deck);
    }
}
