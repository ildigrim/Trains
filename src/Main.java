import java.util.stream.Collectors;

public class Main {
    public static void showPlayer(Player player){
        System.out.println("Name: " + player.getName());
        System.out.println("Color: " + player.getColor());

        System.out.println("Cards: " + String.join(", ", player.getCards().stream().map(Enum::toString).collect(Collectors.joining())));
    }
    public static void main(String[] args) {
        Game game = new Game(2);

        game.getPlayers().forEach(Main::showPlayer);

        System.out.println("Table:");
        game.getTable().getCards().forEach(System.out::println);

    }

}

