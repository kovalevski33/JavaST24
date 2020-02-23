package by.traning.linearalgorithm.task28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    //Составить программу перевода радианной меры угла в градусы, минуты и секунды.

    public static void main(String[] args) throws IOException {
        double pi = Math.PI;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите угол в радианах для перевода в градусы, минуты и секунды ");

        double x = Double.parseDouble(reader.readLine());
        double resultgr = x*180/pi;
        int m = (int) resultgr * 60;//name of variable more clear!
        int s = m * 60;

        System.out.println("Градусы: " + resultgr + " Минуты: " + m + " Секунды: " + s);
    }
}
