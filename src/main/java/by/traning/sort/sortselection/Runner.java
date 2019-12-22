package by.traning.sort.sortselection;

import java.util.Arrays;
import java.util.Random;

public class Runner  {


    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = random.nextInt(12);
        }

        Runner runner = new Runner();
        runner.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public  void sort(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int dummy_index = i;
            int dummy = array[dummy_index];
            for (int k = i; k < j + 1; k++) {
                if (array[k] > dummy) {
                    dummy = array[k];
                    dummy_index = k;
                }
            }
            int tmp = array[dummy_index];
            array[dummy_index] = array[j];
            array[j] = tmp;
            j--;

            dummy_index = j;
            dummy = array[dummy_index];
            for (int k = j; k > i - 1; k--) {
                if (array[k] < dummy) {
                    dummy = array[k];
                    dummy_index = k;
                }
            }
            tmp = array[dummy_index];
            array[dummy_index] = array[i];
            array[i] = tmp;
            i++;
        }
    }
}