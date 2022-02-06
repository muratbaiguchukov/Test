package com.company.task1.model;

public class Ticket {
    private int id;
    private String plase;
    private String departure;
    private String arrival;
    private Flight flight;

    public Ticket(int id, String plase, String departure, String arrival, Flight flight) {
        this.id = id;
        this.plase = plase;
        this.departure = departure;
        this.arrival = arrival;
        this.flight = flight;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlase() {
        return plase;
    }

    public void setPlase(String plase) {
        this.plase = plase;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id='" + id + '\'' +
                ", plase=" + plase + '\'' +
                ", departure=" + departure + '\'' +
                ", arrival=" + arrival + '\'' +
                ", flight=" + flight + '\'' +'}';

    }
}
