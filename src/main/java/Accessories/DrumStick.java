package Accessories;

import Interfaces.ISell;

public class DrumStick extends Accessories implements ISell {

    public DrumStick(String item, int buyPrice, int sellPrice) {
        super(item, buyPrice, sellPrice);
    }

    public int calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }

}
