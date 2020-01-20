package by.traning.task10.taskpayment.controller;

import by.traning.task10.taskpayment.service.PaymentService;

public class Controller {

    public void run(){
        PaymentService paymentService = new PaymentService();
        paymentService.startService();
    }
}
