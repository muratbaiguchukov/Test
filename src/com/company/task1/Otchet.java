package com.company.task1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Otchet {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop\\AirportManagement.txt");
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            fileWriter = new FileWriter(file);
            fileWriter.write("12345");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
            }
        }
    }
}
