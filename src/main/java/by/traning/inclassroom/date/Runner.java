package by.traning.inclassroom.date;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {

        int year;
        int month;
        int day;

        System.out.println("Введите день, месяц(номер), год:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        day = Integer.parseInt(reader.readLine());
        month = Integer.parseInt(reader.readLine());
        year = Integer.parseInt(reader.readLine());

        if (day<=0 || month<=0 || day>31 || month>12){
            System.out.println("Были введены неверные данные ");
            System.exit(0);
        }

        int ndays=0;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ndays=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ndays=30;
                break;
            case 2:
                if (year%4==0 && (year%100!=0 || year%400==0))
                    ndays=29;
                else
                    ndays=28;
                break;
            default:
                System.out.println("Месяцев всего 12");
        }
        day++;
        if (day>ndays) {
            day=1;
            month++;
        }if (month>12) {
            month=1;
            year++;
        }
            System.out.println("Следующий день " + day +" " + month + " " + year);
    }
}
