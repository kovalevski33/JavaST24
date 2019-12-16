package by.traning.linalgoritm.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    //Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать
    //часы через р ч q мин r с?

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текущее время: часы, минуты, секунды");

        int hn = Integer.parseInt(reader.readLine());
        int mn= Integer.parseInt(reader.readLine());
        int sn= Integer.parseInt(reader.readLine());

        if ((hn>24 || hn<0) || (mn > 60 || mn<0) ||(sn>60 || sn<0)){
            System.out.println("Некорректно заданно время");
        } else {
            System.out.println("Добавьте к текущему времени часы, минуты, секунды");
            int h = Integer.parseInt(reader.readLine());
            int m= Integer.parseInt(reader.readLine());
            int s= Integer.parseInt(reader.readLine());

           hn+=h;
           mn+=m;
           sn+=s;

           hn = (hn + ((mn+(sn/60))/60)) % 24;
           mn = (mn + (sn/60)) % 60;
           sn %= 60;
           System.out.println("Новое время: " + hn + ":" + mn + ":" + sn);

        }
    }
}
