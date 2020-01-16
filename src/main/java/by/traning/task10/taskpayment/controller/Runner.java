package by.traning.task10.taskpayment.controller;
import by.traning.task10.taskpayment.entity.Discount;
import by.traning.task10.taskpayment.entity.Payment;
import by.traning.task10.taskpayment.entity.Product;

public class Runner {

        public static void main(String[] args) {
            Product p1 = new Product("Milk", 100253, 7.69);
            Product p2 = new Product("Bread", 120222, 4.99);
            Product p3 = new Product("Orange", 115125, 12.11);
            Product p4 = new Product("Banana", 115135, 9.90);
            Product p5 = new Product("Egg", 115175, 99.9);

            new Payment(Discount.STOCK,p1,p2,p3,p4,p5);
        }
    }