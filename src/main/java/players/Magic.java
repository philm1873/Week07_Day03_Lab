package players;

public class Magic extends Player {
    SpellType spell;
    CreatureType creature;

    public Magic(String name, int health, SpellType spell, CreatureType creature) {
        super(name, health);
        this.spell = spell;
        this.creature = creature;
    }

    public int attack() {
        return spell.getValue();
    }

    public void takeDamage(int value) {
        this.health -= value - this.creature.getValue();
    }


    public void takePotion(int value) {
        this.health += value;
    }
}
