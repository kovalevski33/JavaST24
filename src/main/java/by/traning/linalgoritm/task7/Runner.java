package by.traning.linalgoritm.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    //Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину прямоугольника для нахождения его площади");
        double a = Double.parseDouble(reader.readLine());
        double b = a/2;
        double s = a * b;
        System.out.println("Площадь треугольника " + s);

    }
}
