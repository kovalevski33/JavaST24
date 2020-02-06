package by.traning.conditional.task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
//Составить программу, которая определит площадь какого треугольника больше.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину основания первого треугольника: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите высоту второго треугольника: ");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Введите длину основания второго треугольника: ");
        int c = Integer.parseInt(reader.readLine());
        System.out.println("Введите высоту второго треугольника: ");
        int d = Integer.parseInt(reader.readLine());

        double s1 = (double) (a * b) / 2;
        double s2 = (double) (c * d) / 2;

        if (s1 > s2){
            System.out.println("Площадь первого треугольника больше");
        } else {
            System.out.println("Площадь второго треугольника больше");
        }
    }
}
