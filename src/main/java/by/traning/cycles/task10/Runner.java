package by.traning.cycles.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

   // Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
   // результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
   // также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
  //  перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’

    public static void main(String[] args) throws IOException {
        System.out.println("Введите два операнда и знак операции (+, –, /, *)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        String z = reader.readLine();

        if (!(z.equals("+") || z.equals("-") || z.equals("/") || z.equals("*") || z.equals("0"))) {
            System.out.println("Введён неверный знак операции, либо был введён ноль");
        } else {
            calc(x,y,z);
            while (true){
                System.out.println("Введите два операнда и знак операции (+, –, /, *)");
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

                int a = Integer.parseInt(reader.readLine());
                int b = Integer.parseInt(reader.readLine());
                String c = reader.readLine();
                if (c.equals("0")){
                    break;
                } else {
                    calc(a,b,c);
                }
            }
        }

        }


    private static void  calc (int a, int b, String s){

        if (!(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))) {
            System.out.println("Введён неверный знак операции");
        }

        if (s.equals("+")){
            System.out.println(a+b);;
        }
        if(s.equals("-")){
            System.out.println(a-b);;
        }
        if (s.equals("/")){
            if (b==0){
                System.out.println("На ноль делить нельзя");
            } else {
                System.out.println(a/b);
            }
        }

        if (s.equals("*")){
            System.out.println(a*b);;
        }

    }
}
