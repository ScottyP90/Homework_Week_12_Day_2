import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttractionsTest {

    Dodgems dodgems;

    @Before
    public void setUp() {
        dodgems = new Dodgems("Dode them Dodgems", 3);
    }

    @Test
    public void canGetName() {
        assertEquals("Dode them Dodgems", dodgems.getName());
    }
}
