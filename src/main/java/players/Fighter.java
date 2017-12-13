package players;

public class Fighter extends Player {
    WeaponType weapon;
    DefenceType defence;

    public Fighter(String name, int health, WeaponType weapon, DefenceType defence) {
        super(name, health);
        this.weapon = weapon;
        this.defence = defence;
    }

    public int attack() {
        return weapon.getValue();
    }
}
