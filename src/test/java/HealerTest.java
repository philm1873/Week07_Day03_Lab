import org.junit.Before;
import org.junit.Test;
import players.Healer;

import static org.junit.Assert.assertEquals;

public class HealerTest {

    Healer testHealer;

    @Before
    public void before(){
        testHealer = new Healer("Alchemist", 1000, 10);
    }

    @Test
    public void canHeal() {
        assertEquals(50, testHealer.heal());
        assertEquals(9, testHealer.getPotions());
    }

}
