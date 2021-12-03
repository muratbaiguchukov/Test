package com.company.introduseOOP;

public class Main {

    public static void main(String[] args) {
        // 2 вида типов данных: примитивные иссылочные
        Kopilka myKopilka = new Kopilka();
        myKopilka.countMoney = 22;
        myKopilka.insertMoney(12);
        myKopilka.insertMoney(20);
        System.out.println(myKopilka.countMoney);



    }
}
