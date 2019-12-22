package by.traning.arrays.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

//Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую последовательность, выбросив из исходной
//те члены, которые равны min(a1,a2,a3 ,a4)

public class Runner {

    public static void main(String[] args) throws IOException {
        int min;
        int count=0;
        Random random = new Random();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность массива");
        int a = Integer.parseInt(reader.readLine());
        int [] arr = new int[a];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = random.nextInt(50);
        }
        min = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if (min>arr[i]){
                min=arr[i];
                count++;
            }
        }

        int array [] = new int[arr.length-count];
        int index=0;

        for (int i = 0; i <arr.length ; i++) {
                if (arr[i]!=min){
                    array[index] = arr[i];
                    index++;
                }
        }

        System.out.println("Исходный массив " + Arrays.toString(arr));
        System.out.println("Новый массив " + Arrays.toString(array));

    }

}
