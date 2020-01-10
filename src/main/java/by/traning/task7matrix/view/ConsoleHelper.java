package by.traning.task7matrix.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    public void taskScreen(){
        System.out.println("Здравствуй User, вот список доступных задач: " + "\n" +
                "1.Получить квадратную матрицу порядка n." + "\n" +
                "2.Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму." + "\n" +
                "3.Отсортировать строки матрицы по возрастанию и убыванию значений элементов." + "\n" +
                "4.Найдите сумму двух матриц.");
    }
    public int taskScan()  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (a<=0 || a>4){
            try {
                throw new ValidateException("Вы ввели некорректные данные");
            } catch (ValidateException e) {
                e.printStackTrace();
            }
        }
        return a;
    }
}
