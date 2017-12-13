package rooms;

public class Treasure extends Room {
    private int treasure;

    public Treasure(int inputTreasure) {
        super();
        this.treasure = inputTreasure;
    }

    public int getTreasure() {
        return treasure;
    }
}
