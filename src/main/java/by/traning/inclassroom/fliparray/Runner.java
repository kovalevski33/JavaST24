package by.traning.inclassroom.fliparray;

import java.util.Arrays;

//перевернуть массив
public class Runner {

    public void sort(int[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            int tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
    }

    public static void main(String[] arg){
        int[] mass = {1,2,3,4,5,};
        Runner m = new Runner();
        System.out.println("Исходный массив " + Arrays.toString(mass));

        m.sort(mass);

        System.out.println("Перевернутый массив " + Arrays.toString(mass));

    }

}
