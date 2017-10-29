package com.example.alexandersmith.musicexchange;

/**
 * Created by alexandersmith on 29/10/2017.
 */

public class Guitar extends Instruments implements Playable, Sellable {

    private int strings;
    private String type;

    public Guitar(String colour, FamilyType family, int buyPrice, int sellPrice, int strings, String type) {
        super(colour, family, buyPrice, sellPrice);
        this.strings = strings;
        this.type = type;
    }

    public int getStrings() {
        return strings;
    }

    public String getType() {
        return type;
    }

    public String play (){
        return "strum";
    }

    public int calculateMarkup() {
        return getSellPrice() - getBuyPrice();
    }
}
