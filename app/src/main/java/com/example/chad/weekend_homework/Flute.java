package com.example.chad.weekend_homework;

/**
 * Created by chad on 27/10/2017.
 */

public class Flute extends Instrument {

    public Flute(String model, String material, double buyPrice, double sellPrice, String colour) {
        super("Woodwind", model, material, buyPrice, sellPrice, colour);
    }

    public String play() {
        return super.play() + "Toot toot to-to-toot. Snorlax is still asleep.";
    }

    public String getDescription() {
        return super.getDescription() + "flute";
    }
}
