package by.traning.task10.taskpayment.dao;

import by.traning.task10.taskpayment.entity.Product;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public List<Product> showAllProducts() {
        List<Product> products = new ArrayList<>();
        try {
            java.io.FileReader fileReader = new java.io.FileReader("C:\\Users\\Вероника\\Desktop\\JavaST_24\\ProductList.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String [] productLine = scanner.nextLine().split(" - ");
                String productName = productLine[0];
                int vendorCode = Integer.parseInt(productLine[1]);
                double price = Double.parseDouble(productLine[2]);
                products.add(new Product(productName,vendorCode,price));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Product information file not found.");
        }
        return products;
    }
}
