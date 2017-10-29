package com.example.alexandersmith.musicexchange;

/**
 * Created by alexandersmith on 29/10/2017.
 */

public class SheetMusic implements Sellable {

    private String description;
    private int buyPrice;
    private int sellPrice;

    public SheetMusic(String description, int buyPrice, int sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
