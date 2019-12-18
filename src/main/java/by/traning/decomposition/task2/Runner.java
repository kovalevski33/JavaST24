package by.traning.decomposition.task2;

//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из
//пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите количество точек");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        ArithmeticHelper arithmeticHelper = new ArithmeticHelper();
        arithmeticHelper.helperSolution(a);
    }
}
