package Instruments;

import Interfaces.ISell;
import Interfaces.Iplay;

public class Guitar extends Instrument implements Iplay, ISell {

    private int numberOfStrings;

    public Guitar(InstrumentType instrumentType, String item, String material, String colour, int buyPrice, int sellPrice, int numberOfStrings) {
        super(instrumentType, item, material, colour, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "play";
    }

    public int calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }
}
