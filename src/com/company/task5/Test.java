package com.company.task5;

import java.time.Year;

public class Test {
    public static void main(String[] args) {
        int day = 7;
        String textDay = "";
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                textDay = "в будние дни";
                break;
            case 7:
                textDay = " в вс";
                break;
            case 6:
                textDay = "в сб";

        }
                if (day == 6 || day == 7) {
                    textDay = textDay + " я отдыхаю";
                } else {
                textDay = textDay + " я работаю";
            }
            ;
            System.out.println(textDay);

        }
    }

