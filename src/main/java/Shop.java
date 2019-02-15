import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    String name;
    ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }


    public ArrayList<ISell> getStock() {
        return stock;
    }



    public void addStock(ISell stockItem){
        this.stock.add(stockItem);
    }

    public ISell removeStock(ISell item){
        int index = this.stock.indexOf(item);
        return this.stock.remove(index);
    }


    public int countTotalStock() {
        return this.stock.size();
    }

    public int calculateTotalMarkup() {
        int potentialProfit = 0;
        for(ISell stockItem : this.stock) {
            int markup = stockItem.calculateMarkup();
            potentialProfit += markup;
        }
        return potentialProfit;
    }
}
