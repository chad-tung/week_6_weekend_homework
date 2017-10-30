package com.example.chad.weekend_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chad on 30/10/2017.
 */

public class TestSheetMusic {
    SheetMusic pianoSheets;

    @Before
    public void before() {
        pianoSheets = new SheetMusic("Moonlight Sonata", 1.50, 4.00);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2.50, pianoSheets.calculateMarkup(), 0.1);
    }

    @Test
    public void canGetName() {
        assertEquals("Moonlight Sonata", pianoSheets.getSongName());
    }
}
