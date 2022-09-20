import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<Card> cards = new ArrayList<>();
    public List<Card> getCards (){return cards;}

    public void addCard(Card card){
        cards.add(card);
    }

    public boolean hasThreeLocomotives(){
        int i = 0;
        for(Card card: cards){
            if (card.equals(Card.LOCOMOTIVE)){
                i++;
            }
        }
        return i>2;
    }

    public Card getCard(int index){
        Card card = cards.get(index);
        cards.remove(index);
        return card;
    }

}
