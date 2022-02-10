package com.company.task2;

import java.util.*;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        System.out.println(integers.length);
        ArrayList<Integer> myVariebles = new ArrayList<>();
        System.out.println(myVariebles.size());
                                            // создать список в котором содержатся числа, которые являются квадратами.
                                            // найти все такие числа до числа 10000
        for (int i = 0; i < 10000; i++) {
            myVariebles.add(i * i);
        }
        System.out.println(myVariebles.size());

        System.out.println(myVariebles);

    }
        }
