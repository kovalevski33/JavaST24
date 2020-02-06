package by.traning.conditional.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    //Составить программу, которая определит площадь какого круга меньше.
    public static void main(String[] args) throws IOException {
        double p = Math.PI;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите радиус круга: ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите радиус второго круга: ");
        int b = Integer.parseInt(reader.readLine());
        double s1 = p * (a*a);
        double s2 = p * (b*b);

        if (s1 < s2){
            System.out.println("Площадь первого круга меньше");
        } else {
            System.out.println("Площадь второго круга меньше");
        }
    }
}
