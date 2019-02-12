import Stalls.TobaccoStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setUp() {
        visitor = new Visitor("Rony",39 ,150, 50.00);
        tobaccoStall = new TobaccoStall("Pete's Smokes", "Pete",4, 1);
    }

    @Test
    public void canBuyFromTobaccoStall() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }
}
