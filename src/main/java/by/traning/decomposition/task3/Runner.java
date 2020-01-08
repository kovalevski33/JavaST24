package by.traning.decomposition.task3;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
    //Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
    //если угол между сторонами длиной X и Y— прямой

public class Runner {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        int t = Integer.parseInt(reader.readLine());

        ArithmeticHelper arithmeticHelper = new ArithmeticHelper();
        arithmeticHelper.solution(x, y, z, t);
    }

}
