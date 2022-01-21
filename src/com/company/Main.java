package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] array = {'п', 'р', 'о', 'г', 'р', 'а', 'м', 'м', 'и', 'с', 'т'};
        System.out.println(array);
        String s = String.valueOf(array);
        StringBuilder s1 = new StringBuilder(s).reverse();
        System.out.println(s1);
    }
}


















