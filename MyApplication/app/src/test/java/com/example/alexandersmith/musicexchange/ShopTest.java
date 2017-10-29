package com.example.alexandersmith.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexandersmith on 29/10/2017.
 */
public class ShopTest {

    Shop shop;
    Piano piano;
    Guitar guitar;


    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Red", FamilyType.STRINGED, 25, 50, 6, "electric");
        piano = new Piano("Black", FamilyType.KEYBOARD, 100, 200, "Upright");
        shop = new Shop();
    }

    @Test
    public void testAdd() throws Exception {
        shop.add(piano);
        assertEquals(1, shop.getStock().size());

    }

    @Test
    public void TestRemove() throws Exception {
        shop.add(piano);
        shop.add(guitar);
        shop.remove(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void testTotalProfit(){
        shop.add(piano);
        shop.add(guitar);
        assertEquals(125, shop.totalProfit());
    }

}