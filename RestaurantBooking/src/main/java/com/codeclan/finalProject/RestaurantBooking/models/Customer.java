package com.codeclan.finalProject.RestaurantBooking.models;

public class Customer {

    private String name;
    private String contact;
    private int noOfVisits;

    public Customer(String name, String contact) {
        this.name = name;
        this.contact = contact;
        this.noOfVisits = 0;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getNoOfVisits() {
        return noOfVisits;
    }

    public void setNoOfVisits(int noOfVisits) {
        this.noOfVisits = noOfVisits;
    }
}
