package com.example.chad.weekend_homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chad on 30/10/2017.
 */

public class TestDrumkit {
    DrumKit drums;

    @Before()
    public void before() {
        drums = new DrumKit("Pearl", 400, 800, "Blue");
    }

    @Test
    public void canGetMaterials() {
        assertEquals("Synthetic", drums.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Percussion", drums.getType());
    }

    @Test
    public void canPlayDrums() {
        assertEquals("You play the instrument: Ba-dum-bum-tss.", drums.play());
    }
}
