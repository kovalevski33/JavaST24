package by.traning.arrays.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Runner {

    //Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим числом.
    //Подсчитать количество замен.

    public static void main(String[] args) throws IOException {

        Random random = new Random();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность массива");
        int a = Integer.parseInt(reader.readLine());
        int [] arr = new int[a];

        System.out.println("Введите число для замены ");
        int z = Integer.parseInt(reader.readLine());

        for (int i = 0; i <a; i++) {
            arr[i] = random.nextInt(20);
            if (arr[i]>z){
                arr[i]=z;
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
