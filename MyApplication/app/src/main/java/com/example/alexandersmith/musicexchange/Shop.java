package com.example.alexandersmith.musicexchange;

import java.util.ArrayList;

/**
 * Created by alexandersmith on 29/10/2017.
 */

public class Shop {

    private ArrayList<Sellable> stock;

    public Shop(){
        this.stock = new ArrayList<Sellable>();
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public void add(Sellable sellable){
        stock.add(sellable);
    }

    public void remove(Sellable sellable){
        stock.remove(sellable);
    }

    public int totalProfit(){
        int profit = 0;
        for (Sellable item : stock){
            profit += item.calculateMarkup();
        }
        return profit;
    }
}

