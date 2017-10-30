package com.example.chad.weekend_homework;

/**
 * Created by chad on 27/10/2017.
 */

public class Cello extends Instrument {
    public Cello(String model, double buyPrice, double sellPrice, String colour) {
        super("String", model, "Wood", buyPrice, sellPrice, colour);
    }

    public String play() {
        return super.play() + "Ahhh, what a lovely sounding instrument.";
    }

    public String getDescription() {
        return super.getDescription() + "cello.";
    }
}
