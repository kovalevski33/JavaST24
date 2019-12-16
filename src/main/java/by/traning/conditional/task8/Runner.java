package by.traning.conditional.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    //34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем;
    // если сдачи не требуется, печатает на экране «спасибо»;
    // если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите стоимость книг");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Ввведите сумму денег, внесенную покупателем");
        int b = Integer.parseInt(reader.readLine());
        int c = b-a;

        if (c==0){
            System.out.println("Спасибо");
        }
        if (c>0){
            System.out.println("Возьмите сдачу " + c);
        }
        if (c<0){
            System.out.println("Денег недостаточно " + c);
        }
    }

}
