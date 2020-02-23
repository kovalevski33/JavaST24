package by.traning.linearalgorithm.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    //В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, если в каждом
    // большом бидоне на 12 л. больше, чем в малом
    public static void main(String[] args) throws IOException {
        System.out.println("В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, " +
                "если в каждом большом бидоне на 12 л. больше, чем в малом");
        System.out.println("Введите количество малых бидонов с молоком:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Введите количество , больших бидонов с молоком:");
        int m = Integer.parseInt(reader.readLine());
    }
}
