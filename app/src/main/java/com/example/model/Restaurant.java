package com.example.model;

public class Restaurant {
    private String name;
    private String address;
    private boolean deliver;
    private boolean takeaway;
    private boolean dinein;

    public Restaurant(String name, String address, boolean deliver, boolean takeaway, boolean dinein) {
        this.name = name;
        this.address = address;
        this.dinein = dinein;
        this.takeaway = takeaway;
        this.deliver = deliver;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDeliver() {
        return deliver;
    }

    public void setDeliver(boolean deliver) {
        this.deliver = deliver;
    }

    public boolean isTakeaway() {
        return takeaway;
    }

    public void setTakeaway(boolean takeaway) {
        this.takeaway = takeaway;
    }

    public boolean isDivein() {
        return dinein;
    }

    public void setDivein(boolean divein) {
        this.dinein = divein;
    }


    @Override
    public String toString() {
        return name + " - " + address + " [Delivery: " + deliver + ", Takeaway: " + takeaway + ", Dine-in: " + dinein + "]";
    }

}