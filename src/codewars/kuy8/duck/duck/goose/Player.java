package duck.duck.goose;

public class Player {

    String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Player[] makePlayerArr(String[] names) {
        Player[] players = new Player[names.length];
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i]);
        }
        return players;
    }


}
