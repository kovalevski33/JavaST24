package by.traning.task7matrix.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {
//Получить квадратную матрицу порядка n:

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность массива");

        int n = Integer.parseInt(reader.readLine());

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
}
