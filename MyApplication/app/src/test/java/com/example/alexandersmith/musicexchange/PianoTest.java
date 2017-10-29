package com.example.alexandersmith.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandersmith on 29/10/2017.
 */
public class PianoTest {
    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Black", FamilyType.KEYBOARD, 100, 200, "Upright");
    }

    @Test
    public void getType() throws Exception {
        assertEquals("Upright", piano.getType());
    }

    @Test
    public void play() throws Exception {
        assertEquals("plinkety plink", piano.play());
    }

    @Test
    public void calculateMarkup() throws Exception {
        assertEquals(100, piano.calculateMarkup());
    }

    @Test
    public void getColour() throws Exception {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void getFamily() throws Exception {
        assertEquals(FamilyType.KEYBOARD, piano.getFamily());
    }

    @Test
    public void getBuyPrice() throws Exception {
        assertEquals(100, piano.getBuyPrice());
    }

    @Test
    public void getSellPrice() throws Exception {
        assertEquals(200, piano.getSellPrice());
    }

}