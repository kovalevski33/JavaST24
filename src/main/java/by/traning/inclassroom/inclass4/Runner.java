package by.traning.inclassroom.inclass4;

import java.util.Random;

public class Runner {

    public int summa(int n, int a[])
    {
        if (n==0) return a[0]; else return a[n]+summa(n-1, a);
    }


    public static void main(String[] args) {

       int [] mas = new int[10];

        Random randomGenerator = new Random();
        for (int i=0;i<mas.length;i++)
        {
            mas[i] = randomGenerator.nextInt(10);
        }

        Runner runner = new Runner();
        System.out.println(runner.summa(mas.length-1,mas));

    }

}


