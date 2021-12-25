package com.company;

public class Pizza {

    public String grade;
    public double prise;
    public double weight;
    public int ID;
    public String recipe;

    public void cookPizza(String grade, int ID) { //метод "готовить"

        System.out.println("Готовится пицца № " +  ID);
    }

    public void deliverPizza(String grade, double weight, double prise, String recipe) { //метод "доставлять"
        System.out.println("String grade " + " " + "double weight" + " " + "double prise" + " " + "String recipe");
    }
}
