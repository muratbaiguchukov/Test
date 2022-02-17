package com.company.task5;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Random;
import java.util.List;
import java.util.Map;

                //случайно сгенерировать 1000 целых чисел от 0 до 100.
                // подсчитать, какя цифра сколько раз "выпала"
                // подсказка: ключщм будет цифра, а значением -- сколько раз она "выпала"

                //дополнительное задание -- найти произведение чисел ключа и значения
                // доп задание -- добавить новый ключ 50 если он отсутствует в мапе
                // доп задание -- вывести количество элементов в мапе

public class Rand {
    public static void main(String[] args) {
        Map <Integer, Integer> map = new HashMap<>();// объявляем MAP
        int min = 0;                                 // это минимальное значение согласно условиям задачи
        int max = 100;                               // это максимальное значение согласно условиям задачи
        for (int j= 0; j < 1000; j++) {              // это условие задачи - случайно сгенерировать 1000 целых чисел,
                                                    // значит используем for для того чтобы пройти по массиву от 0 до 1000
            int diff = max - min;                    // разница максимального и минимального значений
            Random random = new Random();            // объявляем Random
            int randomInt = random.nextInt(diff + 1); // рандомное число
            randomInt += min;                        // рандомному числу присваем минимальное значение +

            Integer value = map.getOrDefault(randomInt, 0);       // количеству значения (value, т.е. сколько раз она выпадет) будет приравнено полученное рандомное число
//            //if (value == null) {                      // при первом цикле, т.е. при появлении value равно null
//             // value = 0;                            // при первом цикле приравниваем value 0
            //}
            value = value + 1;                        // при выпадении очередном выпадении число value будет увеличиваться на единицу
            map.putIfAbsent(randomInt, value);                // метод map.put(), т.е. смотрит в HashMap есть ли такое число -- если есть,
                                                    // то стирает его и по новой записывает, но уже с новым значением.
        }
            for (Integer key : map.keySet()) {
                int value = map.get(key);
                System.out.println(key * value);
            }
            map.putIfAbsent(50, 1);
                System.out.println(map.size());
        }

        }



