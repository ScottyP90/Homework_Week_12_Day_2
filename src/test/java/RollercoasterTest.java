import Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        visitor = new Visitor("Scotty",26 ,150, 50.00);
        rollercoaster = new Rollercoaster("Sky Slayer", 9);
    }

    @Test
    public void canRideRollercoaster() {
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }
}
