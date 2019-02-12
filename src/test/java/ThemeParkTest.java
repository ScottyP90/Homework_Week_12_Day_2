import Attractions.Rollercoaster;
import Stalls.IceCreamStall;
import ThemePark.ThemePark;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Rollercoaster rollercoaster;
    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before

    public void setup() {
        visitor = new Visitor("Scotty",26 ,150, 50.00);
        rollercoaster = new Rollercoaster("Towering Inferno", 7);
        iceCreamStall = new IceCreamStall("Sandy's Ice cream", "Sandy", 1, 5);
        themePark = new ThemePark("Glasgow Fair");
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(rollercoaster);
        assertEquals(1, themePark.countAttractions());
    }

    @Test
    public void canAddStall() {
        themePark.addStall(iceCreamStall);
        assertEquals(1, themePark.countAttractions());
    }

    @Test
    public void canVisitorGetOnRide() {
        themePark.addAttraction(rollercoaster);
        assertEquals("Scotty has visited the Towering Inferno", themePark.visit(visitor,rollercoaster));
    }

    @Test
    public void canVisitorRideAttracion() {
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void canGetReviews() {
        themePark.addAttraction(rollercoaster);
        themePark.addStall(iceCreamStall);
        assertEquals(themePark.getAllReviewed(), themePark.getAllReviewed());
    }
}
