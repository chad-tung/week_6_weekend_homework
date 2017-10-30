package com.example.chad.weekend_homework;

import com.example.chad.weekend_homework.Behaviours.Sellable;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by chad on 30/10/2017.
 */

public class TestShop {

    Shop shop;
    Piano piano;
    SheetMusic pianoSheets;
    Flute flute;
    Violin violin;
    ArrayList<Sellable> stock;

    @Before
    public void before() {
        violin = new Violin("Stradivarius", 200000, 450000, "Oak", 4);
        piano = new Piano("Steinway Model A", 15000, 26000, "Mahogany", "Grand", 88);
        flute = new Flute("Pokeflute", "wood and brass", 2000, 3600, "red and white");
        pianoSheets = new SheetMusic("Moonlight Sonata", 1.50, 4.00);
        stock = new ArrayList<Sellable>();
        shop = new Shop(stock);
        shop.addStock(piano);
        shop.addStock(violin);
        shop.addStock(pianoSheets);
    }

    @Test
    public void canAddStock() {
        assertEquals(3, stock.size());
        shop.addStock(violin);
        assertEquals(4, stock.size());
    }

    @Test
    public void canDisplayTotalMargins() {
        assertEquals(261002.50, shop.displayStockMargins(), 0.1);
    }

    @Test
    public void canRemoveStock() {
        shop.removeStock(violin);
        assertEquals(2, stock.size());
        assertEquals(11002.50, shop.displayStockMargins(), 0.1);
    }

    @Test
    public void canGetDescriptions() {
        String expected = "It's a Mahogany Steinway Model A Grand piano, It's a Oak Stradivarius violin, It's sheet music for Moonlight Sonata, ";
        assertEquals(expected, shop.displayStock());
    }


}
