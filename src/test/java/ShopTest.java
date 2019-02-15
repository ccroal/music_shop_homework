import Accessories.DrumStick;
import Accessories.SheetMusic;
import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {


    Guitar guitar;
    DrumStick drumStick;
    SheetMusic sheetMusic;
    Shop shop;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentType.STRING, "Gibson","wood", "black", 100, 125, 6);

        drumStick = new DrumStick("drum stick", 10, 15);

        sheetMusic = new SheetMusic("sheet music", 5, 7);

        shop = new Shop("Music Shop");
        shop.addStock(guitar);
        shop.addStock(drumStick);
        shop.addStock(drumStick);
        shop.addStock(sheetMusic);

    }

    @Test
    public void hasName() {
        assertEquals("Music Shop", shop.getName());
    }

    @Test
    public void canAddStock(){
        assertEquals(4, shop.countTotalStock());
    }

    @Test
    public void canFindItem() {
        assertEquals(guitar, shop.removeStock(guitar));
    }

    @Test
    public void canCalculateTotalProfit(){
        assertEquals(37, shop.calculateTotalMarkup());
    }
}
