import org.junit.Before;
import org.junit.Test;
import players.*;
import rooms.Battle;
import rooms.Enemy;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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
        testBattle.setAttackers(testAttackers);
        testBattle.setHealer(testHealer);
    }

//    @Test
//    public void roomStartsEmpty() {
//        assertEquals(null, testBattle.getHealer());
//        ArrayList<IAttack> test = new ArrayList<>();
//        assertEquals(test, testBattle.getAttackers());
//    }

    @Test
    public void canPopulateRoom() {
        assertEquals(testAttackers, testBattle.getAttackers());
        assertEquals(testHealer, testBattle.getHealer());
    }

    @Test
    public void wontKillAttacker(){
        testAttackers.get(1).takeDamage(500);
        testBattle.findDead();
        assertEquals(2, testAttackers.size());
    }

    @Test
    public void canKillAttacker(){
        testAttackers.get(1).takeDamage(1000);
        testBattle.findDead();
        assertEquals(1, testAttackers.size());
    }

    @Test
    public void canKillHealer(){
        testHealer.takeDamage(500);
        testBattle.findDeadHealer();
        assertEquals(null, testBattle.getHealer());
    }

    @Test
    public void canKillEnemy(){
        testEnemy.takeDamage(1001);
        testBattle.findDeadEnemy();
        assertEquals(null, testBattle.getEnemy());
    }





}