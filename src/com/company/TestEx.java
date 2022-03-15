package com.company;

import java.util.Scanner;

public class TestEx {
    public static void main(String[] args) {
        //void power (double n, int p) {
            //return n * n ;
            //System.out.println();return n * n * n;

            Scanner scan = new Scanner(System.in);// функция main, запрашивающая у пользователя ввести аргументы для power
            double n = scan.nextDouble();
            int p = scan.nextInt();
            //System.out.print();// отображает на экране результаты работы функции power

            //System.out.print(n *);

            class Calculator {
                public static void main(String[] args) {
                    double n = getNumber();
                    //int p = getNumber();
                    char operation = getOperation();
                    //double result = calc(n, p, operation);
                    //System.out.println("Результат:" + result);
                }

                public static double getNumber() {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите число:");
                    if(sc.hasNextDouble()) {
                        return sc.nextDouble();
                    } else {
                        System.out.println("Ошибка при вводе. Повторите ввод");
                        return getNumber();
                    }
                }

                public static char getOperation() {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить");
                    int operationNumber = 0;
                    if(sc.hasNextInt()) {
                        operationNumber = sc.nextInt();
                    } else {
                        System.out.println("Вы ввели не число! Повторите ввод!");
                        return getOperation();
                    }
                    switch (operationNumber) {
                        case 1:
                            return '+';
                        case 2:
                            return '-';
                        case 3:
                            return '*';
                        case 4:
                            return '/';
                        default:
                            System.out.println("Неправильная операция! Повторите ввод!");
                            return getOperation();
                    }
                }

                public static double add(double num1, double num2) {
                    return num1+num2;
                }

                public static double sub(double num1, double num2) {
                    return num1-num2;
                }

                public static double mul(double num1, double num2) {
                    return num1*num2;
                }

                public static double div(double num1, double num2) {
                    if(num2 != 0.0) {
                        return num1/num2;
                    } else {
                        System.out.println("На 0 делить нельзя!");
                        return Double.NaN;
                    }
                }

                public static double calc(double num1, double num2, char operation) {
                    switch (operation) {
                        case '+':
                            return add(num1, num2);
                        case '-':
                            return sub(num1, num2);
                        case '*':
                            return mul(num1, num2);
                        case '/':
                            return div(num1, num2);
                        default:
                            return Double.NaN;
                    }
                }
            }

        }
    }

