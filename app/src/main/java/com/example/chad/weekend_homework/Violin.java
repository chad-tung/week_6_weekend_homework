package com.example.chad.weekend_homework;

/**
 * Created by chad on 27/10/2017.
 */

public class Violin extends Instrument {

    private int numStrings;

    public Violin(String model, double buyPrice, double sellPrice, String colour, int numStrings) {
        super("String", model, "wood", buyPrice, sellPrice, colour);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public String play() {
        return super.play() + "Do re mi fah la ti mi... Sounds like I'm strangling a cat...";
    }

    public String getDescription() {
        return super.getDescription() + "violin";
    }
}
