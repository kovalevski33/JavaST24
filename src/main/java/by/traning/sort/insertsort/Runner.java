package by.traning.sort.insertsort;

import java.util.Arrays;

public class Runner {
    //сортировка вставками

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 3, 2, 3, 4, 4};
        int[] arr2 = {11, 4, 12, 2, 3, 21, 3, 14, 0};
        insertionSort(arr);
        insertionSortBinary(arr2);

    }

    public static void insertionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSortBinary(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);
            System.arraycopy(array, j, array, j + 1, i - j);
            array[j] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}
