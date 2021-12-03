package com.company.introduseOOP;

    /**
     * public class "НазваниеКласса" фигурную скобку открыть
     * --------- ТЕЛО КЛАССА или другими словами описывайте свойства и методы эскиза для будущего объекта -----------
     * фигурную скобку открыть
*/
    public class Kopilka {// фигурную скобку открыть
        /**
         * В теле класса мы можем описать свойства(поля) ИЛИ методы класса
         */
        public int countMoney; //Свойство или поле

    public void insertMoney(int money) { //Начало метода1
        countMoney = countMoney + money;
    } // Конец метода1

        public void showMoneyInKopilka() { //Начало метода1
        System.out.println("Сейчас денег в копилке: " + countMoney);
    }// Конец метода2

}// фигурную скобку закрыть
