import org.junit.Before;
import org.junit.Test;
import players.DefenceType;
import players.Fighter;
import players.WeaponType;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter testFighter;

    @Before
    public void before() {
        testFighter = new Fighter("Knight", 600, WeaponType.SWORD, DefenceType.ARMOUR);
    }

    @Test
    public void canAttack() {
        assertEquals(50, testFighter.attack());
    }

    @Test
    public void canTakeDamage(){
        testFighter.takeDamage(100);
        assertEquals(550, testFighter.getHealth());
    }
}
