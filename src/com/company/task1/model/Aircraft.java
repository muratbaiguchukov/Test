package com.company.task1.model;

public class Aircraft {
    protected int id;
    protected String model;

    public Aircraft(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Aircraft{" + "id='" + id + '\'' +
                ", model=" + model + '\'' + '}';

    }
}
