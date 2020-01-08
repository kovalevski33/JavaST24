package by.traning.decomposition.task2;

import java.util.Random;

    //На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из
    //пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

public class ArithmeticHelper {
    private double temp;

    public void helperSolution (int a){
        Random random = new Random();
        int [] arrx = new int[a];
        int [] arry = new int[a];

        for (int i = 0; i <a; i++) {
            arrx[i] = random.nextInt(12);
            arry[i] = random.nextInt(12);
        }

        temp = Math.sqrt(((arrx[1]-arrx[0])*(arrx[1]-arrx[0]) + ((arry[1]-arry[0])*(arry[1]-arry[0]))));

        for (int i =a-2; i >=0; i--) {
            if (Math.sqrt(((arrx[i+1]-arrx[i])*(arrx[i+1]-arrx[i]) + ((arry[i+1]-arry[i])*(arry[i+1]-arry[i]))))>temp){
                temp = Math.sqrt(((arrx[i+1]-arrx[i])*(arrx[i+1]-arrx[i]) + ((arry[i+1]-arry[i])*(arry[i+1]-arry[i]))));
            }
        }
        System.out.println("Самое большое расстояние " + temp );
    }
}

