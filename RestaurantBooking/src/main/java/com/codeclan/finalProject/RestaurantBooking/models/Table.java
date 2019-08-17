package com.codeclan.finalProject.RestaurantBooking.models;

public class Table {
    private int capacity;


    public Table(int capacity) {
        this.capacity = capacity;
    }

    public Table() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
