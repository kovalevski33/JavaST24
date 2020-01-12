package by.traning.decomposition.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    //Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная
    //в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию

public class Runner {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число для нахождения чисел Армстронга ");
        ArithmeticHelper arithmeticHelper = new ArithmeticHelper();
        arithmeticHelper.armstrongNumber(Integer.parseInt(reader.readLine()));

    }
}
