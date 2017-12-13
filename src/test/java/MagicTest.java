import org.junit.Before;
import org.junit.Test;
import players.CreatureType;
import players.Magic;
import players.SpellType;

import static org.junit.Assert.assertEquals;

public class MagicTest {

    Magic testMagic;


    @Before
    public void before() {
        testMagic = new Magic("Warlock", 1000, SpellType.BLIZZARD, CreatureType.ELF);
    }

    @Test
    public void canAttack() {
        assertEquals(80, testMagic.attack());
    }

    @Test
    public void canTakeDamage(){
        testMagic.takeDamage(100);
        assertEquals(930, testMagic.getHealth());
    }

    @Test
    public void canTakePotion(){
        testMagic.takePotion(100);
        assertEquals(1100, testMagic.getHealth());
    }
}
