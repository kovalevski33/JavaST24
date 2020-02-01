package by.traning.conditional.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    //Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no»
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a<b){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
