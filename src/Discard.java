import java.util.ArrayList;
import java.util.List;

public class Discard {

    private final List<Card> cards = new ArrayList<>();   //відбій

    public void addCard(Card card){
        cards.add(card);
    }   //покласти карту у відбій

    public List<Card> getCards(){
        return cards;
    }


}
