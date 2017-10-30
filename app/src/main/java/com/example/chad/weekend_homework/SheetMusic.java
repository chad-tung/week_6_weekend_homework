package com.example.chad.weekend_homework;

import com.example.chad.weekend_homework.Behaviours.Sellable;

/**
 * Created by chad on 30/10/2017.
 */

public class SheetMusic implements Sellable {
    String songName;
    double buyPrice;
    double sellPrice;

    public SheetMusic(String songName, double buyPrice, double sellPrice) {
        this.songName = songName;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getSongName() {
        return songName;
    }

    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public String getDescription() {
        return "It's sheet music for " + getSongName();
    }


}
