package by.traning.task10.taskpayment.service;


import by.traning.task10.taskpayment.view.ConsoleHelper;

public class PaymentService {
   private Service service = new Service();

    public void startService() {
        ConsoleHelper consoleHelper = new ConsoleHelper();
        consoleHelper.start();
        int a = consoleHelper.taskScan();
        switch (a) {
            case 1: service.createManualPayment();break;
            case 2: service.createStandardPayment();break;
            default:
        }
    }
}