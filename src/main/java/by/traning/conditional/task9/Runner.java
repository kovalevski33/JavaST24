package by.traning.conditional.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    //Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && b == c){
            System.out.println("Треугольник является равносторонним");
        } else {
            System.out.println("Треугольник не является равносторонним");
        }
    }

}
