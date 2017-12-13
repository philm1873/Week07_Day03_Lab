package rooms;

import players.Healer;
import players.IAttack;

import java.util.ArrayList;

public abstract class Room {

    ArrayList<IAttack> attackers;
    Healer healer;
    boolean completed;

    public Room(){
        this.attackers = new ArrayList<IAttack>();
        this.healer = null;
        this.completed = false;
    }

    public ArrayList<IAttack> getAttackers() {
        return attackers;
    }

    public void setAttackers(ArrayList<IAttack> attackers) {
        this.attackers = attackers;
    }

    public Healer getHealer() {
        return healer;
    }

    public void setHealer(Healer healer) {
        this.healer = healer;
    }

    public void setCompleted() {
        this.completed = true;
    }
}
