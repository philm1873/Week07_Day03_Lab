package rooms;

public class Enemy {

    private String type;
    private int health;
    private int strength;

    public Enemy(String type, int health, int strength){
        this.type = type;
        this.health = health;
        this.strength = strength;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public void takeDamage(int value) {
        this.health -= value;
    }
}
