import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<Card> cards = new ArrayList<>();       //карти на столі

    public List<Card> getCards (){return cards;}

    public void addCard(Card card){
        cards.add(card);
    }       //покласти карту на стіл

    public boolean hasThreeLocomotives(){                     //перевірка на три локомотиви
        int i = 0;
        for(Card card: cards){
            if (card.equals(Card.LOCOMOTIVE)){
                i++;
            }
        }
        return i>3;
    }

    public Card getCard(int index){                          //взяти карту зі столу
        Card card = cards.get(index);
        cards.remove(index);
        return card;
    }

}
