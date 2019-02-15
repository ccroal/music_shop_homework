import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before (){
        guitar = new Guitar(InstrumentType.STRING, "Gibson", "wood", "black", 100, 125, 6);
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(100, guitar.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(125, guitar.getSellPrice());
    }

    @Test
    public void canChangeBuyPrice(){
        guitar.setBuyPrice(90);
        assertEquals(90, guitar.getBuyPrice());
    }

    @Test
    public void canChangeSellPrice() {
        guitar.setSellPrice(150);
        assertEquals(150, guitar.getSellPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("play", guitar.play());
    }


    @Test
    public void canCalculateMarkup() {
        assertEquals(25, guitar.calculateMarkup());
    }
}
