package by.traning.inclassroom.inclass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Runner {
    private static final String WINTER = "Winter";
    private static final String SPRING = "Spring";
    private static final String SUMMER = "Summer";
    private static final String FALL = "Fall";

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер месяца:");
        int mounth = Integer.parseInt(reader.readLine());
        String rez;

        switch (mounth){
            case 12:
            case 1:
            case 2:
                rez = WINTER;
                break;
            case 3:
            case 4:
            case 5:
                rez = SPRING;
                break;
            case 6:
            case 7:
            case 8:
                rez = SUMMER;
                break;
            case 9:
            case 10:
            case 11:
                rez = FALL;
                break;
            default: throw new Exception("Нельзя сотворить здесь");
        }
        System.out.println(rez);

    }

}
