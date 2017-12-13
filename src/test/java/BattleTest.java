import org.junit.Before;
import org.junit.Test;
import players.*;
import rooms.Battle;
import rooms.Enemy;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BattleTest {

    Battle testBattle;
    Enemy testEnemy;
    Magic testMagic;
    Fighter testFighter;
    Healer testHealer;
    ArrayList<IAttack> testAttackers;


    @Before
    public void before(){
        testEnemy = new Enemy("Troll", 1000, 150);
        testBattle = new Battle(testEnemy);
        testMagic = new Magic("Wizard", 500, SpellType.HYDRA, CreatureType.OGRE);
        testFighter = new Fighter("Barbarian",900, WeaponType.CLUB, DefenceType.LEATHER);
        testHealer = new Healer("Cleric", 300, 10);
        testAttackers = new ArrayList<>(Arrays.asList(testMagic,testFighter));
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(null, testBattle.getHealer());
        ArrayList<IAttack> test = new ArrayList<>();
        assertEquals(test, testBattle.getAttackers());
    }



}