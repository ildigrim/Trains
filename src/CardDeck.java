import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

    private final List <Card> deck = new ArrayList<>();  //колода карт

    public CardDeck (){
        createDeck();
        deckShuffle();
    }

    public void createDeck (){                //створення колоди для гри
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

    private void fillDeck(Card card, int count){   //влкадання в колоду карт одного кольору
        for (int i = 0; i<count; i++){
            deck.add(card);
        }
    }

    public void addToDeck(List<Card> cardsList){ //оновити колоду з відбою
        deck.addAll(cardsList);
    }

    public void deckDisplay(){                        // відображення колоди
        for (Card card: deck){
            System.out.println(card);
        }
    }

    public void deckShuffle(){
        Collections.shuffle(deck);
    }      //тасування колоди

    public boolean isDeckEmpty(){
        return deck.isEmpty();
    }


    public Card getCard(){                                      // витягування карти з колоди
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }
}
