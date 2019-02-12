import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StallTest {

    IceCreamStall iceCreamStall;

    @Before

    public void setup() {
        iceCreamStall = new IceCreamStall("Sandy's Ice Cream", "Sandy", 1, 6);
    }

    @Test
    public void canGetName() {
        assertEquals("Sandy's Ice Cream", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Sandy", iceCreamStall.getOwnersName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(1, iceCreamStall.getParkingSpot());
    }
}
