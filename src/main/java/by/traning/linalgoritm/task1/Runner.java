package by.traning.linalgoritm.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    //Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        System.out.println("Сумма чисел: " + (x + y));
        System.out.println("Разность чисел " + (x - y));
        System.out.println("Произведение чисел " + (x * y));
        System.out.println("Частное чисел " + ((double)x / y));

    }
}
