package by.traning.cycles.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Runner {
//Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.

    static boolean isArithmeticProgression(Integer[] rang) {
        if (rang.length < 2)
            return false;

        for (int i = 1; i < rang.length - 1; i++) {
            if (rang[i + 1] - rang[i] != rang[1] - rang[0])
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String [] arr = s.split("");


        for (int i = 0; i <arr.length ; i++) {
           list.add(Integer.parseInt(arr[i]));
        }

        Integer [] array = list.toArray(new Integer[list.size()]);

        if (isArithmeticProgression(array)){
            System.out.println("Образуют арифметическую прогрессию.");
        } else {
            System.out.println("Не образуют арифметическую прогрессию.");
        }
    }

}
