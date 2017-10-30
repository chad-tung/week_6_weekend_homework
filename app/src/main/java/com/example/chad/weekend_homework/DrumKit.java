package com.example.chad.weekend_homework;

/**
 * Created by chad on 27/10/2017.
 */

public class DrumKit extends Instrument {
    public DrumKit(String model, double buyPrice, double sellPrice, String colour) {
        super("Percussion", model, "Synthetic", buyPrice, sellPrice, colour);
    }

    public String play() {
        return super.play() + "Ba-dum-bum-tss.";
    }

    public String getDescription() {
        return super.getDescription() + "drumkit";
    }
}
