package by.traning.sort.sortchoose;

import java.util.Arrays;
import java.util.Random;

public class Runner {
    //сортировка выборкой

    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }


    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = random.nextInt(12);
        }
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));

    }

}
