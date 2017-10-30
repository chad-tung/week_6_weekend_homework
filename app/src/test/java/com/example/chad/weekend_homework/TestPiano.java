package com.example.chad.weekend_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chad on 29/10/2017.
 */

public class TestPiano {
    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Steinway Model A", 15000, 26000, "mahogany", "grand", 88);
    }

    @Test
    public void canGetModel() {
        assertEquals("Steinway Model A", piano.getModel());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(11000, piano.calculateMarkup(), 0.1);
    }

    @Test
    public void canGetSize() {
        assertEquals("grand", piano.getSize());
    }

    @Test
    public void canGetColour() {
        assertEquals("mahogany", piano.getColour());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void canPlayPiano() {
        assertEquals("You play the instrument: Do re mi fah la ti mi... Damn, I'm out of practice...", piano.play());
    }

    @Test public void canGetNumKeys() {
        assertEquals(88, piano.getNumKeys());
    }

    @Test
    public void hasPercussionType() {
        assertEquals("Percussion", piano.getType());
    }

    @Test
    public void canGetDescription() {
        assertEquals("It's a mahogany Steinway Model A grand piano", piano.getDescription());
    }

}
