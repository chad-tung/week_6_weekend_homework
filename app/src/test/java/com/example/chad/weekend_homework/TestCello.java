package com.example.chad.weekend_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chad on 30/10/2017.
 */

public class TestCello {
    Cello cello;
    @Before
    public void before() {
        cello = new Cello("Yamaha", 100, 180, "Brown");
    }

    @Test
    public void testMaterial() {
        assertEquals("Wood", cello.getMaterial());
    }

    @Test
    public void testType() {
        assertEquals("String", cello.getType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(80, cello.calculateMarkup(), 0.1);
    }

    @Test
    public void canPlayCello() {
        assertEquals("You play the instrument: Ahhh, what a lovely sounding instrument.", cello.play());
    }
}
