package by.traning.decomposition.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    //Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная
    //в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию

public class Runner {

    public static void main(String[] args) throws IOException {
        int i = 1;
        int a;
        int arm;
        int temp;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число для нахождения чисел Армстронга ");

        int z = Integer.parseInt(reader.readLine());

        while(i < z) {
            temp = i;
            arm = 0;
            while(temp > 0) {
                a = temp % 10;
                arm = arm + (a * a * a);
                temp = temp / 10;
            }
            if(arm == i)
                System.out.println("Число Армстронга " + i);
            i++;
        }
    }
}
