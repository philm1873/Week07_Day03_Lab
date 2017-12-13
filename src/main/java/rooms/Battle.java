package rooms;

import players.Fighter;
import players.IAttack;

public class Battle extends Room{

    Enemy enemy;

    public Battle(Enemy inputEnemy){
        super();
        this.enemy = inputEnemy;
    }


    public void findDead() {
        IAttack dead = null;
        for (IAttack attacker : attackers){
            if (attacker.checkDead()) {
                dead = attacker;
            }
        } attackers.remove(dead);
    }

    public void findDeadHealer() {
        if (healer.checkDead()){
            healer = null;
        }
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void findDeadEnemy() {
        if (enemy.checkDead()){
            enemy = null;
        }
    }
}
