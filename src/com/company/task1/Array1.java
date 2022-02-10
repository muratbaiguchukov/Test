package com.company.task1;

import java.util.ArrayList;
import java.lang.*;
import java.util.Random;;

public class Array1 {
    public static void main(String[] args) {
        ArrayList<Integer> oddNumber = new ArrayList<>();// объявляю ArrayList для нечетных чисел
        ArrayList<Integer> evenNumber = new ArrayList<>(); //объявляю ArrayList для четных чисел
        Random rnd = new Random(); // объявляю Random
        int min = 1; // минимальное значение
        int max = 100; // максимальное значение
        for (int i = 0; i < 50; i++) { // прохожу по массиву -- в условиях задачи указано, что цифр 50
            int num = rnd.nextInt((max-min+1)+min); //
            if (num%2 == 0){ // если число делится на 2 без остатка, т.е четное
                evenNumber.add(num);// то выполняется код -- добавляется в число четных чисел
            }else{// иначе
                oddNumber.add(num);//добавляется к нечетным числам
            }
        }
        System.out.println(oddNumber);
        System.out.println(evenNumber);
        System.out.println(evenNumber.size()+oddNumber.size());


    }
}
