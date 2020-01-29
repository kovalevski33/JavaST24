package by.traning.conditional.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {

        //Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите три действительных числа:");

        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());

            if (a==0) {
                System.out.println("Введённое первое число " + a );
            } else if (a>0) {
                System.out.println("Квадрат первого числа " + a * a);
            } else if (a<0) {
                System.out.println("Четвёртая степень первого числа " + a * a * a * a);
            }

            if (b==0) {
            System.out.println("Введённое второе число " + b );
            } else if (b>0) {
            System.out.println("Квадрат второго числа " + b * b);
            } else if (b<0) {
            System.out.println("Четвёртая степень второго числа " + b * b * b * b);
            }

            if (c==0) {
            System.out.println("Введённое третье число " + c );
            } else if (c>0) {
            System.out.println("Квадрат третьего числа " + c * c);
            } else if (c<0) {
            System.out.println("Четвёртая степень третьего числа " + c * c * c * c);
            }

    }
}