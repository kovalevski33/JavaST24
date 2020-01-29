package by.traning.linalgoritm.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    //Вычислить расстояние между двумя точками с данными координатами (х1, у1) и (x2, у2)
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координаты точек для х1, у1, x2, у2");

        int x1 = Integer.parseInt(reader.readLine());
        int y1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        int y2 = Integer.parseInt(reader.readLine());

        double result = Math.sqrt(((x2-x1)*(x2-x1) + ((y2-y1)*(y2-y1))));

        System.out.println("Расстояние между точками " + result);
    }
}
