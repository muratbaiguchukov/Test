package com.company.task5;

import java.lang.management.ManagementPermission;
import java.util.*;
                            // Создать класс Страны, у которой одно поле в виед hashMap, где клю -- код страны,
 //а значение -- название страны.
//Функционал:
//добавить новую страну
//добавить новую страну если отсутствует в списке
//получить название страны по коду страны
//получить название страны по коду, если нет такого кода, то вернуть значение -- "Такого кода нет"
//Вернуть в ArrayList<String>, где в эелементе должно храниться code-name
 //Удалить по ключу
//добавить возможность добавить 10 новых стран сразу

public class Country {
    public static void main(String[] args) {
        Map <String, String> countries = new HashMap<>();
        countries.put("KG", "Кыргызстан");
        countries.put("RU", "Россия");
        countries.put("En", "Америка");

        countries.put("KZ", "Казахстан");
        countries.putIfAbsent("En", "Англия");

        System.out.println(countries.get("En"));
        System.out.println(countries.getOrDefault("Ar", "Нет такой страны"));

        List<String> codName = new ArrayList<>();
        for (String key : countries.keySet()) {
            String newCode = key + " " + countries.get(key);
            codName.add(newCode);
        }
        System.out.println(codName);

        countries.remove("En");
        System.out.println(countries);

        Map<String, String> newCountries = new HashMap<>();
        newCountries.put("T1", "Test 1");
        newCountries.put("T2", "Test 2");
        newCountries.put("T3", "Test 3");
        newCountries.put("T4", "Test 4");
        newCountries.put("T5", "Test 5");
        countries.putAll(newCountries);
        System.out.println(countries);




    }
}
