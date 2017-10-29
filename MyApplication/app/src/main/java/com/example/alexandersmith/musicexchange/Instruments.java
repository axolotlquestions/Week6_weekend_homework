package com.example.alexandersmith.musicexchange;

/**
 * Created by alexandersmith on 29/10/2017.
 */

public abstract class Instruments {
    private String colour;
    private FamilyType family;
    private int buyPrice;
    private int sellPrice;

    public Instruments(String colour, FamilyType family, int buyPrice, int sellPrice) {
        this.colour = colour;
        this.family = family;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public FamilyType getFamily() {
        return family;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
