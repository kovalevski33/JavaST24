package by.traning.arrays.task3;


//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
//простыми числами.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Runner {
    public static void main(String[] args) throws IOException {
       double sum=0;
        Random random = new Random();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размерность массива");
        int a = Integer.parseInt(reader.readLine());
        double [] arr = new double[a];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = random.nextDouble();
        }

        for (int i = 0; i <arr.length ; i++) {
            if (isPrime(i)){
               sum+= arr[i];
            }
        }

        System.out.println("Сумма чисел , порядковые номера которых являются простыми числами равна " + sum);

    }

   public static boolean isPrime(int n)
    {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;

        return true;
    }

}
