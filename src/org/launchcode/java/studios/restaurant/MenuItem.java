package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;

public class MenuItem {
   private String name;
   private double price;
   private String description;
   private String category;
   private boolean newItem;

    MenuItem (String name, double price, String description, String category, boolean newItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = true;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public String getCategory() {

        return this.category;
    }

    public boolean getNewItem() {

        return this.newItem;
    }
}
