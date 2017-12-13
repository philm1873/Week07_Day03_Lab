package players;

public class Healer extends Player{
    
    int potions;

    public Healer(String name, int health, int potions) {
        super(name, health);
        this.potions = potions;
    }

    public void reducePotions(){
        this.potions--;
    }
    
    public int heal(){
        reducePotions();
        return 50;
    }

    public int getPotions() {
        return potions;
    }
}
