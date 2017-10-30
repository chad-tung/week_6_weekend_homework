package com.example.chad.weekend_homework;

import com.example.chad.weekend_homework.Behaviours.Playable;
import com.example.chad.weekend_homework.Behaviours.Sellable;

/**
 * Created by chad on 27/10/2017.
 */

public class Guitar extends Instrument {

    int numStrings;
    String stringType;

    public Guitar(String model, String material, double buyPrice, double sellPrice, String colour, int numStrings, String stringType) {
        super("String", model, material, buyPrice, sellPrice, colour);
        this.numStrings = numStrings;
        this.stringType = stringType;
    }

    public String play() {
        return super.play() + "Your power chords are a little bit off...";
    }


    public int getNumStrings() {
        return numStrings;
    }

    public String getStringType() {
        return stringType;
    }

    public String getDescription() {
        return super.getDescription() + "guitar";
    }
}
