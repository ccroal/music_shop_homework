package Instruments;

import Interfaces.ISell;
import Interfaces.Iplay;

public class Trumpet extends Instrument implements Iplay, ISell {

    private int numberOfValves;

    public Trumpet(InstrumentType instrumentType, String item, String material, String colour, int buyPrice, int sellPrice, int numberOfValves) {
        super(instrumentType, item, material, colour, buyPrice, sellPrice);
        this.numberOfValves = numberOfValves;
    }


    public String play() {
        return "play.";
    }

    public int calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }
}