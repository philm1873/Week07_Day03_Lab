package players;

public abstract class Player {
    String name;
    int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }
}
