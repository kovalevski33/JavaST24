package by.traning.task7matrix.task3;

import java.util.Arrays;

class Runner {
   // Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

    public static void main(String[] args) {
        int[][] matrix = {
                {5, 4, 45, 12},
                {7, 5, 8,  85},
                {6,9,10,11}
        };

        System.out.println("Первоначальный двумерный массив");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        int[] arr = new int[3 * 4];

        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[k++] = matrix[i][j];
            }
        }

        Arrays.sort(arr);

        k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = arr[k++];
            }
        }

        System.out.println("Сортировка по возрастанию");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] < arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }


        k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = arr[k++];
            }
        }

        System.out.println("Сортировка по убыванию");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}