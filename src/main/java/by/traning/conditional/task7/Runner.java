package by.traning.conditional.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {

        //Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите три числа ");

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int result1 = a + b;
        int result2 = a + c;
        int result3 = b + c;

        if (result1 > 0) {
            System.out.println("Сумма чисел " + a + " и " + b + " является положительной");
        } else {
            System.out.println("Сумма чисел " + a + " и " + b + " является отрицательной");
        }

        if (result2 > 0) {
            System.out.println("Сумма чисел " + a + " и " + c + " является положительной");
        } else {
            System.out.println("Сумма чисел " + a + " и " + c + " является отрицательной");
        }

        if (result3 > 0) {
            System.out.println("Сумма чисел " + b + " и " + c + " является положительной");
        } else {
            System.out.println("Сумма чисел " + b + " и " + c + " является отрицательной");
        }

    }
}
