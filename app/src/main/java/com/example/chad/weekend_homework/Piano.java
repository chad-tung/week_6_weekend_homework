package com.example.chad.weekend_homework;

import com.example.chad.weekend_homework.Behaviours.Sellable;

/**
 * Created by chad on 27/10/2017.
 */

public class Piano extends Instrument {

    private int numKeys;
    private String size;

    public Piano(String model, double buyPrice, double sellPrice, String colour, String size, int numKeys) {
        super("Percussion", model, "Wood", buyPrice, sellPrice, colour);
        this.size = size;
        this.numKeys = numKeys;
    }

    public int getNumKeys() {
        return numKeys;
    }

    public String play() {
        return super.play() + "Do re mi fah la ti mi... Damn, I'm out of practice...";
    }

    public String getSize() {
        return size;
    }

    public String getDescription() {
        return super.getDescription() + this.size + " piano";
    }

}
