package com.company.task5;

import java.util.HashMap;
import java.util.Map;
                                    //
                                    //Заполнить HashMap данными всех автомобилей.
                                    //· Ключ – ID автомобиля
                                    //· Значение – Объект Автомобиля
                                    //· Пройтись по всем элементам таблицы. Вывести в консоль.
public class Auto {
    public static void main(String[] args) {
        Map<Integer, String> autos = new HashMap<>();
        autos.put(1, "Toyota");
        autos.put(2, "Nissan");
        autos.put(3, "Honda");
        autos.put(4, "Mitsubishi");
        autos.put(5, "Subaru");
        autos.put(6, "Suzuki");

        autos.putAll(autos);
        System.out.println(autos);
        }
    }


