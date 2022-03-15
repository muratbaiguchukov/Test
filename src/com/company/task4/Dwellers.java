//package com.company.task4;
//
//import java.util.Scanner;
//
//public class Dwellers {
//
//    Scanner scann = new Scanner(System.in);
//    System.out.println("Введите количество домов: ");
//
//
//    ArrayList<Integer> oddNumber = new ArrayList<>();// объявляю ArrayList для нечетных чисел
//    ArrayList<Integer> evenNumber = new ArrayList<>(); //объявляю ArrayList для четных чисел
//    Random rnd = new Random(); // объявляю Random
//    int min = 1; // минимальное значение
//    int max = 100; // максимальное значение
//        for (int i = 0; i < 50; i++) { // прохожу по массиву -- в условиях задачи указано, что цифр 50
//        int num = rnd.nextInt((max-min+1)+min); //
//        if (num%2 == 0){ // если число делится на 2 без остатка, т.е четное
//            evenNumber.add(num);// то выполняется код -- добавляется в число четных чисел
//        }else{// иначе
//            oddNumber.add(num);//добавляется к нечетным числам
//        }
//    }
//        System.out.println(oddNumber);
//        System.out.println(evenNumber);
//        System.out.println(evenNumber.size()+oddNumber.size());
//
//            for i in range(count_of_buildings):
//
//            ----i += 1
//
//            ----home = int(input(f"Количество человек, проживающих в доме {i}: "))
//
//            ----count_of_buildings.append((i, home))
//
//    odd = sum([count for index, count in count_of_buildings if index % 2 == 1])
//
//    even = sum([count for index, count in count_of_buildings if index % 2 == 0])
//
//if even > odd:
//
//            ----print("Больше всего людей проживает на стороне улицы с четными номерами")
//
//else:
//
//        ----print("Больше всего людей проживает на стороне улицы с нечетными номерами")
//}
