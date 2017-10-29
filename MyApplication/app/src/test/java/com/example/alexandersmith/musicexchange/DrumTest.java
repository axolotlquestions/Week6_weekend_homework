package com.example.alexandersmith.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandersmith on 29/10/2017.
 */
public class DrumTest {

    Drum drum;

    @Before
    public void setUp() throws Exception {
        drum = new Drum("Black", FamilyType.PERCUSSION, 25, 35, "Bass");
    }

    @Test
    public void getType() throws Exception {
        assertEquals("Bass", drum.getType());
    }

    @Test
    public void play() throws Exception {
        assertEquals("parumpapumppump", drum.play());
    }

    @Test
    public void calculateMarkup() throws Exception {
        assertEquals(10, drum.calculateMarkup());
    }

    @Test
    public void getColour() throws Exception {
        assertEquals("Black", drum.getColour());
    }

    @Test
    public void getFamily() throws Exception {
        assertEquals(FamilyType.PERCUSSION, drum.getFamily());
    }

    @Test
    public void getBuyPrice() throws Exception {
        assertEquals(25, drum.getBuyPrice());
    }

    @Test
    public void getSellPrice() throws Exception {
        assertEquals(35, drum.getSellPrice());
    }

}