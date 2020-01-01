package by.traning.task7matrix.task2;

import java.io.IOException;


public class Runner {
    /*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму*/

    public static void main(String[] args) throws IOException {

        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};

        int k = 0;
        int sum = 0;
        int s = 0;

        for (int i = 0; i < twoDimArray.length; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                    System.out.print(" " + twoDimArray[i][j] + " ");//вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }


        for (int j = 0; j < 4; j++) {  //идём по столбцам
            for (int i = 0; i < twoDimArray.length; i++) {//идём по строкам
                k+=twoDimArray[i][j];
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


}
