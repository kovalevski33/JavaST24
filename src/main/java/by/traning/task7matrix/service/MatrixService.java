package by.traning.task7matrix.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatrixService {
   private int [][] matrix = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};

    public void firsTask(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность массива");

        int n = 0;
        try {
            n = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[][] twoDimArray = new int[n][n];
        int k=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j){
                    twoDimArray[i][j]=k;
                    System.out.print(" " + twoDimArray[i][j] + " ");
                    k++;
                }
                else {
                    System.out.print(" " + twoDimArray[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

    public void secondTask(){

        int k = 0;
        int sum = 0;
        int s = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }


        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < matrix.length; i++) {
                k+=matrix[i][j];
            }
            if (k>sum){
                sum=k;
                s=j;
            }
            k=0;
        }
        System.out.println();

        System.out.println("Максимальная сумма " + sum);
        System.out.println("Индекс столбца " + s);
    }

    public void thirdTask(){

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
    public void fourthTask(){
        int [][] sumMatrix = new int[3][4];
        int[][] matrix2 = {
                {16, 11, 5, 2},
                {1, 0, 8,  34},
                {10,22,9,19}
        };
        System.out.println("Первый двумерный массив:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Второй двумерный массив:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sumMatrix[i][j] =  matrix[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Сумма двумерных массивов:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
