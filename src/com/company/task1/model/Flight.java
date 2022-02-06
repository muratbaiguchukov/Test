package com.company.task1.model;

public class Flight {
    private int id;
    private String route;
    private String departure;
    private String arrival;
    private String status;
    private Aircraft aircraft;

    public Flight(int id, String route, String departure, String arrival, String status, Aircraft aircraft) {
        this.id = id;
        this.route = route;
        this.departure = departure;
        this.arrival = arrival;
        this.status = status;
        this.aircraft = aircraft;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public String toString() {
        return "Flight{" + "id='" + id + '\'' +
                ", route=" + route + '\'' +
                ", departure=" + departure + '\'' +
                ", arrival=" + arrival + '\'' +
                ", status=" + status + '\'' +
                ", aircraft=" + aircraft + '}';
    }

}
