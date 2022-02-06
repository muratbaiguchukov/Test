package com.company.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите трехзначное число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int current;

        current = number % 10;
        sum = sum + current;
        number = number / 10;

        current = number % 10;
        sum = sum + current;

        number = number / 10;
        sum = sum + number;
        System.out.println(sum);
    }
}
