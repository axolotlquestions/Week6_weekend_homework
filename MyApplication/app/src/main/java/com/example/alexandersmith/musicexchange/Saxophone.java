package com.example.alexandersmith.musicexchange;

/**
 * Created by alexandersmith on 29/10/2017.
 */

public class Saxophone extends Instruments implements Playable, Sellable{

    private String type;

    public Saxophone(String colour, FamilyType family, int buyPrice, int sellPrice, String type) {
        super(colour, family, buyPrice, sellPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String play(){
        return "Sax-a-ma-phone";
    }

    public int calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }

}
