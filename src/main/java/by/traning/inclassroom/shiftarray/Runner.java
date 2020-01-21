package by.traning.inclassroom.shiftarray;


// сдвинуть элемент массива на n значений

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Runner {

    public static void main(String args[]) throws IOException {
        Random random = new Random();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i,n,temp;

        System.out.println("Введите количество элементов") ;
        n = Integer.parseInt(reader.readLine());
        int[] a = new int[n];

        for(i=0;i<n;i++)
        {
            a[i] = random.nextInt(20);
        }

        System.out.println("Введите значение индекса" );
        int x = Integer.parseInt(reader.readLine());

        System.out.println("Исходный массив " + Arrays.toString(a));

        temp=a[n-x];
        for (int in = (x - 1); in >= 0; in--) {
            a[in+1] = a[in];
        }
        a[0]=temp;

        System.out.println("Новый массив после сдвига"+ Arrays.toString(a));

    }

}
