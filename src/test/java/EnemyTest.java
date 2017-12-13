import org.junit.Before;
import org.junit.Test;
import rooms.Enemy;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Enemy testEnemy;

    @Before
    public void before() {
        testEnemy = new Enemy("Troll", 1000, 150);
    }

    @Test
    public void canTakeDamage() {
        testEnemy.takeDamage(50);
        assertEquals(950, testEnemy.getHealth());
    }
}
