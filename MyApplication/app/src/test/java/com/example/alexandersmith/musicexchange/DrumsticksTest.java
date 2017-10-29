package com.example.alexandersmith.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandersmith on 29/10/2017.
 */
public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void setUp() throws Exception {
        drumsticks = new Drumsticks("Sticks for drums", 2, 5);
    }

    @Test
    public void getDescription() throws Exception {
        assertEquals("Sticks for drums", drumsticks.getDescription());
    }

    @Test
    public void getBuyPrice() throws Exception {
        assertEquals(2, drumsticks.getBuyPrice());
    }

    @Test
    public void getSellPrice() throws Exception {
        assertEquals(5, drumsticks.getSellPrice());
    }

    @Test
    public void calculateMarkup() throws Exception {
        assertEquals(3, drumsticks.calculateMarkup());
    }

}