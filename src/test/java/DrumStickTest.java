import Accessories.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumstick;

    @Before
    public void before(){
        drumstick = new DrumStick("drum stick", 10, 15);
    }

    @Test
    public void hasType() {
        assertEquals("drum stick", drumstick.getItem());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(10, drumstick.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(15, drumstick.getSellPrice());
    }

    @Test
    public void canSetBuyPrice() {
        drumstick.setBuyPrice(20);
        assertEquals(20, drumstick.getBuyPrice());
    }

    @Test
    public void canSetSellPrice() {
        drumstick.setSellPrice(20);
        assertEquals(20, drumstick.getSellPrice());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5, drumstick.calculateMarkup());
    }
}
