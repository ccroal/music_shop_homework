package Accessories;

import Interfaces.ISell;

public class SheetMusic extends Accessories implements ISell {

    public SheetMusic(String item, int buyPrice, int sellPrice) {
        super(item, buyPrice, sellPrice);
    }

    public int calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }
}
