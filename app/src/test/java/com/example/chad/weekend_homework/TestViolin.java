package com.example.chad.weekend_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chad on 30/10/2017.
 */

public class TestViolin {
    Violin violin;

    @Before
    public void before() {
        violin = new Violin("Stradivarius", 200000, 450000, "Oak", 4);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(250000, violin.calculateMarkup(), 0.1);
    }

    @Test
    public void hasStringType() {
        assertEquals("String", violin.getType());
    }

    @Test
    public void hasWoodMaterial() {
        assertEquals("wood", violin.getMaterial());
    }

    @Test
    public void canPlayInstrument() {
        assertEquals("You play the instrument: Do re mi fah la ti mi... Sounds like I'm strangling a cat...", violin.play());
    }

    @Test
    public void canGetNumStrings() {
        assertEquals(4, violin.getNumStrings());
    }
}
