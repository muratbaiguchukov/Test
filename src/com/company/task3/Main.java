package com.company.task3;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//        Задача Б. Работа с листами (20 Баллов) - Продолжение классной работы
//        1. Создать по 50 кошек и собак, с возрастом, идущим на увеличение
//        2. Сохранить всех кошек и собак в LinkedList
//        3. Удалить из списка каждую 5 кошку
//        4. Вставить после каждой 3 собаки – одну мышку.
//        5. Найти оказавшихся рядом кошек и мышек, переместить их в новый LinkedList.
//        6. Скопировать весь список из пункта 4 в ArrayList.
//        7. Получить сумму возрастов отдельно по мышкам, кошкам и собакам.
//        8. Нужно распределить элементы в новый LinkedList так, чтобы в посередине были собаки, вначале кошки,
//                а в хвосте мыши (чтобы не было конфликта мышей и кошек


public class Main {
    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            animals.add("Кошка №" + i + " || ей " + i++);
            animals.add("Собака №" + i + " || eму " + i++);

        }

        int retval = animals.size();

        System.out.println(animals);
        System.out.println("Size of list = " + retval);



       //for (int i = 0; i < animals.size(); i++) {
            //if (animals.get(i) instanceof "Кошка")
                //animals.remove(animals.get(i));
        }
        //if (animals instanceof LinkedList<String>)
    }

