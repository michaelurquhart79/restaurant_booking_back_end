package com.codeclan.finalProject.RestaurantBooking.models;

public class Booking {

    private Long id;

    private String date;

    private String time;

    private int partySize;

    private String comments;

    public Booking(String date, String time, int partySize, String comments) {
        this.date = date;
        this.time = time;
        this.partySize = partySize;
        this.comments = comments;
    }

    public Booking() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
