package by.traning.conditional.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    //Составить программу нахождения наименьшего из квадратов двух чисел а и b.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Наименьшее из квадратов двух чисел: " + Math.min(a*a,b*b));
    }
}
