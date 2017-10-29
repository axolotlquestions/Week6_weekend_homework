package com.example.alexandersmith.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandersmith on 29/10/2017.
 */
public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("sheets of music", 2, 5);
    }

    @Test
    public void getDescription() throws Exception {
        assertEquals("sheets of music", sheetMusic.getDescription());
    }

    @Test
    public void getBuyPrice() throws Exception {
        assertEquals(2, sheetMusic.getBuyPrice());
    }

    @Test
    public void getSellPrice() throws Exception {
        assertEquals(5, sheetMusic.getSellPrice());
    }

    @Test
    public void calculateMarkup() throws Exception {
        assertEquals(3, sheetMusic.calculateMarkup());
    }

}