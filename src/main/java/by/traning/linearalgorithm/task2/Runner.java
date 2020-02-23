package by.traning.linearalgorithm.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    //Найдите значение функции: с = 3 + а.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Программа вычисляет значение функции: с = 3 + а \nВведите значение a:");
        int a = Integer.parseInt(reader.readLine());
        int c = 3 + a;
        System.out.println("Значение функции равно: " + c);
    }
}
