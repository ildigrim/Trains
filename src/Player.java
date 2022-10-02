import java.util.ArrayList;
import java.util.List;

public class Player {

    private final List<Card> cards;                       //список карт на руці в гравця
    private final String name;
    private final PlayersColors color;

    Player(List<Card> cards, String name, PlayersColors color){
        this.cards = cards;
        this.name = name;
        this.color = color;
    }

    public PlayersColors getColor() {

        return color;
    }

    public List<Card> getCards() {
        return cards;
    }

    public String getName() {
        return name;
    }

}
