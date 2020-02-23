package by.traning.linearalgorithm.task38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {

        //Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координаты x,y");

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        //a (для треугольника)
        if (isInside(-4, 0, 0, 4, 4, 0, x, y))
            System.out.println("true");
        else
            System.out.println("false");

        //b
        if ((x>=-4 && x<=4) && (y>=-3 && y<=0) || (x>=-2 && x<=2) && (y>=0 && y<=4) )   {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean isInside (int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) {
        double a = area (x1, y1, x2, y2, x3, y3);
        double a1 = area (x, y, x2, y2, x3, y3);
        double a2 = area (x1, y1, x, y, x3, y3);
        double a3 = area (x1, y1, x2, y2, x, y);
        return(a == a1 + a2 + a3);
    }

    static double area(int x1, int y1, int x2, int y2, int x3, int y3){
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
    }

}



