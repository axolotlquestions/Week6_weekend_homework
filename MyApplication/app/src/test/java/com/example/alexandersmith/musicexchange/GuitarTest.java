package com.example.alexandersmith.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alexandersmith on 29/10/2017.
 */

public class GuitarTest {


    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Red", FamilyType.STRINGED, 25, 50, 6, "electric");
    }

    @Test
    public void getStrings() throws Exception {
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void getType() throws Exception {
        assertEquals("electric", guitar.getType());
    }

    @Test
    public void play() throws Exception {
        assertEquals("strum", guitar.play());
    }

    @Test
    public void calculateMarkup() throws Exception {
        assertEquals(25, guitar.calculateMarkup());
    }

    @Test
    public void getColour() throws Exception {
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void getFamily() throws Exception {
        assertEquals(FamilyType.STRINGED, guitar.getFamily());
    }

    @Test
    public void getBuyPrice() throws Exception {
        assertEquals(25, guitar.getBuyPrice());
    }

    @Test
    public void getSellPrice() throws Exception {
        assertEquals(50, guitar.getSellPrice());
    }


}
