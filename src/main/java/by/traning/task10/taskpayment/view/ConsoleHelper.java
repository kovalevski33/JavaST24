package by.traning.task10.taskpayment.view;

import by.traning.task10.taskpayment.service.PaymentService;
import by.traning.task7matrix.view.ValidateException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
   private PaymentService paymentService;

    public void start() {
        System.out.println("Здравствуй User, вот список доступных действий: " + "\n" +
                "1.Заполнить список продуктов вручную." + "\n" +
                "2.Заполнить список продуктов автоматически (student version)");
    }

    public int taskScan() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (a <= 0 || a > 2) {
            try {
                throw new ValidateException("Вы ввели некорректные данные");
            } catch (ValidateException e) {
                e.printStackTrace();
            }
        }
        return a;
    }

    public void showProductList(){
        System.out.println("Здравствуй User, вот список доступных продуктов для заказа:");
    }

}