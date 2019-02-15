package Instruments;

public abstract class Instrument {

    private InstrumentType instrumentType;
    private String item;
    private String material;
    private String colour;
    private int buyPrice;
    private int sellPrice;

    public Instrument(InstrumentType instrumentType, String item, String material, String colour, int buyPrice, int sellPrice) {
        this.instrumentType = instrumentType;
        this.item = item;
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getItem() {
        return item;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}

