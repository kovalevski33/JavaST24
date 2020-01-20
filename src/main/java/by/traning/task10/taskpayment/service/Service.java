package by.traning.task10.taskpayment.service;

import by.traning.task10.taskpayment.dao.FileReader;
import by.traning.task10.taskpayment.dao.FileWriter;
import by.traning.task10.taskpayment.entity.Discount;
import by.traning.task10.taskpayment.entity.Payment;
import by.traning.task10.taskpayment.entity.Product;
import by.traning.task10.taskpayment.view.ConsoleHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Service {
    private FileWriter fileWriter = new FileWriter();
    private FileReader fileReader = new FileReader();
    private ConsoleHelper consoleHelper = new ConsoleHelper();

    public void createFile(){
        fileWriter.createFile();
    }

    public void createManualFile(){
        fileWriter.createFileManual();
    }


    public void writeText(String s) {
        fileWriter.writeText(s);
    }

    public void writeManualText(String s){
        fileWriter.writeManualPaymentFile(s);
    }

    public void createStandardPayment(){
        Product p1 = new Product("Milk", 100253, 7.69);
        Product p2 = new Product("Bread", 120222, 4.99);
        Product p3 = new Product("Orange", 115125, 12.11);
        Product p4 = new Product("Banana", 115135, 9.90);
        Product p5 = new Product("Egg", 115175, 99.9);

        new Payment(Discount.STOCK,p1,p2,p3,p4,p5);
    }

    public void createManualPayment() {
    consoleHelper.showProductList();
    System.out.println(fileReader.showAllProducts());
    System.out.println("Сделайте Ваш выбор: \n" + "Для выхода введите exit");
    createPayment();
    }

    private void createPayment() {
        List<Product> productList = new ArrayList<>(fileReader.showAllProducts());
        List<Product> orderList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       try {
           String productName = bufferedReader.readLine();
           while ((!productName.equals("exit"))){
               for (Product product : productList) {
                   if (product.getName().equals(productName)) {
                       orderList.add(product);
                   }
               }
               productName = bufferedReader.readLine();
           }
           new Payment(Discount.SALE,orderList);
       } catch (IOException e){
           e.printStackTrace();
       }
    }

}
