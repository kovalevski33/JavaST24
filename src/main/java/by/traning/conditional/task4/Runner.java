package by.traning.conditional.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    //Составить программу: равны ли два числа а и b?
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a==b){
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }
    }
}
