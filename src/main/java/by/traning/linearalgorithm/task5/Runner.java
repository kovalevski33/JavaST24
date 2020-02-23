package by.traning.linearalgorithm.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    //Составить алгоритм нахождения среднего арифметического двух чисел
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два числа, для нахождения среднего арифметического: ");
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = (a + b) / 2;

        System.out.println("Среднее арифметическое равно: " + c);
    }
}
