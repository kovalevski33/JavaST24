package by.traning.task9.traveltours.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
   private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

   public static String readString() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void printExistTour() {
        System.out.println("Тур найден !");
    }

}
