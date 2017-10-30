package com.example.chad.weekend_homework;

import com.example.chad.weekend_homework.Behaviours.Playable;
import com.example.chad.weekend_homework.Behaviours.Sellable;

/**
 * Created by chad on 27/10/2017.
 */

public abstract class Instrument implements Playable, Sellable {

    private final String type;
    private String model;
    private String material;
    private double buyPrice;
    private double sellPrice;
    private String colour;

    public Instrument(String type, String model, String material, double buyPrice, double sellPrice, String colour) {
        this.type = type;
        this.model = model;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.colour = colour;
    }

    public String play() {
        return "You play the instrument: ";
    }

    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public void setPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return "It's a " + getColour() + " " + getModel() + " ";
    }
}
