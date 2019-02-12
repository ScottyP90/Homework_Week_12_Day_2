import Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    
    Playground playground;
    Visitor visitor;
    
    @Before

    public void setup() {
        visitor = new Visitor("Max", 6, 50, 5);
        playground = new Playground("The Pen", 2);
    }

    @Test
    public void canVisitorEnterThePlayground() {
        assertEquals(true, playground.isAllowedTo(visitor));
    }
}
