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
}
