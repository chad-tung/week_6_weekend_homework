package com.example.chad.weekend_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chad on 30/10/2017.
 */

public class TestFlute {
    Flute flute;

    @Before
    public void before() {
        flute = new Flute("Pokeflute", "wood and brass", 2000, 3600, "red and white");

    }

    @Test
    public void canPlayFlute() {
        assertEquals("You play the instrument: Toot toot to-to-toot. Snorlax is still asleep.", flute.play());
    }
}
