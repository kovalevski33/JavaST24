package by.traning.inclassroom.ruble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Runner {

    //Вывести правильно сумму

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сумму");

        String s = reader.readLine();

        String [] arr = s.split("");


        for (int i = 0; i <arr.length ; i++) {
            list.add(Integer.parseInt(arr[i]));
        }

        if (list.size()>=5){
            System.out.println("Да ты богач!!! Красава!!)0)))90))))))(()");
            System.exit(0);
        }

        ConsoleHelper consoleHelper = new ConsoleHelper();
        System.out.println(consoleHelper.helper(list));
    }
}
