package com.example.chad.weekend_homework;

import com.example.chad.weekend_homework.Behaviours.Sellable;

import java.util.ArrayList;

/**
 * Created by chad on 30/10/2017.
 */

public class Shop {
    ArrayList<Sellable> stock;

    public Shop(ArrayList<Sellable> stock) {
        this.stock = stock;
    }

    public void removeStock(Sellable item) {
        stock.remove(item);
    }

    public void addStock(Sellable item) {
        stock.add(item);
    }

    public double displayStockMargins() {
        double margin = 0;
        for (Sellable item : stock) {
            margin += item.calculateMarkup();
        }
        return margin;
    }

    public String displayStock() {
        String stockItems = "";
        for (Sellable item : stock) {
            stockItems += (item.getDescription() + ", ");
        }
        return stockItems;
    }
}
