package com.example.alexandersmith.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandersmith on 29/10/2017.
 */
public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp() throws Exception {
        saxophone = new Saxophone("Gold", FamilyType.WOODWIND, 35, 65, "Alto");
    }

    @Test
    public void getType() throws Exception {
        assertEquals("Alto", saxophone.getType());
    }

    @Test
    public void play() throws Exception {
        assertEquals("Sax-a-ma-phone", saxophone.play());
    }

    @Test
    public void calculateMarkup() throws Exception {
        assertEquals(30, saxophone.calculateMarkup());
    }

    @Test
    public void getColour() throws Exception {
        assertEquals("Gold", saxophone.getColour());
    }

    @Test
    public void getFamily() throws Exception {
        assertEquals(FamilyType.WOODWIND, saxophone.getFamily());
    }

    @Test
    public void getBuyPrice() throws Exception {
        assertEquals(35, saxophone.getBuyPrice());
    }

    @Test
    public void getSellPrice() throws Exception {
        assertEquals(65, saxophone.getSellPrice());
    }

}