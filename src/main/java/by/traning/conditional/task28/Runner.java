package by.traning.conditional.task28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    //Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c)

    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите три числа a, b, с");

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = 5;

        if (a==d){
            System.out.println("Введённое число a является равным d (" + d + ")");
        } else if (b==d){
            System.out.println("Введённое число b является равным d (" + d + ")");
        } else if (c==d){
            System.out.println("Введённое число c является равным d (" + d + ")");
        } else {
            System.out.println("Наибольшее число первой пары " + Math.max(a,d));
            System.out.println("Наибольшее число второй пары " + Math.max(b,d));
            System.out.println("Наибольшее число третьей пары " + Math.max(c,d));
        }

    }

}


