package com.example.chad.weekend_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chad on 30/10/2017.
 */

public class TestGuitar {
    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Ibanez", "Lacquered wood", 380, 600, "Black", 6, "Nylon");
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("You play the instrument: Your power chords are a little bit off...", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(220, guitar.calculateMarkup(), 0.1);
    }

    @Test
    public void canGetStringType() {
        assertEquals("Nylon", guitar.getStringType());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canGetNumStrings() {
        assertEquals(6, guitar.getNumStrings());
    }
}
