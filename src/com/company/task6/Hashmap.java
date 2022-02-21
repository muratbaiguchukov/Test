package com.company.task6;

import java.util.*;

/*
Создать Мар.Ключ -- должность. Значение -- ФИО.
Должность президента занимал Ельцин. Его сменил Путин.
Ельцин стал пенсионером (ArrayList)
Использовать механизм совпадения по рut.
 */

public class Hashmap {
    private static final String PRESIDENT = "Президент";
        public static void main(String[] args) {
        Map<String, String> presidents = new HashMap<>();
        presidents.put(PRESIDENT, "Ельцин");
        System.out.println(presidents);
        List<String> pensionerList = new ArrayList<>();
        pensionerList.add(presidents.get(PRESIDENT));
        presidents.put(PRESIDENT, "Путин");
        System.out.println(presidents);
        System.out.println(pensionerList);

        Set<String> keys = presidents.keySet();
        keys.remove(PRESIDENT);
            System.out.println(presidents);

    }
}
